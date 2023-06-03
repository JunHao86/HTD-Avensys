<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
   <head>
       <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
       <title> 
          Create an Employee
       </title>
       <style>
            .c{
            border-style:solid;
            border-width: 4px;
            border-color: black;

            border-spacing: 10px;
            border-collapse: collapse;
        }
       </style>
   </head>
   <body>
       <div class="container c">
            <form:form method="POST" modelAttribute ="ma-employee">
            <legend> Enter account details for the Employee: </legend>

            <div class="mb-3">
                    Employee Name: <form:input type="text" path="emp_name" required="required" class="form-label"/><br>
                </div>

                <div class="mb-3">
                    Employee Password:  <form:input type="text" path="emp_pw" required="required" class="form-label"/>
                                        <form:errors path="emp_pw" cssClass="text-warning"/> <br>
                </div>

                <div class="mb-3">
                    Position:   <form:input type="text" path="emp_pos" required="required" class="form-label"/>
                                <form:errors path="emp_pos" cssClass="text-warning"/><br>
                </div>

                Currently Active?
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="emp_isActive" id="flexRadioDefault1" value="true" checked>
                    <label class="form-check-label" for="flexRadioDefault1">
                    Active
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="emp_isActive" id="flexRadioDefault2" value="false">
                    <label class="form-check-label" for="flexRadioDefault2">
                    Inactive
                    </label>
                  </div>
 
                <input type="submit" class="btn btn-success">
            </form:form>
       </div>

       <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
       <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
   </body>
</html>