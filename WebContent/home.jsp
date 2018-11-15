<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
<style type="text/css">
<%@ include file ="./style/bootstrap.css" %>
 .jumbotron {
	padding-left: 75px;
	padding-right: 75px;
	padding-bottom: 55px;
	padding-top: 55px;
	background-color: rgba(145, 145, 145, 0.5);
	margin-top: 50px;
}

.well {
	border-raduis: 0px;
}

h4 {
	color: red;
	letter-spacing: 5px;
	font-family: "Tekton Pro", serif;
	font-size: 1.6em;
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
				<li><a
					href="${pageContext.request.contextPath}/mesCmd">Mes
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
		<div class="jumbotron">
			<h4>
				Bonjour <span style="color:black;"><c:out value="${sessionScope.user}" /></span> dans votre espace E-shop
			</h4>
		</div>
	</div>

</body>
</html>