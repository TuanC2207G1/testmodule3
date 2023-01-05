package service;

import dao.ClassroomEmployeeDao;
import model.Employee;

import java.sql.Date;
import java.util.List;

public class EmployeeService {
    ClassroomEmployeeDao classroomEmployeeDao = new ClassroomEmployeeDao();
    public boolean saveStudent(String name,String email,String address,String phone_number,double salary,int department){
        return classroomEmployeeDao.saveStudent(name, email, address, phone_number, salary, department);
    }
    public List<Employee> getAll(){
        return classroomEmployeeDao.getAll();
    }
    public Employee findById(int id){
        return classroomEmployeeDao.findById(id);
    }
    public boolean edit(Employee employee){
        return classroomEmployeeDao.edit(employee);
    }
    public void delete(int id){
        classroomEmployeeDao.delete(id);
    }
}
