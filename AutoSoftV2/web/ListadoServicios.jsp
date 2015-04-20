<%@page import="entidades.Servicios"%>
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
        var id_Servicio;
        function seleccionarE(chinga) {
            document.getElementById("servicioRd"+chinga+"/").checked = true;
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
        }
        String mensaje = "";
        if (request.getAttribute("mensaje") == null) {
                mensaje  = "";
            } else {
                mensaje  = request.getAttribute("mensaje").toString();
            }
    %>



    <br>
    <%if (miUsuarioLogueado.getPerfil()==1){%>
    <a href="NuevoServicio.jsp" target="submenutrabajo"><input type="submit" value="Nuevo Servicio" name="nuevo" id="nuevo" class="botonoper1"/></a><br>
    <%}%>
    <form name="consulta" id="consulta" action="ServiciosN" method="POST" >
        <br><div style="border:0px none; width:99%; height:60%; overflow:auto;">
        <table class="listasP">
            
                <tr>
                    <td></td>
                    <td>ID</td>
                    <td>Estado</td>
                    <td>Encargado</td>
                    <td>Vehiculo</td>
                    <td>Fecha Inicio</td>
                    <td>Fecha Fin</td>
                </tr>
                
                <%
                   if (request.getAttribute("id_Servicio") == null) {
                    String nombre="";
                    int x=0;
                    Datos misDatos = new Datos();
                    ResultSet rs = misDatos.getServicios();
                    
                    while (rs.next()) {
                        if(miUsuarioLogueado.getPerfil()==2){
                            if (miUsuarioLogueado.getId_Usuario().equals(rs.getString("id_Cliente"))){
                                x=x+1;
                            nombre=("servicioRd"+x);
                %>
                <tr onclick="chinga=<%=x%> ; seleccionarE(chinga)" name=<%=x%> id=<%=x%>>
                    <td><input type="radio" name="servicioRd" value="<%=rs.getString("id_Servicio")%>" id=<%=nombre%>/></td>
                    <td><%=rs.getString("id_Servicio")%></td>
                    <td><%=rs.getString("estado")%></td>
                    <td><%=rs.getString("id_Empleado")%></td>
                    <td><%=rs.getString("id_Vehiculo")%></td>
                    <td><%=rs.getString("fecha_Inicio")%></td>
                    <td><%=rs.getString("fecha_Fin")%></td>
                </tr>
                <%
                }
                        }else{
                        x=x+1;
                        nombre=("servicioRd"+x);
                %>
                <tr onclick="chinga=<%=x%> ; seleccionarE(chinga)" name=<%=x%> id=<%=x%>>
                    <td><input type="radio" name="servicioRd" value="<%=rs.getString("id_Servicio")%>" id=<%=nombre%>/></td>
                    <td><%=rs.getString("id_Servicio")%></td>
                    <td><%=rs.getString("estado")%></td>
                    <td><%=rs.getString("id_Empleado")%></td>
                    <td><%=rs.getString("id_Vehiculo")%></td>
                    <td><%=rs.getString("fecha_Inicio")%></td>
                    <td><%=rs.getString("fecha_Fin")%></td>
                </tr>
                <%
                    }}
                    misDatos.cerrarConexion();
                    
                   } else {
                       int x=1;
                       String name=("servicioRd"+x);
                    mensaje = request.getAttribute("mensaje").toString();
                    String id_Servicio = request.getAttribute("id_Servicio").toString();
                    String estado = request.getAttribute("estado").toString();
                    String id_Empleado = request.getAttribute("id_Empleado").toString();
                    String id_Vehiculo = request.getAttribute("id_Vehiculo").toString();
                    String fecha_Inicio = request.getAttribute("fecha_Inicio").toString();
                    String fecha_Fin = request.getAttribute("fecha_Fin").toString();
                %>
                <tr onclick="chinga=<%=id_Servicio%> ; seleccionarE(chinga)" name=<%=id_Servicio%> id=<%=id_Servicio%>>
                    <td><input type="radio" name="servicioRd" value="<%=id_Servicio%>" id=<%=name%>/></td>
                    <td><%=id_Servicio%></td>
                    <td><%=estado%></td>
                    <td><%=id_Empleado%></td>
                    <td><%=id_Vehiculo%></td>
                    <td><%=fecha_Inicio%></td>
                    <td><%=fecha_Fin%></td>

                </tr>
                <% } %>
                
        </table></div>
        <br>
        <input type="text" value="" name="id_Servicio" id="id_Servicio"/>
        <input type="submit" value="buscar" name="buscar" id="buscar" class="botonoper1"/><br>
        <br><input type="submit" value="Más información" name="consultar" id="consultar"  class="botonoper1"/>
        <%if (miUsuarioLogueado.getPerfil()==1){ %>
        <input type="submit" value="Eliminar" name="borrar" id="borrar"   class="botonoper1"/>
        <%}%>
        <div id="mensaje-emergente">
                        <% if (mensaje!= null){
                            if (!(mensaje.equals(""))){
                        %>
        <div id='principal'> <div id='notificacion2'><%=mensaje%></div></div>
                        <%
                        } }%></div>
    </form>
</body>  




