<%@page import="entidades.Servicios"%>
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
            <script language="javascript" src="js/validarCamposServicio.js">
            </script>
        </head>
        <body>
        <%

            HttpSession sesion = request.getSession();
            Usuarios miUsuarioLogueado = (Usuarios) sesion.getAttribute("usuario");
            Empleados miEmpleadoLogueado = (Empleados) sesion.getAttribute("empleado");
            if ((miUsuarioLogueado == null) && (miEmpleadoLogueado == null)) {
        %>
        <META HTTP-EQUIV="REFRESH" CONTENT="0;URL=alertaSesion.jsp" target="_parent"> 
        <%
            }

            //mensajes del sistema
            String mensaje = "";

            //Obtener valor como fue llamado el formulario
            String id_Servicio = "";
            String id_Vehiculo = "";
            String id_Cliente = "";
            String id_Empleado = "";
            String estado = "";
            String fecha_Inicio = "";
            String fecha_Fin = "";

            if (request.getAttribute("id_Servicio") == null) {
                id_Servicio = "";
            } else {
                id_Servicio = request.getAttribute("id_Servicio").toString();
            }

            if (request.getAttribute("id_Vehiculo") == null) {
                id_Vehiculo = "";
            } else {
                id_Vehiculo = request.getAttribute("id_Vehiculo").toString();
            }

            if (request.getAttribute("id_Cliente") == null) {
                id_Cliente = "";
            } else {
                id_Cliente = request.getAttribute("id_Cliente").toString();
            }

            if (request.getAttribute("id_Empleado") == null) {
                id_Empleado = "";
            } else {
                id_Empleado = request.getAttribute("id_Empleado").toString();
            }

            if (request.getAttribute("estado") == null) {
                estado = "";
            } else {
                estado = request.getAttribute("estado").toString();
            }

            if (request.getAttribute("fecha_Inicio") == null) {
                fecha_Inicio = "";
            } else {
                fecha_Inicio = request.getAttribute("fecha_Inicio").toString();
            }

            if (request.getAttribute("fecha_Fin") == null) {
                fecha_Fin = "";
            } else {
                fecha_Fin = request.getAttribute("fecha_Fin").toString();
            }


        %>
        <h1>Actualizar Servicio</h1>
        <div id="mensaje-ingreso"></div>
        <form name="ActualizarServicios" id="ActualizarServicios" action="ServiciosN" method="POST">
            <table class="formP">
                <tbody>
                    <tr>
                        <th>Identificación *:</th>
                        <td><input type="text" name="id_Servicio" id="id_Servicio" value="<%=id_Servicio%>" size="15"  onkeypress="return soloNumeros(event)" OnFocus="this.blur()"/></td>
                        <th>Empleado *:</th>
                        <td><input type="text" name="id_Empleado" id="id_Empleado" value="<%=id_Empleado%>" size="15"  onkeypress="return soloNumeros(event)" OnFocus="this.blur()"/></td>

                    </tr>
                    <tr>
                        <th>Cliente *:</th>
                        <td><input type="text" name="id_Cliente" id="id_Cliente" value="<%=id_Cliente%>" size="15" /></td>
                        <th>Vehiculo *:</th>
                        <td><input type="text" name="id_Vehiculo" id="id_Vehiculo" value="<%=id_Vehiculo%>" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Estado *:</th>
                        <td><select name="estado" id="estado">
                                <option value="0" <%=(estado.equals("") ? "selected" : "")%> >Seleccione el estado...</option>
                                <option value="1" <%=(estado.equals("1") ? "selected" : "")%> >En espera</option>
                                <option value="2" <%=(estado.equals("2") ? "selected" : "")%> >En proceso</option>
                                <option value="3" <%=(estado.equals("3") ? "selected" : "")%> >Finalizado</option>

                            </select></td>
                    </tr>
                    <tr>
                        <th>Fecha Inicio *:</th>
                        <td><input type="date" name="fecha_Inicio" id="fecha_Inicio" value="<%=fecha_Inicio%>" size="15" /></td>
                        <th>Fecha Fin *:</th>
                        <td><input type="date" name="fecha_Fin" id="fecha_Fin" value="<%=fecha_Fin%>" size="15" /></td>
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
        <%   if ((miUsuarioLogueado.getPerfil() == 1)) {
        %>

        <input type="button" value="Modificar" class="botonoper1" name="chingon" id="chingon" onclick="botonModificar()">
        <%
        }%>

        <a href="ListadoServicios.jsp"><input type="button" value="Volver" class="botonoper1"></input></a><br>
        <h4></h4>
    </center>  
    <div id="mensaje-emergente">

    </div>
</body>
</html>
