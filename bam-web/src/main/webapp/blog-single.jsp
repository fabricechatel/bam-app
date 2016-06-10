<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>Blog Single - MacKart</title>
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

<div class="content blog">
  <div class="container">
    <div class="row">
      <div class="col-md-8">
                           <div class="posts">
                           
                              <!-- Each posts should be enclosed inside "entry" class" -->
                              <!-- Post one -->
                              <div class="entry">
                                 <h2><a href="#">Sed justo scelerisque ut consectetur</a></h2>
                                 
                                 <!-- Meta details -->
                                 <div class="meta">
                                    <i class="icon-calendar"></i> 26-2-2012 <i class="icon-user"></i> Admin <i class="icon-folder-open"></i> <a href="#">General</a> <span class="pull-right"><i class="icon-comment"></i> <a href="#">2 Comments</a></span>
                                 </div>
                                 
                                 <!-- Thumbnail -->
                                 <div class="bthumb">
                                    <a href="#"><img src="img/photos/slider1.jpg" alt="" class="img-responsive" /></a>
                                 </div>
                                 
                                 <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate eros nec odio egestas in dictum nisi vehicula. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Suspendisse porttitor luctus imperdiet. <a href="#">Praesent ultricies</a> enim ac ipsum aliquet pellentesque. Nullam justo nunc, dignissim at convallis posuere, sodales eu orci. Duis a risus sed dolor placerat semper quis in urna. Nam risus magna, fringilla sit amet blandit viverra, dignissim eget est. Ut <strong>commodo ullamcorper risus nec</strong> mattis. Fusce imperdiet ornare dignissim. Donec aliquet convallis tortor, et placerat quam posuere posuere. Morbi tincidunt posuere turpis eu laoreet. Nulla facilisi. Aenean at massa leo. Vestibulum in varius arcu.</p>
                                 
                                 <p>Fusce imperdiet, risus eget viverra faucibus, diam mi vestibulum libero, ut vestibulum tellus magna nec enim. Nunc dapibus varius interdum. Phasellus at lorem ut lectus fermentum convallis. Sed diam nisi, pulvinar vitae molestie hendrerit, venenatis eget mauris. Integer porta erat ac eros porta ultrices. </p>
                              </div>
                              
                              <div class="well">
                                 <!-- Social media icons -->
                                 <div class="social pull-left">
                                    <h5>Sharing is Sexy: </h5>
                                    <a href="#"><i class="icon-facebook facebook"></i></a>
                                    <a href="#"><i class="icon-twitter twitter"></i></a>
                                    <a href="#"><i class="icon-linkedin linkedin"></i></a>
                                    <a href="#"><i class="icon-pinterest pinterest"></i></a>
                                    <a href="#"><i class="icon-google-plus google-plus"></i></a>
                                 </div>
                                 <!-- Tags -->
                                 <div class="tags pull-right">
                                    <h5>Tags: </h5>
                                    <a href="#">Bootstrap</a> <a href="#">Responsive</a> <a href="#">Google</a> 
                                 </div>
                                 <div class="clearfix"></div>
                              </div>
                              
                              <hr />
                              
                              <!-- Comment section -->
                  
                              <div class="comments well">
                                 <!-- Comment title -->
                                    <div class="title"><h4>2 Comments</h4></div>
                                    
                                    <ul class="comment-list">
                                      <li class="comment">
                                        <a class="pull-left" href="#">
                                          <!-- Avatar -->
                                          <img class="avatar" src="http://placekitten.com/64/64" alt="">
                                        </a>
                                        <!-- Author -->
                                          <div class="comment-author"><a href="#">Ashok</a></div>
                                          <!-- Comment date -->
                                          <div class="cmeta">Commented on 25/12/2012</div>
                                          <!-- Para -->
                                          <p>Nulla facilisi. Sed justo dui, scelerisque ut consectetur vel, eleifend id erat. Phasellus condimentum rutrum aliquet. Quisque eu consectetur erat.</p>
                                          <div class="clearfix"></div>
                                      </li>
                                      <!-- Reply to previous comment (by adding class "reply") -->
                                      <li class="comment reply">
                                        <a class="pull-left" href="#">
                                          <img class="avatar" src="http://placekitten.com/64/64" alt="">
                                        </a>
                                          <div class="comment-author"><a href="#">Ashok</a></div>
                                          <div class="cmeta">Commented on 25/12/2012</div>
                                          <p>Nulla facilisi. Sed justo dui, scelerisque ut consectetur vel, eleifend id erat. Phasellus condimentum rutrum aliquet. Quisque eu consectetur erat.</p>
                                          <div class="clearfix"></div>
                                      </li>
                                    </ul>
                              </div>
                              
                              <!-- Comment posting -->
                              
                              <div class="respond well">
                                <!-- Form title -->
                                 <div class="title"><h4>Post Reply</h4></div>
                                 <!-- Comment form -->
                                 <div class="form">
                                   <form class="form-horizontal">
                                       <div class="form-group">
                                         <label class="control-label col-md-3" for="name1">Name</label>
                                         <div class="col-md-6">
                                           <input type="text" class="form-control" id="name1">
                                         </div>
                                       </div>
                                       <div class="form-group">
                                         <label class="control-label col-md-3" for="email1">Email</label>
                                         <div class="col-md-6">
                                           <input type="text" class="form-control" id="email1">
                                         </div>
                                       </div>
                                       <div class="form-group">
                                         <label class="control-label col-md-3" for="website">Website</label>
                                         <div class="col-md-6">
                                           <input type="text" class="form-control" id="website">
                                         </div>
                                       </div>
                                       <div class="form-group">
                                         <label class="control-label col-md-3" for="comment">Comment</label>
                                         <div class="col-md-6">
                                           <textarea class="form-control" id="comment" rows="3"></textarea>
                                         </div>
                                       </div>
                                       <div class="form-group">
										<div class="col-md-6 col-md-offset-3">
                                         <button type="submit" class="btn btn-default">Submit</button>
                                         <button type="reset" class="btn btn-default">Reset</button>
										</div>
                                       </div>
                                   </form>
                                 </div>
                              </div>
                              
                              <!-- Navigation -->
                              
                              <div class="navigation button">  
                                    <div class="pull-left"><a href="#">&laquo; Previous Post</a></div>
                                    <div class="pull-right"><a href="#">Next Post &raquo;</a></div>
                                    <div class="clearfix"></div>
                              </div>
                              
                              <div class="clearfix"></div>
                           </div>
                        </div>                        
                        <div class="col-md-4">
                          <!-- Sidebar -->
                           <div class="sidebar">
                              <!-- Widget -->
                              <div class="widget">
                                 <h4>Search</h4>
                                 <form class="form-inline" role="form">
									<div class="form-group">
										<input type="email" class="form-control" id="search" placeholder="Search">
									</div>
			  
									<button type="submit" class="btn btn-default">Search</button>
								 </form>
                              </div>
                              <div class="widget">
                                 <h4>Recent Posts</h4>
                                 <ul>
                                 <li>Etiam adipiscing posuere justo, nec iaculis justo dictum non</li>
                                 <li>Cras tincidunt mi non arcu hendrerit eleifend</li>
                                 <li>Aenean ullamcorper justo tincidunt justo aliquet et lobortis diam faucibus</li>
                                 <li>Maecenas hendrerit neque id ante dictum mattis</li>
                                 <li>Vivamus non neque lacus, et cursus tortor</li>
                                 </ul>
                              </div>
                              <div class="widget">
                                 <h4>About</h4>
                                 <p>Nulla facilisi. Sed justo dui, id erat. Morbi auctor adipiscing tempor. Phasellus condimentum rutrum aliquet. Quisque eu consectetur erat. Proin rutrum, erat eget posuere semper, <em>arcu mauris posuere tortor</em>,velit at <a href="#">magna sollicitudin cursus</a> ac ultrices magna. Aliquam consequat, purus vitae auctor ullamcorper, sem velit convallis quam, a pharetra justo nunc et mauris. </p>
                              </div>                              
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