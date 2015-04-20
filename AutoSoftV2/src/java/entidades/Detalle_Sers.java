
package entidades;

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

    public String getId_Detalle() {
        return id_Detalle;
    }

    public void setId_Detalle(String id_Detalle) {
        this.id_Detalle = id_Detalle;
    }

    public String getId_Servicio() {
        return id_Servicio;
    }

    public void setId_Servicio(String id_Servicio) {
        this.id_Servicio = id_Servicio;
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

    public String getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(String id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public String getTipo_Servicio() {
        return tipo_Servicio;
    }

    public void setTipo_Servicio(String tipo_Servicio) {
        this.tipo_Servicio = tipo_Servicio;
    }

    public String getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(String fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public String getFecha_Fin() {
        return fecha_Fin;
    }

    public void setFecha_Fin(String fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }

    public String getArticulos() {
        return articulos;
    }

    public void setArticulos(String articulos) {
        this.articulos = articulos;
    }

    public String getDatos_Vehiculo() {
        return datos_Vehiculo;
    }

    public void setDatos_Vehiculo(String datos_Vehiculo) {
        this.datos_Vehiculo = datos_Vehiculo;
    }

    public String getDatos_Servicio() {
        return datos_Servicio;
    }

    public void setDatos_Servicio(String datos_Servicio) {
        this.datos_Servicio = datos_Servicio;
    }

    public String getCosto_Art() {
        return costo_Art;
    }

    public void setCosto_Art(String costo_Art) {
        this.costo_Art = costo_Art;
    }

    public String getCosto_Servicio() {
        return costo_Servicio;
    }

    public void setCosto_Servicio(String costo_Servicio) {
        this.costo_Servicio = costo_Servicio;
    }
    
    
    
}
