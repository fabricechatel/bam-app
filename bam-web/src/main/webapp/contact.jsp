<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>Contact - MacKart</title>
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

<div class="content contact-two">
  <div class="container">
    <div class="row"> 
        
        <div class="col-md-6">
                                 <!-- Contact form -->
                                    <h4 class="title">Fiche de renseignements</h4>
                                    <div class="form">
                                      <!-- Contact form (not working)-->
                                      <form class="form-horizontal">
                                          <!-- Name -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="name1">Nom</label>
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
                                          <!-- Website -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="website">Site internet</label>
                                            <div class="col-md-6">
                                              <input type="text" class="form-control" id="website">
                                            </div>
                                          </div>
                                          <!-- Comment -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="comment">Commenter</label>
                                            <div class="col-md-6">
                                              <textarea class="form-control" id="comment" rows="3"></textarea>
                                            </div>
                                          </div>
                                          <!-- Buttons -->
                                          <div class="form-group">
                                             <!-- Buttons -->
											 <div class="col-md-6 col-md-offset-3">
												<button type="submit" class="btn btn-default">Valider</button>
												<button type="reset" class="btn btn-default">effacer</button>
											 </div>
                                          </div>
                                      </form>
                                    </div>
                                    <hr />        
                                        <div class="center">
                                           <!-- Social media icons -->
                                           <strong>Restons en contact</strong>
                                           <div class="social">
                                                <a href="#"><i class="icon-facebook facebook"></i></a>
                                                <a href="#"><i class="icon-twitter twitter"></i></a>
                                                <a href="#"><i class="icon-linkedin linkedin"></i></a>
                                                <a href="#"><i class="icon-google-plus google-plus"></i></a>
                                                <a href="#"><i class="icon-pinterest pinterest"></i></a>
                                           </div>
                                          </div>

                           </div>
                           <div class="col-md-6">
                              <h4 class="title">Google Map</h4>
                              <!-- Google maps -->
                              <div class="gmap">
                                 <!-- Google Maps. Replace the below iframe with your Google Maps embed code -->
                                 <iframe height="200" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Google+India+Bangalore,+Bennigana+Halli,+Bangalore,+Karnataka&amp;aq=0&amp;oq=google+&amp;sll=9.930582,78.12303&amp;sspn=0.192085,0.308647&amp;ie=UTF8&amp;hq=Google&amp;hnear=Bennigana+Halli,+Bangalore,+Bengaluru+Urban,+Karnataka&amp;t=m&amp;ll=12.993518,77.660294&amp;spn=0.012545,0.036006&amp;z=15&amp;output=embed"></iframe>
                              </div>
                              
                              <hr />
                                    <!-- Address section -->
                                       <h4 class="title">Adresse</h4>
                                       <div class="address">
                                           <address>
                                              <!-- Company name -->
                                              <strong>La boîte à musique</strong><br>
                                              <!-- Address -->
                                              36 rue Danton<br>
                                              Malakoff, 92240<br>
                                              <!-- Phone number -->
                                              <abbr title="Phone">P:</abbr> (+33) 777-7777.
                                           </address>
                                            
                                           <address>
                                              <!-- Name -->
                                              <strong>company</strong><br>
                                              <!-- Email -->
                                              <a href="mailto:#">mail@company.org</a>
                                           </address> 
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