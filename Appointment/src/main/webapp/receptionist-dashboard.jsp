<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Receptionist Dashboard</title>

    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #E5E5E5;
            margin: 0;
            padding: 0;
        }

        h2 {
            background-color: #FF5722;
            color: #fff;
            text-align: center;
            padding: 15px 0;
            margin: 0;
        }

        form {
            background-color: #88D780;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            padding: 20px;
            max-width: 600px;
            margin: 20px auto;
        }

        label {
            display: block;
            margin: 10px 0;
            color: #333;
            font-weight: bold;
        }

        input[type="text"],
        input[type="number"],
        textarea,
        select,
        input[type="date"],
        input[type="time"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button {
            background-color: #FF2E63;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: #FF0044;
        }

        .success-message {
            color: green;
            font-weight: bold;
            text-align: center;
            display: none;
        }

        a {
            display: block;
            text-align: center;
            color: #FF2E63;
            text-decoration: none;
            margin-top: 20px;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<h2>Add Patient Details</h2>
<form method="post" action="/receptionist/patient-details">
    <div>
        <label for="patientName">Patient Name:</label>
        <input type="text" id="patientName" name="patientName" required>
    </div>
    <div>
        <label for="patientInfo">Patient Info:</label>
        <textarea id="patientInfo" name="patientInfo" required></textarea>
    </div>
    <div>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required>
    </div>
    <div>
        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required>
    </div>
    <div>
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber" required>
    </div>
    <div>
        <label for="doctorId">Select Doctor:</label>
        <select name="doctorId" required>
            <option value="">Select Doctor</option>
            <c:forEach items="${doctors}" var="doctor">
                <option value="${doctor.id}">${doctor.fullName} - ${doctor.specialization}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        <label for="appointmentDate">Appointment Date:</label>
        <input type="date" id="appointmentDate" name="appointmentDate" required>
    </div>
    <div>
        <label for="appointmentTime">Appointment Time:</label>
        <input type="time" id="appointmentTime" name="appointmentTime" required>
    </div>
    <div>
        <button type="submit" id="submitBtn">Submit</button>
    </div>
</form>

<div class="success-message" id="successMessage">Patient details registered</div>

<script>
    document.getElementById('appointmentDate').min = new Date().toISOString().split('T')[0];

    document.getElementById('submitBtn').addEventListener('click', function () {
        document.getElementById('successMessage').style.display = 'block';
    });
</script>

<a href="/">Logout</a>

</body>
</html>
