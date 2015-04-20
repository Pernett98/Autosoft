

<%@page import="entidades.Clientes"%>
<%@page import="entidades.Usuarios"%>
<%@page import="entidades.Empleados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="estilos.jsp" ></jsp:include>
            <title>AutoSoft</title>

        </head>
        <body>


        <%

        HttpSession sesion = request.getSession();
        Usuarios miUsuarioLogueado = (Usuarios) sesion.getAttribute("usuario");
        Empleados miEmpleadoLogueado = (Empleados) sesion.getAttribute("empleado");
        Clientes miClienteLogueado = (Clientes) sesion.getAttribute("cliente");
        if ((miUsuarioLogueado == null)) {
    %>
    <META HTTP-EQUIV="REFRESH" CONTENT="0;URL=index.jsp" target="_parent"> 
    <%
        }else{
    %>
        <div class="menuizq">
            <div class="titulo1"><img src="Imagenes/logo1-3.png" width="70%" height="100%"></div>
            <div class="perfilbase">
                <br>
                <img src="<%=miUsuarioLogueado.getFoto()%>" width="200" height="200" class="fotomenuizq"><br>
                <% if (miEmpleadoLogueado==null){%>
                <%=miClienteLogueado.getNombre()+" "+miClienteLogueado.getApellido()%><br>
                <br>
                <% }else{%> 
                <%=miEmpleadoLogueado.getNombre()+" "+miEmpleadoLogueado.getApellido()%><br>
                <%=(miEmpleadoLogueado.getCargo()== 1 ? "Mecanico" : miEmpleadoLogueado.getCargo()== 2 ? "Remolcador" : "Recepcionista")%><br>
                <%}%>
                <a href="index.jsp"><input type="submit" name="-" class="salir"  value="Salir"/></a>

            </div>
            <div class="secciones">
                <div class="titulo2"><img src="Imagenes/logo2.png" width="50%" height="100%"></div>
                
                
                
                <%if (miUsuarioLogueado.getPerfil()==1){
                    if ((miEmpleadoLogueado.getCargo() == 3 )||(miEmpleadoLogueado.getCargo() == 4 )) {%>
                <a href="ListadoUsuarios.jsp" target=submenutrabajo><input type="submit" value="Usuarios" name="usuarios" id="usuarios" class="botonmenu"/></a><br>
                <a href="ListadoEmpleados.jsp" target=submenutrabajo><input type="submit" value="Empleados" name="empleados" id="empleados" class="botonmenu"/></a><br>
                <a href="ListadoClientes.jsp" target=submenutrabajo><input type="submit" value="Clientes" name="clientes" id="clientes" class="botonmenu"/></a><br>
                <%}}%>
                <a href="ListadoVehiculos.jsp" target=submenutrabajo><input type="submit" value="Vehiculos" name="vehiculos" id="vehiculos" class="botonmenu"/></a>
                <a href="ListadoServicios.jsp" target=submenutrabajo><input type="submit" value="Servicios" name="servicios" id="servicios" class="botonmenu"/></a><br>

            </div>
            
        </div>
        <div class="menuder">
            <div class="titulo3"><img src="Imagenes/logo3-1.png" width="80%" height="100%"></div>
            <div class="indicadormenu"></div>
            <div class="menutrabajo" id="menutrabajo">
                <iframe class="submenutrabajo" id="submenutrabajo" name="submenutrabajo" style="padding-left: 2px"></iframe>
            </div>

        </div>
                <% } %>
    </body>
</html>
