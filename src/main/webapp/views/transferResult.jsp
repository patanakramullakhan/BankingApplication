<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TRANSFER RESULT</title>
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
            margin-top: 500px;
            bottom: 0;
            z-index: 100;
        }
       .r{
       		text-align: center;
       }
        
    </style>
</head>
<body>
    <header>
        <h1>Welcome to SDFC Bank</h1>
        <nav>
            <a href="/">Home</a>
            <a href="newAccountUrl">Open Account</a>
            <a href="/depositUrl">Deposit</a>
            <a href="/withdrawUrl">Withdraw</a>
            <a href="/balanceCheckUrl">Balance Check</a>
            <a href="/transferUrl">Transfer</a>
            <a href="/closeAccountUrl">Close Account</a>
            <a href="">About Us</a>
        </nav>
    </header>
    <main>
        
        <div class="r">
        	
        	<h2>YOU ARE TRANSFERING...${transfer.amount}</h2>
        	<h2>YOUR PRIVOUS BALANCE...${transfer.prevBal}</h2>
        	<h2>YOUR CURRENT BALANCE..${transfer.currBal}</h2>
        	<h2>......................................................................................</h2>
        	
        	<h2>YOU ARE TRANSFERING TO ...${transfer.transferAccountNumber} ACCOUNT</h2>
        	<h2>YOUR TRANSFER PREVIOUS BALANCE...${transfer.transferPrevBal}</h2>
        	<h2>YOUR TRANSFER CURRENT BALANCE...${transfer.transferCurrBal}</h2>
        
        </div>
        
        
    </main>
    <footer>
        <p>&copy; 2022 Our Bank. All rights reserved.</p>
    </footer>
</body>
</html>