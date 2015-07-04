package entidades;

/**
 * Esta clase define los objetos tanto enteros como de tipo cadena que forman
 * parte del formulario Servicios
 *
 * @author Diego Arango
 * @version Autosoft 1.0
 *
 */

public class Servicios {

    private String id_Servicio;
    private String id_Vehiculo;
    private String id_Cliente;
    private String id_Empleado;
    private int estado;
    private String fecha_Inicio;
    private String fecha_Fin;
/**
     * En este constructor  se asignan el mismo valor de los parametros a las variables
     * @param id_Servicio Recibe  id_Servicio de tipo cadena
     * @param id_Vehiculo Recibe  id_Vehiculo de tipo entero
     * @param id_Cliente Recibe id_Cliente de tipo cadena
     * @param id_Empleado Recibe id_Empleado de tipo cadena
     * @param estado Recibe  estado de tipo entero
     * @param fecha_Inicio Recibe  fecha_Inicio de tipo cadena
     * @param fecha_Fin Recibe fecha_Fin de tipo cadena
      */
    public Servicios(String id_Servicio, String id_Vehiculo, String id_Cliente, String id_Empleado, int estado, String fecha_Inicio, String fecha_Fin) {
        this.id_Servicio = id_Servicio;
        this.id_Vehiculo = id_Vehiculo;
        this.id_Cliente = id_Cliente;
        this.id_Empleado = id_Empleado;
        this.estado = estado;
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Fin = fecha_Fin;
    }

    /**
     * La variable Id_Servicio Contiene lo que va ser la identificación del
     * servicio
     *
     * @return Devuelve id_Servicio de tipo cadena
     */
    public String getId_Servicio() {
        return id_Servicio;
    }

    /**
     * La variable id_Empleado Contendrá lo que va ser la identificación del
     * empleado
     *
     * @param id_Servicio Recibe id_Empleado de tipo cadena
     */

    public void setId_Servicio(String id_Servicio) {
        this.id_Servicio = id_Servicio;
    }

    /**
     * La variable Id_Vehiculo Contiene lo que va ser la identificación del
     * vehiculo
     *
     * @return Devuelve Id_Vehiculo de tipo cadena
     */

    public String getId_Vehiculo() {
        return id_Vehiculo;
    }

    /**
     * La variable id_Vehiculo Contendrá lo que va ser la identificación del
     * vehiculo
     *
     * @param id_Vehiculo Recibe id_Vehiculo de tipo cadena
     */

    public void setId_Vehiculo(String id_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
    }

    /**
     * La variable id_Cliente Contiene lo que va ser la identificación del
     * cliente
     *
     * @return Devuelve id_Cliente de tipo cadena
     */
    public String getId_Cliente() {
        return id_Cliente;
    }

    /**
     * La variable id_Cliente Contendrá lo que va ser la identificación del
     * cliente
     *
     * @param id_Cliente Recibe id_Cliente de tipo cadena
     */

    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    /**
     * La variable id_Empleado Contiene lo que va ser la identificación del
     * empleado
     *
     * @return Devuelve id_Empleado de tipo cadena
     */
    public String getId_Empleado() {
        return id_Empleado;
    }

    /**
     * La variable id_Empleado Contendrá lo que va ser la identificación del
     * empleado
     *
     * @param id_Empleado Recibe id_Empleado de tipo cadena
     */
    public void setId_Empleado(String id_Empleado) {
        this.id_Empleado = id_Empleado;
    }
/**
     * La variable estado Contiene lo que va ser el estado del
     * servicio
     *
     * @return Devuelve estado de tipo cadena
     */
    public int getEstado() {
        return estado;
    }
/**
     * La variable estado Contendrá lo que va ser el estado del
     * servicio
     *
     * @param estado Recibe estado de tipo cadena
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }
/**
     * La variable fecha_Inicio Contiene lo que va ser la fecha de inicio del 
     * servicio
     *
     * @return Devuelve fecha_Inicio de tipo cadena
     */
    public String getFecha_Inicio() {
        return fecha_Inicio;
    }
/**
     * La variable fecha_Inicio Contendrá lo que va ser la fecha de inicio del 
     * servicio
     *
     * @param fecha_Inicio Recibe fecha_Inicio de tipo cadena
     */
    public void setFecha_Inicio(String fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }
/**
     * La variable fecha_Fin Contiene lo que va ser la fecha de finalizacion del 
     * servicio
     *
     * @return Devuelve fecha_Fin de tipo cadena
     */
    public String getFecha_Fin() {
        return fecha_Fin;
    }
/**
     * La variable fecha_Fin Contendrá lo que va ser la fecha de finalizacion del 
     * servicio
     *
     * @param fecha_Fin Recibe fecha_Fin de tipo cadena
     */
    public void setFecha_Fin(String fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }

}