<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE html>

<html>

<head>

    
<meta
 
charset="UTF-8">

    
<title>Patient Login</title>
    <style>
        body {
            font-family: sans-serif;
            background-color: #fff;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        h2 {
            color: #007BFF; /* Text color for the heading */
            text-align: center;
            padding: 20px 0;
            border-radius: 10px;
            margin: 0;
        }

        form {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 300px;
            margin: 0 20px;
        }

        label {
            display: block;
            margin: 10px 0;
            color: #333;
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            display: block;
            width: 100%;
            margin-top: 10px;
        }

        button[type="submit"]:hover {
            background-color: #0056b3;
        }

        c\:if test="${not empty error}" {
            div {
                color: red;
                font-weight: bold;
                text-align: center;
                margin-top: 10px;
            }
        }
    </style>
</head>
<body>
    <h2>Patient Login</h2>
    <form action="/patientlogin" method="post">

        
<div>

            
<label
 
for="username">Username:</label>

            
<input
 
type="text"
 
id="username"
 
name="username"
 
required>

        
</div>

        
<div>

            
<label
 
for="password">Password:</label>

            
<input
 
type="password"
 
id="password"
 
name="password"
 
required>

        
</div>

        
<div>

            
<button
 
type="submit">Login</button>

        
</div>
    </form>
    <c:if test="${not empty error}">
        <div>${error}</div>
    </c:if>
</body>
</html>