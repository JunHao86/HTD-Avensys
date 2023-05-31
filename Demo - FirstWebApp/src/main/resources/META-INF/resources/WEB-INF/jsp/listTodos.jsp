 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title> 
            Todos Page
        </title>
    </head>
    <body>
        <div>Hey ${name} , Welcome to Todos!</div>
        <div>Your Todos are ${todos}</div>
        <table>
        <thead>
            <tr>
                <th>id</th>
                <th>username</th>
                <th>description</th>
                <th>targetdate</th>
                <th>status</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items = "${todos}" var = "todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.username}</td>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                
            </tr>
            </c:forEach>
        </tbody>
        </table>
    
    </body>
</html>