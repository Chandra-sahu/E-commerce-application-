package controllers;

import models.User;
import models.Product;
import models.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/userProfile")
public class UserProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User ) session.getAttribute("user");

        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        ArrayList<Product> products = Product.collectAllProducts(user);
        ArrayList<Order> orders = Order.collectAllOrders(user);

        request.setAttribute("products", products);
        request.setAttribute("orders", orders);
        request.getRequestDispatcher("userProfile.jsp").forward(request, response);
    }
}