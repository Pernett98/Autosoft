
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="estilos.jsp" ></jsp:include>
            <title>AutoSoft</title>
            <script language="javascript" src="js/ValidarUsuarioScript.js"></script>
        </head>
        <body>
        <%
            session.invalidate();
            
        %>
        <div class="header">
            <img src="Imagenes/tipografia.gif" width="50%" height="80%">  
        </div>
        <div class="contenido">


            <form name="ValidarUsuario" id="ValidarUsuario" action="ValidarUsuario" method="POST">
                <h1>Inicio Sesión</h2><br>
                    <h3>Identificación:</h2>
                    <input type="text" name="usuario" id="usuario" value="" size="15" /><br>
                        <h3>Contraseña:</h2>
                            <input type="password" name="clave" id="clave" value="" size="15"/><br><br>
                            <input type="submit" value="Ingresar" name="ingresar" id="boton" class="botonoper1"/>
                            </form>
                            <div id="mensaje-ingreso"></div>
                            </div>

                            <div class="footer" >
                                <a href="chinga.org">Olvide mi contraseña    |    </a><a href="chinga.org">Ayuda</a><a href="chinga.org">    |    Acerca de AutoSoft</a>
                            </div>
                            </body>
                  
</html>