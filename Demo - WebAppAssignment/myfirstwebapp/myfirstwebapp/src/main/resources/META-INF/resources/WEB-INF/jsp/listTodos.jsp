 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
		<title>Todos Page</title>
	</head>
	<body>
		<div class = "contrainer">
		<h1>Your Todos are </h1>
		<table class = "table">
		<thread>
			<tr>
				<th>Id</th>
				<th>Username</th>
				<th>Description</th>
				<th>TragetDate</th>
				<th>Status</th>
				<th></th>
				<th></th>
			</tr>
		</thread>
		<tbody>
			<c:forEach items = "${todos}" var = "todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.username}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
					<td> <a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>
	<script src = "/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src = "/webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>