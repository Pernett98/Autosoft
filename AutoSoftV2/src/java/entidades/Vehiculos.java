package entidades;

/**
 * Esta clase define los objetos tanto enteros como de tipo cadena que forman
 * parte del formulario vehiculos
 *
 * @author Diego Arango
 * @version Autosoft 1.0
 *
 */

public class Vehiculos {

    private String id_Vehiculo;
    private String id_Cliente;
    private String tipo_Vehiculo;
    private String marca;
    private String modelo;
    private String fecha_Matricula;
    private String fecha_Ult_Ser;
    private String combustible;
    private String kilometraje;
    private String historial_Vehiculo;
    private String datos_Vehiculo;

    public Vehiculos(String id_Vehiculo, String id_Cliente, String tipo_Vehiculo, String marca, String modelo, String fecha_Matricula, String fecha_Ult_Ser, String combustible, String kilometraje, String historial_Vehiculo, String datos_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
        this.id_Cliente = id_Cliente;
        this.tipo_Vehiculo = tipo_Vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.fecha_Matricula = fecha_Matricula;
        this.fecha_Ult_Ser = fecha_Ult_Ser;
        this.combustible = combustible;
        this.kilometraje = kilometraje;
        this.historial_Vehiculo = historial_Vehiculo;
        this.datos_Vehiculo = datos_Vehiculo;
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
     * La variable tipo_Vehiculo Contiene lo que va ser el tipo de vehiculo
     *
     * @return Devuelve tipo_Vehiculo de tipo cadena
     */
    public String getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }

    /**
     * La variable tipo_Vehiculo Contendrá lo que va ser el tipo del vehiculo
     *
     * @param tipo_Vehiculo Recibe tipo_Vehiculo de tipo cadena
     */
    public void setTipo_Vehiculo(String tipo_Vehiculo) {
        this.tipo_Vehiculo = tipo_Vehiculo;
    }

    /**
     * La variable marca Contiene lo que va ser la marca del vehiculo
     *
     * @return Devuelve marca de tipo cadena
     */
    public String getMarca() {
        return marca;
    }

    /**
     * La variable marca Contendrá lo que va ser la marca del vehiculo
     *
     * @param marca Recibe marca de tipo cadena
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * La variable modelo Contiene lo que va ser el modelo del vehiculo
     *
     * @return Devuelve modelo de tipo cadena
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * La variable modelo Contendrá lo que va ser el modelo del vehiculo
     *
     * @param modelo Recibe modelo de tipo cadena
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * La variable fecha_Matricula Contiene lo que va ser la fecha de Matricula
     * del vehiculo
     *
     * @return Devuelve fecha_Matricula de tipo cadena
     */
    public String getFecha_Matricula() {
        return fecha_Matricula;
    }

    /**
     * La variable fecha_Matricula Contendrá lo que va ser la fecha de Matricula
     * del vehiculo
     *
     * @param fecha_Matricula Recibe fecha_Matricula de tipo cadena
     */
    public void setFecha_Matricula(String fecha_Matricula) {
        this.fecha_Matricula = fecha_Matricula;
    }

    /**
     * La variable fecha_Ult_Ser Contiene lo que va ser la fecha del ultimo
     * servicio prestado al vehiculo
     *
     * @return Devuelve fecha_Ult_Ser de tipo cadena
     */
    public String getFecha_Ult_Ser() {
        return fecha_Ult_Ser;
    }
/**
     * La variable fecha_Ult_Ser Contendrá lo que va ser la fecha del ultimo
     * servicio prestado al vehiculo
     *
     * @param fecha_Ult_Ser Recibe fecha_Ult_Ser de tipo cadena
     */
    public void setFecha_Ult_Ser(String fecha_Ult_Ser) {
        this.fecha_Ult_Ser = fecha_Ult_Ser;
    }
/**
     * La variable combustible Contiene lo que va ser el combustible
     * del vehiculo
     *
     * @return Devuelve combustible de tipo cadena
     */
    public String getCombustible() {
        return combustible;
    }
/**
     * La variable combustible Contendrá lo que va ser el combustible
     * del vehiculo
     *
     * @param combustible Recibe combustible de tipo cadena
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
/**
     * La variable kilometraje Contiene lo que va ser el kilometraje
     * del vehiculo
     *
     * @return Devuelve kilometraje de tipo cadena
     */
    public String getKilometraje() {
        return kilometraje;
    }
/**
     * La variable kilometraje Contendrá lo que va ser el kilometraje
     * del vehiculo
     *
     * @param kilometraje Recibe kilometraje de tipo cadena
     */
    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }
/**
     * La variable historial_Vehiculo Contiene lo que va ser el historial 
     * del vehiculo
     *
     * @return Devuelve historial_Vehiculo de tipo cadena
     */
    public String getHistorial_Vehiculo() {
        return historial_Vehiculo;
    }
/**
     * La variable historial_Vehiculo Contendrá lo que va ser el historial
     * del vehiculo
     *
     * @param historial_Vehiculo Recibe historial_Vehiculo de tipo cadena
     */
    public void setHistorial_Vehiculo(String historial_Vehiculo) {
        this.historial_Vehiculo = historial_Vehiculo;
    }
/**
     * La variable datos_Vehiculo Contiene lo que va ser los datos
     * del vehiculo
     *
     * @return Devuelve datos_Vehiculo de tipo cadena
     */
    public String getDatos_Vehiculo() {
        return datos_Vehiculo;
    }
/**
     * La variable datos_Vehiculo Contendrá lo que va ser los datos
     * del vehiculo
     *
     * @param datos_Vehiculo Recibe datos_Vehiculo de tipo cadena
     */
    public void setDatos_Vehiculo(String datos_Vehiculo) {
        this.datos_Vehiculo = datos_Vehiculo;
    }

}
