<%-- 
    Document   : index
    Created on : 15-sep-2020, 12:46:23
    Author     : Asus
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="configuracion.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
         <link href="css/styles.css" rel="stylesheet" type="text/css"/>  
         <link href="css/style.css" rel="stylesheet" type="text/css"/>

         <title>Web SCRUM Examen</title>
    </head>
    <body>
        <center>
            <section class="form-login">
               <h5>Formulario Login</h5>
               <form name="frmLogin" action="controladorUser" method="POST">
                    <input class="controls" type="text" name="txtUsuario" value="" placeholder="Usuario">
                    <input class="controls" type="password" name="txtContra" value="" placeholder="Contraseña">
                    <input class="btn btn-primary btn-lg" type="submit" value="Ingresar" name="btnIniciar" />
               </form>
               
               <%
                   HttpSession sesion = request.getSession();
     
                    List<Usuario> datos= new ArrayList<Usuario>();
                    if(request.getAttribute("fail")!=null){
                        out.print("<script>alert('Usuario o contrasena erroneos');</script>");
                        
                    }
               
                    if(request.getAttribute("datos")!=null){
                        
                        datos = (List<Usuario>)request.getAttribute("datos");
                       String Usuario="";
                         int nivel=0;
                             for( Usuario u : datos ){
                        Usuario = u.getUsuario();
                      nivel = u.getNivel(); 
                           }    
                            sesion.setAttribute("Usuario",Usuario);
                            sesion.setAttribute("nivel",nivel);
                            response.sendRedirect("admin.jsp");                                                                                                            
                        }
                                           
               %>
            </section>
        </center>>
    </body>
</html>
          