package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

import models.User;
import models.Product;

@WebServlet("/add_product.do")
public class AddProductServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");

        String nextPage = "signin.jsp";

        if(user!=null) {
            nextPage = "add_product.jsp";
        }
        request.getRequestDispatcher(nextPage).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");

        String nextPage = "signin.do";

        if(user!=null) {
            String productName = request.getParameter("product_name");
            Integer price = Integer.parseInt(request.getParameter("price"));
            Float weight = Float.parseFloat(request.getParameter("weight"));
            Integer quantity = Integer.parseInt(request.getParameter("quantity"));
            String description = request.getParameter("description");

            Product product = new Product(productName, price, weight, quantity, description, user);
            product.saveProduct();

            nextPage = "products.do";
        }
        
        response.sendRedirect(nextPage);
    }
}
