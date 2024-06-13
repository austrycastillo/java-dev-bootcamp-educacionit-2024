<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        h1{
            color: blueviolet;
        }
input{
    display: block;
}
    </style>
</head>
<body>
<h1>Holaaaaa casi Invierno 🥶</h1>
<%
    //si podemos armar un mismo archivo con el procesamiento
    if(request.getParameter("pelicula")!=""){

    }else{
%>
    <form action="procesar.jsp" method="get">
        <input type="text" name="pelicula" placeholder="Película favorita">
        <input type="text" name="actor" placeholder="Actor principal">
        <input type="submit" value="Enviar el gran formulario que armamos">
    </form>
<%
    }
%>
</body>
</html>