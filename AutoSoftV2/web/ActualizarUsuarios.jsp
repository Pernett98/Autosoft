

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
            //mensajes del sistema
            String mensaje = "";

            //Obtener valor como fue llamado el formulario
            String id_Usuario;
            String perfil;
            String contrasena;
            String c_contrasena;
            String estado;
            String foto;
            if (request.getAttribute("id_Usuario") == null) {
                id_Usuario = "";
            } else {
                id_Usuario = request.getAttribute("id_Usuario").toString();
            }

            if (request.getAttribute("perfil") == null) {
                perfil = "";
            } else {
                perfil = request.getAttribute("perfil").toString();
            }

            if (request.getAttribute("contrasena") == null) {
                contrasena = "";
            } else {
                contrasena = request.getAttribute("contrasena").toString();
            }

            if (request.getAttribute("c_contrasena") == null) {
                c_contrasena = "";
            } else {
                c_contrasena = request.getAttribute("c_contrasena").toString();
            }
            if (request.getAttribute("estado") == null) {
                estado = "";
            } else {
                estado = request.getAttribute("estado").toString();
            }

            if (request.getAttribute("foto") == null) {
                foto = "";
            } else {
                foto = request.getAttribute("foto").toString();
            }
        %>
        <h1>Actualizar Usuarios</h1>
        <form name="ActualizarUsuarios" id="ActualizarUsuarios" action="UsuariosN" method="POST">
            <table class="formP">
                <tbody>
                    <tr>
                        <th>Identificación *:</th>
                        <td><input type="text" name="id_Usuario" id="id_Usuario" value="<%=id_Usuario%>" size="15" onkeypress="return soloNumeros(event)" OnFocus="this.blur()"/></td>
                        <th>Perfil *:</th>
                        <td><select name="perfil" id="perfil">
                                <option value="0" <%=(perfil.equals("") ? "selected" : "")%> >Seleccione perfil...</option>
                                <option value="1" <%=(perfil.equals("1") ? "selected" : "")%>>Empleado</option>
                                <option value="2" <%=(perfil.equals("2") ? "selected" : "")%>>Cliente</option>

                            </select></td>
                    </tr>
                    <tr>
                        <th>Contraseña *:</th>
                        <td><input type="password" name="contrasena" id="contrasena" value="<%=contrasena%>" size="15" /></td>
                        <th>Confirmar Contraseña *:</th>
                        <td><input type="password" name="c_contrasena" id="c_contrasena" value="<%=c_contrasena%>" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Foto:</th>
                        <td><input type="file" name="foto" id="foto" value="<%=foto%>" /></td>
                        <td colspan="2">* Campos Obligatorios</td>
                    </tr>
                    <tr>
                        <th colspan="4"><img src="<%=foto%>" width="300" height="300" alt="Foto"/></th>
                    </tr>
                </tbody>
            </table>
            <br>
            <center>
                <div  id="botones" name="botones">
                    
                    
                </div>
            </center>
        </form>
                    
    <center><br>
        <input type="button" value="Modificar" class="botonoper1" onclick="botonModificar()">
        <a href="ListadoUsuarios.jsp"><input type="button" value="Volver" class="botonoper1"></input></a><br>
        <h4><%=mensaje%></h4>
    </center>
    <div id="mensaje-emergente"></div>
</body>
</html>
