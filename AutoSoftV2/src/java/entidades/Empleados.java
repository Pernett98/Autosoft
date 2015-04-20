package entidades;


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
    }

    public String getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(String id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getEstado_Civil() {
        return estado_Civil;
    }

    public void setEstado_Civil(int estado_Civil) {
        this.estado_Civil = estado_Civil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    
    
    
    
}
