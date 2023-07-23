<%-- 
    Document   : listar
    Created on : 20/07/2023, 08:55:40 PM
    Author     : ahs43
--%>

<%@page import="co.edu.sena.sominprojectweb.logica.Producto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Estudiantes</h1>

        <%
            List<Producto> productos = (List) request.getSession().getAttribute("listaProductos");
            int cont = 1;
            for (Producto p : productos) {

        %>

        

        
        <p><b>producto Numero:<%=cont%> </b></p>
        
        <p><%=p%> </p>
        
        <%cont=cont+1;%>
        
        <% }%>

    </body>
</html>