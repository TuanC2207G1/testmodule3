<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 12/29/2022
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
    <h1>Account List</h1>
    <from action="/findAccount" method="post">
        <input value="Find Account" name="find">
        <button type="submit" class="btn btn-success">Summit</button>
    </from>
    <c:if test="${sessionScope.account != null}">
        <a href="/logout" class="btn btn-danger col-6">Logout</a>
    </c:if>
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Lastname</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Email</td>
            <td>Address</td>
            <td>Phone Number</td>
            <td>Salary</td>
            <td>Department</td>
            <td>Action</td>
        </tr>
        <c:forEach var="p" items="${employees}">
            <tr>
                <td>${p.employee_id}</td>
                <td>${p.name}</td>
                <td>${p.email}</td>
                <td>${p.address}</td>
                <td>${p.phone_number}</td>
                <td>${p.salary}</td>
                <td>${p.department}</td>
                <td><a href="/edit?id=${p.employee_id}" class="btn btn-info" >Edit</a><a href="/delete?id=${p.employee_id}" class="btn btn-danger" >Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
        <div>
            <a href="/save" class="btn btn-info" >Add</a>
        </div>
    </table>
</div>

</body>
</html>

