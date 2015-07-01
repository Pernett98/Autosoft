package persistencia;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Cristian
 * @version Autosoft 1.0
 */
@WebServlet(name = "ValidarUsuario", urlPatterns = {"/ValidarUsuario"})
public class ValidarUsuario extends HttpServlet {

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
        try  {
            /**
             *Objeto de BD
             */
            
            Datos misDatos = new Datos ();
            
            
            /**
             *valores tomar de jsp 
             */
            
            String usuario = request.getParameter("usuario");
            String empleado = request.getParameter("usuario");
            String cliente = request.getParameter("usuario");
            String clave = request.getParameter("clave");
            
            /**
             *Validamos Usuario 
             */
            
            out.println(misDatos.validarUsuario(usuario, clave));
            
            
            /**
             * almacenar el usuario logeado en la sesión
             */
           
            HttpSession sesion = request.getSession(true);
            sesion.setAttribute("usuario", misDatos.getUsuario(usuario));
            sesion.setAttribute("empleado", misDatos.getEmpleado(empleado));
            sesion.setAttribute("cliente", misDatos.getCliente(cliente));
            /**
             *Cerrar conexion de BD
             */
            
            misDatos.cerrarConexion();
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
