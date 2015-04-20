<%@page import="entidades.Vehiculos"%>
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
        var id_Vehiculo;
        function seleccionarE(chinga) {
            document.getElementById("vehiculoRd"+chinga+"/").checked = true;
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
    <%if (miUsuarioLogueado.getPerfil()==1){
                    if ((miEmpleadoLogueado.getCargo() == 3 )||(miEmpleadoLogueado.getCargo() == 4 )) {%>
    <a href="NuevoVehiculo.jsp" target="submenutrabajo"><input type="submit" value="Nuevo Vehiculo" name="nuevo" id="nuevo" class="botonoper1"/></a><br>
    <%}}%>
    <form name="consulta" id="consulta" action="VehiculosN" method="POST" >
        <br><div style="border:0px none; width:99%; height:60%; overflow:auto;">
        <table class="listasP">
            
                <tr>
                    <td></td>
                    <td>ID(PLACA)</td>
                    <td>Cliente(ID)</td>
                    <td>Marca</td>
                    <td>Modelo</td>
                    <td>Ultimo Servicio</td>
                </tr>
                
                <%
                   if (request.getAttribute("id_Vehiculo") == null) {
                    String nombre="";
                    int x=0;
                    Datos misDatos = new Datos();
                    ResultSet rs = misDatos.getVehiculos();
                    
                    while (rs.next()) {
                        if(miUsuarioLogueado.getPerfil()==2){
                            if (miUsuarioLogueado.getId_Usuario().equals(rs.getString("id_Cliente"))){
                                x=x+1;
                            nombre=("vehiculoRd"+x);
                            %>
                <tr onclick="chinga=<%=x%> ; seleccionarE(chinga)" name=<%=x%> id=<%=x%>>
                    <td><input type="radio" name="vehiculoRd" value="<%=rs.getString("id_Vehiculo")%>" id=<%=nombre%>/></td>
                    <td><%=rs.getString("id_Vehiculo")%></td>
                    <td><%=rs.getString("id_Cliente")%></td>
                    <td><%=rs.getString("marca")%></td>
                    <td><%=rs.getString("modelo")%></td>
                    <td><%=rs.getString("fecha_Ult_Ser")%></td>
                </tr>
                <%
                            }
                        }else{
                        x=x+1;
                        nombre=("vehiculoRd"+x);
                %>
                <tr onclick="chinga=<%=x%> ; seleccionarE(chinga)" name=<%=x%> id=<%=x%>>
                    <td><input type="radio" name="vehiculoRd" value="<%=rs.getString("id_Vehiculo")%>" id=<%=nombre%>/></td>
                    <td><%=rs.getString("id_Vehiculo")%></td>
                    <td><%=rs.getString("id_Cliente")%></td>
                    <td><%=rs.getString("marca")%></td>
                    <td><%=rs.getString("modelo")%></td>
                    <td><%=rs.getString("fecha_Ult_Ser")%></td>
                </tr>
                <%
                
                    }}
                    misDatos.cerrarConexion();
                    
                   } else {
                       int x=1;
                       String name=("vehiculoRd"+x);
                    mensaje = request.getAttribute("mensaje").toString();
                    String id_Vehiculo = request.getAttribute("id_Vehiculo").toString();
                    String id_Cliente = request.getAttribute("id_Cliente").toString();
                    String marca = request.getAttribute("marca").toString();
                    String modelo = request.getAttribute("modelo").toString();
                    String fecha_Ult_Ser = request.getAttribute("fecha_Ult_Ser").toString();
                %>
                <tr onclick="chinga=<%=id_Vehiculo%> ; seleccionarE(chinga)" name=<%=id_Vehiculo%> id=<%=id_Vehiculo%>>
                    <td><input type="radio" name="vehiculoRd" value="<%=id_Vehiculo%>" id=<%=name%>/></td>
                    <td><%=id_Vehiculo%></td>
                    <td><%=id_Cliente%></td>
                    <td><%=marca%></td>
                    <td><%=modelo%></td>
                    <td><%=fecha_Ult_Ser%></td>

                </tr>
                <% } %>
                
        </table></div>
        <br>
        <input type="text" value="" name="id_Vehiculo" id="id_Vehiculo"/>
        <input type="submit" value="buscar" name="buscar" id="buscar" class="botonoper1"/><br>
        <br><input type="submit" value="Más información" name="consultar" id="consultar"  class="botonoper1"/>
        <%
           if(miUsuarioLogueado.getPerfil()==2){
               %>
        <input type="submit" value="Eliminar" name="borrar" id="borrar"   class="botonoper1"/>
        <%
           }else if ((miEmpleadoLogueado.getCargo() == 3 )||(miEmpleadoLogueado.getCargo() == 4 )) {%>
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




