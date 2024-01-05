<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/login.css">
  <link rel="stylesheet" href="css/index.css">
  <title>Sign In</title>
</head>
<body>
  <div class="all">
    <video src="/signbg"  autoplay loop muted></video>
    <a href="/" class="back-button"> 
      <h3>Go back</h3>
    </a>
    <div class="login-box">
      <h2>Sign in</h2>
      <form method="post" action="cuslogin">
        <div class="user-box">
          <input type="text" name="Email" required />
          <label>Email</label>
        </div>
        <div class="user-box">
          <input type="password" name="pass" required />
          <label>Password</label>
        </div>
        <button type="submit">
          <span></span>
          <span></span>
          <span></span>
          <span></span>
          Submit
        </button>
        <a class="account" href="/">Don't have an account?</a>
      </form>
    </div>
  </div>
</body>
</html>
