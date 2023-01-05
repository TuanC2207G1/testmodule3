package controller;

import service.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/employee")
public class GetAllServlet extends HttpServlet {
    EmployeeService employeeService =new EmployeeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("employees", employeeService.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/view/employeelist.jsp");
        dispatcher.forward(req, resp);
    }
}
