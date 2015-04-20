package entidades;

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

    public String getId_Vehiculo() {
        return id_Vehiculo;
    }

    public void setId_Vehiculo(String id_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
    }

    public String getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(String tipo_Vehiculo) {
        this.tipo_Vehiculo = tipo_Vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFecha_Matricula() {
        return fecha_Matricula;
    }

    public void setFecha_Matricula(String fecha_Matricula) {
        this.fecha_Matricula = fecha_Matricula;
    }

    public String getFecha_Ult_Ser() {
        return fecha_Ult_Ser;
    }

    public void setFecha_Ult_Ser(String fecha_Ult_Ser) {
        this.fecha_Ult_Ser = fecha_Ult_Ser;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getHistorial_Vehiculo() {
        return historial_Vehiculo;
    }

    public void setHistorial_Vehiculo(String historial_Vehiculo) {
        this.historial_Vehiculo = historial_Vehiculo;
    }

    public String getDatos_Vehiculo() {
        return datos_Vehiculo;
    }

    public void setDatos_Vehiculo(String datos_Vehiculo) {
        this.datos_Vehiculo = datos_Vehiculo;
    }
    
    
}
