<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Mon Panier</title>
<style type="text/css">
<%@ include file ="./style/bootstrap.css" %> 


h4 {
	color: white;
	letter-spacing: 5px;
	font-family: "Tekton Pro", serif;
	font-size: 1.6em;
}

.article_title {
	margin-top: 6%;
}
.montant {
width:30%;
margin-left:70%;
}
</style>
</head>
<body>
	<header class="header_page"> <nav class="nav navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#mynavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">E-SHOP </a>
		</div>
		<div class="collapse navbar-collapse" id="mynavbar">
			<ul class="nav navbar-nav">
				<li><a href="index.php">Home</a></li>
				<li><a href="${pageContext.request.contextPath}/mesCmd">Mes
						Cammandes</a></li>
				<li><a href="${pageContext.request.contextPath}/articles">Article</a>
				</li>
				<li><a href="${pageContext.request.contextPath}/panier">Mon
						Panier</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="${pageContext.request.contextPath}/"><span
						class="glyphicon glyphicon-log-out">Déconnexion</span></a></li>
			</ul>
		</div>
	</div>
	</nav> </header>
	<div class="container-fluid">
		<div class="well">
		<strong>Utilisateur : <i><c:out value="${sessionScope.user}" /> </i></strong>
		</div>
	</div>
	<div class="container">
		<div class="well panier_title" style="background-color: lightblue;">
			<h4>
				<i>Liste des Articles du panier</i>
			</h4>
			<hr>
		</div>

		<div class="row">
			<div class="col-lg-9">
				<table class="table table-hover">
					<tr>
						<th>N° Article</th>
						<th>Désignation</th>
						<th>Prix Unitaire</th>
						<th>Quantité</th>
						<th>Action</th>
					</tr>
					<tr>
						<td>03</td>
						<td>Montre en acier</td>
						<td>599.45</td>
						<td>01</td>
						<td><a href="#" class="btn btn-danger">Supprimer</a></td>
					</tr>
					<tr>
						<td>22</td>
						<td>Smart braclet</td>
						<td>433.71</td>
						<td>01</td>
						<td><a href="#" class="btn btn-danger">Supprimer</a></td>
					</tr>
					<tr>
						<td>12</td>
						<td>Haut parleur sans fil</td>
						<td>618.98</td>
						<td>01</td>
						<td><a href="#" class="btn btn-danger">Supprimer</a></td>
					</tr>
				</table>
				<div class="well montant">
				<strong><i>Montant HT : 1610.16</i></strong>
				</div>
				<div class="pull-right">
				<a href="#" class="btn btn-info" >Passer la commande</a>
				<a href="#" class="btn btn-danger">Vider le Panier</a></div>
			</div>
		</div>
	</div>
</body>
</html>