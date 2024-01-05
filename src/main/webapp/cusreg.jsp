<!DOCTYPE html>
<html lang="en">
<%@ include file="Navbar.jsp"%>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/cusreg.css">
  <link rel="stylesheet" href="css/index.css">
  <title>Registration Form</title>
</head>
<body>
  <div class="all">
    <video src="/example" class="img" autoplay loop muted></video>
 
    <div class="login-box-1">
      <h2>Register</h2>
      <form method="post" action="insertcus">
        <div class="user-box">
          <input type="text" name="UserName" required />
          <label>Username</label>
        </div>
        <div class="user-box">
          <input type="email" name="Email" required />
          <label>Email</label>
        </div>
        <div class="user-box">
          <input type="text" name="Adress" required />
          <label>Address</label>
        </div>
        <div style="color: white;">DOB:</div>
        <div class="user-box">
          <input type="date" name="DOB" required />
        </div>
        <div>
          <div style="color: white;">SEX:</div><br />
          <label for="sex"></label>
          <select name="sex" class="form-control browser-default custom-select">
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="unspecified">Unspecified</option>
          </select>
        </div>
        <br />
        <div class="user-box">
          <input type="tel" name="phnmbr" required />
          <label>Phone</label>
        </div>
        <div class="user-box">
          <input type="password" name="pass" required />
          <label>Password</label>
        </div>
        
      <input type="submit" <a >
          <span></span>
          <span></span>
          <span></span>
          <span></span>
          Register
        </a>>
        <a class="account" href="/Signin">Already Registered?</a>
      </form>
    </div>
  </div>
</body>
</html>
