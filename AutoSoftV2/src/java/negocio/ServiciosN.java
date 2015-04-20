/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;
import entidades.Clientes;
import entidades.Empleados;
import entidades.Servicios;
import entidades.Usuarios;
import entidades.Vehiculos;
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
 */
@WebServlet(name = "ServiciosN", urlPatterns = {"/ServiciosN"})
public class ServiciosN extends HttpServlet {

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

            //Obtener valor como fue llamado el formulario
            String id_Servicio = "";
            String id_Vehiculo = "";
            String id_Cliente = "";
            String id_Empleado = "";
            String estado = "";
            String fecha_Inicio = "";
            String fecha_Fin = "";

            if (request.getParameter("servicioRd") != null) {
                id_Servicio = request.getParameter("servicioRd");
            } else if (request.getParameter("id_Servicio") != null) {
                id_Servicio = request.getParameter("id_Servicio");
            }
            if (request.getParameter("id_Vehiculo") != null) {
                id_Vehiculo = request.getParameter("id_Vehiculo");
            }
            if (request.getParameter("id_Cliente") != null) {
                id_Cliente = request.getParameter("id_Cliente");
            }
            if (request.getParameter("id_Empleado") != null) {
                id_Empleado = request.getParameter("id_Empleado");
            }
            if (request.getParameter("estado") != null) {
                estado = request.getParameter("estado");
            }
            if (request.getParameter("fecha_Inicio") != null) {
                fecha_Inicio = request.getParameter("fecha_Inicio");
            }
            if (request.getParameter("fecha_Fin") != null) {
                fecha_Fin = request.getParameter("fecha_Fin");
            }
            

            //Si presiona el boton buscar
            if (buscar) {
                if (id_Servicio.equalsIgnoreCase("")) {
                    mensaje = "Debe de ingresar el numero de identificación del servicio";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoServicios.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Servicios miServicio = misDatos.getServicio(id_Servicio);
                    if (miServicio == null) {
                        mensaje = "El Servicio no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoServicios.jsp").forward(request, response);
                    } else {
                        id_Servicio = "" + miServicio.getId_Servicio();
                        id_Vehiculo = "" + miServicio.getId_Vehiculo();
                        id_Cliente = "" + miServicio.getId_Cliente();
                        id_Empleado= "" + miServicio.getId_Empleado();
                        estado= "" + miServicio.getEstado();
                        fecha_Inicio= "" + miServicio.getFecha_Inicio();
                        fecha_Fin= "" + miServicio.getFecha_Fin();
                        mensaje = "Servicio " + id_Servicio + " fue encontrado";

                        request.setAttribute("id_Servicio", id_Servicio);
                        request.setAttribute("id_Vehiculo", id_Vehiculo);
                        request.setAttribute("id_Cliente", id_Cliente);
                        request.setAttribute("id_Empleado", id_Empleado);
                        request.setAttribute("estado", estado);
                        request.setAttribute("fecha_Inicio", fecha_Inicio);
                        request.setAttribute("fecha_Fin", fecha_Fin);
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoServicios.jsp").forward(request, response);
                    }
                    misDatos.cerrarConexion();

                }
            }

            //Si presiona el boton consultar
            if (consultar) {
                if (id_Servicio.equalsIgnoreCase("")) {
                    mensaje = "Debe seleccionar un Servicio";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoServicios.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Servicios miServicio = misDatos.getServicio(id_Servicio);
                    if (miServicio == null) {
                        mensaje = "El servicio no fue encontrado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoServicios.jsp").forward(request, response);
                    } else {
                        id_Servicio = "" + miServicio.getId_Servicio();
                        id_Vehiculo = "" + miServicio.getId_Vehiculo();
                        id_Cliente = "" + miServicio.getId_Cliente();
                        id_Empleado = "" + miServicio.getId_Empleado();
                        estado = "" + miServicio.getEstado();
                        fecha_Inicio= "" + miServicio.getFecha_Inicio();
                        fecha_Fin = "" + miServicio.getFecha_Fin();

                        mensaje = "El Servicio " + id_Servicio + " fue consultado exitosamente";
                        misDatos.cerrarConexion();
                        request.setAttribute("id_Servicio", id_Servicio);
                        request.setAttribute("id_Vehiculo", id_Vehiculo);
                        request.setAttribute("id_Cliente", id_Cliente);
                        request.setAttribute("id_Empleado", id_Empleado);
                        request.setAttribute("estado", estado);
                        request.setAttribute("fecha_Inicio", fecha_Inicio);
                        request.setAttribute("fecha_Fin", fecha_Fin);         
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarServicio.jsp").forward(request, response);

                    }

                }
            }

            //Si presiona el boton limpiar
            if (limpiar) {

                id_Empleado = "";
                id_Servicio = "";
		id_Vehiculo = "";
		id_Cliente  = "";
		id_Empleado = "";
		estado	    = "";
		fecha_Inicio = "";
		fecha_Fin   = "";
            
                mensaje = "Campos Limpios ;)";
                request.setAttribute("id_Servicio", id_Servicio);
                request.setAttribute("id_Vehiculo", id_Vehiculo);
                request.setAttribute("id_Cliente", id_Cliente);
                request.setAttribute("id_Empleado", id_Empleado);
                request.setAttribute("estado", estado);
                request.setAttribute("fecha_Inicio", fecha_Inicio);
                request.setAttribute("fecha_Fin", fecha_Fin);
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("NuevoServicio.jsp").forward(request, response);
            }

            //Si presiona el boton nuevo
            if (crear) {
                if (id_Servicio.equals("")) {
                } else if (id_Vehiculo.equals("")) {
                } else if (id_Cliente.equals("")) {
                } else if (id_Empleado.equals("")) {
                } else if (estado.equals("0")) {
                } else if (fecha_Inicio.equals("")) {
                } else if (fecha_Fin.equals("")) {  
                } else {
                    Datos misDatos = new Datos();
                    Servicios miServicios = misDatos.getServicio(id_Servicio);
                    Vehiculos miVehiculos = misDatos.getVehiculo(id_Vehiculo);
                    Empleados miEmpleados = misDatos.getEmpleado(id_Vehiculo);
                    if (!(miVehiculos.getId_Cliente().equals(id_Cliente))){
                        System.out.println(miVehiculos.getId_Cliente());
                        System.out.println((id_Cliente));
                        mensaje = "El vehiculo no coincide con el cliente";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("NuevoServicio.jsp").forward(request, response);
                    }else if (miServicios != null) {
                        mensaje = "El servicio ya existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("NuevoServicio.jsp").forward(request, response);
                    } else {
                        System.out.println("prueba3");
                        miServicios = new Servicios(
                                id_Servicio,
				id_Vehiculo,
				id_Cliente,
				id_Empleado,
				new Integer (estado),
				fecha_Inicio,
				fecha_Fin);
                        misDatos.newServicio(miServicios);
                        mensaje = "Servicio " + id_Servicio + " fue guardado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoServicios.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }

            //Si presiona el boton modificar
            if (modificar) {
                if (id_Servicio.equals("")) {
                    mensaje = "Debe ingresar un numero de Identificación de servicio";
                } else if (id_Vehiculo.equals("")) {
                    mensaje = "Debe ingresar un numero de Identificación de vehiculo";
                } else if (id_Cliente.equals("")) {
                    mensaje = "Debe ingresar un numero de Identificación de cliente";
                } else if (id_Empleado.equals("")) {
                    mensaje = "Debe ingresar un numero de Identificación de empleado";
                } else if (estado.equals("")) {
                    mensaje = "Debe ingresar estado";
                } else if (fecha_Inicio.equals("")) {
                    mensaje = "Debe ingresar fecha inicio";
                } else if (fecha_Fin.equals("")) {
                    mensaje = "Debe ingresar fecha fin ";
                } else {
                    Datos misDatos = new Datos();
                    Servicios miServicios = misDatos.getServicio(id_Servicio);

                    if (miServicios == null) {
                        mensaje = "Servicio no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarServicio.jsp").forward(request, response);
                    } else {
                        miServicios = new Servicios(
                                id_Servicio,
				id_Vehiculo,
				id_Cliente,
				id_Empleado,
				new Integer(estado),
				fecha_Inicio,
				fecha_Fin);
                        misDatos.updateServicio(miServicios);
                        mensaje = "Servicio " + id_Servicio + " fue actualizado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoServicios.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }

            //Si presiona el boton borrar
            if (borrar) {
                if (id_Servicio.equalsIgnoreCase("")) {
                    mensaje = "Debe de seleccionar un Servicio";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoServicios.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Servicios miServicio = misDatos.getServicio(id_Servicio);
                    if (miServicio == null) {
                        mensaje = "El Servicio no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoServicios.jsp").forward(request, response);
                    } else {
                        mensaje = "El Servicio " + id_Servicio + " fue borrado exitosamente";
                        misDatos.deleteServicio(id_Servicio);
                        id_Empleado = "";
                        id_Servicio = "";
			id_Vehiculo = "";
			id_Cliente = "";
			id_Empleado = "";
			estado = "";
			fecha_Inicio = "";
			fecha_Fin = "";
                        
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoServicios.jsp").forward(request, response);
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
