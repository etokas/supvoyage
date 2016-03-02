<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/include/header.jsp"/>
<div class="container">
	<div class="row">
		<header class="jumbotron hero-spacer">
            <h2>Description</h2>
            <p>SUPINFO Institute Of Information Technology est aujourd'hui une école d'informatique 
            mondiale qui dispose de son propre réseau international dédié aux technologies de l'information. 
            Le programme SUPINFO étant le même sur tous ces sites en France et dans le monde (avec quelques aménagements en Chine), il est possible de suivre chaque année d'étude sur un site différent tout en poursuivant le même cursus. 
            La mobilité en cours d'année est aussi possible et les étudiants peuvent partir quelques semaines ou mois sur un site à l'étranger pour y suivre les mêmes cours (à la langue près) et passer leurs examens. Pour tous les étudiants, l'Anglais est obligatoire. 
            </p>
        </header>
    </div>
</div>

<div class="container">
	<c:if test="${empty trip}">
		<p> Pas de voyage </p>
	</c:if>
	<c:forEach items="${trip}" var="t">
		<div class="item">
		
			<div class="label"> Trip :</div>
			<div class="values"> ${t.origine} </div>	
		</div>
	</c:forEach>
	
	<c:forEach items="${trip}" var="t">
	   <div class="col-sm-6 col-md-4">
	    <div class="thumbnail">
	      <div class="caption">
	        <h4>${trip.description}</h4>
	        <p>${trip.date}</p>
	        <p><a href="#" class="btn btn-primary" role="button">Ajouter au panier</a></p>
	      </div>
	    </div>
	  </div>
	 </c:forEach>

	<h2>Liste des voyages</h2>
	
	<div class="row">
	  <div class="col-sm-9">
	   <div class="col-sm-6 col-md-4">
	    <div class="thumbnail">
	      <div class="caption">
	        <h4>Paris --> Lille</h4>
	        <p>lorem ipsus</p>
	        <p><a href="#" class="btn btn-primary" role="button">Ajouter au panier</a></p>
	      </div>
	    </div>
	  </div>
	  <div class="col-sm-6 col-md-4">
	    <div class="thumbnail">
	      <div class="caption">
	        <h4>Paris --> Nantes</h4>
	        <p>lorem ipsus</p>
	        <p><a href="#" class="btn btn-primary" role="button">Ajouter au panier</a></p>
	      </div>
	    </div>
	  </div>
	  <div class="col-sm-6 col-md-4">
	    <div class="thumbnail">
	      <div class="caption">
	        <h4>Rouen --> Marseille</h4>
	        <p>lorem ipsus</p>
	        <p><a href="#" class="btn btn-primary" role="button">Ajouter au panier</a></p>
	      </div>
	    </div>SupTrip
	  </div>
	  <div class="col-sm-6 col-md-4">
	    <div class="thumbnail">
	      <div class="caption">
	        <h4>Troyes --> Caen</h4>
	        <p>lorem ipsus</p>
	        <p><a href="#" class="btn btn-primary" role="button">Ajouter au panier</a></p>
	      </div>
	    </div>
	  </div>
	  <div class="col-sm-6 col-md-4">
	    <div class="thumbnail">
	      <div class="caption">
	        <h4>Grenoble --> Bordeaux</h4>
	        <p>lorem ipsus</p>
	        <p><a href="#" class="btn btn-primary" role="button">Ajouter au panier</a></p>
	      </div>
	    </div>
	  </div>
	  <div class="col-sm-6 col-md-4">
	    <div class="thumbnail">
	      <div class="caption">
	        <h4>Toulouse --> Nice</h4>
	        <p>lorem ipsus</p>
	        <p><a href="#" class="btn btn-primary" role="button">Ajouter au panier</a></p>
	      </div>
	    </div>
	  </div>
	  </div>
	  <div class="col-sm-3 stats">
	  	<div class="panel panel-default">
	  		<!-- Default panel contents -->
	  		<div class="panel-heading">
	  			<h4>Statistiques</h4>
	  		</div>
	
	 		<!-- Table -->
	  		<table class="table">
	  			<tr>
	       			<td>Liste de voyage :</td>
	       			<td>10</td>
	   			</tr>
	   			<tr>
	       			<td>Nombre d'utilisateur :</td>
	       			<td>8</td>
	   			</tr> 		
	  		</table>
		</div>
	  </div>
</div>
</div>
<c:import url="/include/footer.jsp"/>