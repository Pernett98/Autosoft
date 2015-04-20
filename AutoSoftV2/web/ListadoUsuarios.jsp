<%@page import="entidades.Empleados"%>
<%@page import="entidades.Usuarios"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="persistencia.Datos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="pragma" content="no-cache">
    <link rel="stylesheet" type="text/css" href="css/micss.css">
    <script >
        var chinga;
        var id_Usuario;
        var id_Empleado;
        function seleccionar(chinga) {
            document.getElementById("usuarioRd"+chinga+"/").checked = true;
            document.getElementById("consultar").disabled = false;
            document.getElementById("borrar").disabled = false;
        }
        function seleccionarE(chinga) {
            document.getElementById("empleadoRd"+chinga+"/").checked = true;
            document.getElementById("consultar").disabled = false;
            document.getElementById("borrar").disabled = false;
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
    <a href="NuevoUsuario.jsp" target="submenutrabajo"><input type="submit" value="Nuevo Usuario" name="nuevo" id="nuevo" class="botonoper1"/></a><br>
    <%}}%>
    <form name="consulta" id="consulta" action="UsuariosN" method="POST" >
        <br><div style="border:0px none; width:99%; height:60%; overflow:auto;">
        <table class="listasP">
            
                <tr>
                    <td></td>
                    <td>Identificación</td>
                    <td>Perfil</td>
                    <td>Estado</td>
                </tr>
                
                <%
                   if (request.getAttribute("id_Usuario") == null) {
                    String nombre="";
                    int x=0;
                    Datos misDatos = new Datos();
                    ResultSet rs = misDatos.getUsuarios();
                    while (rs.next()) {
                        x=x+1;
                        nombre=("usuarioRd"+x);
                %>
                <tr onclick="chinga=<%=x%> ; seleccionar(chinga)" name=<%=x%> id=<%=x%>>
                    <td><input type="radio" name="usuarioRd" value="<%=rs.getString("id_Usuario")%>" id=<%=nombre%>/></td>
                    <td><%=rs.getString("id_Usuario")%></td>
                    <td><%=(rs.getString("perfil").equals("1") ? "Empleado" : "Cliente")%></td>
                    <td><%=(rs.getString("estado").equals("1") ? "Activo" : "Inactivo")%></td>

                </tr>
                <%
                    }
                    misDatos.cerrarConexion();
                    
                   } else {
                       int x=1;
                       String nombre=("usuarioRd"+x);
                       mensaje = request.getAttribute("mensaje").toString();
                       String id_Usuario = request.getAttribute("id_Usuario").toString();
                    String perfil = request.getAttribute("perfil").toString();
                    String estado = request.getAttribute("estado").toString();
                %>
                <tr onclick="chinga=<%=id_Usuario%> ; seleccionar(chinga)" name=<%=id_Usuario%> id=<%=id_Usuario%>>
                    <td><input type="radio" name="usuarioRd" value="<%=id_Usuario%>" id=<%=nombre%>/></td>
                    <td><%=id_Usuario%></td>
                    <td><%=(perfil.equals("1") ? "Empleado" : "Cliente")%></td>
                    <td><%=(estado.equals("1") ? "Activo" : "Inactivo")%></td>

                </tr>
                <% } %>
                
        </table></div>
        <br>
        <input type="text" value="" name="id_Usuario" id="id_Usuario"/>
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

