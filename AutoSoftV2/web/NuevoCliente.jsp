<%@page import="entidades.Clientes"%>
<%@page import="entidades.Usuarios"%>
<%@page import="entidades.Empleados"%>
<%@page import="persistencia.Datos"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="estilos.jsp" ></jsp:include>
            <title>AutoSoft</title>
            <script language="javascript" src="js/validarCamposCliente.js">
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
        <h1>Nuevo Cliente</h1>
        <div id="mensaje-ingreso"></div>
        <form name="ClientesN" id="ClientesN" action="ClientesN" method="POST">
            <table class="formP" >
                <tbody>
                    <tr>
                        <th>Identificación *:</th>
                        <td><select name="id_Cliente" id="id_Cliente"/>
                            <option value="" >Seleccione un cliente...</option>
                            <% int x=0;
                                Datos misDatos = new Datos();
                                ResultSet rs = misDatos.getUsuarios();
                    
                                while (rs.next()) {
                                    if (rs.getString("perfil").equals("2")){
                                    x=x+1;
                                %>
                                <option value="<%=rs.getString("id_Usuario")%>" ><%=rs.getString("id_Usuario")%></option>
                                <%
                                    }}misDatos.cerrarConexion();
                                %>
            
                        </select></td>
                    </tr>
                    <tr>
                        <th>Nombre *:</th>
                        <td><input type="text" name="nombre" id="nombre" value="" size="15" /></td>
                        <th>Apellido *:</th>
                        <td><input type="text" name="apellido" id="apellido" value="" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Fecha de Nacimiento *:</th>
                        <td><input type="date" name="fecha_Nacimiento" id="fecha_Nacimiento" value="" size="15" /></td>
                        <th>Genero *:</th>
                        <td><select name="genero" id="genero">
                                <option value="0" >Seleccione perfil...</option>
                                <option value="1">Masculino</option>
                                <option value="2">Femenino</option>

                            </select></td>
                    </tr>
                    <tr>
                        <th>Telefono Fijo *:</th>
                        <td><input type="text" name="telefono" id="telefono" value="" size="15" /></td>
                        <th>Telefono Celular *:</th>
                        <td><input type="text" name="celular" id="celular" value="" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Pais *:</th>
                        <td><input type="text" name="pais" id="pais" value="" size="15" /></td>
                        <th>Departamento *:</th>
                        <td><input type="text" name="departamento" id="departamento" value="" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Ciudad *:</th>
                        <td><input type="text" name="ciudad" id="ciudad" value="" size="15" /></td> 
                        <th>Direccion Fisica *:</th>
                        <td><input type="text" name="direccion" id="direccion" value="" size="15" /></td> 
                    </tr>
                    <tr>
                        <th>Ocupacion *:</th>
                        <td><input type="text" name="ocupacion" id="ocupacion" value="" size="15" /></td> 
                        <th>Empresa *:</th>
                        <td><input type="text" name="empresa" id="empresa" value="" size="15" /></td> 
                    </tr>
                    <tr>
                        <th>Correo Electronico *:</th>
                        <td><input type="email" name="correo" id="correo" value="" size="15" /></td>
                        <th colspan="2">* Campos Obligatorios</th>
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
        <a href="ListadoClientes.jsp"><input type="button" value="Cancelar" class="botonoper1"></input></a><br>
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

