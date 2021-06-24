<%-- 
    Document   : user
    Created on : 8/10/2020, 02:00:04 PM
    Author     : DiegoCanteo
--%>
<%@page session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
         <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <title>Sitio Web Users</title>
    </head>
    <body>
        <div class="position-relative" style="max-height: 100vh; max-width: 100vw">
            <img src="img/1.jpg" class="img-index" alt="Responsive image" style="width: 100%; height: 100vh;">
            <div class="col-9 text-center text-light" style="position: absolute; bottom: 100px; color: white;">
                <div class="container col text-container">
                    <h1 class="text-center text-uppercase">Bienvenido al Apartado de Usuario</h1>
                    <p class="lead">El trabajo en equipo nos enriquece como profesionales, dándonos perspectivas <br> que tal vez nunca hubiéramos pensado.</p>
                </div><br>
                <div class="text-center">
                    <a  class="btn btn-primary btn-lg" href="Controlador?accion=listar"><strong>Listar </strong></a>  
                </div>
            </div>
        </div>
    </body>
</html>