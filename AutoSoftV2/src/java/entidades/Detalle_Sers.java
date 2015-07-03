package entidades;

/**
 *Esta clase define los objetos tanto enteros como de tipo cadena que forman 
 *parte del formulario Detalle_Sers
 *@author Santiago Morales
 *@version Autosoft 1.0
 *
 */

public class Detalle_Sers {
    public String id_Detalle;
    public String id_Servicio;
    public String id_Vehiculo;
    public String id_Cliente;
    public String id_Empleado;
    public String tipo_Servicio;
    public String fecha_Inicio;
    public String fecha_Fin;
    public String articulos;
    public String datos_Vehiculo;
    public String datos_Servicio;
    public String costo_Art;
    public String costo_Servicio;
    
    /**
     * 
     * En este costructor se le asigna el mismo valor de los parametros a las variables
     * @param id_Detalle recibe el nombre del id_Detalle de tipo String
     * @param id_Servicio recibe el id_Servicio de tipo String
     * @param id_Vehiculo recibe el id_Vehiculo de tipo String
     * @param id_Cliente recibe el id_Cliente de tipo String
     * @param id_Empleado recibe el id_Empleado de tipo String
     * @param tipo_Servicio recibe el tipo_Servicio prestado por el taller automotriz de tipo String
     * @param fecha_Inicio recibe fecha_Inicio del servicio, de tipo String
     * @param fecha_Fin recibe fecha_Fin del servicio, de tipo String
     * @param articulos recibe articulos reemplazados en el automovil durante el servicio, de tipo String
     * @param datos_Vehiculo recibe datos_Vehiculo, de tipo String
     * @param datos_Servicio recibe datos_Servicio, de tipo String
     * @param costo_Art recibe costo_Art quiere decir el costo del articulo reemplazado en el automovil, de tipo String
     * @param costo_Servicio recibe costo_Servicio, de tipo String
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
     * 
     * La variable id_Detalle contiene lo que va a ser la identificacion del detalle del servicio
     * @return devuelve el id_Detalle de tipo String
     */
    
    public String getId_Detalle() {
        return id_Detalle;
    }

    /**
     * 
     * La variable id_Detalle contiene lo que va a ser la identificacion del detalle del servicio
     * @param id_Detalle recibe el id_Detalle de tipo String
     */
    public void setId_Detalle(String id_Detalle) {
        this.id_Detalle = id_Detalle;
    }

    /**
     * 
     * La variable id_Servicio contiene lo que va a ser la identificacion del servicio
     * @return devuelve el id_Servicio de tipo String
     */
    
    public String getId_Servicio() {
        return id_Servicio;
    }

    /**
     * 
     * La variable id_Servicio contiene lo que va a ser la identificacion del servicio
     * @param id_Servicio recibe el id_Servicio de tipo String
     */
    public void setId_Servicio(String id_Servicio) {
        this.id_Servicio = id_Servicio;
    }

    /**
     * 
     * La variable id_Vehiculo contiene lo que va a ser la identificacion del vehiculo
     * @return devuelve el id_Vehiculo de tipo String
     */
    
    public String getId_Vehiculo() {
        return id_Vehiculo;
    }

    /**
     * 
     * La variable id_Vehiculo contiene lo que va a ser la identificacion del vehiculo
     * @param id_Vehiculo recibe el id_Vehiculo de tipo String
     */
    public void setId_Vehiculo(String id_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
    }

    /**
     * 
     * La variable id_Cliente contiene lo que va a ser la identificacion del cliente
     * @return devuelve id_Cliente de tipo String
     */
    public String getId_Cliente() {
        return id_Cliente;
    }

    /**
     * 
     * La variable id_Cliente contiene lo que va a ser la identificacion del cliente
     * @param id_Cliente recibe id_Cliente de tipo String
     */
    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    /**
     * 
     * La variable id_Empleado contiene lo que va a ser la identificacion del empleado 
     * @return devuelve el id_Empleado de tipo String
     */
    public String getId_Empleado() {
        return id_Empleado;
    }

    /**
     * 
     * La variable id_Empleado contiene lo que va a ser la identificacion del empleado
     * @param id_Empleado 
     */
    public void setId_Empleado(String id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    /**
     * 
     * La variable tipo_Servicio contiene lo que va a ser el tipo de servicio prestado por el taller automotriz
     * @return devuelve el tipo_Servicio de tipo String
     */
    public String getTipo_Servicio() {
        return tipo_Servicio;
    }

    /**
     * 
     * La variable tipo_Servicio contiene lo que va a ser el tipo de servicio prestado por el taller automotriz
     * @param tipo_Servicio recibe el tipo_Servicio de tipo String
     */
    public void setTipo_Servicio(String tipo_Servicio) {
        this.tipo_Servicio = tipo_Servicio;
    }

    /**
     * 
     * La variable fecha_Inicio contiene la fecha de inicio de prestacion del servicio por el taller
     * @return devuelve la fecha_Inicio del servicio, de tipo String
     */
    public String getFecha_Inicio() {
        return fecha_Inicio;
    }

    /**
     * 
     * La variable fecha_Inicio contiene la fecha de inicio de prestacion del servicio por el taller 
     * @param fecha_Inicio recibe la fecha_Inicio del servicio, de tipo String
     */
    public void setFecha_Inicio(String fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    /**
     * 
     * La variable fecha_Fin contiene la fecha fin de la prestacion del servicio
     * @return devuelve fecha_Fin del servicio, de tipo String
     */
    public String getFecha_Fin() {
        return fecha_Fin;
    }

    /**
     * 
     * La variable fecha_Fin contiene la fecha fin de la prestacion del servicio
     * @param fecha_Fin recibe fecha_Fin del servicio, de tipo String
     */
    public void setFecha_Fin(String fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }

    /**
     * 
     * La variable articulos contiene los articulos instalados o reemplazados en el automovil
     * @return devuelve articulos, de tipo String
     */
    public String getArticulos() {
        return articulos;
    }

    /**
     * 
     * La variable articulos contiene los articulos instalados o reemplazados en el automovil 
     * @param articulos recibe articulos, de tipo String
     */
    public void setArticulos(String articulos) {
        this.articulos = articulos;
    }

    /**
     * 
     * La variable datos_Vehiculo contiene los datos importantes acerca del vehiculo al que se le esta prestando el servicio
     * @return devuelve datos_Vehiculo de tipo String
     */
    public String getDatos_Vehiculo() {
        return datos_Vehiculo;
    }

    /**
     * 
     * La variable datos_Vehiculo contiene los datos importantes acerca del vehiculo al que se le esta prestando el servicio
     * @param datos_Vehiculo recibe datos_Vehiculo de tipo String
     */
    public void setDatos_Vehiculo(String datos_Vehiculo) {
        this.datos_Vehiculo = datos_Vehiculo;
    }

    /**
     * 
     * La variable datos_Servicio contiene los datos importantes acerca del servicio que ha sido prestado
     * @return devuelve datos_Servicio de tipo String
     */
    public String getDatos_Servicio() {
        return datos_Servicio;
    }

    /**
     * 
     * La variable datos_Servicio contiene los datos importantes acerca del servicio que ha sido prestado
     * @param datos_Servicio 
     */
    public void setDatos_Servicio(String datos_Servicio) {
        this.datos_Servicio = datos_Servicio;
    }

    /**
     * 
     * La variable costo_Art contiene el costo del articulo instalado en el automovil
     * @return devuelve costo_Art de tipo String
     */
    public String getCosto_Art() {
        return costo_Art;
    }

    /**
     * 
     * La variable costo_Art contiene el costo del articulo instalado en el automovil
     * @param costo_Art recibe costo_Art de tipo String
     */
    public void setCosto_Art(String costo_Art) {
        this.costo_Art = costo_Art;
    }

    /**
     * 
     * La variable costo_Servicio contiene el valor del servicio prestado
     * @return devuelve costo_Servicio, de tipo String
     */
    public String getCosto_Servicio() {
        return costo_Servicio;
    }

    /**
     * 
     * La variable costo_Servicio contiene el valor del servicio prestado
     * @param costo_Servicio recibe el costo_Servicio de tipo String
     */
    public void setCosto_Servicio(String costo_Servicio) {
        this.costo_Servicio = costo_Servicio;
    }
    
    
    
}
