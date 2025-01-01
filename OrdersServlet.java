package controllers;

import models.Order;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/orders")
public class OrdersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        ArrayList<Order> orders = getOrders(); 

        
        request.setAttribute("orders", orders);

        
        request.getRequestDispatcher ("/orders.jsp").forward(request, response);
    }

    private ArrayList<Order> getOrders() {
        
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Product A", 2, 20.00, "Shipped"));
        orders.add(new Order(2, "Product B", 1, 15.00, "Pending"));
        orders.add(new Order(3, "Product C", 3, 30.00, "Delivered"));
        return orders;
    }
}