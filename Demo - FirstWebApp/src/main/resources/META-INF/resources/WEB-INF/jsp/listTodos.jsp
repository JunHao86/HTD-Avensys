<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title> 
            Todos Page
        </title>
    </head>
    <body>
        <h1>Hey ${name} , Welcome to Todos!</h1>
        <!-- <div>Your Todos are ${todos}</div> -->
        <table class="table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Description</th>
                <th>TargetDate</th>
                <th>Status</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items = "${todos}" var = "todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.username}</td>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
                <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
                <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
            </tr>
            </c:forEach>
        </tbody>
        </table>

        <a href="add-todo" class="btn btn-success">Add Todo</a>

        <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>