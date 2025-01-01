<%@ page import="java.util.ArrayList, models.Order" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Page</title>

    <style>
        #main_body {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-evenly;       
            padding: 30px;     
        }
    
        .order_box {
            width: 18%;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 12px;
            padding: 12px;
            margin-left: 10px; 
            margin-right: 10px;
            box-shadow: 10px 10px 15px #ccc; 
            background-color: #f5f5d5;
            margin-bottom: 30px;
        }
    
        .record {            
            padding: 12px;
            border-top: 1px solid #ccc;
        }
    
        .order_id {
            font-weight: bold;
            font-size: 18px;
        }
    
        .order_status {
            color: green;
            font-weight: bold;
        }
    
        #new_order_box {
            text-align: right;
            padding-right: 50px;
        }
    
        #new_order_box a {
            border: 1px solid #555;
            border-radius: 8px;
            padding: 7px 12px;
            text-decoration: none;
            background-color: #eee;
            color: #555;
        }
    </style>
</head>
<body>
    <div id="main_container"> <%@ include file="header.jsp" %>

        <%@ include file="menu.jsp" %>

        <div id="new_order_box">
            <a href="add_order.do">Add New Order</a>
        </div>
    
        <div id="main_body">
            <% ArrayList<Order> orders = (ArrayList<Order>) request.getAttribute("orders"); %>
              
            <% if(orders != null && orders.size() != 0) { %>    
                <% for(Order order : orders) { %>
                    <div class="order_box">
                        <div class="record">
                            <div class="order_id">Order ID: <%= order.getOrderId() %></div>
                            <div><span>Product Name:</span> <%= order.getProductName() %></div> 
                            <div><span>Quantity:</span> <%= order.getQuantity() %></div>
                            <div><span>Price:</span> <%= order.getPrice() %></div>
                            <div class="order_status"><span>Status:</span> <%= order.getStatus() %></div>
                        </div>                        
                    </div>
                <% } } else { %>
                <div id="empty">
                    No Orders Found...
                </div>
            <% } %>
        </div>
        
        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>

