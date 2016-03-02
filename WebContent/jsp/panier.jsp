<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/include/header.jsp"/>
<div class="container">
	<div class="row">
		<h4>Le panier</h4>
		<hr>		
		<div class="col-sm-8">
			<p>Voyage pour Paris</p>
		</div>
		<div class="col-sm-4">
			<p>190 €</p>
		</div>
		<div class="col-sm-8">
			<p>Voyage pour Lille</p>
		</div>
		<div class="col-sm-4">
			<p>190 €</p>
		</div>
		
		<div class="col-sm-9">
		</div>
		<div class="col-sm-3">
			<p>Total : 380 € </p>
		</div>
	</div>
	
	<button class="btn btn-primary"  type="submit">Commander</button>
</div>
<c:import url="/include/footer.jsp"/>