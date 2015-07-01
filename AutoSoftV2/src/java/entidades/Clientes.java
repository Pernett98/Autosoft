package entidades;

/**
 *Esta clase define los objetos tanto enteros como de tipo cadena que forman 
 *parte del formulario Clientes
 *@author Diego Arango
 *@version Autosoft 1.0
 *
 */

public class Clientes {

    private String id_Cliente;
    private String nombre;
    private String apellido;
    private String fecha_Nacimiento;
    private int genero;
    private String telefono;
    private String celular;
    private String pais;
    private String departamento;
    private String ciudad;
    private String direccion;
    private String ocupacion;
    private String empresa;
    private String correo;

    /**
     * 
     * En este costructor se le asigna el mismo valor de los parametros a las variables
     * @param id_Cliente recibe el id_Cliente de tipo String
     * @param nombre recibe el nombre del cliente de tipo String
     * @param apellido recibe el apellido del cliente de tipo String
     * @param fecha_Nacimiento recibe la fecha de nacimiento de tipo String
     * @param genero recibe el genero del cliente de tipo entero
     * @param telefono recibe el telefono del cliente de tipo String
     * @param celular recibe el celular del cliente de tipo String
     * @param pais recibe el pais donde reside el cliente de tipo String
     * @param departamento recibe el departamento donde reside el cliente de tipo String 
     * @param ciudad recibe la ciudad donde reside el cliente de tipo String
     * @param direccion recibe la direccion de la empresa o donde vive el cliente de tipo String
     * @param ocupacion recibe la ocupacion del cliente
     * @param empresa recibe el nombre de la empresa del clientes
     * @param correo recibe el correo electronico del cliente
     */
    public Clientes(String id_Cliente, String nombre, String apellido, String fecha_Nacimiento, int genero, String telefono, String celular, String pais, String departamento, String ciudad, String direccion, String ocupacion, String empresa, String correo) {
        this.id_Cliente = id_Cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.genero = genero;
        this.telefono = telefono;
        this.celular = celular;
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.empresa = empresa;
        this.correo = correo;
    }
    
    /**
     * 
     * La variable id_Cliente contiene lo que va a ser la identificacion del cliente
     * @return devuelve el id_Cliente de tipo String
     * 
     */

    public String getId_Cliente() {
        return id_Cliente;
    }

    /**
     * 
     * La variable id_Cliente contendra lo que va a ser la identificacion del cliente
     * @param id_Cliente recibe el id_Cliente de tipo String
     */
    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    /**
     * 
     * La variable nombre contendra el nombre del cliente
     * @return devuelve el nombre de tipo String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * La variable nombre contendra el nombre del cliente
     * @param nombre recibe el nombre del cliente de tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * La variable apellido contendra el apellido del cliente
     * @return devuelve el apellido del cliente
     */

    public String getApellido() {
        return apellido;
    }

    /**
     * 
     * La variable apellido contendra el apellido del cliente
     * @param apellido recibe el apellido de tipo String
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * 
     * La variable fecha_Nacimiento contendra la fecha de nacimiento del cliente
     * @return devuelve la fecha de nacimiento del cliente
     */

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }
    
    /**
     * 
     * La variable fecha_Nacimiento contendra la fecha de nacimiento del cliente
     * @param fecha_Nacimiento recibe la fecha de nacimiento del cliente
     */

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    /**
     * 
     * La variable genero contendra el genero del cliente, masculino o femenino
     * @return devuelve el genero del cliente
     */
    public int getGenero() {
        return genero;
    }

    /**
     * 
     * La variable genero contendra el genero del cliente, masculino o femenino
     * @param genero recibe el genero de tipo entero
     */
    public void setGenero(int genero) {
        this.genero = genero;
    }

    /**
     * 
     * La variable telefono contendra el telefono del cliente 
     * @return devuelve el telefono de tipo String
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * 
     * L avariable telefono contendra el telefono del cliente
     * @param telefono recibe el telefono de tipo String
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * La variable celular contendra el numero celular del cliente
     * @return devuelve el celular de tipo String
     */
    public String getCelular() {
        return celular;
    }

    /**
     * 
     * La variable celular contendra el numero celular del cliente 
     * @param celular recibe el numero celular de tipo String
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * 
     * La variable pais contendra el pais donde vive el cliente
     * @return devuelve el pais donde vive el cliente de tipo String
     */
    public String getPais() {
        return pais;
    }

    /**
     * 
     * La variable pais contendra el pais donde vive el cliente
     * @param pais recibe el pais donde vive el cliente de tipo String
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * 
     * La variable departamento contendra el departamento en donde vive el cliente
     * @return devuelve el departamento de tipo String
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * 
     * La variable departamento contendra el departamento en donde vive el cliente
     * @param departamento recibe el departamento de tipo String
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * 
     * La variable ciudad contendra la ciudad donde vive el cliente
     * @return devuelve la ciudad de tipo String
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * 
     * La variable ciudad contendra la ciudad donde vive el cliente 
     * @param ciudad recibe la ciudad de tipo String
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * 
     * La variable direccion muestra la direccion de la vivienda del cliente
     * @return devuelve la direccion de tipo String
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     * La variable direccion muestra la direccion de la vivienda del cliente
     * @param direccion recibe la direccion del cliente de tipo String
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * La variable ocupacion muestra la ocupacion del cliente
     * @return devuelve la ocupacion del cliente de tipo String
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * 
     * La variable ocupacion muestra la ocupacion del cliente
     * @param ocupacion recibe la ocupacion del cliente
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * 
     * La variable empresa contendra el nombre de la empresa donde trabaja el cliente
     * @return devuelve el nombre de la empresa de tipo String
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * 
     * La variable empresa contendra el nombre de la empesa donde trabaja el cliente
     * @param empresa recibe el nombre de la empresa de tipo String
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * 
     * La variable correo contendra la direccion de correo electronico del cliente
     * @return devuelve el correo del cliente de tipo String
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * 
     * La variable correo contendra la direccion de correo electronico del cliente
     * @param correo recibe el correo del cliente de tipo String
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    
}
