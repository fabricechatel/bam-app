<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>View Cart - MacKart</title>
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


<!-- Cart starts -->

<div class="cart">
  <div class="container">
    <div class="row">
      <div class="col-md-12">

        <!-- Title with number of items in shopping kart -->
          <h3 class="title"><i class="icon-shopping-cart"></i> article(s) dans le panier [<span class="color">5</span>]</h3>
            <br />

            <!-- Table -->
              <table class="table table-striped tcart">
                <thead>
                  <tr>
                    <th>#</th>
                    <th>Nom</th>
                    <th>image</th>
                    <th>Quantité</th>
                    <th>Prix unitaire</th>
                    <th>Total</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <!-- Index -->
                    <td>1</td>
                    <!-- Product  name -->
                    <td><a href="single-item.jsp">HTC One</a></td>
                    <!-- Product image -->
                    <td><a href="single-item.jsp"><img src="img/photos/2.png" alt="" /></a></td>
                    <!-- Quantity with refresh and remove button -->
                    <td class="item-input">
						<div class="input-group">
							<input class="form-control" type="text" value="2">
							<span class="input-group-btn">
								<button class="btn btn-default" type="button"><i class="icon-refresh"></i></button>
								<button class="btn btn-danger" type="button"><i class="icon-remove"></i></button>     
							</span>
						</div>
                    </td>
                    <!-- Unit price -->
                    <td>$150</td>
                    <!-- Total cost -->
                    <td>$300</td>
                  </tr>
                  <tr>
                    <td>2</td>
                    <td><a href="single-item.jsp">Sony Xperia</a></td>
                    <td><a href="single-item.jsp"><img src="img/photos/3.png" alt="" /></a></td>
                    <td class="item-input">
                      <div class="input-group">
							<input class="form-control" type="text" value="2">
							<span class="input-group-btn">
								<button class="btn btn-default" type="button"><i class="icon-refresh"></i></button>
								<button class="btn btn-danger" type="button"><i class="icon-remove"></i></button>     
							</span>
						</div>
                    </td>
                    <td>$150</td>
                    <td>$150</td>
                  </tr>
                  <tr>
                    <td>3</td>
                    <td><a href="single-item.jsp">Nokia Asha</a></td>
                    <td><a href="single-item.jsp"><img src="img/photos/4.png" alt="" /></a></td>
                    <td class="item-input">
                      <div class="input-group">
							<input class="form-control" type="text" value="2">
							<span class="input-group-btn">
								<button class="btn btn-default" type="button"><i class="icon-refresh"></i></button>
								<button class="btn btn-danger" type="button"><i class="icon-remove"></i></button>     
							</span>
						</div>              
                    </td>
                    <td>$250</td>
                    <td>$250</td>
                  </tr>
                  <tr>
                    <td>4</td>
                    <td><a href="single-item.jsp">Samsung Galaxy Pro</a></td>
                    <td><a href="single-item.jsp"><img src="img/photos/5.png" alt="" /></a></td>
                    <td class="item-input">
                      <div class="input-group">
							<input class="form-control" type="text" value="2">
							<span class="input-group-btn">
								<button class="btn btn-default" type="button"><i class="icon-refresh"></i></button>
								<button class="btn btn-danger" type="button"><i class="icon-remove"></i></button>     
							</span>
						</div>
                    </td>
                    <td>$450</td>
                    <td>$450</td>
                  </tr>
                  <tr>
                    <td>5</td>
                    <td><a href="single-item.jsp">Micromax Funbook</a></td>
                    <td><a href="single-item.jsp"><img src="img/photos/6.png" alt="" /></a></td>
                    <td class="item-input">
						<div class="input-group">
							<input class="form-control" type="text" value="2">
							<span class="input-group-btn">
								<button class="btn btn-default" type="button"><i class="icon-refresh"></i></button>
								<button class="btn btn-danger" type="button"><i class="icon-remove"></i></button>     
							</span>
						</div>
                      
                    </td>
                    <td>$150</td>
                    <td>$300</td>
                  </tr>                                    
                  <tr>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th>Total</th>
                    <th>$2405</th>
                  </tr>
                </tbody>
              </table>


              <form class="form-inline">
              <!-- Discount Coupen -->
                <h5 class="title">coupon de réduction</h5>
                <div class="form-group">
					<input type="email" class="form-control" id="" placeholder="Discount Coupon">
				</div>
			  
				<button type="submit" class="btn btn-default">appliquer</button>
                <br />
                <br />
                <!-- Gift coupen -->
                <h5 class="title">coupon cadeau</h5>
                <div class="form-group">
					<input type="email" class="form-control" id="" placeholder="Gift Coupon">
				</div>
			  
				<button type="submit" class="btn btn-default">appliquer</button>           
              </form>  
               
               <!-- Button s-->
              <div class="row">
                <div class="col-md-4 col-md-offset-8">
                  <div class="pull-right">
                    <a href="index.jsp" class="btn btn-default">continuer ses courses</a>
                    <a href="checkout.jsp" class="btn btn-danger">Vérifier panier</a>
                  </div>
                </div>
              </div>

      </div>
    </div>
  </div>
</div>

<!-- Cart ends -->

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