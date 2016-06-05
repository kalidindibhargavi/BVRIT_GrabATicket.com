<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>

    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }

.panel {
    border: 1px solid #f4511e;
    border-radius:0;
    transition: box-shadow 0.5s;
}

.panel:hover {
    box-shadow: 5px 0px 40px rgba(0,0,0, .2);
}

.panel-footer .btn:hover {
    border: 1px solid #f4511e;
    background-color: #fff !important;
    color: #f4511e;
}

.panel-heading {
    color: #fff !important;
    background-color: #f4511e !important;
    padding: 25px;
    border-bottom: 1px solid transparent;
    border-top-left-radius: 0px;
    border-top-right-radius: 0px;
    border-bottom-left-radius: 0px;
    border-bottom-right-radius: 0px;
}

.panel-footer {
    background-color: #fff !important;
}


.panel-footer h4 {
    color: ;
    font-size: 14px;
}

.panel-footer .btn {
    margin: 15px 0;
    background-color: #f4511e;
    color: #fff;
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
        <img src="http://cdn2-www.superherohype.com/assets/uploads/gallery/bts-x-men-apocalypse/tumblr_inline_o6nsw3vg1w1shsvef_1280.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        </div>
        <div class="panel-footer">
          <h4>X-MenApocoly</h4>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button>
        </div>
      </div>      
    </div>     
    <div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
          <div class="panel-body">
          <div class="item active">
        <img src="http://img.lum.dolimg.com/v1/images/movie_poster_thejunglebook2016_v2_48a08fe6.jpeg?region=0%2C0%2C300%2C450" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        </div>
        <div class="panel-footer">
           <h4>Movie Name</h4>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button>
        </div>
      </div>      
    </div>       
    <div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-body">
         <div class="item active">
        <img src="http://cdn2-www.superherohype.com/assets/uploads/gallery/bts-x-men-apocalypse/tumblr_inline_o6nsw3vg1w1shsvef_1280.jpg" alt="Image" class = "Img-responsive" width = "250px"  height = "300px">
      </div>
        <div class="panel-footer">
          <h4>Movie</h4>
          <button class="btn" data-toggle="modal" data-target="#myModal">BOOK NOW</button>        </div>
      </div>      
    </div>    
  </div>
</div>
<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!--  modal content-->
     <!--  <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">×</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Tickets</h4>
        </div>
        <div class="modal-body">
          <form role="form">
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-shopping-cart"></span> Tickets, $23 per person</label>
              <input type="number" class="form-control" id="psw" placeholder="How many?">
            </div>
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span> Send To</label>
              <input type="text" class="form-control" id="usrname" placeholder="Enter email">
            </div>
              <button type="submit" class="btn btn-block">Pay 
                <span class="glyphicon glyphicon-ok"></span>
              </button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal">
            <span class="glyphicon glyphicon-remove"></span> Cancel
          </button>
          <p>Need <a href="#">help?</a></p>
        </div>
      </div>
    </div>
  </div>
</div> 
 -->



</body>
</html>