<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
	<title>Pessoas</title>
	<link href="static/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="static/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
</head>
<body>
     <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index">Início</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
<!--             <li><a href="book">Livros</a></li> -->
<!--             <li><a href="people">Pessoas</a></li> -->
          </ul>
        </div>
      </div>
    </div>
    
    <div class="container" style="margin-top: 100px;">
    	
    	<h1 style="padding: 40px 15px;text-align: center;">Pessoas</h1>
    	
    	<div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li><a href="${pageContext.request.contextPath}/pessoanovo">Novo</a></li>
<!--             <li><a href="#">Listar</a></li> -->
          </ul>
        </div>
    
    </div>


</body>

</html>