

<%@page import="entidades.Empleados"%>
<%@page import="entidades.Usuarios"%>
<%@page import="persistencia.Datos"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="estilos.jsp" ></jsp:include>
            <title>AutoSoft</title>
            <script language="javascript" src="js/validarCamposUsuario.js">
            </script>
        </head>
        <body>
        <%

        HttpSession sesion = request.getSession();
        Usuarios miUsuarioLogueado = (Usuarios) sesion.getAttribute("usuario");
        Empleados miEmpleadoLogueado = (Empleados) sesion.getAttribute("empleado");
        if ((miUsuarioLogueado == null)&&(miEmpleadoLogueado==null)) {
    %>
    <META HTTP-EQUIV="REFRESH" CONTENT="0;URL=alertaSesion.jsp" target="_parent"> 
    <%
        }else
        if( (miUsuarioLogueado.getPerfil() != 1)){
    %>

    <META HTTP-EQUIV="REFRESH" CONTENT="0;URL=alertaSesion2.jsp"> 
    <%
        } else if ((miEmpleadoLogueado.getCargo()!= 3)&&(miEmpleadoLogueado.getCargo()!= 4)){
        %>

    <META HTTP-EQUIV="REFRESH" CONTENT="0;URL=alertaSesion2.jsp"> 
    <%
        }
        String mensaje=(String)null;
        if (request.getAttribute("mensaje") != null) {
                mensaje  = request.getAttribute("mensaje").toString();
            }
    %>
        <h1>Nuevo Usuario</h1>
        <div id="mensaje-ingreso"></div>
        <form name="NuevoUsuario" id="NuevoUsuario" action="UsuariosN" method="POST">
            <table class="formP">
                <tbody>
                    <tr>
                        <th>Identificación *:</th>
                        <td><input type="text" name="id_Usuario" id="id_Usuario" value="" size="15"  onkeypress="return soloNumeros(event)"/></td>
                        <th>Perfil *:</th>
                        <td><select name="perfil" id="perfil">
                                <option value="0" >Seleccione perfil...</option>
                                <option value="1">Empleado</option>
                                <option value="2">Cliente</option>

                            </select></td>
                    </tr>
                    <tr>
                        <th>Contraseña *:</th>
                        <td><input type="password" name="contrasena" id="contrasena" value="" size="15" /></td>
                        <th>Confirmar Contraseña *:</th>
                        <td><input type="password" name="c_contrasena" id="c_contrasena" value="" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Foto:</th>
                        <td><input type="file" name="foto" id="foto" value="" /></td>
                        <td colspan="2">* Campos Obligatorios</th>
                    </tr>
                    <tr>
                         <th colspan="4"><img src="" width="300" height="300" alt="Foto"/></th>
                    </tr>
                </tbody>
            </table>
            <br>
            <center>
                <input type="submit" value="Guardar" name="crear" id="crear"  class="botonoper1" />
                <input type="submit" value="Limpiar" name="limpiar" id="limpiar"  class="botonoper1" />
            </center>

        </form>
    <center><br>
        <a href="ListadoUsuarios.jsp"><input type="button" value="Cancelar" class="botonoper1"></input></a><br>
        <h4></h4>
    </center>  
    <div id="mensaje-emergente">
                        <% if (mensaje!= null){
                            
                        %>
        <div id='principal'> <div id='notificacion2'><%=mensaje%></div></div>
                        <%
                         }%></div>
</body>
</html>
