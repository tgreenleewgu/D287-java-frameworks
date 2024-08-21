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


## E


## F

## G

## H

## I

## J
