package models;

import java.util.ArrayList;
import java.sql.*;

public class Order {
    // #################### Properties #####################################################
    private Integer orderId;
    private String productName;
    private Integer quantity;
    private Double price;
    private String status;
    private User user;

    // #################### Constructors #####################################################
    public Order() {
    }

    public Order(Integer orderId, String productName, Integer quantity, Double price, String status, User user) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.user = user;
    }

    public Order(String productName, Integer quantity, Double price, String status, User user) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.user = user;
    }

    public Order(Integer orderId, String productName, Integer quantity, Double price, String status) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }

    // #################### Other Methods #####################################################
    public boolean saveOrder() {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/authdb?user=root&password=1234");

            String query = "INSERT INTO orders (product_name, quantity, price, status, user_id) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, productName);
            ps.setInt(2, quantity);
            ps.setDouble(3, price);
            ps.setString(4, status);
            ps.setInt(5, user.getUserId());

            if (ps.executeUpdate() == 1) 
                flag = true;

            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public static ArrayList<Order> collectAllOrders(User user) {
        ArrayList<Order> orders = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/authdb?user=root&password=1234");

            String query = "SELECT * FROM orders WHERE user_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, user.getUserId());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int orderId = rs.getInt("order_id");
                String productName = rs.getString("product_name");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                String status = rs.getString("status");

                Order order = new Order(orderId, productName, quantity, price, status, user);
                orders.add(order);
            }

            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return orders;
    }

    // ##################### Getter-Setters #################################################
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }
}