<%@page import="entidades.Detalle_Sers"%>
<%@page import="entidades.Empleados"%>
<%@page import="entidades.Usuarios"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="persistencia.Datos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="pragma" content="no-cache">
    <jsp:include page="estilos.jsp" ></jsp:include>
    <script>
       var chinga;
        var id_Detalle;
        function seleccionarE(chinga) {
            document.getElementById("detalle_serRd"+chinga+"/").checked = true;
        }
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
        if( (miUsuarioLogueado.getPerfil() != 1) || (miEmpleadoLogueado.getCargo()!= 3) ){
    %>

    <META HTTP-EQUIV="REFRESH" CONTENT="0;URL=alertaSesion2.jsp"> 
    <%
        }
        String mensaje = "";
        if (request.getAttribute("mensaje") == null) {
                mensaje  = "";
            } else {
                mensaje  = request.getAttribute("mensaje").toString();
            }
    %>



    <br><a href="NuevoDetalle_Sers.jsp" target="submenutrabajo"><input type="submit" value="Nuevo Detalle Servicio" name="nuevo" id="nuevo" class="botonoper1"/></a><br>
    <form name="consulta" id="consulta" action="Detalle_SersN" method="POST" >
        <br><div style="border:0px none; width:99%; height:60%; overflow:auto;">
        <table class="listasP">
            
                <tr>
                    <td></td>
                    <td>ID</td>
                    <td>Tipo</td>
                    <td>Empleado</td>
                    <td>Vehiculo</td>
                    <td>Fecha Inicio</td>
                    <td>Fecha Fin</td>
                </tr>
                
                <%
                   if (request.getAttribute("id_Detalle") == null) {
                    String nombre="";
                    int x=0;
                    Datos misDatos = new Datos();
                    ResultSet rs = misDatos.getDetalle_ser();
                    
                    while (rs.next()) {
                        x=x+1;
                        nombre=("detalle_serRd"+x);
                %>
                <tr onclick="chinga=<%=x%> ; seleccionarE(chinga)" name=<%=x%> id=<%=x%>>
                    <td><input type="radio" name="detalle_serRd" value="<%=rs.getString("id_Detalle")%>" id=<%=nombre%>/></td>
                    <td><%=rs.getString("id_Detalle")%></td>
                    <td><%=rs.getString("tipo_Servicio")%></td>
                    <td><%=rs.getString("id_Empleado")%></td>
                    <td><%=rs.getString("id_Vehiculo")%></td>
                    <td><%=rs.getString("fecha_Inicio")%></td>
                    <td><%=rs.getString("fecha_Fin")%></td>
                </tr>
                <%
                    }
                    misDatos.cerrarConexion();
                    
                   } else {
                       int x=1;
                       String name=("clienteRd"+x);
                    mensaje = request.getAttribute("mensaje").toString();
                    String id_Detalle = request.getAttribute("id_Detalle").toString();
                    String tipo_Servicio = request.getAttribute("tipo_Servicio").toString();
                    String id_Empleado = request.getAttribute("id_Empleado").toString();
                    String id_Vehiculo = request.getAttribute("id_Vehiculo").toString();
                    String fecha_Inicio = request.getAttribute("fecha_Inicio").toString();
                    String fecha_Fin = request.getAttribute("fecha_Fin").toString();
                %>
                <tr onclick="chinga=<%=id_Detalle%> ; seleccionarE(chinga)" name=<%=id_Detalle%> id=<%=id_Detalle%>>
                    <td><input type="radio" name="detalle_serRd" value="<%=id_Detalle%>" id=<%=name%>/></td>
                    <td><%=id_Detalle%></td>
                    <td><%=tipo_Servicio%></td>
                    <td><%=id_Empleado%></td>
                    <td><%=id_Vehiculo%></td>
                    <td><%=fecha_Inicio%></td>
                    <td><%=fecha_Fin%></td>

                </tr>
                <% } %>
                
        </table></div>
        <br>
        <input type="text" value="" name="id_Detalle" id="id_Detalle"/>
        <input type="submit" value="buscar" name="buscar" id="buscar" class="botonoper1"/><br>
        <br><input type="submit" value="Más información" name="consultar" id="consultar"  class="botonoper1"/>
        <input type="submit" value="Eliminar" name="borrar" id="borrar"   class="botonoper1"/>
        <div id="mensaje-emergente">
                        <% if (mensaje!= null){
                            if (!(mensaje.equals(""))){
                        %>
        <div id='principal'> <div id='notificacion2'><%=mensaje%></div></div>
                        <%
                        } }%></div>
    </form>
</body>  




