
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
            <script language="javascript" src="js/validarCamposEmpleado.js">
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
            //mensajes del sistema
            String mensaje = "";

            //Obtener valor como fue llamado el formulario
            String id_Empleado = "";
            String cargo = "";
            String nombre = "";
            String apellido = "";
            String fecha_Nacimiento = "";
            String genero = "";
            String estado_Civil = "";
            String telefono = "";
            String celular = "";
            String pais = "";
            String departamento = "";
            String ciudad = "";
            String direccion = "";
            String correo = "";
            
            
            
            if (request.getAttribute("id_Empleado") == null) {
                id_Empleado  = "";
            } else {
                id_Empleado  = request.getAttribute("id_Empleado").toString();
            }
            
            if (request.getAttribute("cargo") == null) {
                cargo  = "";
            } else {
                cargo  = request.getAttribute("cargo").toString();
            }
            
            if (request.getAttribute("nombre") == null) {
                nombre  = "";
            } else {
                nombre  = request.getAttribute("nombre").toString();
            }
            
            if (request.getAttribute("apellido") == null) {
                apellido  = "";
            } else {
                apellido = request.getAttribute("apellido").toString();
            }
            
            if (request.getAttribute("fecha_Nacimiento") == null) {
                fecha_Nacimiento = "";
            } else {
                fecha_Nacimiento = request.getAttribute("fecha_Nacimiento").toString();
            }
            
            if (request.getAttribute("genero") == null) {
                genero = "";
            } else {
                genero = request.getAttribute("genero").toString();
            }
            
            if (request.getAttribute("estado_Civil") == null) {
                estado_Civil = "";
            } else {
                estado_Civil = request.getAttribute("estado_Civil").toString();
            }
            
            if (request.getAttribute("telefono") == null) {
                telefono = "";
            } else {
                telefono = request.getAttribute("telefono").toString();
            }
            
            if (request.getAttribute("celular") == null) {
                celular = "";
            } else {
                celular = request.getAttribute("celular").toString();
            }
            
            if (request.getAttribute("pais") == null) {
                pais = "";
            } else {
                pais = request.getAttribute("pais").toString();
            }
            
            if (request.getAttribute("pais") == null) {
                pais = "";
            } else {
                pais = request.getAttribute("pais").toString();
            }
            
            if (request.getAttribute("departamento") == null) {
                departamento = "";
            } else {
                departamento = request.getAttribute("departamento").toString();
            }
            
            if (request.getAttribute("ciudad") == null) {
                ciudad = "";
            } else {
                ciudad = request.getAttribute("ciudad").toString();
            }
            
            if (request.getAttribute("direccion") == null) {
                direccion = "";
            } else {
                direccion = request.getAttribute("direccion").toString();
            }
            
            if (request.getAttribute("correo") == null) {
                correo = "";
            } else {
                correo = request.getAttribute("correo").toString();
            }

        %>
        <h1>Actualizar Empleado</h1>
        <div id="mensaje-ingreso"></div>
        <form name="ActualizarEmpleados" id="ActualizarEmpleados" action="EmpleadosN" method="POST">
            <table class="formP">
                <tbody>
                    <tr>
                        <th>Identificación *:</th>
                        <td><input type="text" name="id_Empleado" id="id_Empleado" value="<%=id_Empleado%>" size="15"  onkeypress="return soloNumeros(event)" OnFocus="this.blur()"/></td>
                        <th>Cargo *:</th>
                        <td><select name="cargo" id="cargo">
                                <option value="0" <%=(cargo.equals("") ? "selected" : "")%> >Seleccione perfil...</option>
                                <option value="1" <%=(cargo.equals("1") ? "selected" : "")%> >Mecanico</option>
                                <option value="2" <%=(cargo.equals("2") ? "selected" : "")%> >Remolcador</option>
                                <option value="3" <%=(cargo.equals("3") ? "selected" : "")%> >Recepcionista</option>

                            </select></td>
                    </tr>
                    <tr>
                        <th>Nombre *:</th>
                        <td><input type="text" name="nombre" id="nombre" value="<%=nombre%>" size="15" /></td>
                        <th>Apellido *:</th>
                        <td><input type="text" name="apellido" id="apellido" value="<%=apellido%>" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Fecha de Nacimiento *:</th>
                        <td><input type="date" name="fecha_Nacimiento" id="fecha_Nacimiento" value="<%=fecha_Nacimiento%>" size="15" /></td>
                        <th>Genero *:</th>
                        <td><select name="genero" id="genero">
                                <option value="0" <%=(genero.equals("") ? "selected" : "")%> >Seleccione perfil...</option>
                                <option value="1" <%=(genero.equals("1") ? "selected" : "")%> >Masculino</option>
                                <option value="2" <%=(genero.equals("2") ? "selected" : "")%> >Femenino</option>

                            </select></td>
                    </tr>
                    <tr>
                        <th>Estado Civil *:</th>
                        <td><select name="estado_Civil" id="estado_Civil">
                                <option value="0" <%=(estado_Civil.equals("") ? "selected" : "")%> >Seleccione perfil...</option>
                                <option value="1" <%=(estado_Civil.equals("1") ? "selected" : "")%> >Soltero</option>
                                <option value="2" <%=(estado_Civil.equals("2") ? "selected" : "")%> >Casado</option>
                                <option value="3" <%=(estado_Civil.equals("3") ? "selected" : "")%> >Divorciado</option>
                                <option value="4" <%=(estado_Civil.equals("4") ? "selected" : "")%> >Viudo</option>
                            </select></td>
                    </tr>
                    <tr>
                        <th>Telefono Fijo *:</th>
                        <td><input type="text" name="telefono" id="telefono" value="<%=telefono%>" size="15" /></td>
                        <th>Telefono Celular *:</th>
                        <td><input type="text" name="celular" id="celular" value="<%=celular%>" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Pais *:</th>
                        <td><input type="text" name="pais" id="pais" value="<%=pais%>" size="15" /></td>
                        <th>Departamento *:</th>
                        <td><input type="text" name="departamento" id="departamento" value="<%=departamento%>" size="15" /></td>
                    </tr>
                    <tr>
                        <th>Ciudad *:</th>
                        <td><input type="text" name="ciudad" id="ciudad" value="<%=ciudad%>" size="15" /></td> 
                    </tr>
                    <tr>
                        <th>Direccion Fisica *:</th>
                        <td><input type="text" name="direccion" id="direccion" value="<%=direccion%>" size="15" /></td> 
                    </tr>
                    
                    <tr>
                        <th>Correo Electronico *:</th>
                        <td><input type="email" name="correo" id="correo" value="<%=correo%>" size="15" /></td>
                        <th colspan="2">* Campos Obligatorios</th>
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
        <input type="button" value="Modificar" class="botonoper1" name="chingon" id="chingon" onclick="botonModificar()">
        <a href="ListadoEmpleados.jsp"><input type="button" value="Volver" class="botonoper1"></input></a><br>
        <h4></h4>
    </center>  
        <div id="mensaje-emergente">
            
        </div>
</body>
</html>