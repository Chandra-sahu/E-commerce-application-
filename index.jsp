<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>:: Welcome Page ::</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        #main_container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }

        #main_body {
            text-align: center;
            margin-top: 20px;
        }

        #empty_box {
            width: 75%;
            height: auto;
            border-radius: 12px;
            background-color: #fff;
            margin: 30px auto;
            padding: 20px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #333;
            margin-bottom: 20px;
        }

        .image-container {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            gap: 20px;
        }

        .image-container img {
            width: 200px;
            height: 200px;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
            transition: transform 0.3s;
        }

        .image-container img:hover {
            transform: scale(1.05);
        }

        .message {
            font-size: 24px;
            color: #444;
            margin-top: 20px;
        }
    </style>
</head>
<body>

    <div id="main_container">
        <%@ include file="header.jsp" %>

        <%@ include file="menu.jsp" %>

        <div id="main_body">
            <a href="products.do">
                <div id="products" class="thumbnails">
                    <img src="static/media/images/products.jpg" height="200">
                    <h2>Products</h2>
                </div>
            </a>
            
            <a href="orders">
                <div id="orders" class="thumbnails">
                    <img src="static/media/images/orders.png" height="200">
                    <h2>Orders</h2>
                </div>
            </a>
        </div>

        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>