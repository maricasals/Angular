<%-- 
    Document   : lister_film
    Created on : 7 mars 2016, 10:10:46
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Films</title>
    </head>
    <body>
        <div class="contenue">
            <h1>${TITRE}</h1>
            <c:forEach items="${mesSeries}" var="maSerie">
                Serie actuel: ${maSerie.titre_serie} <a href="detail_serie?IdSerie=${maSerie.id}" >Detail de la Serie</a>
                <br/>
            </c:forEach>
        </div>
    </body>
</html>
