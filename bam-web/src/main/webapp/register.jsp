<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>Register - MacKart</title>
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

<!-- Header starts -->
  <header>
	<div class="container">
		<div class="row">

			<div class="col-md-4">
				<!-- Logo. Use class "color" to add color to the text. -->
				<div class="logo">
					<h1>
						<a href="#">Boîte <span class="color bold">à Musique</span></a>
					</h1>
					<p class="meta">musique-instruments-spectacles</p>
				</div>
			</div>

			<div class="col-md-5 col-md-offset-3">

				<!-- Search form -->
				<form class="form-inline" role="form">
					<div class="form-group">
						<input type="email" class="form-control" id="search"
							placeholder="Rechercher">
					</div>

					<button type="submit" class="btn btn-default">Rechercher</button>
				</form>

				<div class="hlinks">
					<span> <!-- item details with price --> <a href="#cart"
						role="button" data-toggle="modal">3 articles dans votre <i
							class="icon-shopping-cart"></i></a> -<span class="bold">$25</span>

					</span>


					<!-- Login and Register link -->
					<span class="lr"><a href="#login" role="button"
						data-toggle="modal">Login</a> / <a href="#register" role="button"
						data-toggle="modal">Enregistrement</a></span>

				</div>

			</div>

		</div>
	</div>
	</header>
  <!-- Header ends -->
  
  
  <!-- Cart, Login and Register form (Modal) -->

    <!-- Cart Modal starts -->
<div id="cart" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4>Shopping Cart</h4>
			</div>
			<div class="modal-body">

				<table class="table table-striped tcart">
				  <thead>
					<tr>
					  <th>Name</th>
					  <th>Quantity</th>
					  <th>Price</th>
					</tr>
				  </thead>
				  <tbody>
					<tr>
					  <td><a href="single-item.jsp">HTC One</a></td>
					  <td>2</td>
					  <td>$250</td>
					</tr>
					<tr>
					  <td><a href="single-item.jsp">Apple iPhone</a></td>
					  <td>1</td>
					  <td>$502</td>
					</tr>
					<tr>
					  <td><a href="single-item.jsp">Galaxy Note</a></td>
					  <td>4</td>
					  <td>$1303</td>
					</tr>
					<tr>
					  <th></th>
					  <th>Total</th>
					  <th>$2405</th>
					</tr>
				  </tbody>
				</table>

			</div>
			<div class="modal-footer">
				<a href="index.jsp" class="btn">Continue Shopping</a>
				<a href="checkout.jsp" class="btn btn-danger">Checkout</a>
			</div>
		</div>
	</div>
</div>

<!-- Cart modal ends -->

  <!-- Login Modal starts -->
<div id="login" class="modal fade">
<div class="modal-dialog">
		<div class="modal-content">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h4>Login</h4>
  </div>
  <div class="modal-body">

                    <div class="form">

                                      <form class="form-horizontal">   
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="username">Username</label>
                                            <div class="col-md-9">
                                              <input type="text" class="form-control" id="username">
                                            </div>
                                          </div>
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="email">Password</label>
                                            <div class="col-md-9">
                                              <input type="password" class="form-control" id="password">
                                            </div>
                                          </div>
                                          <div class="form-group">
											<div class="col-md-9 col-md-offset-3">
                                             <div class="checkbox inline">
                                                <label>
                                                   <input type="checkbox" id="inlineCheckbox1" value="agree"> Remember Password
                                                </label>
                                             </div>
											 </div>
                                          </div> 
                                          
                                          <div class="form-group">
										  <div class="col-md-9 col-md-offset-3">
                                            <button type="submit" class="btn btn-default">Login</button>
                                            <button type="reset" class="btn btn-default">Reset</button>
                                          </div>
										  </div>
                                      </form>
                                    </div> 

  </div>
  <div class="modal-footer">
    <p>Dont have account? <a href="register.jsp">Register</a> here.</p>
  </div>
  </div>
  </div>
</div>

<!-- Login modal ends -->

  <!-- Register Modal starts -->

<div id="register" class="modal fade">
<div class="modal-dialog">
		<div class="modal-content">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h4>Register</h4>
  </div>
  <div class="modal-body">
    <div class="form">
                                      <form class="form-horizontal">
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="name">Name</label>
                                            <div class="col-md-9">
                                              <input type="text" class="form-control" id="name">
                                            </div>
                                          </div>   
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="email">Email</label>
                                            <div class="col-md-9">
                                              <input type="text" class="form-control" id="email">
                                            </div>
                                          </div>
                                          <div class="form-group">
                                            <label class="control-label col-md-3">Drop Down</label>
                                            <div class="col-md-9">                               
                                                <select class="form-control">
                                                <option>&nbsp;</option>
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                                </select>  
                                            </div>
                                          </div>           
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="username1">Username</label>
                                            <div class="col-md-9">
                                              <input type="text" class="form-control" id="username1">
                                            </div>
                                          </div>
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="password1">Password</label>
                                            <div class="col-md-9">
                                              <input type="password" class="form-control" id="password1">
                                            </div>
                                          </div>
                                          <div class="form-group">
										  <div class="col-md-9 col-md-offset-3">
                                             <div class="checkbox inline">
                                                <label>
                                                   <input type="checkbox" id="inlineCheckbox2" value="agree"> Agree with Terms and Conditions
                                                </label>
                                             </div>
											</div>
                                          </div> 
                                          
                                          <div class="form-group">
											<div class="col-md-9 col-md-offset-3">
                                            <button type="submit" class="btn btn-default">Register</button>
                                            <button type="reset" class="btn btn-default">Reset</button>
											</div>
                                          </div>
                                      </form>
                                    </div>
  </div>
  <div class="modal-footer">
    <p>Already have account? <a href="login.jsp">Login</a> here.</p>
  </div>
  </div>
  </div>
</div>

<!-- Register modal ends -->

  <!-- Navigation -->
          <div class="navbar bs-docs-nav" role="banner">

		<div class="container">
			<div class="navbar-header">
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target=".bs-navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

			</div>
			<nav class="collapse navbar-collapse bs-navbar-collapse"
				role="navigation">
			<ul class="nav navbar-nav">
				<li><a href="index.jsp"><i class="icon-home"></i></a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Mon compte <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="myaccount.jsp">Compte</a></li>
						<li><a href="view-cart.jsp">panier</a></li>
						<li><a href="checkout.jsp">Paiement</a></li>
						<li><a href="order-history.jsp">Historiques</a></li>
						<li><a href="edit-profile.jsp">modifier profil</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Tutoriels <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="blog.jsp">Accès aux tutos</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Instruments <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="items.jsp">vents</a></li>
						<li><a href="items.jsp">Cuivres</a></li>
						<li><a href="items.jsp">Bois</a></li>
						<li><a href="items.jsp">Cordes</a></li>
						<li><a href="items.jsp">Numérique/Digital</a></li>
					</ul></li>
				<li class="dropdown"><a href="items.jsp"
					class="dropdown-toggle" data-toggle="dropdown">CD/DVD <b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="items.jsp">CD/DVD</a></li>
					</ul></li>
				<li class="dropdown"><a href="items.jsp"
					class="dropdown-toggle" data-toggle="dropdown">Mp3 <b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="items.jsp">Télécharger</a></li>
					</ul></li>
				<li class="dropdown"><a href="items.jsp"
					class="dropdown-toggle" data-toggle="dropdown">Logiciels <b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="items.jsp">Télécharger</a></li>
					</ul></li>
			</ul>
			</nav>
		</div>
	</div>

<!-- Page content starts -->

<div class="content">
  <div class="container">
    <div class="row">
      <div class="col-md-6">
        <!-- Some content -->
                  <h3 class="title">Register Today <span class="color">!!!</span></h3>
                  <h4 >Morbi tincidunt posuere turpis eu laoreet</h4>
                  <p>Nullam in est urna. In vitae adipiscing enim. Curabitur rhoncus condimentum lorem, non convallis dolor faucibus eget. In vitae adipiscing enim. Curabitur rhoncus condimentum lorem, non convallis dolor faucibus eget. In ut nulla est. </p>
                  <h5>Maecenas hendrerit neque id</h5>
				  <div class="lists">
                  <ul>
                    <li>Etiam adipiscing posuere justo, nec iaculis justo dictum non</li>
                    <li>Cras tincidunt mi non arcu hendrerit eleifend</li>
                    <li>Aenean ullamcorper justo tincidunt justo aliquet et lobortis diam faucibus</li>
                    <li>Maecenas hendrerit neque id ante dictum mattis</li>
                    <li>Vivamus non neque lacus, et cursus tortor</li>
                  </ul>
				  </div>
                  <p>Nullam in est urna. In vitae adipiscing enim. In ut nulla est. Nullam in est urna. In vitae adipiscing enim. Curabitur rhoncus condimentum lorem, non convallis dolor faucibus eget. In ut nulla est. </p>

                </div>

                <div class="col-md-6">
                  <div class="formy well">
                     <h4 class="title">Register for New Account</h4>
                                  <div class="form">
                                      <!-- Register form (not working)-->
                                      <form class="form-horizontal">
                                          <!-- Name -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="name1">Name</label>
                                            <div class="col-md-6">
                                              <input type="text" class="form-control" id="name1">
                                            </div>
                                          </div>   
                                          <!-- Email -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="email1">Email</label>
                                            <div class="col-md-6">
                                              <input type="text" class="form-control" id="email1">
                                            </div>
                                          </div>
                                          <!-- Select box -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3">Drop Down</label>
                                            <div class="col-md-6">                               
                                                <select class="form-control">
                                                <option>&nbsp;</option>
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                                </select>  
                                            </div>
                                          </div>                                           
                                          <!-- Username -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="username2">Username</label>
                                            <div class="col-md-6">
                                              <input type="text" class="form-control" id="username2">
                                            </div>
                                          </div>
                                          <!-- Password -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="password2">Password</label>
                                            <div class="col-md-6">
                                              <input type="password" class="form-control" id="password2">
                                            </div>
                                          </div>
                                          <!-- Checkbox -->
                                          <div class="form-group">
                                             <div class="col-md-9 col-md-offset-3">
                                                <label class="checkbox-inline">
                                                   <input type="checkbox" id="inlineCheckbox3" value="agree"> Agree with Terms and Conditions
                                                </label>
                                             </div>
                                          </div> 
                                          
                                          <!-- Buttons -->
                                          <div class="form-actions">
                                             <!-- Buttons -->
											 <div class="col-md-9 col-md-offset-3">
												<button type="submit" class="btn btn-default">Register</button>
												<button type="reset" class="btn btn-default">Reset</button>
											</div>
                                          </div>
                                      </form>
									  <div class="clearfix"></div>
									  <hr />
										<p>Already have an Account? <a href="login.jsp">Login</a></p>
                                    </div> 
                                  </div>

                </div>
    </div>
  </div>
</div>

<!-- Page content ends -->


<!-- Newsletter starts -->

<div class="container newsletter">
  <div class="row">
    <div class="col-md-12">
      <div class="well">
               <h5><i class="icon-envelope-alt"></i> Hot Offers - Don't Miss Anything!!!</h5>
               <p>Nulla facilisi. Sed justo dui, scelerisque ut consectetur vel, eleifend id erat. Morbi auctor adipiscing tempor. Phasellus condimentum rutrum aliquet.</p>
               <form class="form-inline" role="form">
					<div class="form-group">
						<input type="email" class="form-control" id="search" placeholder="Subscribe">
					</div>
					<button type="submit" class="btn btn-default">Subscribe</button>
				</form>
      </div>
    </div>
  </div>
</div>

<!-- Newsletter ends -->

<!-- Footer starts -->
<footer>
	<div class="container">
		<div class="row">
			<div class="col-md-12">

				<div class="row">

					<div class="col-md-4">
						<div class="widget">
							<h5>Contact</h5>
							<hr />
							<div class="social">
								<a href="#"><i class="icon-facebook facebook"></i></a> <a
									href="#"><i class="icon-twitter twitter"></i></a> <a href="#"><i
									class="icon-linkedin linkedin"></i></a> <a href="#"><i
									class="icon-google-plus google-plus"></i></a>
							</div>
							<hr />
							<i class="icon-home"></i> &nbsp; 3, Rue Danton, Malakoff, 92240.
							<hr />
							<i class="icon-phone"></i> &nbsp; +33-3823-34344
							<hr />
							<i class="icon-envelope-alt"></i> &nbsp; <a href="mailto:#">bam@company.com</a>
							<hr />
							<div class="payment-icons">
								<img src="img/payment/americanexpress.gif" alt="" /> <img
									src="img/payment/visa.gif" alt="" /> <img
									src="img/payment/mastercard.gif" alt="" /> <img
									src="img/payment/discover.gif" alt="" /> <img
									src="img/payment/paypal.gif" alt="" />
							</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="widget">
							<h5>a propos</h5>
							<hr />
							<p>Ouvert du lundu au vendredi de 10h à 19h. Ouvert le samedi
								de 9h à 13h. Fermé le dimanche. Vous devez reserver des essais
								en ligne ou par téléphone, autrement, il est strictement
								interdit de toucher aux instruments ou au matériel exposé à
								moins que cela ne soit précisé.</p>
						</div>
					</div>

					<!-- 					<div class="col-md-4"> -->
					<!-- 						<div class="widget"> -->
					<!-- 							<h5>Links Goes Here</h5> -->
					<!-- 							<hr /> -->
					<!-- 							<div class="two-col"> -->
					<!-- 								<div class="col-left"> -->
					<!-- 									<ul> -->
					<!-- 										<li><a href="#">Condimentum</a></li> -->
					<!-- 										<li><a href="#">Etiam at</a></li> -->
					<!-- 										<li><a href="#">Fusce vel</a></li> -->
					<!-- 										<li><a href="#">Vivamus</a></li> -->
					<!-- 										<li><a href="#">Pellentesque</a></li> -->
					<!-- 										<li><a href="#">Vivamus</a></li> -->
					<!-- 									</ul> -->
					<!-- 								</div> -->
					<!-- 								<div class="col-right"> -->
					<!-- 									<ul> -->
					<!-- 										<li><a href="#">Condimentum</a></li> -->
					<!-- 										<li><a href="#">Etiam at</a></li> -->
					<!-- 										<li><a href="#">Fusce vel</a></li> -->
					<!-- 										<li><a href="#">Vivamus</a></li> -->
					<!-- 										<li><a href="#">Pellentesque</a></li> -->
					<!-- 										<li><a href="#">Vivamus</a></li> -->
					<!-- 									</ul> -->
					<!-- 								</div> -->
					<!-- 								<div class="clearfix"></div> -->
					<!-- 							</div> -->
					<!-- 						</div> -->
					<!-- 					</div> -->

					<!-- 				</div> -->

					<hr />
					<!-- Copyright info -->
					<p class="copy">
						Copyright &copy; 2016 | <a href="#">Notre site</a> - <a href="#">Home</a>
						| <a href="#">à propos de nous</a> | <a href="#">Service</a> | <a href="#">Contactez
							Nous</a>
					</p>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
	</footer>
 	

<!-- Footer ends -->

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