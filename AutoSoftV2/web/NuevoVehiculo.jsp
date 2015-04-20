<%@page import="entidades.Vehiculos"%>
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
            <script language="javascript" src="js/validarCamposVehiculo.js">
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
        <h1>Nuevo Vehiculo</h1>
        <div id="mensaje-ingreso"></div>
        <form name="VehiculosN" id="VehiculosN" action="VehiculosN" method="POST">
            <table class="formP" >
                <tbody>
                    <tr>
                        <th>ID (PLACA) *:</th>
                        <td><input type="text" name="id_Vehiculo" id="id_Vehiculo" value="" size="15" /></td>
                        <th>Propietario (ID) *:</th>
                        <td><select name="id_Cliente" id="id_Cliente"/>
                            <option value="" >Seleccione un cliente...</option>
                            <% int x=0;
                                Datos misDatos = new Datos();
                                ResultSet rs = misDatos.getClientes();
                    
                                while (rs.next()) {
                                    x=x+1;
                                %>
                                <option value="<%=rs.getString("id_Cliente")%>" ><%=rs.getString("id_Cliente")%></option>
                                <%
                                    }misDatos.cerrarConexion();
                                %>
            
                        </select></td>
                    </tr>
                    <tr>
                        <th>Tipo *:</th>
                        <td><input type="text" name="tipo_Vehiculo" id="tipo_Vehiculo" value="" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Marca *:</th>
                        <td><input type="text" name="marca" id="marca" value="" size="15" /></td>
                        <th>Modelo *:</th>
                        <td><input type="text" name="modelo" id="modelo" value="" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Fecha de Matricula *:</th>
                        <td><input type="date" name="fecha_Matricula" id="fecha_Matricula" value="" size="15" /></td>
                        <th>Ultimo Servicio *:</th>
                        <td><input type="date" name="fecha_Ult_Ser" id="fecha_Ult_Ser" value="" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Combustible *:</th>
                        <td><input type="text" name="combustible" id="combustible" value="" size="15" /></td>
                        <th>Kilometraje *:</th>
                        <td><input type="text" name="kilometraje" id="kilometraje" value="" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Hitorial Del Vehiculo *:</th>
                        <td rowspan="5"><input type="text" name="historial_Vehiculo" id="historial_Vehiculo" value="" size="30" style="height: 60px"/></td>
                        <th>Datos del Vehiculo *:</th>
                        <td rowspan="5"><input type="text" name="datos_Vehiculo" id="datos_Vehiculo" value="" size="30" style="height: 60px"/></td>
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
        <a href="ListadoVehiculos.jsp"><input type="button" value="Cancelar" class="botonoper1"></input></a><br>
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

