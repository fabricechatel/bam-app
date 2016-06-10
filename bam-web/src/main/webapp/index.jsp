<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<!-- Title and other stuffs -->
<title>MacKart</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">

<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600'
	rel='stylesheet' type='text/css'>

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

	<!-- Cart Modal starts - DEBUT DU PANIER -->
	<div id="cart" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
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
					<a href="index.jsp" class="btn">Continue Shopping</a> <a
						href="checkout.jsp" class="btn btn-danger">Checkout</a>
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
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
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
										<label> <input type="checkbox" id="inlineCheckbox1"
											value="agree"> Remember Password
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
					<p>
						Dont have account? <a href="register.jsp">Register</a> here.
					</p>
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
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
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
										<label> <input type="checkbox" id="inlineCheckbox2"
											value="agree"> Agree with Terms and Conditions
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
					<p>
						Already have account? <a href="login.jsp">Login</a> here.
					</p>
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




	<!-- Flex Slider starts -->

	<div class="container flex-main">
		<div class="row">
			<div class="col-md-12">

				<div class="flex-image flexslider">
					<ul class="slides">
						<!-- Each slide should be enclosed inside li tag. -->

						<!-- Slide #1 -->
						<li>
							<!-- Image --> <img src="img/photos/slider1.jpg" alt="" /> <!-- Caption -->
							<div class="flex-caption">
								<!-- Title -->
								<h3>
									Levi's T-Shirt - <span class="color">Just $49</span>
								</h3>
								<!-- Para -->
								<p>Ut commodo ullamcorper risus nec mattis. Fusce imperdiet
									ornare dignissim. Donec aliquet convallis tortor, et placerat
									quam posuere posuere. Morbi tincidunt posuere turpis eu
									laoreet.</p>
								<div class="button">
									<a href="single-item.jsp">Buy Now</a>
								</div>
							</div>
						</li>

						<!-- Slide #2 -->
						<li><img src="img/photos/slider2.jpg" alt="" />
							<div class="flex-caption">
								<!-- Title -->
								<h3>
									Denim Jeans - <span class="color">Just $149</span>
								</h3>
								<!-- Para -->
								<p>Ut commodo ullamcorper risus nec mattis. Fusce imperdiet
									ornare dignissim. Donec aliquet convallis tortor, et placerat
									quam posuere posuere. Morbi tincidunt posuere turpis eu
									laoreet.</p>
								<div class="button">
									<a href="single-item.jsp">Buy Now</a>
								</div>
							</div></li>

						<li><img src="img/photos/slider3.jpg" alt="" />
							<div class="flex-caption">
								<!-- Title -->
								<h3>
									Polo Shirts - <span class="color">Just $79</span>
								</h3>
								<!-- Para -->
								<p>Ut commodo ullamcorper risus nec mattis. Fusce imperdiet
									ornare dignissim. Donec aliquet convallis tortor, et placerat
									quam posuere posuere. Morbi tincidunt posuere turpis eu
									laoreet.</p>
								<div class="button">
									<a href="single-item.jsp">Buy Now</a>
								</div>
							</div></li>

						<li><img src="img/photos/slider4.jpg" alt="" />
							<div class="flex-caption">
								<!-- Title -->
								<h3>
									Raymonds Suitings - <span class="color">Just $449</span>
								</h3>
								<!-- Para -->
								<p>Ut commodo ullamcorper risus nec mattis. Fusce imperdiet
									ornare dignissim. Donec aliquet convallis tortor, et placerat
									quam posuere posuere. Morbi tincidunt posuere turpis eu
									laoreet.</p>
								<div class="button">
									<a href="single-item.jsp">Buy Now</a>
								</div>
							</div></li>

					</ul>
				</div>

			</div>
		</div>
	</div>

	<!-- Flex slider ends -->

	<!-- Promo box starts -->

	<div class="promo">
		<div class="container">
			<div class="row">

				<!-- Red color promo box -->
				<div class="col-md-4">
					<!-- rcolor =  Red color -->
					<div class="pbox rcolor">
						<div class="pcol-left">
							<!-- Image -->
							<a href="items.jsp"><img src="img/photos/play-button.png" alt="" /></a>
						</div>
						<div class="pcol-right">
							<!-- Title -->
							<p class="pmed">
								<a href="items.jsp">Musique</a>
							</p>
							<!-- Para -->
							<p class="psmall">
								<a href="items.jsp">Accédez à une sélection de musique en téléchargement payant 
								ou disponible en CD et/ou DVD.      </a>
							</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>


				<!-- Blue color promo box -->
				<div class="col-md-4">
					<!-- bcolor =  Blue color -->
					<div class="pbox bcolor">
						<div class="pcol-left">
							<a href="items.jsp"><img src="img/photos/piano.png" alt="" /></a>
						</div>
						<div class="pcol-right">
							<p class="pmed">
								<a href="items.jsp">Instruments</a>
							</p>
							<p class="psmall">
								<a href="items.jsp">Quel instruments allez vous apprendre à jouer aujoud'hui?
								Accédez à notre liste d'instruments.</a>
							</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>

				<!-- Green color promo box -->
				<div class="col-md-4">
					<!-- gcolor =  Green Color -->
					<div class="pbox gcolor">
						<div class="pcol-left">
							<a href="items.jsp"><img src="img/photos/theatre.png" alt="" /></a>
						</div>
						<div class="pcol-right">
							<p class="pmed">
								<a href="items.jsp">Spectacles</a>
							</p>
							<p class="psmall">
								<a href="items.jsp">Et si vous viviez votre musique en live?
								Commandez votre place de spectacle ici sans plus tarder!
								</a>
							</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<!-- Promo box ends -->


	

	<!-- Recent items carousel starts -->

	<div class="recent-posts">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="bor"></div>
					<h4 class="title">A la une</h4>
					<div class="carousel_nav pull-right">
						<!-- Navigation -->
						<a class="prev" id="car_prev" href="#"><i
							class="icon-chevron-left"></i></a> <a class="next" id="car_next"
							href="#"><i class="icon-chevron-right"></i></a>
					</div>
					<div class="clearfix"></div>
					<ul class="rps-carousel">
						<!-- Recent items #1 -->
						<!-- Each item should be enclosed inside "li"  tag. -->
						<li>
							<div class="rp-item">
								<div class="rp-image">
									<!-- Image -->
									<a href="single-item.jsp"><img src="img/photos/2.png"
										alt="" /></a>
								</div>
								<div class="rp-details">
									<!-- Title and para -->
									<h5>
										<a href="single-item.jsp">HTC One V <span
											class="price pull-right">$225</span></a>
									</h5>
									<div class="clearfix"></div>
									<!-- Description -->
									<p>Travel far away to a space station.</p>
								</div>
							</div>
						</li>
						<!-- Recent items #2 -->
						<li>
							<div class="rp-item">
								<div class="rp-image">
									<a href="single-item.jsp"><img src="img/photos/3.png"
										alt="" /></a>
								</div>
								<div class="rp-details">
									<!-- Title and para -->
									<h5>
										<a href="single-item.jsp">Sony Xperia Pro <span
											class="price pull-right">$525</span></a>
									</h5>
									<div class="clearfix"></div>
									<p>Travel far away to a space station.</p>
								</div>
							</div>
						</li>
						<li>
							<div class="rp-item">
								<div class="rp-image">
									<a href="single-item.jsp"><img src="img/photos/4.png"
										alt="" /></a>
								</div>
								<div class="rp-details">
									<!-- Title and para -->
									<h5>
										<a href="single-item.jsp">Samsung Pop <span
											class="price pull-right">$255</span></a>
									</h5>
									<div class="clearfix"></div>
									<p>Travel far away to a space station.</p>
								</div>
							</div>
						</li>
						<li>
							<div class="rp-item">
								<div class="rp-image">
									<a href="single-item.jsp"><img src="img/photos/5.png"
										alt="" /></a>
								</div>
								<div class="rp-details">
									<!-- Title and para -->
									<h5>
										<a href="single-item.jsp">Motorola Droid <span
											class="price pull-right">$325</span></a>
									</h5>
									<div class="clearfix"></div>
									<p>Travel far away to a space station.</p>
								</div>
							</div>
						</li>
						<li>
							<div class="rp-item">
								<div class="rp-image">
									<a href="single-item.jsp"><img src="img/photos/6.png"
										alt="" /></a>
								</div>
								<div class="rp-details">
									<!-- Title and para -->
									<h5>
										<a href="single-item.jsp">Blackberry Force <span
											class="price pull-right">$125</span></a>
									</h5>
									<div class="clearfix"></div>
									<p>Travel far away to a space station.</p>
								</div>
							</div>
						</li>
						<li>
							<div class="rp-item">
								<div class="rp-image">
									<a href="single-item.jsp"><img src="img/photos/7.png"
										alt="" /></a>
								</div>
								<div class="rp-details">
									<!-- Title and para -->
									<h5>
										<a href="single-item.jsp">Pantech One <span
											class="price pull-right">$253</span></a>
									</h5>
									<div class="clearfix"></div>
									<p>Travel far away to a space station.</p>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<!-- Recent Posts ends -->

	<!-- Newsletter starts -->

	<div class="container newsletter">
		<div class="row">
			<div class="col-md-12">
				<div class="well">
					<h5>
						<i class="icon-envelope-alt"></i> Ne ratez rien de ce qui se passe!!!
					</h5>
					<p>Inscrivez-vous à une newsletter responsable, sans spam garantit!</p>
					<form class="form-inline" role="form">
						<div class="form-group">
							<input type="email" class="form-control" id="search"
								placeholder="Subscribe">
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
	<script src="js/jquery.js"></script>
	<!-- jQuery -->
	<script src="js/bootstrap.js"></script>
	<!-- Bootstrap -->
	<script src="js/jquery.prettyPhoto.js"></script>
	<!-- Pretty Photo -->
	<script src="js/filter.js"></script>
	<!-- Filter for support page -->

	<script src="js/jquery.flexslider-min.js"></script>
	<!-- Flex slider -->

	<script src="js/jquery.carouFredSel-6.1.0-packed.js"></script>
	<!-- Carousel for recent posts -->
	<script src="js/custom.js"></script>
	<!-- Custom codes -->

</body>
</html>