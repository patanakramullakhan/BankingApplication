<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BALANCE CHECK</title>
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
            bottom: 0;
            z-index: 100;
        }
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 100%;
            max-width: 500px;
            margin: 0 auto;
            padding: 20px;
            box-sizing: border-box;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input,
        .form-group select {
            width: 100%;
            padding: 10px;
            box-sizing: border-box;
        }
        .form-group button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
            width: 100%;
        }
        .form-group button:hover {
            background-color: #45a049;
        }
        h1{
        	color: purple;
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
            <a href="">About Us</a>
        </nav>
    </header>
    <main>
      <div class="container">
        
        <h1>BALNCE CHECK</h1>
        
        <form action="/balance-check" method="post">
            <div class="form-group">
                <label for="accountNumber">Account Number</label>
                <input type="text" id="accountNumber" name="accountNumber" required>
            </div>
            <div class="form-group">
                <label for="accountName">Account Name</label>
                <input type="text" id="accountName" name="accountName" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label for="confirmPassword">Confirm Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" required>
            </div>
            
            <div class="form-group">
                <button type="submit">Check Balance</button>
            </div>
        </form>
    </div>
  </main>
    <footer>
        <p>&copy; 2024 SDFC Bank. All rights reserved.</p>
    </footer>
</body>
</html>
   