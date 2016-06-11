<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>Wish List - MacKart</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="author" content="">

  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600' rel='stylesheet' type='text/css'>

  <!-- Stylesheets -->
  <link href="style/bootstrap.css" rel="stylesheet">
  <!-- Pretty Photo -->
  <link href="style/prettyPhoto.css" rel="stylesheet">
  <!-- Sidebar nav -->
  <link href="style/sidebar-nav.css" rel="stylesheet">
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


<!-- My Account page -->

<div class="items">
  <div class="container">
    <div class="row">

      <!-- Sidebar navigation -->
      <div class="col-md-4 col-sm-4 hidden-xs">

        <!-- Sidebar navigation -->
        <h5 class="title">Pages</h5>
        <!-- Sidebar navigation -->
          <nav>
            <ul id="navi">
              <li><a href="myaccount.jsp">Mon Compte</a></li>
              <li><a href="wish-list.jsp">Liste de souhaits</a></li>
              <li><a href="order-history.jsp">Historique de commandes</a></li>
              <li><a href="edit-profile.jsp">Modifier profil</a></li>
            </ul>
          </nav>
      </div>

      <div class="col-md-8 col-sm-8">

        <!-- Main content -->
          <h5 class="title">Wish List</h5>
          
            <table class="table table-striped tcart">
              <thead>
                <tr>
                  <th>#</th>
                  <th>Name</th>
                  <th>Price</th>
                  <th>Quantity</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>1</td>
                  <td><a href="single-item.jsp">HTC One</a></td>
                  <td>$530</td>
                  <td>1</td>
                </tr>
                <tr>
                  <td>2</td>
                  <td><a href="single-item.jsp">Sony Xperia</a></td>
                  <td>$330</td>
                  <td>2</td>
                </tr>
                <tr>
                  <td>3</td>
                  <td><a href="single-item.jsp">Nokia Asha</a></td>
                  <td>$230</td>
                  <td>6</td>
                </tr>  
                <tr>
                  <td>4</td>
                  <td><a href="single-item.jsp">Xperia Tipo</a></td>
                  <td>$330</td>
                  <td>2</td>
                </tr>
                <tr>
                  <td>5</td>
                  <td><a href="single-item.jsp">Apple iPhone</a></td>
                  <td>$730</td>
                  <td>1</td>
                </tr>
                <tr>
                  <td>6</td>
                  <td><a href="single-item.jsp">Windows Mobile</a></td>
                  <td>$130</td>
                  <td>3</td>
                </tr>
                <tr>
                  <td>7</td>
                  <td><a href="single-item.jsp">Galaxy SIII</a></td>
                  <td>$430</td>
                  <td>2</td>
                </tr>                                                                                                             
              </tbody>
            </table>

      </div>                                                                    



    </div>
  </div>
</div>



<jsp:include page="footer.jsp"></jsp:include>

<!-- Scroll to top -->
<span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span> 

<!-- JS -->
<script src="js/jquery.js"></script> <!-- jQuery -->
<script src="js/bootstrap.js"></script> <!-- Bootstrap -->
<script src="js/jquery.prettyPhoto.js"></script> <!-- Pretty Photo -->
<script src="js/filter.js"></script> <!-- Filter for support page -->

<script src="js/jquery.flexslider-min.js"></script> <!-- Flex slider -->
<script src="js/nav.js"></script> <!-- Sidebar navigation -->
<script src="js/jquery.carouFredSel-6.1.0-packed.js"></script> <!-- Carousel for recent posts -->
<script src="js/custom.js"></script> <!-- Custom codes -->

</body>
</html>