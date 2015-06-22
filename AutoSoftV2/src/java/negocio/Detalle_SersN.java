/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;


/**
 * @author: Santiago Morales
 * @author: Cristian
 * @fechaCreacion: 30 Octubre 2014
 * @version: Autosoft 1.0
 * 
 */

import entidades.Detalle_Sers;
import persistencia.Datos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
            /**
             * @name: mensaje
             * @type: String
             * @function: Mostrar un mensaje predeterminado
            */
            String mensaje = "";
            // cual boton se presiona
            
            /**
             * @name: consultar
             * @type: boolean
             * @funtion: boton para consultar los clientes
             */
            boolean consultar = false;
            
            /**
             * @name: buscar
             * @type: boolean
             * @function: boton para buscar los clientes
             */
            boolean buscar = false;
            
            /**
             * @name: crear
             * @type: boolean
             * @function: boton para crear clientes
             */
            boolean crear = false;
            
            /**
             * @name: borrar
             * @type: boolean
             * @function: boton para borrar clientes
             */
            boolean modificar = false;
            
            /**
             * @name: borrar
             * @type: boolean
             * @function: boton para borrar clientes
             */
            boolean borrar = false;
            //boolean listar = false;
            
           /**
             * @name: limpiar
             * @type: boolean
             * @function: boton para limpiar lso campos del formulario de clientes
             */
            boolean limpiar = false;

            /**
             * @name: getParameter
             * @function: Mostrar los parametros establecidos en los botones 
             * 
             */
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
             * Los strings del formulario de Detalle_sers, aparecen como fueron llamados
             */
            
            /**
             * @name: id_Detalle
             * @type: String
             */
            String id_Detalle = "";
            
            /**
             * @name: id_Servicio
             * @type: String
             */
            String id_Servicio = "";
            
            /**
             * @name: id_Vehiculo
             * @type: String
             */
            String id_Vehiculo = "";
            
            /**
             * @name: id_Cliente
             * @type: String
             */
            String id_Cliente = "";
            
            /**
             * @name: id_Empleado
             * @type: String
             */
            String id_Empleado = "";
            
            /**
             * @name: tipo_Servicio
             * @type: String
             */
            String tipo_Servicio = "";
            
            /**
             * @name: fecha_Inicio
             * @type: String
             */
            String fecha_Inicio = "";
            
              /**
             * @name: fecha_Fin
             * @type: String
             */
            String fecha_Fin = "";
            
              /**
             * @name: articulos
             * @type: String
             */
            String articulos = "";
            
              /**
             * @name: datos_vehiculo
             * @type: String
             */
            String datos_Vehiculo = "";
            
              /**
             * @name: datos_Servicio
             * @type: String
             */
            String datos_Servicio = "";
            
              /**
             * @name: costo_Art
             * @type: String
             */
	    String costo_Art = "";
            
              /**
             * @name: costo_Servicio
             * @type: String
             */
            String costo_Servicio = "";
            
            /**
             * @name: getParameter
             * @function: Se establecen los parametros para lo strings
             * 
             */
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
             * Este ciclo solo ocurre si se presiona el boton buscar
             * 
             */
            if (buscar) {
                if (id_Detalle.equalsIgnoreCase("")) {
                    mensaje = "Debe de ingresar el numero de identificación de detalle ser";
                     /**
                     * @name: setAttribute
                     * @type: String
                     * @function: El set esta estableciendo un mensaje 
                     */
                    request.setAttribute("mensaje", mensaje);
                    /**
                     * @name: getRequestDispatcher
                     * @function: El get esta obteniendo un listado de detalles de servicios
                     */
                    request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    /**
                     * @name: getDetalle_ser
                     * @type: String
                     * @function: Mostrar los datos que esten en id_Detalle
                     */
                    Detalle_Sers miDetalle_ser = misDatos.getDetalle_ser(id_Detalle);
                    if (miDetalle_ser == null) {
                        /**
                         * @name:setAttribute
                         * @function: Si el servicio buscado no existe, aparece el set mostrando el mensaje 
                         */
                        mensaje = "El servicio no existe";
                        request.setAttribute("mensaje", mensaje);
                        /**
                         * @name: getRequestDispatcher
                         * @function: El get esta obteniendo un listado de detalles de servicios 
                         */
                        request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                    } else {
                         /**
                         * @name: id_Detalle
                         * @type: String
                         * @function: La variable id_Detalle llama al getId_Detalle para obtener los datos 
                         * 
                         */
                        id_Detalle = "" + miDetalle_ser.getId_Detalle();
                        
                        /**
                         * @name: id_Servicio
                         * @type: String
                         * @function: La variable id_Servicio llama al getId_Servicio para obtener los datos 
                         * 
                         */
                        id_Servicio = "" + miDetalle_ser.getId_Servicio();
                        
                        /**
                         * @name: id_Vehiculo
                         * @type: String
                         * @function: La variable id_Vehiculo llama al getId_Vehiculo para obtener los datos 
                         * 
                         */
                        id_Vehiculo = "" + miDetalle_ser.getId_Vehiculo();
                        
                        /**
                         * @name: id_Cliente
                         * @type: String
                         * @function: La variable id_Cliente llama al getId_Cliente para obtener los datos 
                         * 
                         */
                        id_Cliente = "" + miDetalle_ser.getId_Cliente();
                        
                        /**
                         * @name: id_Empleado
                         * @type: String
                         * @function: La variable id_Empleado llama al getId_Empleado para obtener los datos 
                         * 
                         */
                        id_Empleado = "" + miDetalle_ser.getId_Empleado();
                        
                        /**
                         * @name: tipo_Servicio
                         * @type: String
                         * @function: La variable tipo_Servicio llama al getTipo_Servicio para obtener los datos 
                         * 
                         */
                        tipo_Servicio = "" + miDetalle_ser.getTipo_Servicio();
                        
                        /**
                         * @name: fecha_Inicio
                         * @type: String
                         * @function: La variable fecha_Inicio llama al getFecha_Inicio para obtener los datos 
                         * 
                         */
                        fecha_Inicio = "" + miDetalle_ser.getFecha_Inicio();
                        
                        /**
                         * @name: fecha_Fin
                         * @type: String
                         * @function: La variable fecha_Fin llama al getFecha_Fin para obtener los datos 
                         * 
                         */
                        fecha_Fin = "" + miDetalle_ser.getFecha_Fin();
                        
                        /**
                         * @name: articulos
                         * @type: String
                         * @function: La variable articulos llama al getArticulos para obtener los datos 
                         * 
                         */
                        articulos = "" + miDetalle_ser.getArticulos();
                        
                        /**
                         * @name: datos_Vehiculo
                         * @type: String
                         * @function: La variable datos_Vehiculo llama al getDatos_Vehiculo para obtener los datos 
                         * 
                         */
                        datos_Vehiculo = "" + miDetalle_ser.getDatos_Vehiculo();
                        
                        /**
                         * @name: datos_Servicio
                         * @type: String
                         * @function: La variable datos_Servicio llama al getDatos_Servicio para obtener los datos 
                         * 
                         */
                        datos_Servicio = "" + miDetalle_ser.getDatos_Servicio();
                        
                        /**
                         * @name: id_Detalle
                         * @type: String
                         * @function: La variable id_Detalle llama al getId_Detalle para obtener los datos 
                         * 
                         */
                        costo_Art = "" + miDetalle_ser.getCosto_Art();
                        
                        /**
                         * @name: costo_Servicio
                         * @type: String
                         * @function: La variable costo_Servicio llama al getCosto_Servicio para obtener los datos 
                         * 
                         */
                        costo_Servicio = "" + miDetalle_ser.getCosto_Servicio();
                         /**
                         * @name: setAttrbute
                         * @function: Establece el resultado de los datos anteriormente asignados
                         */
                        mensaje = "El detalle ser " + id_Detalle + " fue encontrado";

                        request.setAttribute("id_Detalle", id_Detalle);
                        request.setAttribute("id_Servicio", id_Servicio);
                        request.setAttribute("id_Vehiculo", id_Vehiculo);
                        request.setAttribute("id_Cliente", id_Cliente);
                        request.setAttribute("mensaje", mensaje);
                        /**
                         * @name: getRequestDispatcher
                         * @function: Obtiene el listado de los detalles del servicio
                         */
                        request.getRequestDispatcher("ListadoDetalle_Sers.jsp").forward(request, response);
                    }
                    misDatos.cerrarConexion();

                }
            }

            /**
             * Ciclo por el que se pasa, si se presiona el boton consultar
             * 
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
                         /**
                         * @name: get
                         * @type: String
                         * @function: Obtener los datos asignados en los get
                         * 
                         */
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
                          
                        /**
                         * 
                         * @name: setAttribute
                         * @funtion: Establecer los datos de las variables
                         * 
                         */
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
                        /**
                         * @name: getRequestDispatcher
                         * @function: Se obtiene el get con una actualizacion de los detalles del servicio
                         */
                        request.getRequestDispatcher("ActualizarDetalle_ser.jsp").forward(request, response);

                    }

                }
            }

            /**
             * 
             * Ciclo por el que se pasa si se presiona el boton limpiar
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
                /**
                 * @name: setAttribute
                 * @function: Establece los datos de las variables por medio del set
                 */
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
             * Ciclo por el que se pasa si se presiona el boton nuevo
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
             * Ciclo por el que pasa si se presiona el boton modificar
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
             * Ciclo por el que pasa si se presiona el boton borrar
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
