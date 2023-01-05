package controller;

import service.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/save")
public class SaveServlet extends HttpServlet {
    EmployeeService employeeService =new EmployeeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/view/save.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =req.getParameter("name");
        String email =req.getParameter("email");
        String address =req.getParameter("address");
        String phone_number =req.getParameter("phone_number");
        double salary = Double.parseDouble(req.getParameter("salary"));
        int department = Integer.parseInt(req.getParameter("department"));
        employeeService.saveStudent(name,email,address,phone_number,salary,department);
        req.setAttribute("employees", employeeService.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/view/employeelist.jsp");
        dispatcher.forward(req, resp);
    }
}
