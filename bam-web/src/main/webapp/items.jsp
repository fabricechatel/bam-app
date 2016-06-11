<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>Items - MacKart</title>
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

<!-- Items -->

<div class="items">
  <div class="container">
    <div class="row">

      <!-- Sidebar -->
      <div class="col-md-3 col-sm-3 hidden-xs">

        <h5 class="title">Catégories</h5>
        <!-- Sidebar navigation -->
          <nav>
            <ul id="nav">
              <!-- Main menu. Use the class "has_sub" to "li" tag if it has submenu. -->
              <li><a href="index.jsp">Page d'acceuil</a></li>
              <li class="has_sub"><a href="#">une catégorie</a>
                <!-- Submenu -->
                <ul>
                              <li><a href="items.jsp">une sous catégorie</a></li>
                              <li><a href="items.jsp">une autre</a></li>
                              <li><a href="items.jsp">une autre encore</a></li>
                </ul>
              </li>
              <li class="has_sub"><a href="#">une autre catégorie</a>
                <ul>
<!--                               <li><a href="items.jsp">Samsung</a></li> -->
<!--                               <li><a href="items.jsp">Apple</a></li> -->
<!--                               <li><a href="items.jsp">Motorola</a></li> -->
                </ul>
              </li>
              <li class="has_sub"><a href="#">Une autre catégorie</a>
                <ul>
<!--                               <li><a href="items.jsp">Nikkon</a></li> -->
<!--                               <li><a href="items.jsp">Samsung</a></li> -->
<!--                               <li><a href="items.jsp">Sony</a></li> -->
<!--                               <li><a href="items.jsp">Cannon</a></li> -->
                </ul>
              </li>
          </nav>
<br />
          <!-- Sidebar items (featured items)-->

          <div class="sidebar-items">

            <h5 class="title">articles à la une</h5>

            <!-- Item #1 -->
<!--             <div class="sitem"> -->
<!--               Don't forget the class "onethree-left" and "onethree-right" -->
<!--               <div class="onethree-left"> -->
<!--                 Image -->
<!--                 <a href="single-item.jsp"><img src="img/photos/2.png" alt="" class="img-responsive" /></a> -->
<!--               </div> -->
<!--               <div class="onethree-right"> -->
<!--                 Title -->
<!--                 <a href="single-item.jsp">HTC One V</a> -->
<!--                 Para -->
<!--                 <p>Aenean ullamcorper justo tincidunt justo aliquet.</p> -->
<!--                 Price -->
<!--                 <p class="bold">$199</p> -->
<!--               </div> -->
<!--               <div class="clearfix"></div> -->
<!--             </div> -->
                                    
          </div>

      </div>


<!-- Main content -->
      <div class="col-md-9 col-sm-9">

        <!-- Breadcrumb -->
        <ul class="breadcrumb">
          <li><a href="index.jsp">accueil</a> <span class="divider">/</span></li>
          <li><a href="items.jsp">articles</a> <span class="divider">/</span></li>
          <li class="active">détails</li>
        </ul>

                            <!-- Title -->
                              <h4 class="pull-left">Les articles</h4>


                                          <!-- Sorting -->
                                            <div class="form-group pull-right">                               
                                                <select class="form-control"> 
                                                <option>Trier par</option>
                                                <option>Nom (A-Z)</option>
                                                <option>Nom (Z-A)</option>
                                                <option>prix (Low-High)</option>
                                                <option>prix (High-Low)</option>
                                                </select>  
                                            </div>

                          <div class="clearfix"></div>

              <div class="row">

                <!-- Item #1 -->
                <div class="col-md-4 col-sm-6">
                  <!-- Each item should be enclosed in "item" class -->
                  <div class="item">
                    <!-- Item image -->
                    <div class="item-image">
                      <a href="single-item.jsp"><img src="img/photos/2.png" alt="" class="img-responsive" /></a>
                    </div>
                    <!-- Item details -->
                    <div class="item-details">
                      <!-- Name -->
                      <!-- Use the span tag with the class "ico" and icon link (hot, sale, deal, new) -->
                      <h5><a href="single-item.jsp">HTC One V</a><span class="ico"><img src="img/hot.png" alt="" /></span></h5>
                      <div class="clearfix"></div>
                      <!-- Para. Note more than 2 lines. -->
                      <p>Something about the product goes here. Not More than 2 lines.</p>
                      <hr />
                      <!-- Price -->
                      <div class="item-price pull-left">$360</div>
                      <!-- Add to cart -->
                      <div class="button pull-right"><a href="#">Add to Cart</a></div>
                      <div class="clearfix"></div>
                    </div>
                  </div>
                </div>

                <!-- Item #2 -->
                <div class="col-md-4 col-sm-6">
                  <div class="item">
                    <!-- Item image -->
                    <div class="item-image">
                      <a href="single-item.jsp"><img src="img/photos/3.png" alt="" class="img-responsive" /></a>
                    </div>
                    <!-- Item details -->
                    <div class="item-details">
                      <!-- Name -->
                      <h5><a href="single-item.jsp">Dell One V</a></h5>
                      <!-- Para. Note more than 2 lines. -->
                      <p>Something about the product goes here. Not More than 2 lines.</p>
                      <hr />
                      <!-- Price -->
                      <div class="item-price pull-left">$264</div>
                      <!-- Add to cart -->
                      <div class="button pull-right"><a href="#">Add to Cart</a></div>
                      <div class="clearfix"></div>
                    </div>
                  </div>
                </div>  

                <div class="col-md-4 col-sm-6">
                  <div class="item">
                    <!-- Item image -->
                    <div class="item-image">
                      <a href="single-item.jsp"><img src="img/photos/4.png" alt="" class="img-responsive" /></a>
                    </div>
                    <!-- Item details -->
                    <div class="item-details">
                      <!-- Name -->
                      <h5><a href="single-item.jsp">Cannon One V</a><span class="ico"><img src="img/new.png" alt="" /></span></h5>
                      <!-- Para. Note more than 2 lines. -->
                      <p>Something about the product goes here. Not More than 2 lines.</p>
                      <hr />
                      <!-- Price -->
                      <div class="item-price pull-left">$160</div>
                      <!-- Add to cart -->
                      <div class="button pull-right"><a href="#">Add to Cart</a></div>
                      <div class="clearfix"></div>
                    </div>
                  </div>
                </div>

                <div class="col-md-4 col-sm-6">
                  <div class="item">
                    <!-- Item image -->
                    <div class="item-image">
                      <a href="single-item.jsp"><img src="img/photos/5.png" alt="" class="img-responsive" /></a>
                    </div>
                    <!-- Item details -->
                    <div class="item-details">
                      <!-- Name -->
                      <h5><a href="single-item.jsp">Apple One V</a><span class="ico"><img src="img/deal.png" alt="" /></span></h5>
                      <!-- Para. Note more than 2 lines. -->
                      <p>Something about the product goes here. Not More than 2 lines.</p>
                      <hr />
                      <!-- Price -->
                      <div class="item-price pull-left">$420</div>
                      <!-- Add to cart -->
                      <div class="button pull-right"><a href="#">Add to Cart</a></div>
                      <div class="clearfix"></div>
                    </div>
                  </div>
                </div>

                <div class="col-md-4 col-sm-6">
                  <div class="item">
                    <!-- Item image -->
                    <div class="item-image">
                      <a href="single-item.jsp"><img src="img/photos/6.png" alt="" class="img-responsive" /></a>
                    </div>
                    <!-- Item details -->
                    <div class="item-details">
                      <!-- Name -->
                      <h5><a href="single-item.jsp">Samsung One V</a></h5>
                      <!-- Para. Note more than 2 lines. -->
                      <p>Something about the product goes here. Not More than 2 lines.</p>
                      <hr />
                      <!-- Price -->
                      <div class="item-price pull-left">$300</div>
                      <!-- Add to cart -->
                      <div class="button pull-right"><a href="#">Add to Cart</a></div>
                      <div class="clearfix"></div>
                    </div>
                  </div>
                </div>

                <div class="col-md-4 col-sm-6">
                  <div class="item">
                    <!-- Item image -->
                    <div class="item-image">
                      <a href="single-item.jsp"><img src="img/photos/7.png" alt="" class="img-responsive" /></a>
                    </div>
                    <!-- Item details -->
                    <div class="item-details">
                      <!-- Name -->
                      <h5><a href="single-item.jsp">Micromax One V</a><span class="ico"><img src="img/sale.png" alt="" /></span></h5>
                      <!-- Para. Note more than 2 lines. -->
                      <p>Something about the product goes here. Not More than 2 lines.</p>
                      <hr />
                      <!-- Price -->
                      <div class="item-price pull-left">$240</div>
                      <!-- Add to cart -->
                      <div class="button pull-right"><a href="#">Add to Cart</a></div>
                      <div class="clearfix"></div>
                    </div>
                  </div>
                </div>

                <div class="col-md-4 col-sm-6">
                  <div class="item">
                    <!-- Item image -->
                    <div class="item-image">
                      <a href="single-item.jsp"><img src="img/photos/8.png" alt="" class="img-responsive" /></a>
                    </div>
                    <!-- Item details -->
                    <div class="item-details">
                      <!-- Name -->
                      <h5><a href="single-item.jsp">Nokia One V</a></h5>
                      <!-- Para. Note more than 2 lines. -->
                      <p>Something about the product goes here. Not More than 2 lines.</p>
                      <hr />
                      <!-- Price -->
                      <div class="item-price pull-left">$50</div>
                      <!-- Add to cart -->
                      <div class="button pull-right"><a href="#">Add to Cart</a></div>
                      <div class="clearfix"></div>
                    </div>
                  </div>
                </div>

                <div class="col-md-4 col-sm-6">
                  <div class="item">
                    <!-- Item image -->
                    <div class="item-image">
                      <a href="single-item.jsp"><img src="img/photos/9.png" alt="" class="img-responsive" /></a>
                    </div>
                    <!-- Item details -->
                    <div class="item-details">
                      <!-- Name -->
                      <h5><a href="single-item.jsp">Sony One V</a></h5>
                      <!-- Para. Note more than 2 lines. -->
                      <p>Something about the product goes here. Not More than 2 lines.</p>
                      <hr />
                      <!-- Price -->
                      <div class="item-price pull-left">$100</div>
                      <!-- Add to cart -->
                      <div class="button pull-right"><a href="#">Add to Cart</a></div>
                      <div class="clearfix"></div>
                    </div>
                  </div>
                </div>  

                <div class="col-md-4 col-sm-6">
                  <div class="item">
                    <!-- Item image -->
                    <div class="item-image">
                      <a href="single-item.jsp"><img src="img/photos/10.png" alt="" class="img-responsive" /></a>
                    </div>
                    <!-- Item details -->
                    <div class="item-details">
                      <!-- Name -->
                      <h5><a href="single-item.jsp">Huawai One V</a></h5>
                      <!-- Para. Note more than 2 lines. -->
                      <p>Something about the product goes here. Not More than 2 lines.</p>
                      <hr />
                      <!-- Price -->
                      <div class="item-price pull-left">$100</div>
                      <!-- Add to cart -->
                      <div class="button pull-right"><a href="#">Add to Cart</a></div>
                      <div class="clearfix"></div>
                    </div>
                  </div>
                </div>

                <div class="col-md-9 col-sm-9">
                                    <!-- Pagination -->
                                    <div class="paging">
                                       <span class='current'>1</span>
                                       <a href='#'>2</a>
                                       <span class="dots">&hellip;</span>
                                       <a href='#'>6</a>
                                       <a href="#">Next</a>
                                    </div>
                </div>           

              </div>


            </div>                                                                    



    </div>
  </div>
</div>

<!-- Recent items carousel starts -->

<div class="recent-posts">
  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <div class="bor"></div>
        <h4 class="title">Acticles recents</h4>
        <div class="carousel_nav pull-right">
          <!-- Navigation -->
          <a class="prev" id="car_prev" href="#"><i class="icon-chevron-left"></i></a>
          <a class="next" id="car_next" href="#"><i class="icon-chevron-right"></i></a>
        </div>
        <div class="clearfix"></div>
        <ul class="rps-carousel">
            <!-- Recent items #1 -->
            <!-- Each item should be enclosed inside "li"  tag. -->
            <li>
                <div class="rp-item"> 
                  <div class="rp-image">    
                  <!-- Image -->    
                    <a href="single-item.jsp"><img src="img/photos/2.png" alt=""/></a>
                  </div>
                  <div class="rp-details">
                    <!-- Title and para -->
                    <h5><a href="single-item.jsp">HTC One V <span class="price pull-right">$225</span></a></h5>
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
                    <a href="single-item.jsp"><img src="img/photos/3.png" alt=""/></a>
                  </div>
                  <div class="rp-details">
                    <!-- Title and para -->
                    <h5><a href="single-item.jsp">Sony Xperia Pro <span class="price pull-right">$525</span></a></h5>
                    <div class="clearfix"></div>
                    <p>Travel far away to a space station.</p>         
                  </div>                
                </div>        
            </li>
            <li>
                <div class="rp-item"> 
                  <div class="rp-image">        
                    <a href="single-item.jsp"><img src="img/photos/4.png" alt=""/></a>
                  </div>
                  <div class="rp-details">
                    <!-- Title and para -->
                    <h5><a href="single-item.jsp">Samsung Pop <span class="price pull-right">$255</span></a></h5>
                    <div class="clearfix"></div>
                    <p>Travel far away to a space station.</p>         
                  </div>                
                </div>        
            </li>
            <li>
                <div class="rp-item"> 
                  <div class="rp-image">        
                    <a href="single-item.jsp"><img src="img/photos/5.png" alt=""/></a>
                  </div>
                  <div class="rp-details">
                    <!-- Title and para -->
                    <h5><a href="single-item.jsp">Motorola Droid <span class="price pull-right">$325</span></a></h5>
                    <div class="clearfix"></div>
                    <p>Travel far away to a space station.</p>         
                  </div>                
                </div>        
            </li>
            <li>
                <div class="rp-item"> 
                  <div class="rp-image">        
                    <a href="single-item.jsp"><img src="img/photos/6.png" alt=""/></a>
                  </div>
                  <div class="rp-details">
                    <!-- Title and para -->
                    <h5><a href="single-item.jsp">Blackberry Force <span class="price pull-right">$125</span></a></h5>
                    <div class="clearfix"></div>
                    <p>Travel far away to a space station.</p>         
                  </div>                
                </div>        
            </li>
            <li>
                <div class="rp-item"> 
                  <div class="rp-image">        
                    <a href="single-item.jsp"><img src="img/photos/7.png" alt=""/></a>
                  </div>
                  <div class="rp-details">
                    <!-- Title and para -->
                    <h5><a href="single-item.jsp">Pantech One <span class="price pull-right">$253</span></a></h5>
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