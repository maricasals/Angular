<%-- 
    Document   : details_film
    Created on : 7 mars 2016, 12:25:03
    Author     : admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details Film</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
        <c:import url="_TITRE.jsp"/>
        <c:import url="_MENU.jsp"/>
        <div class="contenue">
            <h1>${FILM.titre_serie}</h1>
        </div>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
