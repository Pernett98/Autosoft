<%@page import="entidades.Clientes"%>
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
        var id_Cliente;
        function seleccionarE(chinga) {
            document.getElementById("clienteRd"+chinga+"/").checked = true;
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
        if( (miUsuarioLogueado.getPerfil() != 1)){
    %>

    <META HTTP-EQUIV="REFRESH" CONTENT="0;URL=alertaSesion2.jsp"> 
    <%
        } else if ((miEmpleadoLogueado.getCargo()!= 3)&&(miEmpleadoLogueado.getCargo()!= 4)){
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



    <br>
    <%if (miUsuarioLogueado.getPerfil()==1){
                    if ((miEmpleadoLogueado.getCargo() == 3 )||(miEmpleadoLogueado.getCargo() == 4 )) {%>
    <a href="NuevoCliente.jsp" target="submenutrabajo"><input type="submit" value="Nuevo Cliente" name="nuevo" id="nuevo" class="botonoper1"/></a><br>
   <%}}%>
    <form name="consulta" id="consulta" action="ClientesN" method="POST" >
        <br><div style="border:0px none; width:99%; height:60%; overflow:auto;">
        <table class="listasP">
            
                <tr>
                    <td></td>
                    <td>Identificación(CC)</td>
                    <td>Nombre</td>
                    <td>Apellido</td>
                    <td>Celular</td>
                    <td>Correo</td>
                </tr>
                
                <%
                   if (request.getAttribute("id_Cliente") == null) {
                    String nombre="";
                    int x=0;
                    Datos misDatos = new Datos();
                    ResultSet rs = misDatos.getClientes();
                    
                    while (rs.next()) {
                        x=x+1;
                        nombre=("clienteRd"+x);
                %>
                <tr onclick="chinga=<%=x%> ; seleccionarE(chinga)" name=<%=x%> id=<%=x%>>
                    <td><input type="radio" name="clienteRd" value="<%=rs.getString("id_Cliente")%>" id=<%=nombre%>/></td>
                    <td><%=rs.getString("id_Cliente")%></td>
                    <td><%=rs.getString("nombre")%></td>
                    <td><%=rs.getString("apellido")%></td>
                    <td><%=rs.getString("celular")%></td>
                    <td><%=rs.getString("correo")%></td>
                </tr>
                <%
                    }
                    misDatos.cerrarConexion();
                    
                   } else {
                       int x=1;
                       String name=("clienteRd"+x);
                    mensaje = request.getAttribute("mensaje").toString();
                    String id_Cliente = request.getAttribute("id_Cliente").toString();
                    String nombre = request.getAttribute("nombre").toString();
                    String apellido = request.getAttribute("apellido").toString();
                    String celular = request.getAttribute("celular").toString();
                    String correo = request.getAttribute("correo").toString();
                %>
                <tr onclick="chinga=<%=id_Cliente%> ; seleccionarE(chinga)" name=<%=id_Cliente%> id=<%=id_Cliente%>>
                    <td><input type="radio" name="clienteRd" value="<%=id_Cliente%>" id=<%=name%>/></td>
                    <td><%=id_Cliente%></td>
                    <td><%=nombre%></td>
                    <td><%=apellido%></td>
                    <td><%=celular%></td>
                    <td><%=correo%></td>

                </tr>
                <% } %>
                
        </table></div>
        <br>
        <input type="text" value="" name="id_Cliente" id="id_Cliente"/>
        <input type="submit" value="buscar" name="buscar" id="buscar" class="botonoper1"/><br>
        <br><input type="submit" value="Más información" name="consultar" id="consultar"  class="botonoper1"/>
        <%if (miUsuarioLogueado.getPerfil()==1){
                    if ((miEmpleadoLogueado.getCargo() == 3 )||(miEmpleadoLogueado.getCargo() == 4 )) {%>
        <input type="submit" value="Eliminar" name="borrar" id="borrar"   class="botonoper1"/>
        <%}}%>
        <div id="mensaje-emergente">
                        <% if (mensaje!= null){
                            if (!(mensaje.equals(""))){
                        %>
        <div id='principal'> <div id='notificacion2'><%=mensaje%></div></div>
                        <%
                        } }%></div>
    </form>
</body>  



