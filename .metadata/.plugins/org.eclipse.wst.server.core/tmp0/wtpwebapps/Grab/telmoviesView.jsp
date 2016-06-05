<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>  <style>
  body {
  	background-color:black;
  	background-image: no-repeat;
      font: 400 15px/1.8 Lato, sans-serif;
      color: #777;
  }
  h3, h4 {
      margin: 10px 0 30px 0;
      letter-spacing: 10px;      
      font-size: 20px;
      color: #111;
  }
  .container {
      padding: 80px 120px;
  }
  .person {
      border: 10px solid transparent;
      margin-bottom: 25px;
      width: 80%;
      height: 80%;
      opacity: 0.7;
  }
  .person:hover {
      border-color: #f1f1f1;
  }
  .carousel-inner img {
      -webkit-filter: grayscale(90%);
      filter: grayscale(90%); /* make all photos black and white */ 
      width: 100%; /* Set width to 100% */
      margin: auto;
  }
  .carousel-caption h3 {
      color: #fff !important;
  }
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */
    }
  }
  .bg-1 {
      background: #2d2d30;
      color: #bdbdbd;
  }
  .bg-1 h3 {color: #fff;}
  .bg-1 p {font-style: italic;}
  .list-group-item:first-child {
      border-top-right-radius: 0;
      border-top-left-radius: 0;
  }
  .list-group-item:last-child {
      border-bottom-right-radius: 0;
      border-bottom-left-radius: 0;
  }
  .thumbnail {
      padding: 0 0 15px 0;
      border: none;
      border-radius: 0;
  }
  .thumbnail p {
      margin-top: 15px;
      color: #555;
  }
  .btn {
      padding: 10px 20px;
      background-color: #333;
      color: #f1f1f1;
      border-radius: 0;
      transition: .2s;
  }
  .btn:hover, .btn:focus {
      border: 1px solid #333;
      background-color: #fff;
      color: #000;
  }
  .modal-header, h4, .close {
      background-color: #333;
      color: #fff !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-header, .modal-body {
      padding: 40px 50px;
  }
  .nav-tabs li a {
      color: #777;
  }
  #googleMap {
      width: 100%;
      height: 400px;
      -webkit-filter: grayscale(100%);
      filter: grayscale(100%);
  }  
  .navbar {
      font-family: Montserrat, sans-serif;
      margin-bottom: 0;
      background-color: #2d2d30;
      border: 0;
      font-size: 11px !important;
      letter-spacing: 4px;
      opacity: 0.9;
  }
  .navbar li a, .navbar .navbar-brand { 
      color: #d5d5d5 !important;
  }
  .navbar-nav li a:hover {
      color: #fff !important;
  }
  .navbar-nav li.active a {
      color: #fff !important;
      background-color: #29292c !important;
  }
  .navbar-default .navbar-toggle {
      border-color: transparent;
  }
  .open .dropdown-toggle {
      color: #fff;
      background-color: #555 !important;
  }
  .dropdown-menu li a {
      color: #000 !important;
  }
  .dropdown-menu li a:hover {
      background-color: transparent !important;
  }
  footer {
      background-color: #2d2d30;
      color: #f5f5f5;
      padding: 32px;
  }
  footer a {
      color: #000000;
  }
  footer a:hover {
      color: #777;
      text-decoration: none;
  }  
  .form-control {
      border-radius: 0;
  }
  textarea {
      resize: none;
  }
  </style>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
<div class="container-fluid">
  <div class="text-center">
   
  </div>
  <div class="row">
    <div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
<!--         <div class="panel-heading">

        </div> -->
        <div class="panel-body">
          <div class="item active">
        <img src="b1.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        </div>
        <div class="panel-footer">
          <h5>X-MenApocoly</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button>
        </div>
      </div>      
    </div>     
    <div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
          <div class="panel-body">
          <div class="item active">
        <img src="b2.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        </div>
        <div class="panel-footer">
           <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button>
        </div>
      </div>      
    </div>       
    <div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="b3.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button></div>
      </div>      
    </div>    
  </div>
</div>
<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="b4.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button></div>
      </div>      
    </div>    
  </div>
</div>
<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="b5.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button></div>
      </div>      
    </div>    
  </div>

<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="b6.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button></div>
      </div>      
    </div>    
  </div>

<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="b7.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button></div>
      </div>      
    </div>    
  </div>
<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="b8.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button></div>
      </div>      
    </div>    
  </div>

<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="b9.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button></div>
      </div>      
    </div>    
  </div>

<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="b10.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button></div>
      </div>      
    </div>    
  </div>

<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="b11.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button></div>
      </div>      
    </div>    
  </div>

<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="b12.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h5>Movie Name</h5>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button></div>
      </div>      
    </div>    
  </div>

<jsp:include page="themeView.jsp" /> 
</body>
</html>