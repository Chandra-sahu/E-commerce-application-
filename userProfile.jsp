<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="models.User" %>
<%@ page import="models.Product" %>
<%@ page import="models.Order" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="javax.servlet.http.HttpSession" %>

<%
    HttpSession session = request.getSession();
    User user = (User ) session.getAttribute("user");
    
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    ArrayList<Product> products = Product.collectAllProducts(user);
    ArrayList<Order> orders = Order.collectAllOrders(user);
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Profile</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>User Profile</h1>
    <h2>Welcome, <%= user.getUsername() %>!</h2>

    <h3>Your Products</h3>
    <table border="1">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Description</th>
        </tr>
        <%
            for (Product product : products) {
        %>
        <tr>
            <td><%= product.getProductId() %></td>
            <td><%= product.getProductName() %></td>
            <td><%= product.getPrice() %></td>
            <td><%= product.getQuantity() %></td>
            <td><%= product.getDescription() %></td>
        </tr>
        <%
            }
        %>
    </table>

    <h3>Your Orders</h3>
    <table border="1">
        <tr>
            <th>Order ID</th>
            <th>Product Name</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>Status</th>
        </tr>
        <%
            for (Order order : orders) {
        %>
        <tr>
            <td><%= order.getOrderId() %></td>
            <td><%= order.getProductName() %></td>
            <td><%= order.getQuantity() %></td>
            <td><%= order.getPrice() %></td>
            <td><%= order.getStatus() %></td>
        </tr>
        <%
            }
        %>
    </table>

    <a href="logout.jsp">Logout</a>
</body>
</html>