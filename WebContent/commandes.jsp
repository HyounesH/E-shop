<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Mes Commandes</title>
<style type="text/css">
<%@include file="./style/bootstrap.css" %>

h4{
color:green;
letter-spacing: 5px;
font-family: "Tekton Pro", serif;
font-size: 1.6em;
}
.cmd_title{
background-color:rgb(212,212,199);
margin-top:1%
}
</style>

</head>
<body>
<header class="header_page">
    <nav class="nav navbar-inverse" >
        <div class="container-fluid">
            <div class="navbar-header" >
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mynavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">E-SHOP </a>
            </div>
            <div class="collapse navbar-collapse" id="mynavbar">
                <ul class="nav navbar-nav" >
                    <li><a href="index.php" >Home</a> </li>
                    <li><a href="${pageContext.request.contextPath}/mesCmd" >Mes Cammandes</a> </li>
                    <li><a href="${pageContext.request.contextPath}/articles" >Article</a> </li>
                    <li><a href="${pageContext.request.contextPath}/panier" >Mon Panier</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="${pageContext.request.contextPath}/" ><span class="glyphicon glyphicon-log-out">Déconnexion</span></a></li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<div class="container-fluid">
		<div class="well">
		<strong>Utilisateur : <i><c:out value="${sessionScope.user}" /> </i> </strong>
		</div>
	</div>
<div class="container">
<div class="well cmd_title">
<h4><i>Liste de mes commandes</i></h4>
<hr>
</div>
  <div class="row">
     <div class="col-lg-9">
        <table class="table table-hover">
           <tr>
           <th>N° Commande</th>
           <th>Date Commande</th>
           <th>Montant Commande</th>
           <th>Option</th>
           </tr>
           <tr>
           <td>56/17</td>
           <td>23/12/2017</td>
           <td>459.49</td>
           <td><a href="#" class="btn btn-info">Editer</a></td>
           </tr>
           <c:forEach items="${commandes}" var="a">
           <tr>
           <td>${a.numero_cmd } </td>
           <td>${a.date_cmd }</td>
           <td>${a.montant }</td>
           <td><a href="${pageContext.request.contextPath}/detailes?d=${a.numero_cmd}" class="btn btn-info">Editer</a></td>
           </tr>
           </c:forEach>
        </table>
     </div>
  </div>
</div>
</body>
</html>