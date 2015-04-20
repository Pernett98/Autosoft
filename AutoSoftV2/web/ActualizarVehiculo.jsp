<%@page import="entidades.Vehiculos"%>
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
        }
            //mensajes del sistema
            String mensaje = "";

            //Obtener valor como fue llamado el formulario
            String id_Vehiculo = "";
            String id_Cliente = "";
            String tipo_Vehiculo = "";
            String marca = "";
            String modelo = "";
            String fecha_Matricula = "";
            String fecha_Ult_Ser = "";
            String combustible = "";
            String kilometraje = "";
            String historial_Vehiculo = "";
            String datos_Vehiculo = "";
            
            
            
            if (request.getAttribute("id_Vehiculo") == null) {
                id_Vehiculo  = "";
            } else {
                id_Vehiculo  = request.getAttribute("id_Vehiculo").toString();
            }
            
            if (request.getAttribute("id_Cliente") == null) {
               id_Cliente   = "";
            } else {
                id_Cliente = request.getAttribute("id_Cliente").toString();
            }
            
            if (request.getAttribute("tipo_Vehiculo") == null) {
                tipo_Vehiculo  = "";
            } else {
                tipo_Vehiculo = request.getAttribute("tipo_Vehiculo").toString();
            }
            
            if (request.getAttribute("marca") == null) {
                marca  = "";
            } else {
                marca = request.getAttribute("marca").toString();
            }
            
            if (request.getAttribute("modelo") == null) {
                 modelo = "";
            } else {
                modelo = request.getAttribute("modelo").toString();
            }
            
            if (request.getAttribute("fecha_Matricula") == null) {
                fecha_Matricula  = "";
            } else {
                fecha_Matricula = request.getAttribute("fecha_Matricula").toString();
            }
            
            if (request.getAttribute("fecha_Ult_Ser") == null) {
                fecha_Ult_Ser  = "";
            } else {
                fecha_Ult_Ser = request.getAttribute("fecha_Ult_Ser").toString();
            }
            
            if (request.getAttribute("combustible") == null) {
                combustible  = "";
            } else {
                combustible = request.getAttribute("combustible").toString();
            }
            
            if (request.getAttribute("kilometraje") == null) {
                kilometraje  = "";
            } else {
                kilometraje = request.getAttribute("kilometraje").toString();
            }
            
            if (request.getAttribute("historial_Vehiculo") == null) {
                historial_Vehiculo  = "";
            } else {
                historial_Vehiculo = request.getAttribute("historial_Vehiculo").toString();
            }
            
            if (request.getAttribute("datos_Vehiculo") == null) {
                datos_Vehiculo  = "";
            } else {
                datos_Vehiculo = request.getAttribute("datos_Vehiculo").toString();
            }
            

        %>
        <h1>Actualizar Vehiculo</h1>
        <div id="mensaje-ingreso"></div>
        <form name="ActualizarVehiculo" id="ActualizarVehiculo" action="VehiculosN" method="POST">
            <table class="formP">
                <tbody>
                    <tr>
                        <th>ID (PLACA) *:</th>
                        <td><input type="text" name="id_Vehiculo" id="id_Vehiculo" value="<%=id_Vehiculo%>" size="15"  onkeypress="return soloNumeros(event)" OnFocus="this.blur()"/></td>
                        <th>Propietario (ID) *:</th>
                        <td><input type="text" name="id_Cliente" id="id_Empleado" value="<%=id_Cliente%>" size="15"  onkeypress="return soloNumeros(event)" OnFocus="this.blur()"/></td>
                        
                    </tr>
                    <tr>
                        <th>Tipo *:</th>
                        <td><input type="text" name="tipo_Vehiculo" id="tipo_Vehiculo" value="<%=tipo_Vehiculo%>" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Marca *:</th>
                        <td><input type="text" name="marca" id="marca" value="<%=marca%>" size="15" /></td>
                        <th>Modelo *:</th>
                        <td><input type="text" name="modelo" id="modelo" value="<%=modelo%>" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Fecha de Matricula *:</th>
                        <td><input type="date" name="fecha_Matricula" id="fecha_Matricula" value="<%=fecha_Matricula%>" size="15" /></td>
                        <th>Ultimo Servicio *:</th>
                        <td><input type="date" name="fecha_Ult_Ser" id="fecha_Ult_Ser" value="<%=fecha_Ult_Ser%>" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Combustible *:</th>
                        <td><input type="text" name="combustible" id="combustible" value="<%=combustible%>" size="15" /></td>
                        <th>Kilometraje *:</th>
                        <td><input type="text" name="kilometraje" id="kilometraje" value="<%=kilometraje%>" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Hitorial Del Vehiculo *:</th>
                        <td rowspan="5"><input type="text" name="historial_Vehiculo" id="historial_Vehiculo" value="<%=historial_Vehiculo%>" size="30" style="height: 60px"/></td>
                        <th>Datos del Vehiculo *:</th>
                        <td rowspan="5"><input type="text" name="datos_Vehiculo" id="datos_Vehiculo" value="<%=datos_Vehiculo%>" size="30" style="height: 60px"/></td>
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
        <a href="ListadoVehiculos.jsp"><input type="button" value="Volver" class="botonoper1"></input></a><br>
        <h4></h4>
    </center>  
        <div id="mensaje-emergente">
            
        </div>
</body>
</html>

