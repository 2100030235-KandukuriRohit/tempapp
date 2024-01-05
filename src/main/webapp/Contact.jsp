<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <%@ include file="Navbar.jsp"%>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/contact.css">
  <link rel="stylesheet" href="css/index.css">
  <title>Contact Page</title>
</head>
<body>
  <div class="contact">
    <div class="container">
      <video src="path/to/your/birdflying.mp4" autoplay loop muted></video>

      <div class="form-container">
        <form>
          <h1><span>Contact</span> Us</h1>
          <div>
            <label for="name">Name</label>
            <input type="text" id="name" placeholder="Enter your name">
          </div>
          <div>
            <label for="email">Email</label>
            <input type="email" id="email" placeholder="Enter your email">
          </div>
          <div>
            <label for="message">Message</label>
            <textarea id="message" rows="10" placeholder="Enter your message"></textarea>
          </div>
          <button type="submit">Submit</button>
        </form>
      </div>
    </div>
  </div>
</body>
</html>