<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #f1f1f1;
            padding: 20px;
            text-align: center;
            position: sticky;
            top: 0;
            z-index: 100;
        }
        header a {
            color: black;
            margin: 0 10px;
            text-decoration: none;
            padding: 8px 16px;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        header a:hover {
            color: #444;
            background-color: #ddd;
        }
        main {
            padding: 20px;
        }
        footer {
            background-color: #f1f1f1;
            padding: 10px;
            text-align: center;
            position: sticky;
            margin-top: 300px;
            margin-top:300px
            bottom: 0;
            z-index: 100;
        }
        h2{
        	color:green;
        	text-align: center;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to SDFC Bank</h1>
        <nav>
            <a href="/">Home</a>
            <a href="/newAccountUrl">Open Account</a>
            <a href="/depositUrl">Deposit</a>
            <a href="/withdrawUrl">Withdraw</a>
            <a href="/balanceCheckUrl">Balance Check</a>
            <a href="/transferUrl">Transfer</a>
            <a href="/closeAccountUrl">Close Account</a>
            <a href="/aboutUrl">About Us</a>
        </nav>
    </header>
    <main>
        <h2>ACCOUNT OPENED SUCCESSFULLY....</h2>
        
    </main>
    <footer>
        <p>&copy; 2022 Our Bank. All rights reserved.</p>
    </footer>
</body>
</html>