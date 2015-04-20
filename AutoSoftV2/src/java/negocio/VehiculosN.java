/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;
import entidades.Clientes;
import entidades.Usuarios;
import entidades.Vehiculos;
import persistencia.Datos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cristian
 */
@WebServlet(name = "VehiculosN", urlPatterns = {"/VehiculosN"})
public class VehiculosN extends HttpServlet {

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
            String id_Vehiculo = "";
            String id_Cliente = "";
            String tipo_Vehiculo = "";
            String marca = "";
            String modelo = "";
            String fecha_Matricula = "";
            String fecha_Ult_Ser = "";
            String combustible = "";
            String kilometraje = "";
            String historial_Vehiculo = "";
            String datos_Vehiculo = "";
            

            if (request.getParameter("vehiculoRd") != null) {
                id_Vehiculo = request.getParameter("vehiculoRd");
            } else if (request.getParameter("id_Vehiculo") != null) {
                id_Vehiculo = request.getParameter("id_Vehiculo");
            }
            if (request.getParameter("id_Cliente") != null) {
                id_Cliente = request.getParameter("id_Cliente");
            }
            if (request.getParameter("tipo_Vehiculo") != null) {
                tipo_Vehiculo = request.getParameter("tipo_Vehiculo");
            }
            if (request.getParameter("marca") != null) {
                marca = request.getParameter("marca");
            }
            if (request.getParameter("modelo") != null) {
                modelo = request.getParameter("modelo");
            }
            if (request.getParameter("fecha_Matricula") != null) {
                fecha_Matricula = request.getParameter("fecha_Matricula");
            }
            if (request.getParameter("fecha_Ult_Ser") != null) {
                fecha_Ult_Ser = request.getParameter("fecha_Ult_Ser");
            }
            if (request.getParameter("combustible") != null) {
                combustible = request.getParameter("combustible");
            }
            if (request.getParameter("kilometraje") != null) {
                kilometraje = request.getParameter("kilometraje");
            }
            if (request.getParameter("historial_Vehiculo") != null) {
                historial_Vehiculo = request.getParameter("historial_Vehiculo");
            }
            if (request.getParameter("datos_Vehiculo") != null) {
                datos_Vehiculo = request.getParameter("datos_Vehiculo");
            }
            
            

            //Si presiona el boton buscar
            if (buscar) {
                if (id_Vehiculo.equalsIgnoreCase("")) {
                    mensaje = "Debe de ingresar el numero de identificación";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoVehiculos.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Vehiculos miVehiculo = misDatos.getVehiculo(id_Vehiculo);
                    if (miVehiculo == null) {
                        mensaje = "El Vehiculo no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoVehiculos.jsp").forward(request, response);
                    } else {
                        id_Vehiculo = "" + miVehiculo.getId_Vehiculo();
                        tipo_Vehiculo = "" + miVehiculo.getTipo_Vehiculo();
                        id_Cliente = "" + miVehiculo.getId_Cliente();
                        marca = "" + miVehiculo.getMarca();
                        modelo= "" + miVehiculo.getModelo();
                        fecha_Matricula = "" + miVehiculo.getFecha_Matricula();
                        fecha_Ult_Ser = "" + miVehiculo.getFecha_Matricula();
                        combustible = "" + miVehiculo.getFecha_Matricula();
                        kilometraje = "" + miVehiculo.getFecha_Matricula();
                        historial_Vehiculo = "" + miVehiculo.getHistorial_Vehiculo();
                        datos_Vehiculo = "" + miVehiculo.getDatos_Vehiculo();
                        mensaje = "El vehiculo " + id_Vehiculo + " fue encontrado";

                        request.setAttribute("id_Vehiculo", id_Vehiculo);
                        request.setAttribute("id_Cliente", id_Cliente);
                        request.setAttribute("tipo_Vehiculo", tipo_Vehiculo);
                        request.setAttribute("marca", marca);
                        request.setAttribute("modelo", modelo);
                        request.setAttribute("fecha_Matricula", fecha_Matricula);
                        request.setAttribute("fecha_Ult_Ser", fecha_Ult_Ser);
                        request.setAttribute("combustible", combustible);
                        request.setAttribute("kilometraje", kilometraje);
                        request.setAttribute("historial_Vehiculo", historial_Vehiculo);
                        request.setAttribute("datos_Vehiculo", datos_Vehiculo);
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoVehiculos.jsp").forward(request, response);
                    }
                    misDatos.cerrarConexion();

                }
            }

            //Si presiona el boton consultar
            if (consultar) {
                if (id_Vehiculo.equalsIgnoreCase("")) {
                    mensaje = "Debe seleccionar un vehiculo";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoVehiculos.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Vehiculos miVehiculo = misDatos.getVehiculo(id_Vehiculo);
                    if (miVehiculo == null) {
                        mensaje = "El vehiculo no fue encontrado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoVehiculos.jsp").forward(request, response);
                    } else {
                        id_Vehiculo = "" + miVehiculo.getId_Vehiculo();
                        id_Cliente = "" + miVehiculo.getId_Cliente();
                        tipo_Vehiculo= "" + miVehiculo.getTipo_Vehiculo();
                        marca = "" + miVehiculo.getMarca();
                        modelo = "" + miVehiculo.getModelo();
                        fecha_Matricula = "" + miVehiculo.getFecha_Matricula();
                        fecha_Ult_Ser = "" + miVehiculo.getFecha_Ult_Ser();
                        combustible = "" + miVehiculo.getCombustible();
                        kilometraje = "" + miVehiculo.getKilometraje();
                        historial_Vehiculo = "" + miVehiculo.getHistorial_Vehiculo();
                        datos_Vehiculo = "" + miVehiculo.getDatos_Vehiculo();

                        mensaje = "El vehiculo" + id_Vehiculo + " fue consultado exitosamente";
                        misDatos.cerrarConexion();
                        request.setAttribute("id_Vehiculo", id_Vehiculo);
                        request.setAttribute("id_Cliente", id_Cliente);
                        request.setAttribute("tipo_Vehiculo", tipo_Vehiculo);
                        request.setAttribute("marca", marca);
                        request.setAttribute("modelo", modelo);
                        request.setAttribute("fecha_Matricula", fecha_Matricula);
                        request.setAttribute("fecha_Ult_Ser", fecha_Ult_Ser);
                        request.setAttribute("combustible", combustible);
                        request.setAttribute("kilometraje", kilometraje);
                        request.setAttribute("historial_Vehiculo", historial_Vehiculo);
                        request.setAttribute("datos_Vehiculo", datos_Vehiculo);
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarVehiculo.jsp").forward(request, response);

                    }

                }
            }

            //Si presiona el boton limpiar
            if (limpiar) {

                id_Vehiculo = "";
                id_Cliente = "";
                tipo_Vehiculo = "";
                marca = "";
                modelo = "";
                fecha_Matricula = "";
                fecha_Ult_Ser = "";
                combustible = "";
                kilometraje = "";
                historial_Vehiculo = "";
                datos_Vehiculo = "";
                mensaje = "Campos Limpios ;)"; 
                request.setAttribute("id_Vehiculo", id_Vehiculo);
		request.setAttribute("id_Cliente", id_Cliente);
		request.setAttribute("tipo_Vehiculo", tipo_Vehiculo);
		request.setAttribute("marca", marca);
		request.setAttribute("modelo", modelo);
 		request.setAttribute("fecha_Matricula", fecha_Matricula);
 		request.setAttribute("fecha_Ult_Ser", fecha_Ult_Ser);
		request.setAttribute("combustible", combustible);
 		request.setAttribute("kilometraje", kilometraje);
		request.setAttribute("historial_Vehiculo", historial_Vehiculo);
		request.setAttribute("datos_Vehiculo", datos_Vehiculo);
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("NuevoVehiculo.jsp").forward(request, response);
            }

            //Si presiona el boton nuevo
            if (crear) {
                if (id_Vehiculo.equals("")) {
                } else if (id_Cliente.equals("")) {
                } else if (tipo_Vehiculo.equals("")) {
                } else if (marca.equals("")) {
                } else if (modelo.equals("")) {
                } else if (fecha_Matricula.equals("")) {
                } else if (fecha_Ult_Ser.equals("")) {
                } else if (combustible.equals("")) {
                } else if (kilometraje.equals("")) {
                } else if (historial_Vehiculo.equals("")) {
                } else if (datos_Vehiculo.equals("")) {
                } else {
                    Datos misDatos = new Datos();
                    Vehiculos miVehiculos = misDatos.getVehiculo(id_Vehiculo);
                    Clientes miClientes = misDatos.getCliente(id_Cliente);
                    if (miClientes == null){
                        mensaje = "El cliente no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("NuevoEmpleado.jsp").forward(request, response);
                    }else if (miVehiculos != null) {
                        mensaje = "El Vehiculo ya existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("NuevoVehiculo.jsp").forward(request, response);
                    } else {
                        miVehiculos = new Vehiculos(
                                id_Vehiculo,
				id_Cliente,
				tipo_Vehiculo,
				marca,
				modelo,
				fecha_Matricula,
				fecha_Ult_Ser,
				combustible,
				kilometraje,
				historial_Vehiculo,
				datos_Vehiculo);
                        misDatos.newVehiculo(miVehiculos);
                        mensaje = "Vehiculo " + id_Vehiculo + " fue guardado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoVehiculos.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }

            //Si presiona el boton modificar
            if (modificar) {
                if (id_Vehiculo.equals("")) {
                    mensaje = "Debe ingresar un numero de Identificación vehiculo";
                } else if (id_Cliente.equals("")) {
                    mensaje = "Debe ingresar un numero de Identificación de cliente";
                } else if (tipo_Vehiculo.equals("")) {
                    mensaje = "Debe ingresar un tipo de vehiculo";
                } else if (marca.equals("")) {
                    mensaje = "Debe ingresar marca del vehiculo";
                } else if (modelo.equals("")) {
                    mensaje = "Debe ingresar modelo del vehiculo";
                } else if (fecha_Matricula.equals("")) {
                    mensaje = "Debe ingresar fecha de matricula";
                } else if (fecha_Ult_Ser.equals("")) {
                    mensaje = "Debe ingresar fecha del ultimo servicio";
                } else if (combustible.equals("")) {
                    mensaje = "Debe ingresar combustible";
                } else if (kilometraje.equals("")) {
                    mensaje = "Debe ingresar kilometraje";
                } else if (historial_Vehiculo.equals("")) {
                    mensaje = "Debe ingresar historial del vehiculo";
                } else if (datos_Vehiculo.equals("")) {
                    mensaje = "Debe ingresar datos del vehiculo";
                } else {
                    Datos misDatos = new Datos();
                    Vehiculos miVehiculos = misDatos.getVehiculo(id_Vehiculo);

                    if (miVehiculos == null) {
                        mensaje = "Vehiculo no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarVehiculos.jsp").forward(request, response);
                    } else {
                        miVehiculos = new Vehiculos(
                                id_Vehiculo,
				id_Cliente,
				tipo_Vehiculo,
				marca,
				modelo,
				fecha_Matricula,
				fecha_Ult_Ser,
				combustible,
				kilometraje,
				historial_Vehiculo,
				datos_Vehiculo);
                        misDatos.updateVehiculo(miVehiculos);
                        mensaje = "Vehiculo" + id_Vehiculo + " fue actualizado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoVehiculos.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }

            //Si presiona el boton borrar
            if (borrar) {
                if (id_Vehiculo.equalsIgnoreCase("")) {
                    mensaje = "Debe de seleccionar un Vehiculo";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoVehiculos.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Vehiculos miVehiculo = misDatos.getVehiculo(id_Vehiculo);
                    if (miVehiculo == null) {
                        mensaje = "El Vehiculo no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoVehiculos.jsp").forward(request, response);
                    } else {
                        mensaje = "El Vehiculo " + id_Vehiculo + " fue borrado exitosamente";
                        misDatos.deleteVehiculo(id_Vehiculo);
                        id_Vehiculo = "";
			id_Cliente  = "";
			tipo_Vehiculo = "";
			marca = "";
			modelo = "";
			fecha_Matricula = "";
			fecha_Ult_Ser = "";
			combustible = "";
			kilometraje = "";
			historial_Vehiculo = "";
			datos_Vehiculo = "";

                        
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoVehiculos.jsp").forward(request, response);
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
