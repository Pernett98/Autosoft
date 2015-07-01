
package negocio;

import entidades.Usuarios;
import persistencia.Datos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Santiago Morales y Cristian 
 * @version Autosoft 1.0
 */
@WebServlet(name = "UsuariosN", urlPatterns = {"/UsuariosN"})
public class UsuariosN extends HttpServlet {

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
            /*  out.println("<!DOCTYPE html>");TODO output your page here. You may use following sample code. */
            /**
             *mensajes del sistema 
             */
            
            String mensaje = "";

            /**
             *cual boton se presiona
             */
            
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
            
            String id_Usuario = "";
            String perfil = "";
            String contrasena = "";
            String c_contrasena = "";
            String estado = "0";
            String foto = "";

            if (request.getParameter("usuarioRd") != null) {
                id_Usuario = request.getParameter("usuarioRd");
            } else if (request.getParameter("id_Usuario") != null) {
                id_Usuario = request.getParameter("id_Usuario");
            }
            if (request.getParameter("perfil") != null) {
                perfil = request.getParameter("perfil");
            }
            if (request.getParameter("contrasena") != null) {
                contrasena = request.getParameter("contrasena");
            }
            if (request.getParameter("c_contrasena") != null) {
                c_contrasena = request.getParameter("c_contrasena");
            }
            if (request.getParameter("foto") != null) {
                foto = request.getParameter("foto");
            }
            /**
             *Si presiona el boton buscar
             */
            
            if (buscar) {
                if (id_Usuario.equalsIgnoreCase("")) {
                    mensaje = "Debe de ingresar el numero de identificación";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Usuarios miUsuario = misDatos.getUsuario(id_Usuario);
                    if (miUsuario == null) {
                        mensaje = "El usuario no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                    } else {
                        id_Usuario = "" + miUsuario.getId_Usuario();
                        perfil = "" + miUsuario.getPerfil();
                        estado = "" + miUsuario.getEstado();
                        mensaje = "El usuario  " + id_Usuario + " fue encontrado";
                        request.setAttribute("id_Usuario", id_Usuario);
                        request.setAttribute("perfil", perfil);
                        request.setAttribute("estado", estado);
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                    }
                    misDatos.cerrarConexion();
                }
            }
            /**
             *Si presiona el boton consultar 
             */
            
            if (consultar) {
                if (id_Usuario.equalsIgnoreCase("")) {
                    mensaje = "Debe de ingresar el numero de identificación";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Usuarios miUsuario = misDatos.getUsuario(id_Usuario);
                    if (miUsuario == null) {
                        mensaje = "El usuario no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarUsuarios.jsp").forward(request, response);
                    } else if(miUsuario.getId_Usuario().equals("1010")){
                    mensaje = "No puede consultar el perfil de usuario del administrador";
                    request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                    }  else {
                        id_Usuario = "" + miUsuario.getId_Usuario();
                        perfil = "" + miUsuario.getPerfil();
                        contrasena = miUsuario.getContrasena();
                        c_contrasena = miUsuario.getContrasena();
                        foto = miUsuario.getFoto();
                        mensaje = "El usuario  " + id_Usuario + " fue consultado exitosamente";
                        request.setAttribute("id_Usuario", id_Usuario);
                        request.setAttribute("perfil", perfil);
                        request.setAttribute("contrasena", contrasena);
                        request.setAttribute("c_contrasena", c_contrasena);
                        request.setAttribute("foto", foto);
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarUsuarios.jsp").forward(request, response);
                    }
                    misDatos.cerrarConexion();
                }
            }

            /**
             *Si presiona el boton limpiar 
             */
            
            if (limpiar) {
                id_Usuario = "";
                perfil = "";
                contrasena = "";
                c_contrasena = "";
                foto = "";
                mensaje = "Campos Limpios ;)";
                request.setAttribute("id_Usuario", id_Usuario);
                request.setAttribute("perfil", perfil);
                request.setAttribute("contrasena", contrasena);
                request.setAttribute("c_contrasena", c_contrasena);
                request.setAttribute("foto", foto);
                request.getRequestDispatcher("NuevoUsuario.jsp").forward(request, response);
            }

            /**
             *Si presiona el boton nuevo 
             */
            
            if (crear) {
                if (id_Usuario.equals("")) {
                } else if (perfil.equals("0")) {
                } else if (contrasena.equals("")) {
                } else if (c_contrasena.equals("")) {
                } else if (!contrasena.equals(c_contrasena)) {
                } else {
                    if (foto.equals("")) {
                        foto = "Imagenes/avatar.png";
                    } else {
                        foto = "Imagenes/" + foto;
                    }
                    Datos misDatos = new Datos();
                    Usuarios miUsuarios = misDatos.getUsuario(id_Usuario);

                    if (miUsuarios != null) {
                        mensaje = "El Usuario ya existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("NuevoUsuario.jsp").forward(request, response);
                    } else {
                        miUsuarios = new Usuarios(
                                id_Usuario,
                                new Integer(perfil),
                                contrasena,
                                new Integer(estado),
                                foto);
                        misDatos.newUsuario(miUsuarios);
                        mensaje = "Usuario " + id_Usuario + " fue guardado";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }

            /**
             *Si presiona el boton modificar
             */
           
            if (modificar) {
                if (id_Usuario.equals("")) {
                    mensaje = "Debe ingresar un numero de Identificación";
                } else if (perfil.equals("0")) {
                    mensaje = "Debe seleccionar un perfil de usuario";
                } else if (contrasena.equals("")) {
                    mensaje = "Debe ingresar una contraseña";
                } else if (c_contrasena.equals("")) {
                    mensaje = "Debe ingresar la confirmación de la contraseña";
                } else if (!contrasena.equals(c_contrasena)) {
                    mensaje = "La contraseña y la confirmacion no coinciden";
                } else {
                    if (foto.equals("")) {
                        foto = "Imagenes/avatar.png";
                    } else {
                        foto = "Imagenes/" + foto;
                    }
                    Datos misDatos = new Datos();
                    Usuarios miUsuarios = misDatos.getUsuario(id_Usuario);

                    if (miUsuarios == null) {
                        mensaje = "Usuario no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ActualizarUsuarios.jsp").forward(request, response);
                    } else if(miUsuarios.getId_Usuario().equals("1010")){
                    mensaje = "No puede modificar el administrador";
                    request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                    } else {
                        miUsuarios = new Usuarios(
                                id_Usuario,
                                new Integer(perfil),
                                contrasena,
                                new Integer(estado),
                                foto);
                        misDatos.updateUsuario(miUsuarios);
                        mensaje = "Usuario " + id_Usuario + " fue actualizado";

                        
                        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                    }

                    misDatos.cerrarConexion();
                }
            }
            
            /**
             *Si presiona el boton borrar
             */
            
            if (borrar) {
                if (id_Usuario.equalsIgnoreCase("")) {
                    mensaje = "Debe de ingresar el numero de identificación";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                } else {
                    Datos misDatos = new Datos();
                    Usuarios miUsuario = misDatos.getUsuario(id_Usuario);
                    if (miUsuario == null) {
                        mensaje = "El usuario no existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                    } else if(miUsuario.getId_Usuario().equals("1010")){
                    mensaje = "No puede borrar el administrador";
                    request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
                    }
                            else{
                        mensaje = "El usuario " + id_Usuario + " fue borrado exitosamente";
                        
                        misDatos.deleteUsuario(id_Usuario);
                        id_Usuario = "";
                        perfil = "";
                        contrasena = "";
                        c_contrasena = "";
                        foto = "";
                        
                        request.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
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
