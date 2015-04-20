
package entidades;


public class Servicios {
    private String id_Servicio;
    private String id_Vehiculo;
    private String id_Cliente;
    private String id_Empleado;
    private int estado;
    private String fecha_Inicio;
    private String fecha_Fin;
    
    public Servicios (String id_Servicio, String id_Vehiculo, String id_Cliente, String id_Empleado, int estado, String fecha_Inicio, String fecha_Fin){
    this.id_Servicio  =  id_Servicio;
    this.id_Vehiculo  =  id_Vehiculo;
    this.id_Cliente  =  id_Cliente;
    this.id_Empleado  =  id_Empleado;
    this.estado = estado;
    this.fecha_Inicio  =  fecha_Inicio;
    this.fecha_Fin  =  fecha_Fin;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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
    
    
    
}
