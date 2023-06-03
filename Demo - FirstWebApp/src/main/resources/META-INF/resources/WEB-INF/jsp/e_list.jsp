<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title> 
            Employee List
        </title>
    </head>
    <body>
        <div>
            <div>
                <h1>Hey ${name} , Welcome to Avensys!</h1>
                <h2>Here is the Employee Database for Avensys employees!</h2>
            <table class="table table-dark">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Position</th>
                    <th>isActive</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items = "${employee}" var = "employee">
                <tr>
                    <td>${employee.emp_id}</td>
                    <td>${employee.emp_name}</td>
                    <td>${employee.emp_pw}</td>
                    <td>${employee.emp_pos}</td>
                    <td>${employee.emp_isActive}</td>
                    <td><a href="update-employee?eid=${employee.emp_id}" class="btn btn-success">Update</a></td>
                    <td><a href="delete-employee?eid=${employee.emp_id}" class="btn btn-warning">Delete</a></td>
                </tr>
                </c:forEach>
            </tbody>
            </table>
                <a href="create-employee" class="btn btn-success">Add an Employee</a>
            </div>

        <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    </div>
    </body>
</html>