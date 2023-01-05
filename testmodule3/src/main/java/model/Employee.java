package model;

public class Employee {
    private int employee_id;
    private String name;
    private String email;
    private String address;
    private String phone_number;
    private double salary;
    private int department_id;
    private String department;

    public Employee() {
    }

    public Employee(int employee_id, String name, String email, String address, String phone_number, double salary, int department_id) {
        this.employee_id = employee_id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone_number = phone_number;
        this.salary = salary;
        this.department_id = department_id;
    }

    public Employee(int employee_id, String name, String email, String address, String phone_number, double salary, String department) {
        this.employee_id = employee_id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone_number = phone_number;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String name, String email, String address, String phone_number, double salary, int department_id) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone_number = phone_number;
        this.salary = salary;
        this.department_id = department_id;
    }

    public Employee(int employee_id, String name, String email, String address, String phone_number, double salary, int department_id, String department) {
        this.employee_id = employee_id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone_number = phone_number;
        this.salary = salary;
        this.department_id = department_id;
        this.department = department;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
