/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;
import entidades.Detalle_Sers;
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
 * @version Autosoft 1.0
 * 
 */
@WebServlet(name = "Detalle_SersN", urlPatterns = {"/Detalle_SersN"})
public class Detalle_SersN extends HttpServlet {

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
             * Obtener valor como fue llamado el formulario
             */
            
            String id_Detalle = "";
            String id_Servicio = "";
            String id_Vehiculo = "";
            String id_Cliente = "";
            String id_Empleado = "";
            String tipo_Servicio = "";
            String fecha_Inicio = "";
            String fecha_Fin = "";
            String articulos = "";
            String datos_Vehiculo = "";
            String datos_Servicio = "";
	    String costo_Art = "";
            String costo_Servicio = "";
            

            if (request.getParameter("detalle_serRd") != null) {
                id_Detalle = request.getParameter("detalle_serRd");
            } else if (request.getParameter("id_Detalle") != null) {
                id_Detalle = request.getParameter("id_Detalle");
            }
    
            if (request.getParameter("id_Servicio") != null) {
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
            
            if (request.getParameter("tipo_Servicio") != null) {
                tipo_Servicio = request.getParameter("tipo_Servicio");
            }
            if (request.getParameter("fecha_Inicio") != null) {
                fecha_Inicio = request.getParameter("fecha_Inicio");
            }
            if (request.getParameter("fecha_Fin") != null) {
                fecha_Fin = request.getParameter("fecha_Fin");
            }
            if (request.getParameter("articulos") != null) {
                articulos = request.getParameter("articulos");
            }
            if (request.getParameter("datos_Vehiculo") != null) {
                datos_Vehiculo = request.getParameter("datos_Vehiculo");
            }
            if (request.getParameter("datos_Servicio") != null) {
                datos_Servicio = request.getParameter("datos_Servicio");
            }
  	    if (request.getParameter("costo_Art") != null) {
                costo_Art = request.getParameter("costo_Art");
            }
	    if (request.getParameter("costo_Servicio") != null) {
                costo_Servicio = request.getParameter("costo_Servicio");
            }

           

            /**
             * Si presiona el boton buscar
             */
            
            if (buscar) {
                if (id_Detalle.equalsIgnoreCase("")) {
                    mensaje = "Debe de ingresar el numero de identificación de detalle ser";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Detalle_Sers miDetalle_ser = misDatos.getDetalle_ser(id_Detalle);
                    if (miDetalle_ser == null) {
                        mensaje = "El servicio no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                    } else {
                        id_Detalle = "" + miDetalle_ser.getId_Detalle();
                        id_Servicio = "" + miDetalle_ser.getId_Servicio();
                        id_Vehiculo = "" + miDetalle_ser.getId_Vehiculo();
                        id_Cliente = "" + miDetalle_ser.getId_Cliente();
                        id_Empleado = "" + miDetalle_ser.getId_Empleado();
                        tipo_Servicio = "" + miDetalle_ser.getTipo_Servicio();
                        fecha_Inicio = "" + miDetalle_ser.getFecha_Inicio();
                        fecha_Fin = "" + miDetalle_ser.getFecha_Fin();
                        articulos = "" + miDetalle_ser.getArticulos();
                        datos_Vehiculo = "" + miDetalle_ser.getDatos_Vehiculo();
                        datos_Servicio = "" + miDetalle_ser.getDatos_Servicio();
                        costo_Art = "" + miDetalle_ser.getCosto_Art();
                        costo_Servicio = "" + miDetalle_ser.getCosto_Servicio();
                        mensaje = "El detalle ser " + id_Detalle + " fue encontrado";

                        request.setAttribute("id_Detalle", id_Detalle);
                        request.setAttribute("id_Servicio", id_Servicio);
                        request.setAttribute("id_Vehiculo", id_Vehiculo);
                        request.setAttribute("id_Cliente", id_Cliente);
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                    }
                    misDatos.cerrarConexion();

                }
            }

            /**
             * Si presiona el boton consultar
             */
            
            if (consultar) {
                if (id_Cliente.equalsIgnoreCase("")) {
                    mensaje = "Debe seleccionar un usuario";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Detalle_Sers miDetalle_ser = misDatos.getDetalle_ser(id_Detalle);
                    if (miDetalle_ser == null) {
                        mensaje = "El Detalle ser no fue encontrado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                    } else {
                        id_Detalle = "" + miDetalle_ser.getId_Detalle();
                        id_Servicio = "" + miDetalle_ser.getId_Servicio();
                        id_Vehiculo = "" + miDetalle_ser.getId_Vehiculo();
                        id_Cliente = "" + miDetalle_ser.getId_Cliente();
                        id_Empleado = "" + miDetalle_ser.getId_Empleado();  
                        tipo_Servicio = "" + miDetalle_ser.getTipo_Servicio();
                        fecha_Inicio = "" + miDetalle_ser.getFecha_Inicio();
                        fecha_Fin = "" + miDetalle_ser.getFecha_Fin();
                        articulos = "" + miDetalle_ser.getArticulos();
                        datos_Vehiculo = "" + miDetalle_ser.getDatos_Vehiculo();
                        datos_Servicio = "" + miDetalle_ser.getDatos_Servicio();
			costo_Art = "" + miDetalle_ser.getCosto_Art();
			costo_Servicio = "" + miDetalle_ser.getCosto_Servicio();
                        
                        mensaje = "El Detalle ser " + id_Detalle + " fue consultado exitosamente";
                        misDatos.cerrarConexion();
                        request.setAttribute("id_Detalle", id_Detalle);
                        request.setAttribute("id_Servicio", id_Servicio);
                        request.setAttribute("id_Vehiculo", id_Vehiculo);
                        request.setAttribute("id_Cliente", id_Cliente);
                        request.setAttribute("id_Empleado", id_Empleado);
                        request.setAttribute("tipo_Servicio", tipo_Servicio);
                        request.setAttribute("fecha_Inicio", fecha_Inicio);
                        request.setAttribute("fecha_Fin", fecha_Fin);
                        request.setAttribute("articulos", articulos);
                        request.setAttribute("datos_Vehiculo", datos_Vehiculo);
                        request.setAttribute("datos_Servicio", datos_Servicio);
                        request.setAttribute("costo_Art", costo_Art);
                        request.setAttribute("costo_Servicio", costo_Servicio);
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarDetalle_ser.jsp").forward(request, response);

                    }

                }
            }

            /**
             * Si presiona el boton limpiar
             */
            
            if (limpiar) {

                id_Cliente = "";
                id_Detalle = "";
		id_Servicio = "";
		id_Vehiculo = "";
		id_Cliente = "";
		id_Empleado = "";
		tipo_Servicio = "";
		fecha_Inicio = "";
		fecha_Fin = "";
		articulos = "";
		datos_Vehiculo = "";
		datos_Servicio = "";
		costo_Art = "";
		costo_Servicio = "";
                mensaje = "Campos Limpios ;)";
                request.setAttribute("id_Detalle", id_Detalle);
                request.setAttribute("id_Servicio", id_Servicio);
                request.setAttribute("id_Vehiculo", id_Vehiculo);
                request.setAttribute("id_Cliente", id_Cliente);
                request.setAttribute("id_Empleado", id_Empleado);
                request.setAttribute("tipo_Servicio", tipo_Servicio);
                request.setAttribute("fecha_Inicio", fecha_Inicio);
                request.setAttribute("fecha_Fin", fecha_Fin);
                request.setAttribute("articulos", articulos);
                request.setAttribute("datos_Vehiculo", datos_Vehiculo);
                request.setAttribute("datos_Servicio", datos_Servicio);
                request.setAttribute("costo_Art", costo_Art);
                request.setAttribute("costo_Servicio", costo_Servicio);
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("NuevoDetalle_ser.jsp").forward(request, response);
            }

            /**
             * Si presiona el boton nuevo
             */
            
            if (crear) {
                if (id_Detalle.equals("")) {
                } else if (id_Servicio.equals("")) {
                } else if (id_Vehiculo.equals("")) {
                } else if (id_Cliente.equals("")) {
                } else if (id_Empleado.equals("")) {
                } else if (tipo_Servicio.equals("")) {
                } else if (fecha_Inicio.equals("")) {
                } else if (fecha_Fin.equals("")) {
                } else if (articulos.equals("")) {
                } else if (datos_Vehiculo.equals("")) {
		} else if (datos_Servicio.equals("")) {
		} else if (costo_Art.equals("")) {
		} else if (costo_Servicio.equals("")) {
                } else {
                    Datos misDatos = new Datos();
                    Detalle_Sers  miDetalle_serv = misDatos.getDetalle_ser(id_Detalle);
                    if (miDetalle_serv != null) {
                        mensaje = "El Servicio ya existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("NuevoDetalle_ser.jsp").forward(request, response);
                    } else {
                        miDetalle_serv = new Detalle_Sers(
                                id_Detalle,
				id_Servicio,
				id_Vehiculo,
				id_Cliente,
				id_Empleado,
				tipo_Servicio,
				fecha_Inicio,
				fecha_Fin,
				articulos,
				datos_Vehiculo,
				datos_Servicio,
				costo_Art,
				costo_Servicio);
                        misDatos.newDetalle_ser(miDetalle_serv);
                        mensaje = "Servicio" + id_Detalle + " fue guardado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }

            /**
             * Si presiona el boton modificar
             */
            if (modificar) {
                if (id_Detalle.equals("")) {
                    mensaje = "Debe ingresar un numero de Identificación detalle serv";
                } else if (id_Servicio.equals("")) {
                    mensaje = "Debe ingresar un numero de identificación servicio";
                } else if (id_Vehiculo.equals("")) {
                    mensaje = "Debe ingresar un numero de identificación vehiculo";
                } else if (id_Cliente.equals("")) {
                    mensaje = "Debe ingresar un numero de identificación cliente";
                } else if (id_Empleado.equals("")) {
                    mensaje = "Debe ingresar un numero de identificación empleado"; 
                } else if (tipo_Servicio.equals("")) {
                    mensaje = "Debe ingresar un tipo de servicio";
                } else if (fecha_Inicio.equals("")) {
                    mensaje = "Debe ingresar fecha inicio";
                } else if (fecha_Fin.equals("")) {
                    mensaje = "Debe ingresar fecha fin";
                } else if (articulos.equals("")) {
                    mensaje = "Debe ingresar articulos";
                } else if (datos_Vehiculo.equals("")) {
                    mensaje = "Debe ingresar datos vehiculo";
		} else if (datos_Servicio.equals("")) {
                    mensaje = "Debe ingresar datos servicio";
		} else if (costo_Art.equals("")) {
                    mensaje = "Debe ingresar costo articulos";
		} else if (costo_Servicio.equals("")) {
                    mensaje = "Debe ingresar costo servicio";
                } else {
                    Datos misDatos = new Datos();
                    Detalle_Sers miDetalle_serv= misDatos.getDetalle_ser(id_Detalle);

                    if (miDetalle_serv == null) {
                        mensaje = "Servicio no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarDetalle_ser.jsp").forward(request, response);
                    } else {
                        miDetalle_serv = new Detalle_Sers(
                                id_Detalle,
				id_Servicio,
				id_Vehiculo,
				id_Cliente,
				id_Empleado,
				tipo_Servicio,
				fecha_Inicio,
				fecha_Fin,
				articulos,
				datos_Vehiculo,
				datos_Servicio,
				costo_Art,
				costo_Servicio);
                        misDatos.updateDetalle_ser(miDetalle_serv);
                        mensaje = "Servicio " + id_Detalle + " fue actualizado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }

            /**
             * Si presiona el boton borrar
             */
            
            if (borrar) {
                if (id_Detalle.equalsIgnoreCase("")) {
                    mensaje = "Debe de seleccionar un Detalle ser";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Detalle_Sers miDetalle_ser = misDatos.getDetalle_ser(id_Detalle);
                    if (miDetalle_ser == null) {
                        mensaje = "El servicio no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                    } else {
                        mensaje = "El servicio " + id_Detalle + " fue borrado exitosamente";
                        misDatos.deleteDetalle_ser(id_Detalle);
                id_Detalle = "";
		id_Servicio = "";
		id_Vehiculo = "";
		id_Cliente = "";
		id_Empleado = "";
		tipo_Servicio = "";
		fecha_Inicio = "";
		fecha_Fin = "";
		articulos = "";
		datos_Vehiculo = "";
		datos_Servicio = "";
		costo_Art = "";
		costo_Servicio = "";
                        
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
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
