package controller;

import model.Employee;
import service.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/edit")
public class EditServlet extends HttpServlet {
    EmployeeService employeeService =new EmployeeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Employee employee = employeeService.findById(id);
        req.setAttribute("employee",employee);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/view/edit.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int employee_id= Integer.parseInt(req.getParameter("employee_id"));
        String name =req.getParameter("name");
        String email =req.getParameter("email");
        String address =req.getParameter("address");
        String phone_number =req.getParameter("phone_number");
        double salary = Double.parseDouble(req.getParameter("salary"));
        int department = Integer.parseInt(req.getParameter("department"));
        Employee employee=new Employee(employee_id,name,email,address,phone_number,salary,department);
        employeeService.edit(employee);
        req.setAttribute("employees", employeeService.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/view/employeelist.jsp");
        dispatcher.forward(req, resp);
    }
}