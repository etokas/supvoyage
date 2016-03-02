<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/include/header.jsp"/>
<div class="container">
	<div class="row">
		<h5>Bienvenu dans votre espace ${user.firstName} ${user.lastName} !</h5>
	</div>
</div>
<div class="container">
    <h1>Edit Profile</h1>
  	<hr>
	<div class="row">
      <!-- left column -->
      <div class="col-md-3">
        <div class="text-center">
          <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
         
        </div>
      </div>
      
      <!-- edit form column -->
      <div class="col-md-9 personal-info">
       
        <h3>Personal info</h3>
        
        <form class="form-horizontal" role="form" ation="edit">
          <div class="form-group">
            <label class="col-lg-3 control-label">Campus Id:</label>
            <div class="col-lg-8">
              <input class="form-control" name="idbooster" value="${user.idbooster}" type="text">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Email:</label>
            <div class="col-lg-8">
              <input class="form-control" name="email" value="${user.emailAdress}" type="text">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">First Name :</label>
            <div class="col-lg-8">
              <input class="form-control" name="firstname" value="${user.firstName}" type="text">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Last Name:</label>
            <div class="col-lg-8">
              <input class="form-control"  name="lastname"value="${user.lastName}" type="text">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Campus Name :</label>
            <div class="col-lg-8">
              <div class="ui-select">
                <select id="user_time_zone" class="form-control">
                  <option value="">SUPINFO Bordeaux</option>
                  <option value="">SUPINFO Grenoble</option>
                  <option value="">SUPINFO Marseille </option>
                  <option value="">SUPINFO Nantes</option>
                  <option value="">SUPINFO Caen </option>
                  <option value="">SUPINFO Lille </option>
                  <option value="">SUPINFO Metz</option>
                  <option value="">SUPINFO Nice </option>
                  <option value="">SUPINFO Lyon </option>
                  <option value="">SUPINFO Montpellier</option>
                  <option value="">SUPINFO Clermont-Ferrand</option>
                  <option value="">SUPINFO Orléans</option>
                  <option value="">SUPINFO Paris</option>
                  <option value="">SUPINFO Reims</option>
                  <option value="">SUPINFO Strasbourg</option>
                  <option value="">SUPINFO Toulouse</option>
                  <option value="">SUPINFO Tours</option>
                  <option value="">SUPINFO Troyes</option>
                  <option value="">SUPINFO Valenciennes</option>
                  <option value="">SUPINFO Martinique</option>
                  <option value="">SUPINFO Guadeloupe</option>
                  <option value="">SUPINFO Reunion</option>
                  <option value="">SUPINFO Bruxelles</option>
                  <option value="">SUPINFO Londres</option>
                  <option value="">SUPINFO Luxembourg</option>
                  <option value="">SUPINFO Rome</option>
                  <option value="">SUPINFO Suisse</option>
                  <option value="">SUPINFO Trapani</option>
                  <option value="">SUPINFO Montreal</option>
                  <option value="">SUPINFO San Francisco</option>
                  <option value="">SUPINFO Rio de Janeiro</option>
                  <option value="">SUPINFO Casablanca</option>
                  <option value="">SUPINFO Ile-Maurice</option>
                  <option value="">SUPINFO Senegal</option>
                  <option value="">SUPINFO Rabat</option>
                  <option value="">SUPINFO Hong Kong</option>
                  <option value="">SUPINFO Beijng</option>
                  <option value="">SUPINFO Tianjin</option>
                  <option value="">SUPINFO Zhenjiang</option>
                 </select>
              </div>
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-md-3 control-label">Password:</label>
            <div class="col-md-8">
              <input class="form-control" name="password" value="${user.password}" type="password">
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-3 control-label">Confirm password:</label>
            <div class="col-md-8">
              <input class="form-control" value="${user.password}" type="password">
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-3 control-label"></label>
            <div class="col-md-8">
              <input class="btn btn-primary" value="Save Changes" type="submit">
              <span></span>
              <input class="btn btn-default" value="Cancel" type="reset">
            </div>
          </div>
        </form>
      </div>
  </div>
</div>
<hr>
<c:import url="/include/footer.jsp"/>