package controller;


import service.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    EmployeeService employeeService=new EmployeeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id= Integer.parseInt(req.getParameter("id"));
        employeeService.delete(id);
        req.setAttribute("employees", employeeService.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/view/employeelist.jsp");
        dispatcher.forward(req, resp);
    }
}