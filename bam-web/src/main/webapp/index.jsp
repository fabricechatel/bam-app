<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
 	pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html 
   xmlns:h="http://java.sun.com/jsf/html"
   xmlns:f="http://java.sun.com/jsf/core"
   xmlns:ui="http://java.sun.com/jsf/facelets" 
   xmlns:a4j="http://richfaces.org/a4j"
>
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

<jsp:include page="header.jsp"></jsp:include>
	
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
</h:form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>