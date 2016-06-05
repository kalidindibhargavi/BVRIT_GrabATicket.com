<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
 <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
body {
    border-collapse: collapse;
    background-image:url("https://fbcdn-sphotos-e-a.akamaihd.net/hphotos-ak-xtp1/v/t1.0-9/10734037_1569370753285631_5924407247485389463_n.jpg?oh=372db81d97781f70e0424f00dcb33ec5&oe=57E467E8&__gda__=1472816078_af2bfe398ceb10689e0eeb4afbf1d8cb");
    background-size: 1000px, 8000px;
    background-repeat: no-repeat;
    text-field: right;
    text-color: white;
    
}
container{
text-color: #000000;
}
modal-header, h4, close {
      background-color: #5cb85c;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
  modal-footer {
      background-color: #f9f9f9;
  }
</style>
</head>

<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Movies <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="telmoviesView.jsp">Telugu</a></li>
          <li><a href="hinmoviesView.jsp">Hindi</a></li>
          <li><a href="engmoviesView.jsp">English</a></li>
        </ul>
      </li>
      <li><a href="trailerView.jsp">Trailer</a></li>
      <li><a href="">Page 2</a></li>
      
    </ul>
  </div>
</nav>
  
      <div class="form-group">
      <input type="text" class="form-control" id="usr" placeholder ="pick up user name"></div> 
   <div class="form-group">
      <input type="text" class="form-control" id="usr" placeholder ="create new password"></div> 
      <div class="form-group">
      <button type="submit" class="btn btn-success">Signup for ticket</button></div>
<div class="container">
  <h1>If you already picked ur name then go for </h1>
  </div>
   <div class="container">
   <button type="button" class="btn btn-default btn-lg" id="myBtn">Login</button>
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 style="color:red;"><span class="glyphicon glyphicon-lock"></span> Login</h4>
        </div>
        <div class="modal-body">
          <form role="form">
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span> Username</label>
              <input type="text" class="form-control" id="usrname" placeholder="Enter email">
            </div>
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
              <input type="text" class="form-control" id="psw" placeholder="Enter password">
            </div>
            <div class="checkbox">
              <label><input type="checkbox" value="" checked>Remember me</label>
            </div>
            <button type="submit" class="btn btn-default btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Login</button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-default btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          <p>Not a member? <a href="#">Sign Up</a></p>
          <p>Forgot <a href="#">Password?</a></p>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>
