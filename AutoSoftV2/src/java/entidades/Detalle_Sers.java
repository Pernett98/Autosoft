
package entidades;

public class Detalle_Sers {
    /**
     * @author: Santiago Morales
     * @author: Juan Diego Arango
     * @creationDate: 27 Octubre del 2014
     * @version: Autosoft 1.0
     * 
     */
    
    public String id_Detalle;
    /**
     * @name: id_Detalle
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el id del detalle del servicio
     * 
     */
    
    public String id_Servicio;
     /**
     * @name: id_Servicio
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el id del servicio
     * 
     */
    
    public String id_Vehiculo;
     /**
     * @name: id_Vehiculo
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el id del vehiculo
     * 
     */
    
    public String id_Cliente;
     /**
     * @name: id_Cliente
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el id del cliente
     * 
     */
    
    public String id_Empleado;
     /**
     * @name: id_Empleado
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el id del empleado
     * 
     */
    
    public String tipo_Servicio;
     /**
     * @name: tipo_Servicio
     * @tyow: String
     * @function: Contiene un dato de tipo cadena, con el tipo de servicio que se esta prestando
     * 
     */
    
    public String fecha_Inicio;
     /**
     * @name: fecha_inicio
     * @type: String 
     * @function: Contiene un dato de tipo cadena, con la fecha de inicio del servicio
     * 
     */
    
    public String fecha_Fin;
     /**
     * @name: fecha_Fin
     * @type: String
     * @function: Contiene un dato de tipo cadena, con la fecha de terminacion del servicio
     * 
     */
    
    public String articulos;
     /**
     * @name: articulos
     * @type: String
     * @function: Contiene un dato de tipo cadena, con los articulos instalados en el vehiculo
     * 
     */
    
    public String datos_Vehiculo;
     /**
     * @name: datos_Vehiculo
     * @type: String
     * @function: Contiene un dato de tipo cadena, con datos acerca del vehiculo
     * 
     */
    public String datos_Servicio;
     /**
     * @name: datos_Servicio
     * @type: String
     * @function: Contiene un dato de tipo cadena, con los datos acerca del servicio 
     * 
     */
    
    public String costo_Art;
     /**
     * @name: costo_Art
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el costo de los articulos instalados en el vehiculo
     * 
     */
    
    public String costo_Servicio;
    /**
     * @name: costo_Servicio
     * @type: String
     * @function: Contiene un dato de tipo cadena, con el costo total del servicio
     * 
     * 
     * Se establecen como parametros todas las variables
     * @param id_Detalle
     * @param id_Servicio
     * @param id_Vehiculo
     * @param id_Cliente
     * @param id_Empleado
     * @param tipo_Servicio
     * @param fecha_Inicio
     * @param fecha_Fin
     * @param articulos
     * @param datos_Vehiculo
     * @param datos_Servicio
     * @param costo_Art
     * @param costo_Servicio 
     */
    public Detalle_Sers (String id_Detalle, String id_Servicio, String id_Vehiculo, String id_Cliente, String id_Empleado, String tipo_Servicio, String fecha_Inicio, String fecha_Fin, String articulos, String datos_Vehiculo, String datos_Servicio, String costo_Art, String costo_Servicio){
    this.id_Detalle = id_Detalle;
    this.id_Servicio = id_Servicio;
    this.id_Vehiculo = id_Vehiculo;
    this.id_Cliente = id_Cliente;
    this.id_Empleado = id_Empleado;
    this.tipo_Servicio = tipo_Servicio;
    this.fecha_Inicio = fecha_Inicio;
    this.fecha_Fin = fecha_Fin;
    this.articulos = articulos;
    this.datos_Vehiculo = datos_Vehiculo;
    this.datos_Servicio = datos_Servicio;
    this.costo_Art = costo_Art;
    this.costo_Servicio = costo_Servicio;
    }

    /**
     * @name: getId_Detalle
     * @type: String
     * @function: Obtiene los datos asignados a id_Detalle y los retorna
     * @return 
     */
    public String getId_Detalle() {
        return id_Detalle;
    }

    /**
     * @name: setId_Detalle 
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getId_Detalle
     * @param id_Detalle 
     */
    public void setId_Detalle(String id_Detalle) {
        this.id_Detalle = id_Detalle;
    }

    /**
     * @name: getId_Servicio
     * @type: String
     * @function: Obtiene los datos asignados en id_Servicio y los retorna
     * @return 
     */
    public String getId_Servicio() {
        return id_Servicio;
    }

    /**
     * @name: setId_Servicio
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getId_Servicio
     * @param id_Servicio 
     */
    public void setId_Servicio(String id_Servicio) {
        this.id_Servicio = id_Servicio;
    }

    /**
     * @name: getId_Vehiculo
     * @type: String
     * @function: Obtiene los datos asignados para id_Vehiculo y los retorna
     * @return 
     */
    public String getId_Vehiculo() {
        return id_Vehiculo;
    }

    /**
     * @name: setId_Vehiculo
     * @type: Sring
     * @function: Establece como parametros los datos obtenidos en getId_Vehiculo
     * @param id_Vehiculo 
     */
    public void setId_Vehiculo(String id_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
    }

    /**
     * @name: getId_Cliente
     * @type: String
     * @function: Obtiene los datos aignados para id_Cliente y los retorna
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
     * @name: getId_Empleado
     * @type: String
     * @function: Obtiene los datos que han sido asignados en id_Empleado y los retorna
     * @return 
     */
    public String getId_Empleado() {
        return id_Empleado;
    }

    /**
     * @name: setId_Empleado
     * @type: String
     * @function: Establece como parametro los datos que han sido obtenidos en getId_Empleado
     * @param id_Empleado 
     */
    public void setId_Empleado(String id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    /**
     * @name: getTipo_Servicio
     * @type: String
     * @function: Obtiene los datos que han sido asignados para tipo_Servicio y los retorna 
     * @return 
     */
    public String getTipo_Servicio() {
        return tipo_Servicio;
    }

    /**
     * @name: setTipo_Servicio
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getTipo_servicio
     * @param tipo_Servicio 
     */
    public void setTipo_Servicio(String tipo_Servicio) {
        this.tipo_Servicio = tipo_Servicio;
    }

    /**
     * @name: getFecha_Inicio
     * @type: String
     * @function: Obtiene los datos asignados para fecha_Inicio y los retorna
     * @return 
     */
    public String getFecha_Inicio() {
        return fecha_Inicio;
    }

    /**
     * @name: setFecha_Inicio
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getFecha_Inicio
     * @param fecha_Inicio 
     */
    public void setFecha_Inicio(String fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    /**
     * @name: getFecha_Fin
     * @type: String
     * @function: Obtiene los datos asignados en gecha_Fin y los retorna 
     * @return 
     */
    public String getFecha_Fin() {
        return fecha_Fin;
    }

    /**
     * @name: setFecha_Fin
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getFecha_Fin
     * @param fecha_Fin 
     */
    public void setFecha_Fin(String fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }

    /**
     * @name: getArticulos
     * @type: String
     * @function: Obtiene los datos asignados para articulos y los retorna
     * @return 
     */
    public String getArticulos() {
        return articulos;
    }

    /**
     * @name: setArticulos
     * @type: String
     * @function: Establece como parametros los datos obtenidos en getArticulos
     * @param articulos 
     */
    public void setArticulos(String articulos) {
        this.articulos = articulos;
    }

    /**
     * @name: getDatos_Vehiculo
     * @type: String
     * @function: Obtiene los datos asginados para datos_Vehiculo y los retorna  
     * @return 
     */
    public String getDatos_Vehiculo() {
        return datos_Vehiculo;
    }

    /**
     * @name: setDatos_Vehiculo
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getDatos_Vehiculo
     * @param datos_Vehiculo 
     */
    public void setDatos_Vehiculo(String datos_Vehiculo) {
        this.datos_Vehiculo = datos_Vehiculo;
    }

    /**
     * @name: getDatos_Servicio
     * @type: String
     * @function: Obtiene los datos asignados para datos_Servicio y los retorna
     * @return 
     */
    public String getDatos_Servicio() {
        return datos_Servicio;
    }

    /**
     * @name: setDatos_Servicio
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getDatos_Servicio
     * @param datos_Servicio 
     */
    public void setDatos_Servicio(String datos_Servicio) {
        this.datos_Servicio = datos_Servicio;
    }

    /**
     * @name: getCosto_Art
     * @type: String
     * @function: Obtiene los datos asignados en costo_Art y los retorna
     * @return 
     */
    public String getCosto_Art() {
        return costo_Art;
    }

    /**
     * @name: setCosto_Art
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getCosto_Art
     * @param costo_Art 
     */
    public void setCosto_Art(String costo_Art) {
        this.costo_Art = costo_Art;
    }

    /**
     * @name: getCosto_Servicio
     * @type: String
     * @function: Obtiene los datos asignados para costo_Servicio y los retorna
     * @return 
     */
    public String getCosto_Servicio() {
        return costo_Servicio;
    }

    /**
     * @name: setCosto_Servicio
     * @type: String
     * @function: Establece como parametro los datos obtenidos en getCosto_Servicio
     * @param costo_Servicio 
     */
    public void setCosto_Servicio(String costo_Servicio) {
        this.costo_Servicio = costo_Servicio;
    }
    
    
    
}
