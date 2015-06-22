package entidades;

public class Clientes {
 /**
  * @author: Santiago Morales
  * @author: Juan Diego Arango
  * @creationDate: 27 Octubre del 2014
  * @version: Autosoft 1.0
  * 
  */
    
    private String id_Cliente;
    /**
     * @name: id_Cliente
     * @type: String
     * @function: Es un dato de tipo cadena, que contiene la identificación que usara el cliente
     * 
     */
    
    private String nombre;
    /**
     * @name: nombre
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el nombre del cliente
     * 
     */
    
    private String apellido;
    /**
     * @name: apellido
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el apellidos del cliente
     * 
     */
    
    private String fecha_Nacimiento;
    /**
     * @name: fecha_Nacimiento
     * @type: String
     * @function: Contiene un dato de tipo cadena, con la fecha de nacimiento del cliente
     * 
     */
    
    private int genero;
    /**
     * @name: genero
     * @type: int
     * @function: Contiene un dato de tipo numerico, que permite saber el genero del cliente
     * 
     */
    
    private String telefono;
    /**
     * @name: telefono
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el telefono del cliente
     * 
     */
    
    private String celular;
    /**
     * @name: celular
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el numero celular del cliente
     * 
     */
    
    private String pais;
    /**
     * @name: pais
     * @type: Stirng
     * @function: Contiene un dato de tipo cadena, con el pais en donde reside o esta ubicada la empresa del cliente
     * 
     */
    
    private String departamento;
    /**
     * @name: departamento
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el departamento donde reside o esta ubicada la empresa del cliente
     * 
     */
    
    private String ciudad;
    /**
     * @name: ciudad
     * @type: String
     * @function: Contiene un dato de tipo cadena, con la ciudad donde reside o esta ubicada la empresa del cliente
     * 
     */
    
    private String direccion;
    /**
     * @name: direccion
     * @type: String
     * @function: Contiene un dato de tipo cadena, con la direccion donde reside o esta ubicada la empresa del cliente
     * 
     */
    
    private String ocupacion;
    /**
     * @name: ocupacion
     * @type: String
     * @function: Contiene un dato de tipo cadena, con la ocupacion del cliente
     * 
     */
    
    private String empresa;
    /**
     * @name: empresa
     * @type: String
     * @function: Contiene un dato de tipo cadena, con la empresa donde trabaja el cliente
     * 
     */
    
    private String correo;
    /**
     * @name: correo
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el correo electronico del cliente
     * 
     * 
     * Se establecen como parametros todas las variables
     * @param id_Cliente
     * @param nombre
     * @param apellido
     * @param fecha_Nacimiento
     * @param genero
     * @param telefono
     * @param celular
     * @param pais
     * @param departamento
     * @param ciudad
     * @param direccion
     * @param ocupacion
     * @param empresa
     * @param correo 
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
    
    /*
    * @name: getId_Cliente
    * @type: String
    * @function: Obtiene los datos que han sido asignados para id_Cliente y luego los retorna
    * @return 
    */
    public String getId_Cliente() {
        return id_Cliente;
    }
    
    /**
     * @name: setId_Cliente
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getId_Cliente
     * @param id_Cliente 
     */
    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }
    
    /**
     * @name: getNombre
     * @type: String
     * @function: Obtiene los datos que han sido asignados para nombre y los retorna
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @name: setNombre
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getNombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @name: getApellido
     * @type: String
     * @function: Obtiene los datos que han sido asignados para apellido y los retorna
     * @return 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @name: setApellido
     * @type: String
     * @function: Establece los datos obtenidos en getApellido como parametros
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @name: getFecha_Nacimiento
     * @type: String
     * @function: Obtiene los datos que han sido asignados para fecha_Nacimiento y los retorna
     * @return 
     */
    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    /**
     * @name: setFecha_Nacimiento
     * @type: String
     * @function: Establece los datos que han sido obtenidos en getFecha_Nacimiento como parametros
     * @param fecha_Nacimiento 
     */
    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    /**
     * @name: getGenero
     * @type: int
     * @function: Obtiene los datos que han sido asignados para genero y los retorna
     * @return 
     */
    public int getGenero() {
        return genero;
    }

    /**
     * @name: setGenero
     * @type: int
     * @function: Establece los datos que han sido obtenidos en getGenero como parametros
     * @param genero 
     */
    public void setGenero(int genero) {
        this.genero = genero;
    }
    
    /**
     * @name: getTelefono
     * @type: String
     * @function: Obtener los datos asignados para telefono y retornarlos
     * @return 
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @name: setTelefono
     * @type: String
     * @function: Estableces como parametro los datos obtenidos en getTelefono
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @name: getCelular
     * @type: String
     * @function: Obtener los datos asignados para celular y retornarlos
     * @return 
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @name: setCelular
     * @type: String
     * @function: Establecer como parametros los datos obtenidos en getCelular
     * @param celular 
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @name: getPais
     * @type: String
     * @function: Obtener los datos asignados para pais y retornarlos
     * @return 
     */
    public String getPais() {
        return pais;
    }

    /**
     * @name: setPais
     * @type: String 
     * @function: Establecer como parametro los datos obtenidos en getPais
     * @param pais 
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @name: getDepartamento
     * @type: String
     * @function: Obtener los datos asignados para departamento y retornarlos
     * @return 
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @name: setDepartamento
     * @type: String
     * @function: Establecer como parametro los datos establecidos en getDepartamento
     * @param departamento 
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @name: getCiudad
     * @type: String
     * @function: Obtener los datos asignados para ciudad y retornarlos
     * @return 
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @name: setCiudad
     * @type: String
     * @function: Establecer como parametro los datos obtenidos en getCiudad
     * @param ciudad 
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @name: getDireccion
     * @type: String
     * @function: Obtener los datos asignados para direcciopn y retornarlos
     * @return 
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @name: setDireccion
     * @type: String
     * @function: Establecer como parametro los datos obtenidos en getDireccion
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @name: getOcupacion
     * @type: String
     * @function: Obtener los datos asignados para ocupacion y retornarlos
     * @return 
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * @name: setOcupacion
     * @type: String
     * @function: Establece como parametros los datos que han sido obtenidos en getOcupacion
     * @param ocupacion 
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * @name: getEmpresa
     * @type: String
     * @function: Obtiene los datos que han sifo asignados para empresa y los retorna
     * @return 
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @name: setEmpresa
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getEmpresa
     * @param empresa 
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @name: getCorreo
     * @type: String
     * @function: Obtiene los datos que han sido asignados para correo y los retorna
     * @return 
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @name: setCorreo
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getCorreo
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    
}
