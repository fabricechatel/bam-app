<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>header</title>
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
					<h4>panier</h4>
				</div>
				<div class="modal-body">

					<table class="table table-striped tcart">
						<thead>
							<tr>
								<th>Nom</th>
								<th>Quantité</th>
								<th>prix</th>
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
					<a href="index.jsp" class="btn">Continuer ses achats</a> <a
						href="checkout.jsp" class="btn btn-danger">paiement</a>
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
								<label class="control-label col-md-3" for="username">Nom d'utilisateur</label>
								<div class="col-md-9">
									<input type="text" class="form-control" id="username">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-3" for="email">mot de passe</label>
								<div class="col-md-9">
									<input type="password" class="form-control" id="password">
								</div>
							</div>
							<div class="form-group">
								<div class="col-md-9 col-md-offset-3">
									<div class="checkbox inline">
										<label> <input type="checkbox" id="inlineCheckbox1"
											value="agree"> se souvenir du mot de passe
										</label>
									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="col-md-9 col-md-offset-3">
									<button type="submit" class="btn btn-default">Login</button>
									<button type="reset" class="btn btn-default">réinitialiser</button>
								</div>
							</div>
						</form>
					</div>

				</div>
				<div class="modal-footer">
					<p>
						Vous avez un compte? <a href="register.jsp">S'enregistrer</a> ici.
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
					<h4>S'enregistrer</h4>
				</div>
				<div class="modal-body">
					<div class="form">
						<form class="form-horizontal">
						<div class="form-group">
								<label class="control-label col-md-3">Civilité</label>
								<div class="col-md-9">
									<select class="form-control">
										<option>&nbsp;</option>
										<option>M.</option>
										<option>Mme.</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-3" for="name">Nom</label>
								<div class="col-md-9">
									<input type="text" class="form-control" id="name">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-3" for="name">Prénom</label>
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
								<label class="control-label col-md-3" for="username1">login</label>
								<div class="col-md-9">
									<input type="text" class="form-control" id="username1">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-3" for="password1">mot de passe</label>
								<div class="col-md-9">
									<input type="password" class="form-control" id="password1">
								</div>
							</div>
							<div class="form-group">
								<div class="col-md-9 col-md-offset-3">
									<div class="checkbox inline">
										<label> <input type="checkbox" id="inlineCheckbox2"
											value="agree"> accepter les conditions d'utilisation
										</label>
									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="col-md-9 col-md-offset-3">
									<button type="submit" class="btn btn-default">valider</button>
									<button type="reset" class="btn btn-default">reinitialiser</button>
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="modal-footer">
					<p>
						Vous avez déjà un compte? <a href="login.jsp">S'enregistrer</a> ici.
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
</body>
</html>