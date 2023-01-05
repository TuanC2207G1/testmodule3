
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style>
    body {
      font-family: Arial, Helvetica, sans-serif;
      background-color: black;
    }

    * {
      box-sizing: border-box;
    }

    /* Add padding to containers */
    .container {
      padding: 16px;
      background-color: white;
    }

    /* Full-width input fields */
    input[type=text], input[type=password] {
      width: 100%;
      padding: 15px;
      margin: 5px 0 22px 0;
      display: inline-block;
      border: none;
      background: #f1f1f1;
    }

    input[type=text]:focus, input[type=password]:focus {
      background-color: #ddd;
      outline: none;
    }

    /* Overwrite default styles of hr */
    hr {
      border: 1px solid #f1f1f1;
      margin-bottom: 25px;
    }

    /* Set a style for the submit button */
    .registerbtn {
      background-color: #04AA6D;
      color: white;
      padding: 16px 20px;
      margin: 8px 0;
      border: none;
      cursor: pointer;
      width: 100%;
      opacity: 0.9;
    }

    .registerbtn:hover {
      opacity: 1;
    }

    /* Add a blue text color to links */
    a {
      color: dodgerblue;
    }

    /* Set a grey background color and center the text of the "sign in" section */
    .signin {
      background-color: #f1f1f1;
      text-align: center;
    }
  </style>
</head>
<body>

<form action="/save" method="post">
  <div class="container">
    <h1>Add Employee</h1>
    <p>Please fill in this form to add a new Employee .</p>
    <hr>

    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" id="name" required>
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>
    <label for="address"><b>Address</b></label>
    <input type="text" placeholder="Enter Address" name="address" id="address" required>
    <label for="phone_number"><b>Phone Number</b></label>
    <input type="text" placeholder="Enter Phone Number" name="phone_number" id="phone_number" required>
    <label for="salary"><b>Salary</b></label>
    <input type="text" placeholder="Enter Salary" name="salary" id="salary" required>
    <hr>
    <label for="department">Choose Department:</label>
    <select name="department" id="department">
      <option value="1">Manager</option>
      <option value="2">Worker</option>
      <option value="3">Engineer</option>
      <option value="4">Sale</option>
    </select>
    <br><br>
    <button type="submit" class="registerbtn">Add</button>
  </div>
</form>

</body>
</html>
