<html>
    <head>
        <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title> Employee Login Page </title>
        <!-- Touch up with bootstrap later -->
    </head>
    <body>
        <div class="container p-3 mb-2 bg-light-subtle text-emphasis-light">
            <h1>Welcome to Avensys!</h1>
            <pre>${errorMessage}</pre>

            <form method="post">
                Username: <input type="text" name="username">  
                Password: <input type="password" name="password"><br>
                <br>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
        <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>