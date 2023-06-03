<html>
    <head>
        <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title> 
            Employee Welcome Page
        </title>
        <style>

        </style>
    </head>
    <body>
        <div class="container p-3 mb-2 bg-light-subtle text-emphasis-light">
            <h1>Welcome ${user}.</h1><br>
            <h3>Username = ${user}. </h3><br>
            <!-- Edit link eventually -->
            <a href="list-employees" 
            class="ink-info link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
            Check the Avensys Employee Database here</a> 
            <br><br>
            <a href="elogin"
            class="ink-info link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
            Return to Login</a>
        </div>
        <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>