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