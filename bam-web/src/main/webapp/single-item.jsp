<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>Single Item - MacKart</title>
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
      <div class="col-md-4 col-sm-4 hidden-xs">

        <h5 class="title">Categories</h5>
        <!-- Sidebar navigation -->
          <nav>
            <ul id="nav">
              <!-- Main menu. Use the class "has_sub" to "li" tag if it has submenu. -->
              <li><a href="index.jsp">Home</a></li>
              <li class="has_sub"><a href="#">Smartphone</a>
                <!-- Submenu -->
                <ul>
                              <li><a href="items.jsp">HTC</a></li>
                              <li><a href="items.jsp">Samsung</a></li>
                              <li><a href="items.jsp">Apple</a></li>
                              <li><a href="items.jsp">Motorola</a></li>
                              <li><a href="items.jsp">Nokia</a></li>
                </ul>
              </li>
              <li class="has_sub"><a href="#">Tablet</a>
                <ul>
                              <li><a href="items.jsp">Samsung</a></li>
                              <li><a href="items.jsp">Apple</a></li>
                              <li><a href="items.jsp">Motorola</a></li>
                </ul>
              </li>
              <li class="has_sub"><a href="#">Digital Camera</a>
                <ul>
                              <li><a href="items.jsp">Nikkon</a></li>
                              <li><a href="items.jsp">Samsung</a></li>
                              <li><a href="items.jsp">Sony</a></li>
                              <li><a href="items.jsp">Cannon</a></li>
                </ul>
              </li>
              <li class="has_sub"><a href="#">Computers</a>
                <ul>
                              <li><a href="items.jsp">Dell</a></li>
                              <li><a href="items.jsp">Lenovo</a></li>
                              <li><a href="items.jsp">Apple</a></li>
                              <li><a href="items.jsp">Samsung</a></li>
                </ul>
              </li>
              <li class="has_sub"><a href="#">Software</a>
                <ul>
                              <li><a href="items.jsp">Microsoft</a></li>
                              <li><a href="items.jsp">Nero</a></li>
                              <li><a href="items.jsp">Apple</a></li>
                              <li><a href="items.jsp">Avaira</a></li>
                </ul>
              </li>
            </ul>
          </nav>
<br />
          <!-- Sidebar items (featured items)-->

          <div class="sidebar-items">

            <h5 class="title">Featured Items</h5>

            <!-- Item #1 -->
            <div class="sitem">
              <!-- Don't forget the class "onethree-left" and "onethree-right" -->
              <div class="onethree-left">
                <!-- Image -->
                <a href="single-item.jsp"><img src="img/photos/2.png" alt="" /></a>
              </div>
              <div class="onethree-right">
                <!-- Title -->
                <a href="single-item.jsp">HTC One V</a>
                <!-- Para -->
                <p>Aenean ullamcorper justo tincidunt justo aliquet.</p>
                <!-- Price -->
                <p class="bold">$199</p>
              </div>
              <div class="clearfix"></div>
            </div>

            <div class="sitem">
              <div class="onethree-left">
                <a href="single-item.jsp"><img src="img/photos/3.png" alt="" /></a>
              </div>
              <div class="onethree-right">
                <a href="single-item.jsp">Sony One V</a>
                <p>Aenean ullamcorper justo tincidunt justo aliquet.</p>
                <p class="bold">$399</p>
              </div>
              <div class="clearfix"></div>
            </div>

            <div class="sitem">
              <div class="onethree-left">
                <a href="single-item.jsp"><img src="img/photos/4.png" alt="" /></a>
              </div>
              <div class="onethree-right">
                <a href="single-item.jsp">Nokia One V</a>
                <p>Aenean ullamcorper justo tincidunt justo aliquet.</p>
                <p class="bold">$159</p>
              </div>
              <div class="clearfix"></div>
            </div>

            <div class="sitem">
              <div class="onethree-left">
                <a href="single-item.jsp"><img src="img/photos/5.png" alt="" /></a>
              </div>
              <div class="onethree-right">
                <a href="single-item.jsp">Samsung One V</a>
                <p>Aenean ullamcorper justo tincidunt justo aliquet.</p>
                <p class="bold">$299</p>
              </div>
              <div class="clearfix"></div>
            </div>
                                    
          </div>

      </div>

      <!-- Main content -->

      <div class="col-md-8 col-sm-8">

        <!-- Breadcrumbs -->
        <ul class="breadcrumb">
          <li><a href="index.jsp">Home</a> <span class="divider">/</span></li>
          <li><a href="items.jsp">Smartphone</a> <span class="divider">/</span></li>
          <li class="active">Apple</li>
        </ul>

        <!-- Product details -->

        <div class="product-main">
          <div class="row">
            <div class="col-md-6 col-sm-6">

              <!-- Image. Flex slider -->
                <div class="product-slider">
                  <div class="product-image-slider flexslider">
                    <ul class="slides">
                        <!-- Each slide should be enclosed inside li tag. -->
                        
                        <!-- Slide #1 -->
                      <li>
                        <!-- Image -->
                        <img src="img/photos/1-1.png" alt=""/>
                      </li>
                      
                        <!-- Slide #2 -->
                      <li>
                        <img src="img/photos/1-2.png" alt=""/>
                      </li>
                      
                      <li>
                        <img src="img/photos/1-3.png" alt=""/>
                      </li>
                      
                      <li>
                        <img src="img/photos/1-4.png" alt=""/>
                      </li>

                      <li>
                        <img src="img/photos/1-5.png" alt=""/>
                      </li>                  
                      
                    </ul>
                  </div>
              </div>

            </div>
            <div class="col-md-6 col-sm-6">
              <!-- Title -->
                <h4 class="title">Apple iPhone 5G</h4>
                <h5>Price : $999</h5>
                <p>Shipping : Free</p>
                <p>Brand : Apple</p>
                <p>Modal : 5G</p>
                <p>Availability : In Stock</p>
                                          <!-- Dropdown menu -->
                                            <div class="form-group">                               
                                                <select class="form-control">
                                                <option>Color</option>
                                                <option>Black</option>
                                                <option>White</option>
                                                <option>Grey</option>
                                                </select>  
                                            </div>

                                            <!-- Quantity and add to cart button -->
											
								<div class="row">
									<div class="col-md-6">
										<div class="input-group">
										  <input type="text" class="form-control input-sm" value="2">
										  <span class="input-group-btn">
											<button class="btn btn-default btn-sm" type="button">Add to Cart</button>
										  </span>								  
										</div>
									</div>
								</div>

                        <!-- Add to wish list -->
                        <a href="wish-list.jsp">+ Add to Wish List</a>

                        
            </div>
          </div>
        </div>

<br />
        
        <!-- Description, specs and review -->

        <ul class="nav nav-tabs">
          <!-- Use uniqe name for "href" in below anchor tags -->
          <li class="active"><a href="#tab1" data-toggle="tab">Description</a></li>
          <li><a href="#tab2" data-toggle="tab">Specs</a></li>
          <li><a href="#tab3" data-toggle="tab">Review (5)</a></li>
        </ul>

        <!-- Tab Content -->
        <div class="tab-content">
          <!-- Description -->
          <div class="tab-pane active" id="tab1">
            <h5>Apple iPhone 5G</h5>
            <p>Nulla facilisi. Sed justo dui, scelerisque ut consectetur vel, eleifend id erat. Morbi auctor adipiscing tempor. Phasellus condimentum rutrum aliquet. Quisque eu consectetur erat. Proin rutrum, erat eget posuere semper, <em>arcu mauris posuere tortor</em>, in commodo enim magna id massa. Suspendisse potenti. Aliquam erat volutpat. Maecenas quis tristique turpis. Nulla facilisi. Duis sed velit at <a href="#">magna sollicitudin cursus</a> ac ultrices magna. Aliquam consequat, purus vitae auctor ullamcorper, sem velit convallis quam, a pharetra justo nunc et mauris. Vivamus diam diam, fermentum sed dapibus eget, egestas sed eros. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            <h6>Features</h6>
            <ul>
            <li>Etiam adipiscing posuere justo, nec iaculis justo dictum non</li>
            <li>Cras tincidunt mi non arcu hendrerit eleifend</li>
            <li>Aenean ullamcorper justo tincidunt justo aliquet et lobortis diam faucibus</li>
            <li>Maecenas hendrerit neque id ante dictum mattis</li>
            <li>Vivamus non neque lacus, et cursus tortor</li>
            </ul>
          </div>

          <!-- Sepcs -->
          <div class="tab-pane" id="tab2">
            
            <h5 class="title">Product Specs</h5>
            <table class="table table-striped tcart">
              <tbody>
                <tr>
                  <td><strong>Name</strong></td>
                  <td>Apple iPhone 5G</td>
                </tr>
                <tr>
                  <td><strong>Brand</strong></td>
                  <td>Apple</td>
                </tr>
                <tr>
                  <td><strong>Modal</strong></td>
                  <td>Fifth Generation</td>
                </tr>
                <tr>
                  <td><strong>Memory</strong></td>
                  <td>2GB RAM</td>
                </tr>
                <tr>
                  <td><strong>Storage</strong></td>
                  <td>16GB, 32GB, 64GB</td>
                </tr>
                <tr>
                  <td><strong>Camera</strong></td>
                  <td>Front VGA, Read 8MP</td>
                </tr>
                <tr>
                  <td><strong>Processor</strong></td>
                  <td>Apple 1.25GHz Processor</td>
                </tr>
                <tr>
                  <td><strong>Battery</strong></td>
                  <td>30 Hours Standby</td>
                </tr>                                                                                                
              </tbody>
            </table>

          </div>

          <!-- Review -->
          <div class="tab-pane" id="tab3">
            <h5>Product Reviews</h5>
            <div class="item-review">
              <h5>Ravi Kumar - <span class="color">4/5</span></h5>
              <p class="rmeta">27/1/2012</p>
              <p>Suspendisse potenti. Morbi ac felis nec mauris imperdiet fermentum. Aenean sodales augue ac lacus hendrerit sed rhoncus erat hendrerit. Vivamus vel ultricies elit. Curabitur lacinia nulla vel tellus elementum non mollis justo aliquam.</p>
            </div>

            <hr />
            <h5 class="title">Write a Review</h5>

                                  <div class="form form-small">

                                      <!-- Review form (not working)-->
                                      <form class="form-horizontal">                                         
                                          <!-- Name -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="name2">Your Name</label>
                                            <div class="col-md-6">
                                              <input type="text" class="form-control" id="name2">
                                            </div>
                                          </div>
                                          <!-- Select box -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3">Rating</label>
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

                                          <!-- Review -->
                                          <div class="form-group">
                                            <label class="control-label col-md-3" for="name">Your Review</label>
                                            <div class="col-md-6">
                                              <textarea class="form-control"></textarea>
                                            </div>
                                          </div>
                                          <!-- Buttons -->
                                          <div class="form-group">
                                             <!-- Buttons -->
											 <div class="col-md-6 col-md-offset-3">
												<button type="submit" class="btn btn-default">Post</button>
												<button type="reset" class="btn btn-default">Reset</button>
											</div>
                                          </div>
                                      </form>
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
        <h4 class="title">Recent Items</h4>
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