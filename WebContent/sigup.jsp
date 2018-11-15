<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Enregistrement</title>
<style type="text/css">
<%@include file="./style/bootstrap.css" %>

.jumbotron {
	background-color: rgba(145, 145, 145, 0.5);
	margin-top: 50px;
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
<div class="container">
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
				<div class="jumbotron">

					<h4>Enregistrement</h4>
					<HR>
					<form method="post" action="${pageContext.request.contextPath}/signup">
						<div class="form-group">
							<label for="code"><i>Code:</i></label> <input type="text"
								name="code" class="form-control" required>
						</div>
						<div class="form-group">
							<label for="password"><i>Mot de pass :</i></label> <input
								type="password" name="password" class="form-control" required>
						</div>
						<div class="form-group">
							<label for="name"><i>Nom :</i></label> <input
								type="text" name="name" class="form-control" required>
						</div>
						<div class="form-group">
							<label for="address"><i>Address:</i></label> <input
								type=text name="address" class="form-control" required>
						</div>
						<div class="form-group">
							<label for="ville"><i>Ville:</i></label> <input
								type="text" name="ville" class="form-control" required>
						</div>
						<input type="submit" value="Valider" class="btn btn-info">
						<input type="reset" value="Effacer" class="btn btn-danger">
						<a href="/" class="btn btn-success">Annuler</a>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>