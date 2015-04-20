

<%@page import="entidades.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="estilos.jsp" ></jsp:include>
        <title>AutoSoft</title>
    </head>
    <body>
        <div style="background: blue; position: fixed;  width: 250px; height: auto; left: 0; top: 0; bottom: 0;">
            <div style="background: white; height: 60px; text-align: center; font-size: 40px; padding-top: 10px">AUTOSOFT</div>
            <div style="background:#005dab; height: 320px">S</div>
            <div style="background:#005dab; height: 250px">
                <div style="background: white; height: 30px; text-align: center; font-size: 28px">SECCIONES</div>
                    <input type="submit" value="Clientes" name="clientes" /><br>
                    <input type="submit" value="Empleados" name="empleados" /><br>
                    <input type="submit" value="Servicios" name="empleados" /><br>
                    <input type="submit" value="Vehiculos" name="empleados" />
            
            </div>
            <div style="background:#005dab; min-height: 325px; height: auto">
                <div style="background: white; height: 30px; text-align: center; font-size: 28px">NOVEDADES</div>D</div>
            
        </div>
        <%
            HttpSession sesion = request.getSession();
            Usuarios miUsuarioLogueado = (Usuarios) sesion.getAttribute("usuario");
            if(miUsuarioLogueado==null ){
        %>
        <jsp:forward page="index.jsp"></jsp:forward>
        <%
            }
            if(miUsuarioLogueado.getPerfil() != 2) {
        %>
            
        <jsp:forward page="index.jsp"></jsp:forward>
        <%
            }
        %>
        <h1>Menú Principal Cliente</h1>
         <h3>Bienvenido: <%=miUsuarioLogueado.getId_Usuario()%></h3>
        <img src="<%=miUsuarioLogueado.getFoto()%>" width="300" height="300"></img>
        <br>
        <a class="a1" href="MenuCliente.jsp">Vehiculos</a><br>
        <a class="a1" href="Servicios.jsp">Servicios</a><br>
        <a class="a1" href="index.jsp">Salir</a>
    </body>
</html>
