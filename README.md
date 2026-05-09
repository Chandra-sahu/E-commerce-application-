# 🛒 Java E-Commerce Web Application

A full-featured **E-Commerce Web Application** built using **Java, JSP, Servlets, JDBC, and MySQL**. This project provides a complete online shopping platform with user authentication, product management, order processing, and customer profile management.

---

## 🚀 Project Overview

This project is designed to simulate a real-world online shopping system where users can browse products, register/login, manage profiles, and place orders.

It demonstrates the implementation of **Java Web Development concepts**, database connectivity, session management, and dynamic web page rendering using JSP and Servlets.

---

# ✨ Features

## 👤 User Module
- User Registration
- User Login & Logout
- Profile Management
- Secure Session Handling

## 📦 Product Module
- View Available Products
- Product Listing Page
- Add Products (Admin)

## 🛍️ Order Module
- Place Orders
- View Order History
- Order Processing

## 📊 Dashboard
- Customer Dashboard
- Navigation Menu
- Dynamic Data Rendering

---

# 🛠️ Technologies Used

### Backend
- Java
- JSP
- Servlets
- JDBC

### Frontend
- HTML5
- CSS3
- JSP Pages

### Database
- MySQL

### Server
- Apache Tomcat

---

# 📂 Project Structure

```bash
Java-Ecommerce-Application/
│
├── AddProductServlet.java
├── OrdersServlet.java
├── ProductsServlet.java
├── SigninServlet.java
├── SignoutServlet.java
├── SignupServlet.java
├── UserProfileServlet.java
│
├── Product.java
├── Order.java
├── User.java
│
├── dashboard.jsp
├── index.jsp
├── products.jsp
├── orders.jsp
├── signin.jsp
├── signup.jsp
├── userProfile.jsp
├── add_product.jsp
│
├── header.jsp
├── footer.jsp
├── menu.jsp
│
├── common.css
├── form.css
├── header.css
├── footer.css
│
├── sql.txt
└── web.xml
```

---

# ⚙️ Installation & Setup

## Clone Repository

```bash
git clone https://github.com/your-username/Java-Ecommerce-Application.git
```

---

## Import into IDE

Import project into:

- Eclipse IDE
- NetBeans
- IntelliJ IDEA

---

## Configure Database

Create MySQL database:

```sql
CREATE DATABASE ecommerce;
```

Run SQL script from:

```bash
sql.txt
```

---

## Configure Database Connection

Update database credentials inside your Java DB connection file:

```java
String url = "jdbc:mysql://localhost:3306/ecommerce";
String username = "root";
String password = "your_password";
```

---

## Deploy on Apache Tomcat

- Add project to Tomcat server
- Start Server

Access:

```bash
http://localhost:8080/Java-Ecommerce-Application
```

---

# 📸 Application Screens

### Home Page
(Add Screenshot)

### User Login
(Add Screenshot)

### Dashboard
(Add Screenshot)

### Products Page
(Add Screenshot)

### Orders Page
(Add Screenshot)

---

# 🔄 Workflow

### User Flow

1. Signup
2. Login
3. Browse Products
4. Place Orders
5. View Profile
6. Logout

---

# 🔐 Security Features

- Session-based Authentication
- Login Validation
- Logout Protection
- User Access Control

---

# 📈 Learning Outcomes

This project demonstrates:

- Java Web Application Development
- MVC Architecture Basics
- Database Connectivity using JDBC
- Session Management
- Dynamic Content Rendering using JSP
- Servlet Request Handling

---

# 🚀 Future Enhancements

- Shopping Cart System
- Payment Gateway Integration
- Product Search & Filters
- Admin Dashboard Analytics
- Product Reviews & Ratings
- REST API Integration

---

# 👨‍💻 Author

## Chandra Shekhar Sahu

**MCA Graduate | Java Full Stack & Data Science Enthusiast**

Skills:

- Java Development
- JDBC
- JSP & Servlets
- MySQL
- Machine Learning
- Full Stack Development

---

# 🤝 Contribution

Contributions are welcome.

Steps:

1. Fork Repository
2. Create Feature Branch
3. Commit Changes
4. Push to Branch
5. Open Pull Request

---

# ⭐ Support

If you found this project useful:

⭐ Star this repository  
🍴 Fork it  
📢 Share it



### "Building scalable Java web solutions for modern e-commerce experiences."
