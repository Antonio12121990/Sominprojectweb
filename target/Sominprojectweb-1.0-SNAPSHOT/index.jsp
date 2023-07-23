<%-- 
    Document   : index
    Created on : 20/07/2023, 06:00:21 PM
    Author     : ahs43
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<link rel="stylesheet" href="css/index.css"/>
</head>
<body>
<div class="cuerpo">

<header>
    <img src="img/colegiobaner.jgp.jpeg" alt="no carga">
</header>

<nav>

</nav>

<section>


<article>

<fieldset>
   <legend>Registrar Producto</legend>
            <form action="SvProducto" method="POST">
            <label for="txtId">Id:</label><br>
            <input type="number" id="txtId" name="id" ><br>
            <label for="txtNombre">Nombre:</label><br>
            <input type="text" id="txtNombre" name="nombre"><br>
            <label for="txtValor">Valor:</label><br>
            <input type="number" id="txtValor" name="valor" ><br>
            <label for="txtExistencias">Existencias</label><br>
            <input type="number" id="txtExistencias" name="existencias" ><br><br>


<input type="submit" value="Registrar">
</form>
</fieldset>
</article>

<article>
<fieldset>
<legend>Listar Productos</legend>
<p>Para listar productos presione el siguiente boton</p>

<form action="SvProducto" method="GET">

<input type="submit" value="Consultar">
</form>
</fieldset>
</article>

</section>

<footer>

<h6>Somin</h6>
</footer>

</div>
</body>
</html>

