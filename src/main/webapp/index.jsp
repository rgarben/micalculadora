<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="mi_calculadora.Calculadora"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>My strange calculator</title> 

<link rel="stylesheet" href="style.css">
</head>
<body class="bg-dark">

	<%! StringBuilder sb = new StringBuilder(); %>

    <div class="container justify-content-center align-items-center vh-100 d-flex">

        <div>

            <form method="get" action="index.jsp">

                <span class="input-group-text mb-2" id="inputGroup-sizing-lg">Number operation</span>
                
                <div class="area">
	                <%
	                	if(request.getParameter("add")!=null){
	                		Calculadora.add(request.getParameter("number"), sb);
	                		Calculadora.add(request.getParameter("operator"), sb);
	                	}else if (request.getParameter("clear")!=null){
	                		Calculadora.delete(request.getParameter("clear"), sb);
	                	}else if (request.getParameter("c")!=null){
	                		sb.append("="+Calculadora.calculate(sb));
	                	}	               				
	                %>
	                <% out.println(sb.toString());%>
                </div>
                <br>
                					
                <input type="number" class="w-100 mb-2" name="number">

                <br><select class="form-select mb-2" aria-label="Default select example" name="operator">
                    <option selected value=""> </option>
                    <option value="+">Sum</option>
                    <option value="-">Subtract</option>
                </select>
                <input type="submit" class="btn btn-light mb-2" value="Add Number" name="add">
                <input type="submit" class="btn btn-light mb-2" value="Calculate" name="c">
                <input type="submit" class="btn btn-light mb-2" value="clear" name="clear">

            </form>

        </div>

    </div>

</body>
</html>