package entidades;
/**
 *Esta clase define los objetos tanto enteros como de tipo cadena que forman 
 *parte del formulario Empleados
 *@author Diego Arango
 *@version Autosoft 1.0
 *
 */

public class Empleados {
    private String id_Empleado;
    private int cargo;
    private String nombre;
    private String apellido;
    private String fecha_Nacimiento;
    private int genero;
    private int estado_Civil;
    private String telefono;
    private String celular;
    private String pais;
    private String departamento;
    private String ciudad;
    private String direccion;
    private String correo;

    /**
     * En este constructor  se asignan el mismo valor de los parametros a las variables
     * @param id_Empleado Recibe  id_Empleado de tipo cadena
     * @param cargo Recibe  cargo de tipo entero
     * @param nombre Recibe  nombre de tipo cadena
     * @param apellido Recibe  apellido de tipo cadena
     * @param fecha_Nacimiento Recibe  fecha_Nacimiento de tipo cadena
     * @param genero Recibe  genero de tipo entero
     * @param estado_Civil Recibe estado_Civil de tipo entero
     * @param telefono Recibe  telefono de tipo cadena
     * @param celular Recibe  celular de tipo cadena
     * @param pais Recibe  pais de tipo cadena
     * @param departamento Recibe departamento  de tipo cadena
     * @param ciudad Recibe  ciudad  de tipo cadena
     * @param direccion Recibe direccion de tipo cadena
     * @param correo Recibe  correo de tipo cadena
     */
    public Empleados(String id_Empleado, int cargo, String nombre, String apellido, String fecha_Nacimiento, int genero, int estado_Civil, String telefono, String celular, String pais, String departamento, String ciudad, String direccion, String correo) {
        this.id_Empleado = id_Empleado;
        this.cargo = cargo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.genero = genero;
        this.estado_Civil = estado_Civil;
        this.telefono = telefono;
        this.celular = celular;
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.correo = correo;
    }//Cierre del constructor 
    
    /**
     * La variable id_Empleado Contiene  lo que va ser la identificación del empleado 
     * @return Devuelve id_Empleado de tipo cadena 
     * 
     */

    public String getId_Empleado() {
        return id_Empleado;
    }//Cierre del método 
    
    /**
     * La variable id_Empleado Contendrá  lo que va ser la identificación del empleado
     * @param id_Empleado Recibe id_Empleado de tipo cadena  
     */

    public void setId_Empleado(String id_Empleado) {
        this.id_Empleado = id_Empleado;
    }//Cierre del método 
    
    
/**
 * La variable cargo Contiene  lo que va ser el cargo del empleado 
 * @return Devuelve  cargo de tipo entero
 */
    public int getCargo() {
        return cargo;
    }//Cierre del método 

    /**
     * La variable cargo Contendrá   lo que va ser el cargo del empleado 
     * @param cargo Recibe  cargo de tipo entero
     */
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }//Cierre del método 
    
    /**
     * La variable nombre contiene lo que va ser el nombre del empleado
     * @return Devuelve nombre de tipo cadena
     */

    public String getNombre() {
        return nombre;
    }//Cierre del método 
    
    /**
     * La variable nombre Contendrá lo que va ser el nombre del empleado
     * @param nombre  Recibe nombre de tipo cadena
     */
        
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Cierre del método 
    
    /**
     * La variable apellido Contiene lo que va ser el apellido del empleado
     * @return Muestra apellido de tipo cadena
     */

    public String getApellido() {
        return apellido;
    }//Cierre del método 

    
    /**
     * La variable apellido Contendrá  lo que va ser el apellido del empleado
     * @param apellido  Recibe apellido de tipo cadena
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }//Cierre del método 
    
    /**
     * La variable fecha_Nacimiento Contiene  lo que va ser la fecha de nacimiento del empleado
     * @return Devuelve fecha_Nacimiento de tipo cadena
     */

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }//Cierre del método 
    
    /**
     * La variable fecha_Nacimiento Contendrá   lo que va ser la fecha de nacimiento del empleado
     * @param fecha_Nacimiento  Recibe fecha_Nacimiento de tipo cadena
     */

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }//Cierre del método 
    
/**
 * La variable genero Contiene  lo que va ser el genero del  empleado
 * @return Devuelve  genero de tipo entero
 */
    public int getGenero() {
        return genero;
    }//Cierre del método 
    
    /**
     * La variable genero Contendrá  lo que va ser el genero del  empleado
     * @param genero Recibe genero de tipo entero
     */

    public void setGenero(int genero) {
        this.genero = genero;
    }//Cierre del método 

    /**
     * La variable estado_Civil Contiene lo que va ser el estado civil del  empleado
     * @return Devuelve estado_Civil de tipo  entero 
     */
    public int getEstado_Civil() {
        return estado_Civil;
    }//Cierre del método 
    
    /**
     * La variable estado_Civil Contendrá  lo que va ser el estado civil del  empleado
     * @param estado_Civil Recibe estado_Civil de tipo  entero 
     */

    public void setEstado_Civil(int estado_Civil) {
        this.estado_Civil = estado_Civil;
    }//Cierre del método 
    
    /**
     * La variable telefono Contiene  lo que va ser el # telefono del  empleado
     * @return Devuelve telefono de tipo cadena
     */

    public String getTelefono() {
        return telefono;
    }//Cierre del método 

    /**
     * La variable telefono Contendrá  lo que va ser el # telefono del  empleado
     * @param telefono Recibe telefono de tipo cadena
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }//Cierre del método 
    
    /**
     * La variable celular Contiene lo que va ser el # de celular del  empleado
     * @return Devuelve celular de tipo cadena
     */

    public String getCelular() {
        return celular;
    }///Cierre del método  
    
    /**
     * La variable celular Contendrá lo que va ser el # de celular del  empleado
     * @param celular Recibe  celular de tipo cadena
     */

    public void setCelular(String celular) {
        this.celular = celular;
    }//Cierre del método 
    
    /**
     * La variable pais Contiene lo que va ser el país  del  empleado
     * @return Devuelve Pais de tipo cadena
     */

    public String getPais() {
        return pais;
    }//Cierre del método 
    
    /**
     * La variable pais Contendrá lo que va ser el país  del  empleado
     * @param pais Recibe Pais de tipo cadena
     */

    public void setPais(String pais) {
        this.pais = pais;
    }//Cierre del método 
    
    /**
     * La variable departamento Contiene lo que va ser el departamento  del  empleado
     * @return Devuelve  departamento de tipo cadena
     */

    public String getDepartamento() {
        return departamento;
    }//Cierre del método 
    
    /**
     * La variable departamento Contendrálo que va ser el departamento  del  empleado
     * @param departamento Recibe departamento de tipo cadena 
     */

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }//Cierre del método 
    
    /**
     * La variable ciudad Contiene lo que va ser la ciudad  del  empleado
     * @return Devuelve  Ciudad de tipo cadena  
     */

    public String getCiudad() {
        return ciudad;
    }//Cierre del método 
    
 /**
  * La variable ciudad Contendrá lo que va ser la ciudad  del  empleado
  * @param ciudad Recibe Ciudad de tipo cadena  
  */

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }//Cierre del método 
    
    /**
     * La variable direccion Contiene lo que va ser la dirección del  empleado
     * @return Devuelve direccion de tipo cadena
     */

    public String getDireccion() {
        return direccion;
    }//Cierre del método 
    
    /**
     * La variable direccion Contendrá lo que va ser la dirección del  empleado
     * @param direccion Recibe direccion de tipo cadena
     */

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }//Cierre del método 
    
    /**
     * La variable correo Contiene lo que va ser el correo electronico del  empleado
     * @return Recibe  correo de tipo cadena
     */

    public String getCorreo() {
        return correo;
    }//Cierre del método 
    
    /**
     * La variable correo Contendrá lo que va ser el correo electronico del  empleado
     * @param correo Recibe correo de tipo cadena
     */

    public void setCorreo(String correo) {
        this.correo = correo;
    }//Cierre del método 

     
    
    
}//Cierre de la clase 
