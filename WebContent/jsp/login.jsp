<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/include/header.jsp"/>
<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
			<h3 style="color:dimgray; text-align: center">Se connecter</h3>
			<form method="POST" action="login" accept-charset="UTF-8" role="form" class="form-signin">
				<fieldset>
					<input class="form-control" placeholder="173025" name="idbooster" type="text">
					<br>		
			    	<input class="form-control middle" placeholder="Password" name="password" value="" type="password">
			    	<br>
				    <input class="btn btn-lg btn-primary btn-block" value="Valider" type="submit">
				  	<br>
				  	<p class="text-center"><a href="#">Mot de passe oublié ?</a></p>
			  	</fieldset>
		  	</form>
		</div>
	</div>
</div>
<c:import url="/include/footer.jsp"/>