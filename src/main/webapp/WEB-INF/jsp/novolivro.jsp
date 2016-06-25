<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Livros</title>
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
    
    	<div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
          </ul>
        </div>
    	
    	<h1 style="padding: 40px 15px;text-align: center;">Novo Livro</h1>
    	
    	
    	<div class="textCenterAcess" style="text-align: center;">
			<div class="col-md-12">
				<form:form  method="POST" action="livro">
					<div class="form-inline">
						<div class="col-md-12">
							<input id="nome" maxlength="100" name="nome" type="text" class="form-control" style="width: 100%;margin-bottom: 15px;" placeholder="Título">
						</div>
						<div class="col-md-12">
							<input id="escritor" maxlength="100" name="escritor" type="text" class="form-control" style="width: 100%;margin-bottom: 15px;" placeholder="Escritor">
						</div>
						<div class="col-md-6">
							<input id="classificacao" name="classificacao" maxlength="200" type="number" class="form-control" style="width: 100%;margin-bottom: 15px;" placeholder="Classificação" min="0" max="200">
						</div>
						<div class="col-md-12" style="text-align: left;">
							<div>
								<span style="color: darkblue;font-style: italic;">Ano Edição</span>
							</div>
							<input id="anoEdicao" name="anoEdicao" type="number" maxlength="4" class="form-control" style="margin:auto;margin-bottom: 15px;min-width: 197px;" min="0" max="9999">
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-12">
							<div>
								<button type="submit" class="btn btn-success" value="send">Salvar</button>
								<button class="btn btn-warning" value="">Cancelar</button>
							</div>
						</div>
					</div>
				</form:form>
			</div>
		</div>
    	
    
    </div>


</body>

</html>