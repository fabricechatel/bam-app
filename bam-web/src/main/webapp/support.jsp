<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<!-- Title and other stuffs -->
<title>Support - MacKart</title>
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

	<!-- Page heading starts -->

	<div class="page-head">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h2>Fiche de l'entreprise</h2>
					<h4>Quelque chose à écrire ici</h4>
				</div>
			</div>
		</div>
	</div>

	<!-- Page Heading ends -->

	<!-- Support starts -->

	<div class="support container">
		<div class="row">
			<div class="col-md-12">
				<!-- Support -->

				<div class="row">
					<div class="col-md-8">
						<div class="support-page well">
							<h5>Saisir pour filtrer:</h5>
							<!-- Below line creates form -->
							<div id="form"></div>
							<hr />
							<div class="clearfix"></div>
							<!-- Lists -->
							<ul id="slist">
								<!-- List #1 -->
								<li>
									<!-- Title --> <a href="#">Sed eu leo orci condimentum
										grvid metus</a> <!-- Para -->
									<p>Fusce imperdiet, risus eget viverra faucibus, diam mi
										vestibulum libero, ut vestibulum tellus magna nec enim. Nunc
										dapibus varius interdum. Phasellus at lorem ut lectus
										fermentum convallis. Sed diam nisi, pulvinar vitae molestie
										hendrerit, venenatis eget mauris. Integer porta erat ac eros
										porta ultrices. Proin porttitor eros a ante molestie gravida
										commodo dui adipiscing.</p>
								</li>
								<!-- List #2 and so on.... -->
								<li><a href="#">Fusce imperdiet risus eget viverr</a>
									<p>Fusce imperdiet, risus eget viverra faucibus, diam mi
										vestibulum libero, ut vestibulum tellus magna nec enim. Nunc
										dapibus varius interdum. Phasellus at lorem ut lectus
										fermentum convallis. Sed diam nisi, pulvinar vitae molestie
										hendrerit, venenatis eget mauris. Integer porta erat ac eros
										porta ultrices. Proin porttitor eros a ante molestie gravida
										commodo dui adipiscing.</p></li>
								<li><a href="#">Dimmi vestibulum libero ut vestibulum</a>
									<p>Fusce imperdiet, risus eget viverra faucibus, diam mi
										vestibulum libero, ut vestibulum tellus magna nec enim. Nunc
										dapibus varius interdum. Phasellus at lorem ut lectus
										fermentum convallis. Sed diam nisi, pulvinar vitae molestie
										hendrerit, venenatis eget mauris. Integer porta erat ac eros
										porta ultrices. Proin porttitor eros a ante molestie gravida
										commodo dui adipiscing.</p></li>
								<li><a href="#">Aeros a ante molestie gravida commodo</a>
									<p>Fusce imperdiet, risus eget viverra faucibus, diam mi
										vestibulum libero, ut vestibulum tellus magna nec enim. Nunc
										dapibus varius interdum. Phasellus at lorem ut lectus
										fermentum convallis. Sed diam nisi, pulvinar vitae molestie
										hendrerit, venenatis eget mauris. Integer porta erat ac eros
										porta ultrices. Proin porttitor eros a ante molestie gravida
										commodo dui adipiscing.</p></li>
								<li><a href="#">Integer porta erat ac eros porta</a>
									<p>Fusce imperdiet, risus eget viverra faucibus, diam mi
										vestibulum libero, ut vestibulum tellus magna nec enim. Nunc
										dapibus varius interdum. Phasellus at lorem ut lectus
										fermentum convallis. Sed diam nisi, pulvinar vitae molestie
										hendrerit, venenatis eget mauris. Integer porta erat ac eros
										porta ultrices. Proin porttitor eros a ante molestie gravida
										commodo dui adipiscing.</p></li>
								<li><a href="#">Molestie gravida commodo dui adipiscing</a>
									<p>Fusce imperdiet, risus eget viverra faucibus, diam mi
										vestibulum libero, ut vestibulum tellus magna nec enim. Nunc
										dapibus varius interdum. Phasellus at lorem ut lectus
										fermentum convallis. Sed diam nisi, pulvinar vitae molestie
										hendrerit, venenatis eget mauris. Integer porta erat ac eros
										porta ultrices. Proin porttitor eros a ante molestie gravida
										commodo dui adipiscing.</p></li>
							</ul>
						</div>
					</div>
					<div class="col-md-4">
						<!-- Contact box -->
						<div class="scontact well">
							<!-- Title -->
							<h4>Contact</h4>
							<!-- Phone, email and address with font awesome icon -->
							<p>3 rue Danton, 92240, Malakoff.</p>
							<p>
								<i class="icon-phone"></i> Phone<strong>:</strong> +33-777-7777
							</p>
							<p>
								<i class="icon-envelope-alt"></i> Email<strong>:</strong>
								mail@company.com
							</p>
							<!-- Button -->
							<div class="button">
								<a href="contact.jsp">Nous contacter</a> <a href="faq.jsp">questions</a>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>

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