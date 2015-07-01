/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Empleados;
import entidades.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.Datos;

/**
 *
 * @author Cristian
 * @version Autosoft 1.0 
 * 
 */
@WebServlet(name = "EmpleadosN", urlPatterns = {"/EmpleadosN"})
public class EmpleadosN extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //mensajes del sistema
            String mensaje = "";
            // cual boton se presiona
            boolean consultar = false;
            boolean buscar = false;
            boolean crear = false;
            boolean modificar = false;
            boolean borrar = false;
            //boolean listar = false;
            boolean limpiar = false;

            if (request.getParameter("consultar") != null) {
                consultar = true;
            }
            if (request.getParameter("buscar") != null) {
                buscar = true;
            }
            if (request.getParameter("crear") != null) {
                crear = true;
            }
            if (request.getParameter("modificar") != null) {
                modificar = true;
            }
            if (request.getParameter("borrar") != null) {
                borrar = true;
            }
            /*if (request.getParameter("listar") != null) {
             listar = true;
             }*/
            if (request.getParameter("limpiar") != null) {
                limpiar = true;
            }

            /**
             *Obtener valor como fue llamado el formulario 
             */
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

            if (request.getParameter("empleadoRd") != null) {
                id_Empleado = request.getParameter("empleadoRd");
            } else if (request.getParameter("id_Empleado") != null) {
                id_Empleado = request.getParameter("id_Empleado");
            }
            if (request.getParameter("cargo") != null) {
                cargo = request.getParameter("cargo");
            }
            if (request.getParameter("nombre") != null) {
                nombre = request.getParameter("nombre");
            }
            if (request.getParameter("apellido") != null) {
                apellido = request.getParameter("apellido");
            }
            if (request.getParameter("fecha_Nacimiento") != null) {
                fecha_Nacimiento = request.getParameter("fecha_Nacimiento");
            }
            if (request.getParameter("genero") != null) {
                genero = request.getParameter("genero");
            }
            if (request.getParameter("estado_Civil") != null) {
                estado_Civil = request.getParameter("estado_Civil");
            }
            if (request.getParameter("telefono") != null) {
                telefono = request.getParameter("telefono");
            }
            if (request.getParameter("celular") != null) {
                celular = request.getParameter("celular");
            }
            if (request.getParameter("pais") != null) {
                pais = request.getParameter("pais");
            }
            if (request.getParameter("departamento") != null) {
                departamento = request.getParameter("departamento");
            }
            if (request.getParameter("ciudad") != null) {
                ciudad = request.getParameter("ciudad");
            }
            if (request.getParameter("direccion") != null) {
                direccion = request.getParameter("direccion");
            }
            if (request.getParameter("correo") != null) {
                correo = request.getParameter("correo");
            }

            /**
             * Si presiona el boton buscar
             */
            if (buscar) {
                if (id_Empleado.equalsIgnoreCase("")) {
                    mensaje = "Debe de ingresar el numero de identificación";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Empleados miEmpleado = misDatos.getEmpleado(id_Empleado);
                    if (miEmpleado == null) {
                        mensaje = "El empleado no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                    } else {
                        id_Empleado = "" + miEmpleado.getId_Empleado();
                        cargo = "" + miEmpleado.getCargo();
                        nombre = "" + miEmpleado.getNombre();
                        apellido = "" + miEmpleado.getApellido();
                        correo = "" + miEmpleado.getCorreo();
                        mensaje = "El usuario " + id_Empleado + " fue encontrado";

                        request.setAttribute("id_Empleado", id_Empleado);
                        request.setAttribute("cargo", cargo);
                        request.setAttribute("nombre", nombre);
                        request.setAttribute("apellido", apellido);
                        request.setAttribute("correo", correo);
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                    }
                    misDatos.cerrarConexion();

                }
            }

            /**
             * Si presiona el boton consultar
             */ 
            if (consultar) {
                if (id_Empleado.equalsIgnoreCase("")) {
                    mensaje = "Debe seleccionar un usuario";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Empleados miEmpleado = misDatos.getEmpleado(id_Empleado);
                    if (miEmpleado == null) {
                        mensaje = "El empleado no fue encontrado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                    } else {
                        id_Empleado = "" + miEmpleado.getId_Empleado();
                        cargo = "" + miEmpleado.getCargo();
                        nombre = "" + miEmpleado.getNombre();
                        apellido = "" + miEmpleado.getApellido();
                        fecha_Nacimiento = "" + miEmpleado.getFecha_Nacimiento();
                        genero = "" + miEmpleado.getGenero();
                        estado_Civil = "" + miEmpleado.getEstado_Civil();
                        telefono = "" + miEmpleado.getTelefono();
                        celular = "" + miEmpleado.getCelular();
                        pais = "" + miEmpleado.getPais();
                        departamento = "" + miEmpleado.getDepartamento();
                        ciudad = "" + miEmpleado.getCiudad();
                        direccion = "" + miEmpleado.getDireccion();
                        correo = "" + miEmpleado.getCorreo();

                        mensaje = "El usuario " + id_Empleado + " fue consultado exitosamente";
                        misDatos.cerrarConexion();
                        request.setAttribute("id_Empleado", id_Empleado);
                        request.setAttribute("cargo", cargo);
                        request.setAttribute("nombre", nombre);
                        request.setAttribute("apellido", apellido);
                        request.setAttribute("fecha_Nacimiento", fecha_Nacimiento);
                        request.setAttribute("genero", genero);
                        request.setAttribute("estado_Civil", estado_Civil);
                        request.setAttribute("telefono", telefono);
                        request.setAttribute("celular", celular);
                        request.setAttribute("pais", pais);
                        request.setAttribute("departamento", departamento);
                        request.setAttribute("ciudad", ciudad);
                        request.setAttribute("direccion", direccion);
                        request.setAttribute("correo", correo);
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarEmpleados.jsp").forward(request, response);

                    }

                }
            }

            /**
             * Si presiona el boton limpiar 
             */
            if (limpiar) {

                id_Empleado = "";
                cargo = "";
                nombre = "";
                apellido = "";
                fecha_Nacimiento = "";
                genero = "";
                estado_Civil = "";
                telefono = "";
                celular = "";
                pais = "";
                departamento = "";
                ciudad = "";
                direccion = "";
                correo = "";
                mensaje = "Campos Limpios ;)";
                request.setAttribute("id_Empleado", id_Empleado);
                request.setAttribute("cargo", cargo);
                request.setAttribute("nombre", nombre);
                request.setAttribute("apellido", apellido);
                request.setAttribute("fecha_Nacimiento", fecha_Nacimiento);
                request.setAttribute("genero", genero);
                request.setAttribute("estado_Civil", estado_Civil);
                request.setAttribute("telefono", telefono);
                request.setAttribute("celular", celular);
                request.setAttribute("pais", pais);
                request.setAttribute("departamento", departamento);
                request.setAttribute("ciudad", ciudad);
                request.setAttribute("direccion", direccion);
                request.setAttribute("correo", correo);
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("NuevoEmpleado.jsp").forward(request, response);
            }

            /**
             * Si presiona el boton nuevo 
             */
            if (crear) {
                if (id_Empleado.equals("")) {
                } else if (cargo.equals("")) {
                } else if (nombre.equals("")) {
                } else if (apellido.equals("")) {
                } else if (fecha_Nacimiento.equals("")) {
                } else if (genero.equals("")) {
                } else if (estado_Civil.equals("")) {
                } else if (telefono.equals("")) {
                } else if (celular.equals("")) {
                } else if (pais.equals("")) {
                } else if (departamento.equals("")) {
                } else if (ciudad.equals("")) {
                } else if (correo.equals("")) {
                } else {
                    
                    
                    Datos misDatos = new Datos();
                    Empleados miEmpleados = misDatos.getEmpleado(id_Empleado);
                    Usuarios miUsuarios = misDatos.getUsuario(id_Empleado);
                    if (miUsuarios == null){
                        mensaje = "Debe crear primero el usuario";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("NuevoEmpleado.jsp").forward(request, response);
                    }else if (miEmpleados != null) {
                        mensaje = "El Empleado ya existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("NuevoEmpleado.jsp").forward(request, response);
                    } else {
                        miEmpleados = new Empleados(
                                id_Empleado,
                                new Integer(cargo),
                                nombre,
                                apellido,
                                fecha_Nacimiento,
                                new Integer(genero),
                                new Integer(estado_Civil),
                                telefono,
                                celular,
                                pais,
                                departamento,
                                ciudad,
                                direccion,
                                correo);
                        misDatos.newEmpleado(miEmpleados);
                        mensaje = "Empleado " + id_Empleado + " fue guardado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }

            /**
             * Si presiona el boton modificar
             */
            if (modificar) {
                if (id_Empleado.equals("")) {
                    mensaje = "Debe ingresar un numero de Identificación";
                } else if (cargo.equals("")) {
                    mensaje = "Debe ingresar un cargo";
                } else if (nombre.equals("")) {
                    mensaje = "Debe ingresar un nombre";
                } else if (apellido.equals("")) {
                    mensaje = "Debe ingresar los apellidos";
                } else if (fecha_Nacimiento.equals("")) {
                    mensaje = "Debe ingresar la fecha de nacimiento";
                } else if (genero.equals("")) {
                    mensaje = "Debe ingresar el genero";
                } else if (estado_Civil.equals("")) {
                    mensaje = "Debe ingresar el estado civil";
                } else if (telefono.equals("")) {
                    mensaje = "Debe ingresar un numero telefonico fijo";
                } else if (celular.equals("")) {
                    mensaje = "Debe ingresar un numero celular";
                } else if (pais.equals("")) {
                    mensaje = "Debe ingresar un pais";
                } else if (departamento.equals("")) {
                    mensaje = "Debe ingresar un departamento";
                } else if (ciudad.equals("")) {
                    mensaje = "Debe ingresar una ciudad";
                } else if (correo.equals("")) {
                    mensaje = "Debe ingresar un correo";
                } else {
                    Datos misDatos = new Datos();
                    Empleados miEmpleados = misDatos.getEmpleado(id_Empleado);

                    if (miEmpleados == null) {
                        mensaje = "Empleado no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarEmpleados.jsp").forward(request, response);
                    } else if(miEmpleados.getId_Empleado().equals("1010")){
                    mensaje = "No puede modificar el administrador";
                    request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                    } else {
                        miEmpleados = new Empleados(
                                id_Empleado,
                                new Integer(cargo),
                                nombre,
                                apellido,
                                fecha_Nacimiento,
                                new Integer(genero),
                                new Integer(estado_Civil),
                                telefono,
                                celular,
                                pais,
                                departamento,
                                ciudad,
                                direccion,
                                correo);
                        misDatos.updateEmpleado(miEmpleados);
                        mensaje = "Empleado " + id_Empleado + " fue actualizado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }

            /**
             * Si presiona el boton borrar
             */
            if (borrar) {
                if (id_Empleado.equalsIgnoreCase("")) {
                    mensaje = "Debe de seleccionar un empleado";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Empleados miEmpleado = misDatos.getEmpleado(id_Empleado);
                    if (miEmpleado == null) {
                        mensaje = "El empleado no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                    } else if(miEmpleado.getId_Empleado().equals("1010")){
                    mensaje = "No puede borrar el administrador";
                    request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                    } else {
                        mensaje = "El empleado " + id_Empleado + " fue borrado exitosamente";
                        misDatos.deleteEmpleado(id_Empleado);
                        id_Empleado = "";
                        cargo = "";
                        nombre = "";
                        apellido = "";
                        fecha_Nacimiento = "";
                        genero = "";
                        estado_Civil = "";
                        telefono = "";
                        celular = "";
                        pais = "";
                        departamento = "";
                        ciudad = "";
                        direccion = "";
                        correo = "";
                        
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoEmpleados.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
