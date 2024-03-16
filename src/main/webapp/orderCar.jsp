<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Car Order</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2>Order Your Car</h2>
        <form action="orderCar" method="post">
            <div class="form-group">
                <label for="shape">Shape:</label>
                <select class="form-control" id="shape" name="shape">
                    <option>Sedan</option>
                    <option>Muscles</option>
                    <option>Sports</option>
                </select>
            </div>
            <div class="form-group">
                <label for="color">Color:</label>
                <select class="form-control" id="color" name="color">
                    <option>White</option>
                    <option>Black</option>
                    <option>Silver</option>
                </select>
            </div>
            <div class="form-group">
                <label>Type:</label><br>
                <input type="checkbox" name="type" value="Dodge"> Dodge<br>
                <input type="checkbox" name="toppings" value="Mercedes"> Mercedes<br>
                <input type="checkbox" name="toppings" value="BMW"> BMW<br>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>
</html>