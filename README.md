# Changes C-J

## C
Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
mainscreen  - line 14 chaged title to " my Golf Shop"
            -line 19 Change name of the shop to `Swinging Richard's Golf Shop"
            - line 14 - 160 add inline css to change colors of page and tables.
           
             <style>
            .header-image {
            display: block;
            margin-left: auto;
            margin-right: auto;
            width: 100%;
            }

        body {
            margin: 0;
            padding: 0;
            color: #000;
            background-color: black; /* Changes background to black */
            font-family: "Gill Sans", Helvetica, Arial, sans-serif;
            font-size: 1em;
            line-height: 1.2;
        }

        h1 {
            margin: 0;
            margin-top: 0.67em;
            font-weight: bold;
            font-size: 1.8em;
            line-height: 1;
            text-align: center; /* Centers the title */
            color: #ff0000; /* Changes title color to red */
        }

        h2 {
            margin: 0 0 1em;
            color: #ff0000; /* Changes h2 color to red */
        }

        p {
            margin: 1em 0 1.5em;
            line-height: 1.5;
        }

        a:link {
            color: black; /* Changes link color to red */
            background-color: transparent;
        }

        a:visited {
            color: darkgrey; /* Changes visited link color to dark red */
            background-color: transparent;
        }

        a:focus {
            color: #fff;
            background-color: #000;
            outline: 0;
        }

        a:active {
            color: #ff0000;
            background-color: transparent;
        }

        .container {
            margin: 0 auto;
            max-width: 60em;
            background: black; /* Changes container background to black */
        }
        .thead-dark {
            background-color: black; /* Changes table header background to black */
            color: red; /* Changes table header text color to white */
        }

        .navigation-primary ul {
            margin: 0;
            padding: 0;
            list-style-type: none;
            overflow: hidden;
        }

        .navigation-primary li {
            display: inline;
        }

        .navigation-primary a {
            float: left;
            padding: .5em 1em;
            color: #fff;
            background: #000;
            text-decoration: none;
            border-right: 1px solid #fff;
        }

        .navigation-primary a:hover {
            background: #ff0000; /* Changes hover background to red */
        }

        .navigation-primary a:focus {
            background: #000;
            outline: none;
        }

        .navigation-primary a:active {
            background: #ff0000; /* Changes active background to red */
        }

        .footer-primary {
            background-color: #000; /* Changes footer background to black */
            color: #fff;
            padding: 20px;
        }

        /* Form styling */
        form {
            color: #ff0000; /* Changes form text color to red */
        }

        input[type="text"] {
            background-color: #000; /* Changes input background to black */
            color: #ff0000; /* Changes input text color to red */
            border: 1px solid #ff0000; /* Adds a red border */
        }

        input[type="submit"], input[type="button"] {
            background-color: #ff0000; /* Changes button background to red */
            color: #fff; /* Changes button text color to white */
            border: 1px solid #ff0000; /* Adds a red border */
        }

        input[type="submit"]:hover, input[type="button"]:hover {
            background-color: #800000; /* Changes button background on hover to dark red */
            border: 1px solid #800000; /* Changes button border on hover to dark red */
        }

        table.table {
            color: #000; /* Changes table text color to black */
            background-color: #fff; /* Changes table background color to white */
        }
        form {
            color: #ff0000; /* Changes form text color to red */
            background-color: #333; /* Changes form background color to dark gray */
            padding: 15px; /* Adds some padding inside the form */
            border-radius: 5px; /* Optional: adds rounded corners */
        }
        tbody tr:nth-child(odd) {
            background-color: darkred; /* Changes odd rows to light gray */
        }
        tbody tr:nth-child(even) {
            background-color: red; /* Changes odd rows to light gray */
        }
    </style>


        }
added matching css for line 12-72 of inhouse/products/outsourced forms.

        <style>
        body {
            margin: 0;
            padding: 0;
            color: #ff0000; /* Red text color */
            background-color: black; /* Black background */
            font-family: "Gill Sans", Helvetica, Arial, sans-serif;
            font-size: 1.2em;
            line-height: 1.5;
            text-align: center;
        }

        h1 {
            font-size: 2.5em;
            margin-top: 20px;
            color: #ff0000;
        }

        p {
            margin: 20px 0;
            font-size: 1.1em;
            color: #ff0000;
        }

        a {
            color: #ff0000;
            text-decoration: none;
            font-weight: bold;
            padding: 10px 20px;
            background-color: #333;
            border-radius: 5px;
            border: 2px solid #ff0000;
            display: inline-block;
            margin-top: 20px;
        }

        a:hover {
            background-color: #800000; /* Dark red hover effect */
        }
        </style>
mainscreen line 185 
            - changed "parts" to "indvidual clubs"
main screen line 186
            - changed "products" to "club sets"

## D
Added About page and foramted to fit the rest of the site.

Mainscreencontroller line 56
            - added mapping to link to about page.
            - @GetMapping("/about")
mainsceen line line 184 
            - added link to about page.
            - <a href="/about">About</a>


## E
    added 5 part and 5 products to the part/products repositories. 
    used if statements to check if the repositories are empty before adding the parts/products.

        if(partRepository.count()==0) {


            InhousePart driver = new InhousePart();
            driver.setName("Driver");
            driver.setPrice(450.0);
            driver.setInv(10);
            driver.setPartId(1); // Assuming partId is an identifier specific to InhousePart
            partRepository.save(driver);

            InhousePart drivingIron = new InhousePart();
            drivingIron.setName("Driving Iron");
            drivingIron.setPrice(215.0);
            drivingIron.setInv(6);
            drivingIron.setPartId(2); // Assuming partId is an identifier specific to InhousePart
            partRepository.save(drivingIron);

            InhousePart irons = new InhousePart();
            irons.setName("Irons");
            irons.setPrice(1200.0);
            irons.setInv(16);
            irons.setPartId(3); // Assuming partId is an identifier specific to InhousePart
            partRepository.save(irons);

            InhousePart wedges = new InhousePart();
            wedges.setName("Wedges");
            wedges.setPrice(300.0);
            wedges.setInv(15);
            wedges.setPartId(4); // Assuming partId is an identifier specific to InhousePart
            partRepository.save(wedges);


            InhousePart putter = new InhousePart();
            putter.setName("Putter");
            putter.setPrice(175.0);
            putter.setInv(12);
            putter.setPartId(5); // Assuming partId is an identifier specific to InhousePart
            partRepository.save(putter);
        }

        if(productRepository.count()==0) {
            ;

            Product fullSet = new Product();
            fullSet.setName("Full Set");
            fullSet.setPrice(3000.0);
            fullSet.setInv(12);
            fullSet.setId(6);
            productRepository.save(fullSet);

            Product midRange = new Product();
            midRange.setName("Mid Range Set");
            midRange.setPrice(1500.0);
            midRange.setInv(3);
            midRange.setId(7);
            productRepository.save(midRange);

            Product drivingSet = new Product();
            drivingSet.setName("Driving Set");
            drivingSet.setPrice(670.0);
            drivingSet.setInv(3);
            drivingSet.setId(8);
            productRepository.save(drivingSet);

            Product shortSet = new Product();
            shortSet.setName("Short Game Set");
            shortSet.setPrice(480.0);
            shortSet.setInv(5);
            shortSet.setId(9);
            productRepository.save(shortSet);

            Product ironsOnly = new Product();
            ironsOnly.setName("Irons Only Set");
            ironsOnly.setPrice(1400.0);
            ironsOnly.setInv(12);
            ironsOnly.setId(10);
            productRepository.save(ironsOnly);

## F

added one line of code to create buy now button on main screen line 250
            - <a th:href="@{/buynow(productID=${tempProduct.id})}" class="btn btn-success btn-sm mb-3">Buy Now</a>
added 3 new pages to code
-class BuyNowController
    

    package com.example.demo.controllers;
    import com.example.demo.domain.Product;
    import com.example.demo.repositories.ProductRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    
    import java.util.Optional;
    
    @Controller
    public class buyNowController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buynow")
    public String buyProduct(@RequestParam("productID") Long theId, Model theModel) {
        Optional<Product> productToBuy = productRepository.findById(theId);

        if (productToBuy.isPresent()) {    //check if product in catalog
            Product product = productToBuy.get();

            if (product.getInv() > 0) {    //check if product still in stock
                product.setInv(product.getInv() - 1);   //decrement stock
                productRepository.save(product);    //save to product database

                return "/confirmsuccess";   //successful purchase
            } else {
                return "/confirmfailure";   //purchase failed: out of stock
            }
        } else {
            return "/confirmfailure";  //purchase failed: product not found
        }
    }
}

    confirmsuccess HTML page
        <!DOCTYPE html>
        <html lang="en">
        <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Purchase Successful</title>
        <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            color: #333;
            padding: 20px;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #28a745;
            text-align: center;
            font-size: 1.8em;
            margin-bottom: 20px;
        }

        p {
            margin-bottom: 20px;
            line-height: 1.5;
        }

        .details {
            background-color: #f1f1f1;
            padding: 15px;
            border-radius: 5px;
            margin-bottom: 20px;
        }

        .details p {
            margin: 0;
        }

        .support {
            text-align: center;
            margin-top: 30px;
        }

        .support a {
            color: #007bff;
            text-decoration: none;
            font-weight: bold;
        }

        .support a:hover {
            text-decoration: underline;
        }
    </style>
    </head>
    <a href="http://localhost:8080/">Home</a>
    <body>

    <div class="container">
    <h1>Purchase Successful!</h1>
    <p>Thank you for your purchase. Your order has been successfully processed.</p>

    <div class="details">
        <p><strong>Order Number:</strong> #123456789</p>
        <p><strong>Date:</strong> Month Day, Year</p>
        <p><strong>Total Amount:</strong> $99.99</p>
    </div>

    <p>You will receive a confirmation email shortly with the details of your purchase.</p>
    <p>If you have any questions or need further assistance, please don't hesitate to contact our support team.</p>

    <div class="support">
        <p><strong>Customer Support:</strong></p>
        <a href="mailto:support@example.com">support@example.com</a>
    </div>
    </div>

    </body>
    </html>

confirmfailure HTML page 

    !DOCTYPE html>
    <html lang="en">
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Purchase Unsuccessful</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            color: #333;
            padding: 20px;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #ff0000;
            text-align: center;
            font-size: 1.8em;
            margin-bottom: 20px;
        }

        p {
            margin-bottom: 20px;
            line-height: 1.5;
        }

        ul {
            list-style-type: disc;
            padding-left: 20px;
        }

        ul li {
            margin-bottom: 10px;
        }

        .support {
            text-align: center;
            margin-top: 30px;
        }

        .support a {
            color: #007bff;
            text-decoration: none;
            font-weight: bold;
        }

        .support a:hover {
            text-decoration: underline;
        }
    </style>
    </head>
    <a href="http://localhost:8080/">Home</a>
    <body>

    <div class="container">
    <h1>Purchase Unsuccessful</h1>
    <p>We’re sorry, but your purchase could not be completed at this time.</p>
    <p><strong>Possible reasons for this issue:</strong></p>
    <ul>
        <li>Insufficient funds or incorrect payment details.</li>
        <li>Network or connection issues.</li>
        <li>The item is out of stock or no longer available.</li>
        <li>Technical difficulties on our end.</li>
    </ul>
    <p><strong>What you can do:</strong></p>
    <ul>
        <li>Double-check your payment information and try again.</li>
        <li>Ensure your internet connection is stable.</li>
        <li>If the problem persists, please contact our customer support team for assistance.</li>
    </ul>
    <p>We apologize for the inconvenience and appreciate your understanding.</p>

    <div class="support">
        <p><strong>Customer Support:</strong></p>
        <a href="mailto:support@example.com">support@example.com</a>
    </div>
    </div>

    </body>
    </html>



    
## G

## H

## I

## J
