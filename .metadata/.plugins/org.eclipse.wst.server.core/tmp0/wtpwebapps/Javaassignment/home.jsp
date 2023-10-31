<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>Welcome, <%= session.getAttribute("userId") %></h1>
    <ul>
        <li><a href="withdraw.jsp">Withdraw Money</a></li>
        <li><a href="deposit.jsp">Deposit Money</a></li>
        <li><a href="transfer.jsp">Fund Transfer</a></li>
        <li><a href="logout.jsp">Logout</a></li>
    </ul>
</body>
</html>
