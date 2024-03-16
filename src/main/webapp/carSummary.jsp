<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.builder.Pizza" %>
<!DOCTYPE html>
<html>
<head>
<title>Car Summary</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<h2>Car Order Summary</h2>
		<p>
			<strong>Shape:</strong> ${car.shape}
		</p>
		<p>
			<strong>Color:</strong> ${car.color}
		</p>
		<p>
			<strong>Type:</strong>
		</p>
		<ul>
			<%
    Car car = (Car) request.getAttribute("Car");
    if (car != null && car.getType() != null) {
        for(String type : car.getType()) {
%>
			<li><%= type %></li>
			<%
        }
    }
%>
		</ul>
		<a href="orderCar.jsp" class="btn btn-primary">Order your second
			Car</a>
	</div>
</body>
</html>