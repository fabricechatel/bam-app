<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>404 - MacKart</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="author" content="">

  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600' rel='stylesheet' type='text/css'>

  <!-- Stylesheets -->
  <link href="style/bootstrap.css" rel="stylesheet">
  <!-- Pretty Photo -->
  <link href="style/prettyPhoto.css" rel="stylesheet">
  <!-- Flex slider -->
  <link href="style/flexslider.css" rel="stylesheet">
  <!-- Font awesome icon -->
  <link rel="stylesheet" href="style/font-awesome.css"> 
  <!-- Main stylesheet -->
  <link href="style/style.css" rel="stylesheet">
  <!-- Stylesheet for Color -->
  <link href="style/red.css" rel="stylesheet">
  
  
  <!-- HTML5 Support for IE -->
  <!--[if lt IE 9]>
  <script src="js/html5shim.js"></script>
  <![endif]-->

  <!-- Favicon -->
  <link rel="shortcut icon" href="img/favicon/favicon.png">
</head>

<body>

<jsp:include page="header.jsp"></jsp:include>

<!-- Page content starts -->

<div class="content error-page">
  <div class="container">
    <div class="row">
      <div class="col-md-4 col-sm-5">  
        <!-- Big 404 text -->
        <div class="big-text">404</div>
        <hr />
      </div>
      <div class="col-md-5 col-sm-5 col-sm-offset-1 col-md-offset-1">
        <h2>Oops<span class="color">!!!</span></h2>
        <h4>Pge non trouvée</h4>
        <hr />
        <!-- Some site links -->
        <div class="horizontal-links">
          <h5>Faites un tour sur notre site</h5>
          <a href="#">Home</a> <a href="#">A propos de nous</a> <a href="#">Aide</a> <a href="#">Nous contacter</a> <a href="#">Politique</a>
        </div>
        <hr />
        <!-- Search form -->
        <div class="form">
         <form class="form-inline" role="form">
			<div class="form-group">
				<input type="email" class="form-control" id="search" placeholder="Search">
			</div>
			  
			<button type="submit" class="btn btn-default">Rechercher</button>
		 </form>
        </div>
      </div>

    </div>
  </div>
</div>

<!-- Page content ends -->

<jsp:include page="footer.jsp"></jsp:include>

<!-- Scroll to top -->
<span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span> 

<!-- JS -->
<script src="js/jquery.js"></script> <!-- jQuery -->
<script src="js/bootstrap.js"></script> <!-- Bootstrap -->
<script src="js/jquery.prettyPhoto.js"></script> <!-- Pretty Photo -->
<script src="js/filter.js"></script> <!-- Filter for support page -->

<script src="js/jquery.flexslider-min.js"></script> <!-- Flex slider -->

<script src="js/jquery.carouFredSel-6.1.0-packed.js"></script> <!-- Carousel for recent posts -->
<script src="js/custom.js"></script> <!-- Custom codes -->

</body>
</html>