/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 * @author: Santiago Morales
 * @author: Cristian
 * @creationDate: 30 Octubre 2014
 * @version: Autosoft 1.0 
 * 
 */

import entidades.Clientes;
import entidades.Usuarios;
import persistencia.Datos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ClientesN", urlPatterns = {"/ClientesN"})
public class ClientesN extends HttpServlet {

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
             * @name: modificar
             * @type: boolean
             * @function: boton para modificar los clientes
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
             * Los strings del formulario de clientes, aparecen como fueron llamados
            */
            
            /**
             * @name: id_Cliente
             * @type: String
             */
            String id_Cliente = "";
            
            /**
             * @name: nombre
             * @type: String
             */
            String nombre = "";
            
            /**
             * @name: apellido
             * @type: String
             */
            String apellido = "";
            
            /**
             * @name: fecha_Nacimiento
             * @type: String
             */
            String fecha_Nacimiento = "";
            
            /**
             * @name: genero
             * @type: int
             */
            String genero = "";
            
            /**
             * @name: telefono
             * @type: String
             */
            String telefono = "";
            
            /**
             * @name: celular
             * @type: String
             */
            String celular = "";
            
            /**
             * @name: pais
             * @type: String
             */
            String pais = "";
            
            /**
             * @name: departamento
             * @type: String
             */
            String departamento = "";
            
            /**
             * @name: ciudad
             * @type: String
             */
            String ciudad = "";
            
            /**
             * @name: direccion
             * @type: String
             */
            String direccion = "";
            
            /**
             * @name: ocupacion
             * @type: String
             */
            String ocupacion = "";
            
            /**
             * @name: empresa
             * @type: String
             */
            String empresa = "";
            
            /**
             * @name: correo
             * @type: String
             */
            String correo = "";

            
            /**
             * @name: getParameter
             * @function: Se establecen los parametros para lo strings
             * 
             */
            if (request.getParameter("clienteRd") != null) {
                id_Cliente = request.getParameter("clienteRd");
            } else if (request.getParameter("id_Cliente") != null) {
                id_Cliente = request.getParameter("id_Cliente");
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
            if (request.getParameter("ocupacion") != null) {
                ocupacion = request.getParameter("ocupacion");
            }
            if (request.getParameter("empresa") != null) {
                empresa = request.getParameter("empresa");
            }
            if (request.getParameter("correo") != null) {
                correo = request.getParameter("correo");
            }

 
            /**
             * Este ciclo solo ocurre si se presiona el boton buscar
             * 
             */
            if (buscar) {
                if (id_Cliente.equalsIgnoreCase("")) {
                    mensaje = "Debe de ingresar el numero de identificación";
                    /**
                     * @name: setAttribute
                     * @type: String
                     * @function: El set esta estableciendo un mensaje 
                     */
                    request.setAttribute("mensaje", mensaje);
                    /**
                     * @name: getRequestDispatcher
                     * @function: El get esta obteniendo un listado de clientes
                     */
                    request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    /**
                     * @name: getCliente
                     * @type: String
                     * @function: Mostrar los datos que esten en id_Cliente
                     */
                    Clientes miCliente = misDatos.getCliente(id_Cliente);
                    if (miCliente == null) {
                        /**
                         * @name:setAttribute
                         * @function: Si el cliente buscado no existe, aparece el set mostrando el mensaje 
                         */
                        mensaje = "El Cliente no existe";
                        request.setAttribute("mensaje", mensaje);
                        /**
                         * @name: getRequestDispatcher
                         * @function: El get esta obteniendo un listado de clientes
                         */
                        request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
                    } else {
                        /**
                         * @name: id_Cliente
                         * @type: String
                         * @function: La variable id_Cliente llama al getId_Cliente para obtener los datos 
                         * 
                         */
                        id_Cliente = "" + miCliente.getId_Cliente();
                        /**
                         * @name: nombre
                         * @type: String
                         * @function: La variable nombre llama al getNombre para obtener los datos
                         */
                        nombre = "" + miCliente.getNombre();
                        /**
                         * @name: apellido
                         * @type: String
                         * @function: La variable apellidos llama al getApellido para obtener los datos
                         */
                        apellido = "" + miCliente.getApellido();
                         /**
                         * @name: apellido
                         * @type: String
                         * @function: La variable apellidos llama al getApellido para obtener los datos
                         */
                        fecha_Nacimiento = "" + miCliente.getFecha_Nacimiento();
                         /**
                         * @name: fecha_Nacimiento
                         * @type: String
                         * @function: La variable fecha_Nacimiento llama al getFecha_Nacmiento para obtener los datos
                         */
                        genero = "" + miCliente.getGenero();
                         /**
                         * @name: genero
                         * @type: int
                         * @function: La variable genero llama al getGenero para obtener los datos
                         */
                        telefono = "" + miCliente.getTelefono();
                         /**
                         * @name: telefono
                         * @type: String
                         * @function: La variable telefono llama al getTelefono para obtener los datos
                         */
                        celular = "" + miCliente.getCelular();
                         /**
                         * @name: celular
                         * @type: String
                         * @function: La variable celular llama al getCelular para obtener los datos
                         */
                        pais = "" + miCliente.getPais(); 
                        /**
                         * @name: pais
                         * @type: String
                         * @function: La variable pais llama al getPais para obtener los datos
                         */
                        departamento = "" + miCliente.getDepartamento();
                         /**
                         * @name: departamento
                         * @type: String
                         * @function: La variable departamento llama al getDepartamento para obtener los datos
                         */
                        ciudad = "" + miCliente.getCiudad();
                         /**
                         * @name: ciudad
                         * @type: String
                         * @function: La variable ciudad llama al getCiudad para obtener los datos
                         */
                        direccion = "" + miCliente.getDireccion();
                         /**
                         * @name: direccion
                         * @type: String
                         * @function: La variable direccion llama al getADireccion para obtener los datos
                         */
                        ocupacion = "" + miCliente.getOcupacion();
                         /**
                         * @name: ocupacion
                         * @type: String
                         * @function: La variable ocupacion llama al getOcupacion para obtener los datos
                         */
                        empresa = "" + miCliente.getEmpresa();
                         /**
                         * @name: empresa
                         * @type: String
                         * @function: La variable empresa llama al getEmpresa para obtener los datos
                         */
                        correo = "" + miCliente.getCorreo();
                         /**
                         * @name: correo
                         * @type: String
                         * @function: La variable correo llama al getCorreo para obtener los datos
                         */
                        mensaje = "El usuario " + id_Cliente + " fue encontrado";
                        
                        
                        /**
                         * @name: setAttrbute
                         * @function: Establece el resultado de los datos anteriormente asignados
                         */
                        request.setAttribute("id_Cliente", id_Cliente);
                        request.setAttribute("nombre", nombre);
                        request.setAttribute("apellido", apellido);
                        request.setAttribute("fecha_Nacimiento", fecha_Nacimiento);
                        request.setAttribute("genero", genero);
                        request.setAttribute("telefono", telefono);
                        request.setAttribute("celular", celular);
                        request.setAttribute("pais", pais);
                        request.setAttribute("departamento", departamento);
                        request.setAttribute("ciudad", ciudad);
                        request.setAttribute("direccion", direccion);
                        request.setAttribute("ocupacion", ocupacion);
                        request.setAttribute("empresa", empresa);
                        request.setAttribute("correo", correo);
                        request.setAttribute("mensaje", mensaje);
                        /**
                         * @name: getRequestDispatcher
                         * @function: Obtiene el listado de los clientes
                         */
                        request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
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
                    Clientes miCliente = misDatos.getCliente(id_Cliente);
                    if (miCliente == null) {
                        mensaje = "El Cliente no fue encontrado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
                    } else {
                        /**
                         * @name: get
                         * @type: String
                         * @function: Obtener los datos asignados en los get
                         * 
                         */
                        id_Cliente = "" + miCliente.getId_Cliente();
                        nombre = "" + miCliente.getNombre();
                        apellido = "" + miCliente.getApellido();
                        fecha_Nacimiento = "" + miCliente.getFecha_Nacimiento();
                        genero = "" + miCliente.getGenero();
                        telefono = "" + miCliente.getTelefono();
                        celular = "" + miCliente.getCelular();
                        pais = "" + miCliente.getPais();
                        departamento = "" + miCliente.getDepartamento();
                        ciudad = "" + miCliente.getCiudad();
                        direccion = "" + miCliente.getDireccion();
                        ocupacion = "" + miCliente.getOcupacion();
                        empresa = "" + miCliente.getEmpresa();
                        correo = "" + miCliente.getCorreo();

                        mensaje = "El cliente " + id_Cliente + " fue consultado exitosamente";
                        misDatos.cerrarConexion();
                        /**
                         * 
                         * @name: setAttribute
                         * @funtion: Establecer los datos de las variables
                         * 
                         */
                        request.setAttribute("id_Cliente", id_Cliente);
                        request.setAttribute("nombre", nombre);
                        request.setAttribute("apellido", apellido);
                        request.setAttribute("fecha_Nacimiento", fecha_Nacimiento);
                        request.setAttribute("genero", genero);
                        request.setAttribute("telefono", telefono);
                        request.setAttribute("celular", celular);
                        request.setAttribute("pais", pais);
                        request.setAttribute("departamento", departamento);
                        request.setAttribute("ciudad", ciudad);
                        request.setAttribute("direccion", direccion);
                        request.setAttribute("ocupacion", ocupacion);
                        request.setAttribute("empresa", empresa);
                        request.setAttribute("correo", correo);
                        request.setAttribute("mensaje", mensaje);
                        /**
                         * @name: getRequestDispatcher
                         * @function: Se obtiene el get con una actualizacion de los clientes
                         */
                        request.getRequestDispatcher("ActualizarClientes.jsp").forward(request, response);

                    }

                }
            }

            /**
             * 
             * Ciclo por el que se pasa si se presiona el boton limpiar
             */
            if (limpiar) {

                id_Cliente = "";
                nombre = "";
                apellido = "";
                fecha_Nacimiento = "";
                genero = "";
                telefono = "";
                celular = "";
                pais = "";
                departamento = "";
                ciudad = "";
                direccion = "";
                ocupacion = "";
                empresa = "";
                correo = "";
                mensaje = "Campos Limpios ;)";
                /**
                 * @name: setAttribute
                 * @function: Establece los datos de las variables por medio del set
                 */
                request.setAttribute("id_Cliente", id_Cliente);
                request.setAttribute("nombre", nombre);
                request.setAttribute("apellido", apellido);
                request.setAttribute("fecha_Nacimiento", fecha_Nacimiento);
                request.setAttribute("genero", genero);
                request.setAttribute("telefono", telefono);
                request.setAttribute("celular", celular);
                request.setAttribute("pais", pais);
                request.setAttribute("departamento", departamento);
                request.setAttribute("ciudad", ciudad);
                request.setAttribute("direccion", direccion);
                request.setAttribute("ocupacion", ocupacion);
                request.setAttribute("empresa", empresa);
                request.setAttribute("correo", correo);
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("NuevoCliente.jsp").forward(request, response);
            }

            /**
             * Ciclo por el que se pasa si se presiona el boton nuevo
             */
            if (crear) {
                if (id_Cliente.equals("")) {
                } else if (nombre.equals("")) {
                } else if (apellido.equals("")) {
                } else if (fecha_Nacimiento.equals("")) {
                } else if (genero.equals("")) {
                } else if (telefono.equals("")) {
                } else if (celular.equals("")) {
                } else if (pais.equals("")) {
                } else if (departamento.equals("")) {
                } else if (ciudad.equals("")) {
                } else if (direccion.equals("")) {
                } else if (ocupacion.equals("")) {
                } else if (empresa.equals("")) {
                } else if (correo.equals("")) {
                } else {
                    Datos misDatos = new Datos();
                    Clientes miClientes = misDatos.getCliente(id_Cliente);
                    Usuarios miUsuarios = misDatos.getUsuario(id_Cliente);
                    if (miUsuarios == null){
                        mensaje = "Debe crear primero el usuario";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("NuevoCliente.jsp").forward(request, response);
                    } else if (miClientes != null) {
                        mensaje = "El Cliente ya existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("NuevoCliente.jsp").forward(request, response);
                    } else {
                        miClientes = new Clientes(
                                id_Cliente,
                                nombre,
                                apellido,
                                fecha_Nacimiento,
                                new Integer(genero),
                                telefono,
                                celular,
                                pais,
                                departamento,
                                ciudad,
                                direccion,
                                ocupacion,
                                empresa,
                                correo);
                        misDatos.newCliente(miClientes);
                        mensaje = "Cliente " + id_Cliente + " fue guardado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }
            /**
             * Ciclo por el que pasa si se presiona el boton modificar
             */
            if (modificar) {
                if (id_Cliente.equals("")) {
                } else if (nombre.equals("")) {
                } else if (apellido.equals("")) {
                } else if (fecha_Nacimiento.equals("")) {
                } else if (genero.equals("")) {
                } else if (telefono.equals("")) {
                } else if (celular.equals("")) {
                } else if (pais.equals("")) {
                } else if (departamento.equals("")) {
                } else if (ciudad.equals("")) {
                } else if (direccion.equals("")) {
                } else if (ocupacion.equals("")) {
                } else if (empresa.equals("")) {
                } else if (correo.equals("")) {
                } else {
                    Datos misDatos = new Datos();
                    Clientes miClientes = misDatos.getCliente(id_Cliente);

                    if (miClientes == null) {
                        mensaje = "Cliente no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarClientes.jsp").forward(request, response);
                    } else {
                        miClientes = new Clientes(
                                id_Cliente,
                                nombre,
                                apellido,
                                fecha_Nacimiento,
                                new Integer(genero),
                                telefono,
                                celular,
                                pais,
                                departamento,
                                ciudad,
                                direccion,
                                ocupacion,
                                empresa,
                                correo);
                        misDatos.updateCliente(miClientes);
                        mensaje = "Cliente " + id_Cliente + " fue actualizado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }
            
            /**
             * Ciclo por el que pasa si se presiona el boton borrar
             */
            if (borrar) {
                if (id_Cliente.equalsIgnoreCase("")) {
                    mensaje = "Debe de seleccionar un Cliente";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Clientes miCliente = misDatos.getCliente(id_Cliente);
                    if (miCliente == null) {
                        mensaje = "El Cliente no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
                    } else {
                        mensaje = "El Cliente " + id_Cliente + " fue borrado exitosamente";
                        misDatos.deleteCliente(id_Cliente);
                        id_Cliente = "";
                        nombre = "";
                        apellido = "";
                        fecha_Nacimiento = "";
                        genero = "";
                        telefono = "";
                        celular = "";
                        pais = "";
                        departamento = "";
                        ciudad = "";
                        direccion = "";
                        ocupacion = "";
                        empresa = "";
                        correo = "";

                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
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
