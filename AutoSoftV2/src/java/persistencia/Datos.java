
package persistencia;

import entidades.Clientes;
import entidades.Empleados;
import entidades.Servicios;
import entidades.Usuarios;
import entidades.Vehiculos;
import entidades.Detalle_Sers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datos {

    private Connection cnn;

    public Datos() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db = "jdbc:mysql://localhost/autosoft";
            cnn = DriverManager.getConnection(db, "root", "");
        } catch (Exception ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarConexion() {
        try {
            cnn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String validarUsuario(String usuario, String clave) {
        try {
            String sql = "select perfil from tbl_usuario where "
                    + " id_Usuario = '" + usuario + "' and "
                    + " contrasena = '" + clave + "' ";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getString("perfil");
            } else {
                return "Usuario Erroneo";
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return "Error";
        }
    }

        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    
    public Usuarios getUsuario(String id_Usuario) {
        try {
            Usuarios miUsuario = null;
            String sql = "select * from tbl_usuario where "
                    + " id_Usuario = '" + id_Usuario + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                miUsuario = new Usuarios(
                        rs.getString("id_Usuario"),
                        rs.getInt("perfil"),
                        rs.getString("contrasena"),
                        rs.getInt("estado"),
                        rs.getString("foto"));
            }

            return miUsuario;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void newUsuario(Usuarios miUsuario) {
        try {
            String sql = "insert into tbl_usuario "
                    + "values("
                    + " " + miUsuario.getId_Usuario() + ","
                    + " " + miUsuario.getPerfil() + ","
                    + "'" + miUsuario.getContrasena() + "',"
                    + " " + miUsuario.getEstado() + ","
                    + "'" + miUsuario.getFoto() + "')";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateUsuario(Usuarios miUsuario) {
        try {
            String sql = "update tbl_usuario set "
                    + " perfil = "+ miUsuario.getPerfil()+","
                    + " contrasena = '"+ miUsuario.getContrasena()+"',"
                    + " estado = "+ miUsuario.getEstado()+","
                    + " foto = '"+ miUsuario.getFoto()+"'"
                    + " where id_Usuario = '" + miUsuario.getId_Usuario() + "'";
            
                    
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteUsuario(String id_Usuario) {
        try {
            String sql = "delete from tbl_usuario where "
                    + " id_Usuario = '" + id_Usuario + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getUsuarios() {
        try {
            Usuarios miUsuario = null;
            String sql = "select * from tbl_usuario";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    
    public Empleados getEmpleado(String id_Empleado) {
        try {            
            Empleados miEmpleado = null;
            String sql = "select * from tbl_empleado where "
                    + " id_Empleado = '" + id_Empleado + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                miEmpleado = new Empleados(
                        rs.getString("id_Empleado"),
                        rs.getInt("cargo"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("fecha_Nacimiento"),
                        rs.getInt("genero"),
                        rs.getInt("estado_Civil"),
                        rs.getString("telefono"),
                        rs.getString("celular"),
                        rs.getString("pais"),
                        rs.getString("departamento"),
                        rs.getString("ciudad"),
                        rs.getString("direccion"),
                        rs.getString("correo"));
            }

            return miEmpleado;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void newEmpleado(Empleados miEmpleado) {
        try {
            
            
            String sql = "insert into tbl_empleado "
                    + "values("
                    + "'" + miEmpleado.getId_Empleado()+ "',"
                    + " " + miEmpleado.getCargo()+ ","
                    + "'" + miEmpleado.getNombre()+ "',"
                    + "'" + miEmpleado.getApellido()+ "',"
                    + "'" + miEmpleado.getFecha_Nacimiento()+ "',"
                    + " " + miEmpleado.getGenero()+ ","
                    + " " + miEmpleado.getEstado_Civil()+ ","
                    + "'" + miEmpleado.getTelefono()+ "',"
                    + "'" + miEmpleado.getCelular()+ "',"
                    + "'" + miEmpleado.getPais()+ "',"
                    + "'" + miEmpleado.getDepartamento()+ "',"
                    + "'" + miEmpleado.getCiudad()+ "',"
                    + "'" + miEmpleado.getDireccion()+ "',"
                    + "'" + miEmpleado.getCorreo()+ "')";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateEmpleado(Empleados miEmpleado) {
        try {
            
            String sql = "update tbl_empleado set "
                    + " cargo = "+ miEmpleado.getCargo()+ ","
                    + " nombre = '"+ miEmpleado.getNombre()+ "',"
                    + " apellido = '"+ miEmpleado.getApellido()+ "',"
                    + " fecha_Nacimiento = '"+ miEmpleado.getFecha_Nacimiento()+ "',"
                    + " genero = "+ miEmpleado.getGenero()+ ","
                    + " estado_Civil = "+ miEmpleado.getEstado_Civil()+ ","
                    + " telefono = '"+ miEmpleado.getTelefono()+ "',"
                    + " celular = '"+ miEmpleado.getCelular()+ "',"
                    + " pais = '"+ miEmpleado.getPais()+ "',"
                    + " departamento = '"+ miEmpleado.getDepartamento()+ "',"
                    + " ciudad = '"+ miEmpleado.getCiudad()+ "',"
                    + " direccion = '"+ miEmpleado.getDireccion()+ "',"
                    + " correo = '"+ miEmpleado.getCorreo()+ "'"
                    + " where id_Empleado = '" + miEmpleado.getId_Empleado()+ "'";
            
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteEmpleado(String id_Empleado) {
        try {
            String sql = "delete from tbl_empleado where "
                    + " id_Empleado = '" + id_Empleado + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getEmpleados() {
        try {
            Empleados miEmpleado = null;
            String sql = "select * from tbl_empleado";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    
   public Servicios getServicio(String id_Servicio) {
        try {
            Servicios miServicio = null;
            String sql = "select * from tbl_servicio where "
                    + " id_Servicio = '" + id_Servicio+ "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                miServicio = new Servicios(
                        rs.getString("id_Servicio"),
                        rs.getString("id_Vehiculo"),
                        rs.getString("id_Cliente"),
                        rs.getString("id_Empleado"),
                        rs.getInt("estado"),
                        rs.getString("fecha_Inicio"),
			rs.getString("fecha_Fin"));
                        
                        
            }

            return miServicio;
} catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void newServicio(Servicios miServicio) {
        try {
            String sql = "insert into tbl_servicio "
                    + "values("
                    + "'" + miServicio.getId_Servicio()+ "'," 
                    + "'" + miServicio.getId_Vehiculo()+ "',"
                    + "'" + miServicio.getId_Cliente()+ "',"
                    + "'" + miServicio.getId_Empleado()+ "',"
                    + " " + miServicio.getEstado()+ ","
                    + "'" + miServicio.getFecha_Inicio()+ "',"
                    + "'" + miServicio.getFecha_Fin()+ "')";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void updateServicio(Servicios miServicio) {
        try {
            String sql = "update tbl_servicio set"
                    + " id_Vehiculo = '"+ miServicio.getId_Vehiculo()+ "',"
                    + " id_Cliente = '"+ miServicio.getId_Cliente()+ "',"
                    + " id_Empleado = '"+ miServicio.getId_Empleado()+ "',"
                    + " estado = "+ miServicio.getEstado()+ ","
                    + " fecha_Inicio = '"+miServicio.getFecha_Inicio()+ "',"
                    + " fecha_Fin = '"+ miServicio.getFecha_Fin()+ "'"
                    + " where id_Servicio = '" + miServicio.getId_Servicio()+ "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void deleteServicio(String id_Servicio ) {
        try {
            String sql = "delete from tbl_servicio where "
                    + " id_Servicio = '" + id_Servicio + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getServicios() {
        try {
            Servicios miServicio = null;
            String sql = "select * from tbl_servicio";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
       //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    
       public Clientes getCliente(String id_Cliente) {
        try {
            Clientes miCliente = null;
            String sql = "select * from tbl_cliente where "
                    + " id_Cliente = '" + id_Cliente + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                miCliente = new Clientes(
                        rs.getString("id_Cliente"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("fecha_Nacimiento"),
                        rs.getInt("genero"),
                        rs.getString("telefono"),
                        rs.getString("celular"),
                        rs.getString("pais"),
                        rs.getString("departamento"),
                        rs.getString("ciudad"),
                        rs.getString("direccion"),
			rs.getString("ocupacion"),
			rs.getString("empresa"),
                        rs.getString("correo"));
            }

            return miCliente;
} catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void newCliente(Clientes miCliente) {
        try {
            String sql = "insert into tbl_cliente "
                    + "values("
                    + "'" + miCliente.getId_Cliente()+ "'," 
                    + "'" + miCliente.getNombre()+ "',"
                    + "'" + miCliente.getApellido()+ "',"
                    + "'" + miCliente.getFecha_Nacimiento()+ "',"
                    + " " + miCliente.getGenero()+ ","
                    + "'" + miCliente.getTelefono()+ "',"
                    + "'" + miCliente.getCelular()+ "',"
                    + "'" + miCliente.getPais()+ "',"
                    + "'" + miCliente.getDepartamento()+ "',"
                    + "'" + miCliente.getCiudad()+ "',"
                    + "'" + miCliente.getDireccion()+ "',"
		    + "'" + miCliente.getOcupacion()+ "',"
	            + "'" + miCliente.getEmpresa()+ "',"
                    + "'" + miCliente.getCorreo()+ "')";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void updateCliente(Clientes miCliente) {
        try {
            String sql = "update tbl_cliente set "
                    
                    + " nombre = '"+ miCliente.getNombre()+ "',"
                    + " apellido = '"+ miCliente.getApellido()+ "',"
                    + " fecha_Nacimiento = '"+ miCliente.getFecha_Nacimiento()+ "',"
                    + " genero = "+ miCliente.getGenero()+ ","
                    + " telefono = '"+ miCliente.getTelefono()+ "',"
                    + " celular = '"+ miCliente.getCelular()+ "',"
                    + " pais = '"+ miCliente.getPais()+ "',"
                    + " departamento = '"+ miCliente.getDepartamento()+ "',"
                    + " ciudad = '"+ miCliente.getCiudad()+ "',"
                    + " direccion = '"+ miCliente.getDireccion()+ "',"
		    + " ocupacion = '"+ miCliente.getOcupacion()+ "',"
		    + " empresa = '"+ miCliente.getEmpresa()+ "',"
                    + " correo = '"+ miCliente.getCorreo()+ "'"
                    + " where id_Cliente = '" + miCliente.getId_Cliente()+ "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void deleteCliente(String id_Cliente) {
        try {
            String sql = "delete from tbl_cliente where "
                    + " id_Cliente = '" + id_Cliente + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getClientes() {
        try {
            Clientes miCliente = null;
            String sql = "select * from tbl_cliente";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
       //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    
    public Vehiculos getVehiculo(String id_Vehiculo) {
        try {
            Vehiculos miVehiculo = null;
            String sql = "select * from tbl_vehiculo where "
                    + " id_Vehiculo = '" + id_Vehiculo + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                miVehiculo = new Vehiculos(
                        rs.getString("id_Vehiculo"),
                        rs.getString("id_Cliente"),
                        rs.getString("tipo_Vehiculo"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("fecha_Matricula"),
                        rs.getString("fecha_Ult_Ser"),
                        rs.getString("combustible"),
                        rs.getString("kilometraje"),
                        rs.getString("historial_Vehiculo"),
                        rs.getString("datos_Vehiculo"));

            }

            return miVehiculo;
} catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void newVehiculo(Vehiculos miVehiculo) {
        try {
            String sql = "insert into tbl_vehiculo "
                    + "values("
                    + "'" + miVehiculo.getId_Vehiculo()+ "'," 
                    + "'" + miVehiculo.getId_Cliente()+ "',"
                    + "'" + miVehiculo.getTipo_Vehiculo()+ "',"
                    + "'" + miVehiculo.getMarca()+ "',"
                    + "'" + miVehiculo.getModelo()+ "',"
                    + "'" + miVehiculo.getFecha_Matricula()+ "',"
                    + "'" + miVehiculo.getFecha_Ult_Ser()+ "',"
                    + "'" + miVehiculo.getCombustible()+ "',"
                    + "'" + miVehiculo.getKilometraje()+ "',"
                    + "'" + miVehiculo.getHistorial_Vehiculo()+ "',"
                    + "'" + miVehiculo.getDatos_Vehiculo()+"')";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void updateVehiculo(Vehiculos mivehiculo) {
        try {
            String sql = "update tbl_vehiculo set "
                    
                    + " id_Cliente= '"+ mivehiculo.getId_Cliente()+ "',"
                    + " tipo_Vehiculo = '"+ mivehiculo.getTipo_Vehiculo()+ "',"
                    + " marca = '"+ mivehiculo.getMarca()+ "',"
                    + " modelo = '"+ mivehiculo.getModelo()+ "',"
                    + " fecha_Matricula = '"+ mivehiculo.getFecha_Matricula()+ "',"
                    + " fecha_Ult_Ser = '"+ mivehiculo.getFecha_Ult_Ser()+ "',"
                    + " combustible = '"+ mivehiculo.getCombustible()+ "',"
                    + " kilometraje = '"+ mivehiculo.getKilometraje()+ "',"
                    + " historial_Vehiculo = '"+ mivehiculo.getHistorial_Vehiculo()+ "',"
                    + " datos_Vehiculo = '"+ mivehiculo.getDatos_Vehiculo()+ "'"
                    + " where id_Vehiculo = '" + mivehiculo.getId_Vehiculo()+ "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void deleteVehiculo(String id_Vehiculo) {
        try {
            String sql = "delete from tbl_vehiculo where "
                    + " id_Vehiculo = '" + id_Vehiculo + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getVehiculos() {
        try {
            Vehiculos miVehiculo = null;
            String sql = "select * from tbl_vehiculo";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
           //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public Detalle_Sers getDetalle_ser(String id_Detalle) {
        try {
            Detalle_Sers miDetalle_ser = null;
            String sql = "select * from tbl_detalle_ser where "
                    + " id_Detalle = '" + id_Detalle+ "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                miDetalle_ser = new Detalle_Sers(
                        rs.getString("id_Detalle"),
                        rs.getString("id_Servicio"),
                        rs.getString("id_Vehiculo"),
                        rs.getString("id_Cliente"),
                        rs.getString("id_Empleado"),
                        rs.getString("tipo_Servicio"),
                        rs.getString("fecha_Inicio"),
                        rs.getString("fecha_Fin"),
                        rs.getString("articulos"),
                        rs.getString("datos_Vehiculo"),
                        rs.getString("datos_Servicio"),
			rs.getString("costo_Art"),
                        rs.getString("costo_Servicio"));
            }

            return miDetalle_ser;
} catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void newDetalle_ser(Detalle_Sers miDetalle_ser) {
        try {
            String sql = "insert into tbl_detalle_ser "
                    + "values("
                    + "'" + miDetalle_ser.getId_Detalle()+ "'," 
                    + "'" + miDetalle_ser.getId_Servicio()+ "',"
                    + "'" + miDetalle_ser.getId_Vehiculo()+ "',"
                    + "'" + miDetalle_ser.getId_Cliente()+ "',"
                    + "'" + miDetalle_ser.getId_Empleado()+ "',"
                    + "'" + miDetalle_ser.getTipo_Servicio()+ "',"
                    + "'" + miDetalle_ser.getFecha_Inicio()+ "',"
                    + "'" + miDetalle_ser.getFecha_Fin()+ "',"
                    + "'" + miDetalle_ser.getArticulos()+ "',"
                    + "'" + miDetalle_ser.getDatos_Vehiculo()+ "',"
                    + "'" + miDetalle_ser.getDatos_Servicio()+ "',"
		    + "'" + miDetalle_ser.getCosto_Art()+ "',"
	            + "'" + miDetalle_ser.getCosto_Servicio()+ "')";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void updateDetalle_ser(Detalle_Sers miDetalle_ser) {
        try {
            String sql = "update tbl_detalle_ser "
                    
                  
                    + " id_Servicio = '"+ miDetalle_ser.getId_Servicio()+ "',"
                    + " id_Vehiculo = '"+ miDetalle_ser.getId_Vehiculo()+ "',"
                    + " id_Cliente = '"+ miDetalle_ser.getId_Cliente()+ "',"
                    + " id_Empleado = '"+ miDetalle_ser.getId_Empleado()+ "',"
                    + " tipo_Servicio = '"+ miDetalle_ser.getTipo_Servicio()+ "',"
                    + " fecha_Inicio = '"+ miDetalle_ser.getFecha_Inicio()+ "',"
                    + " fecha_Fin = '"+ miDetalle_ser.getFecha_Fin()+ "',"
                    + " articulos = '"+ miDetalle_ser.getArticulos()+ "',"
                    + " datos_Vehiculo= '"+ miDetalle_ser.getDatos_Vehiculo()+ "',"
		    + " datos_Servicio = '"+ miDetalle_ser.getDatos_Servicio()+ "',"
		    + " costo_Art = '"+ miDetalle_ser.getCosto_Art()+ "',"
                    + " costo_Servicio= '"+ miDetalle_ser.getCosto_Servicio()+ "'"
                    + " where id_Detalle = '" + miDetalle_ser.getId_Detalle()+ "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void deleteDetalle_ser(String id_Detalle ) {
        try {
            String sql = "delete from tbl_detalle_ser where "
                    + " id_Detalle = '" + id_Detalle + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getDetalle_ser() {
        try {
            Detalle_Sers miDetalle_ser = null;
            String sql = "select * from tbl_detalle_ser";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }


    
}

