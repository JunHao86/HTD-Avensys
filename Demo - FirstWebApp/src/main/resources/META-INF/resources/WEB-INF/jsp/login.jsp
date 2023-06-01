<html>
    <head>
        <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title> 
            Login Page
        </title>
    </head>
    <body>
        Welcome to the login page.
        <pre>${errorMessage}</pre>

        
        <form method="post">
            Name:<input type="text" name="name"><br>
            Password:<input type="password" name="password"><br>
            <button type="submit">Submit</button>
        </form>
        <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>