/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

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

// Ensayando esto

/**
 *
 * @author Cristian
 * @version Autosoft 1.0
 * 
 */
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
             * 
             * Obtener valor como fue llamado el formulario
             * 
             */
            
            String id_Cliente = "";
            String nombre = "";
            String apellido = "";
            String fecha_Nacimiento = "";
            String genero = "";
            String telefono = "";
            String celular = "";
            String pais = "";
            String departamento = "";
            String ciudad = "";
            String direccion = "";
            String ocupacion = "";
            String empresa = "";
            String correo = "";

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
             * Si presiona el boton buscar
             * 
             */
            
            if (buscar) {
                if (id_Cliente.equalsIgnoreCase("")) {
                    mensaje = "Debe de ingresar el numero de identificación";
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
                        mensaje = "El usuario " + id_Cliente + " fue encontrado";

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
                        request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);
                    }
                    misDatos.cerrarConexion();

                }
            }

            /**
             * Si presiona el boton consultar
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
                        request.getRequestDispatcher("ActualizarClientes.jsp").forward(request, response);

                    }

                }
            }

            /**
             * 
             * Si presiona el boton limpiar
             * 
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
             * Si presiona el boton nuevo
             * 
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
             * Si presiona el boton modificar
             * 
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
             * Si presiona el boton borrar
             * 
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
