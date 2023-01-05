package dao;

import model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClassroomEmployeeDao {
    static Connection connection=ConnectionMySql.getConnection();
    public List<Employee> getAll() {
        List<Employee> employeesList = new ArrayList<>();
        String sql = "Select * from employee join department on employee.department_id=department.department_id";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int employee_id = resultSet.getInt("employee_id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String phone_number = resultSet.getString("phone_number");
                double salary = resultSet.getDouble("salary");
                int department_id=resultSet.getInt("department_id");
                String department = resultSet.getString("department");
                employeesList.add(new Employee(employee_id, name, email, address, phone_number,salary,department_id,department));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return employeesList;
    }

    public boolean saveStudent(String name,String email,String address,String phone_number,double salary,int department){
        String sql = "INSERT INTO classroom_db.employee (employee_id, name, email, address, phone_number, salary, department_id) VALUES (null,?,?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,address);
            preparedStatement.setString(4,phone_number);
            preparedStatement.setDouble(5,salary);
            preparedStatement.setInt(6,department);
            preparedStatement.execute();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public  boolean edit(Employee employee) {
        String sql = "update employee set name=?, email=?, address=?,phone_number=?,salary=?,department_id=? where employee_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2, employee.getEmail());
            preparedStatement.setString(3, employee.getAddress());
            preparedStatement.setString(4, employee.getPhone_number());
            preparedStatement.setDouble(5, employee.getSalary());
            preparedStatement.setInt(6, employee.getDepartment_id());
            preparedStatement.setInt(7, employee.getEmployee_id());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Employee findById(int id){
        String sql = "select * from employee where employee_id = "+ id;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            int employee_id = resultSet.getInt("employee_id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            String phone_number = resultSet.getString("phone_number");
            double salary = resultSet.getDouble("salary");
            int department_id=resultSet.getInt("department_id");
            return new Employee(employee_id, name, email, address, phone_number,salary,department_id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public void delete(int id){
        String sql ="delete FROM employee where employee_id = "+id;
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
