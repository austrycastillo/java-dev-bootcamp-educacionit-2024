<%@ page import="com.educacionit.clase24.entities.Pelicula" %>
<%@ page import="com.educacionit.clase24.clase24.ProcesarPelicula" %><%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 12/6/2024
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Procesar</h1>
<%
    String pelicula = request.getParameter("pelicula");
    String actor = request.getParameter("actor");
    out.println(pelicula+ " " + actor);
    Pelicula pelicula1 = new Pelicula(pelicula,actor);
    ProcesarPelicula pp = new ProcesarPelicula();
    String mensaje = pp.insertarBd(pelicula1);
%>
<h2>
    <%
        out.println(mensaje);
    %>
</h2>


</body>
</html>
