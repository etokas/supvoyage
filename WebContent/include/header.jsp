<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
		<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</head>
	<body>
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-brand"> <a href="${pageContext.request.contextPath}/">Suptrip</a></div>
				
					 <form class="navbar-form navbar-left" role="search">
					  <div class="form-group">
					    <input type="text" class="form-control" placeholder="Recherchez un voyage">
					  </div>
					  <button type="submit" class="btn btn-primary">Rechercher</button>
					</form>
  				
				<div>
					<ul class="nav navbar-nav navbar-right">
						<li class="active"><a href="${pageContext.request.contextPath}/">Acceuil</a>
						
						<c:choose>
							<c:when test="${empty sessionScope.idBoosterSession}">
								<li class="active"><a href="${pageContext.request.contextPath}/jsp/register">S'enregistrer</a>
								<li class="active"><a href="${pageContext.request.contextPath}/jsp/login">Se connecter</a>	
							</c:when>
							<c:otherwise>
								<li class="active"><a href="${pageContext.request.contextPath}/jsp/profile">Mon Compte</a>
								<li><a href="${pageContext.request.contextPath}/logout">Se deconnecter </a></li>
							</c:otherwise>
						</c:choose>
						<li><a href="${pageContext.request.contextPath}/jsp/panier">Panier <span class="badge"> 0</span></a></li>				
					</ul>				
				</div>
			</div>
		</nav>
		
		
        
        
		
		