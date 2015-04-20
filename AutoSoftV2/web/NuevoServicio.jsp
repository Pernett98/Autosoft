<%@page import="entidades.Servicios"%>
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
            <script language="javascript" src="js/validarCamposServicio.js">
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
        }
        String mensaje=(String)null;
        if (request.getAttribute("mensaje") != null) {
                mensaje  = request.getAttribute("mensaje").toString();
            }
    %>
        <h1>Nuevo Servicio</h1>
        <div id="mensaje-ingreso"></div>
        <form name="ServiciosN" id=ServiciosN" action="ServiciosN" method="POST">
            <table class="formP" >
                <tbody>
                    <tr>
                        <th>Identificación *:</th>
                        <% int x=0;
                                Datos misDatos = new Datos();
                                ResultSet rs = misDatos.getServicios();
                    
                                while (rs.next()) {
                                    x=x+1;
                                }
                                %>
                        <td><input type="text" name="id_Servicio" id="id_Servicio" value="<%=x+1%>" size="15"  onkeypress="return soloNumeros(event)" OnFocus="this.blur()"/></td>
                        <th>Empleado *:</th>
                        <td><select name="id_Empleado" id="id_Empleado"/>
                            <option value="" >Seleccione un empleado...</option>
                            <%  x=0;
                                rs = misDatos.getEmpleados();
                    
                                while (rs.next()) {
                                    x=x+1;
                                %>
                                <option value="<%=rs.getString("id_Empleado")%>" ><%=rs.getString("id_Empleado")%></option>
                                <%
                                    }
                                %>
            
                        </select></td>
                    </tr>
                    <tr>
                        <th>Cliente *:</th>
                        <td><select name="id_Cliente" id="id_Cliente"/>
                            <option value="" >Seleccione un cliente...</option>
                            <% x=0;
                                rs = misDatos.getClientes();
                    
                                while (rs.next()) {
                                    x=x+1;
                                %>
                                <option value="<%=rs.getString("id_Cliente")%>" ><%=rs.getString("id_Cliente")%></option>
                                <%
                                    }
                                %>
            
                        </select></td>
                        <th>Vehiculo *:</th>
                        <td><select name="id_Vehiculo" id="id_Vehiculo"/>
                            <option value="" >Seleccione un vehiculo...</option>
                            <% x=0;
                                rs = misDatos.getVehiculos();
                    
                                while (rs.next()) {
                                    x=x+1;
                                %>
                                <option value="<%=rs.getString("id_Vehiculo")%>" ><%=rs.getString("id_Vehiculo")%></option>
                                <%
                                    }misDatos.cerrarConexion();
                                %>
            
                        </select></td>
                    </tr>
                    <tr>
                        <th>Estado *:</th>
                        <td><select name="estado" id="estado">
                                <option value="0" >Seleccione perfil...</option>
                                <option value="1" >En espera</option>
                                <option value="2" >En proceso</option>
                                <option value="3" >Finalizado</option>

                            </select></td>
                    </tr>
                    <tr>
                        <th>Fecha Inicio *:</th>
                        <td><input type="date" name="fecha_Inicio" id="fecha_Inicio" value="" size="15" /></td>
                        <th>Fecha Fin *:</th>
                        <td><input type="date" name="fecha_Fin" id="fecha_Fin" value="" size="15" /></td>
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
        <a href="ListadoServicios.jsp"><input type="button" value="Cancelar" class="botonoper1"></input></a><br>
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

