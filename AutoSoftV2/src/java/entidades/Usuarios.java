
package entidades;


public class Usuarios {
    private String id_Usuario;
    private int perfil;
    private String contrasena;
    private int estado;
    private String foto;

    public Usuarios(String id_Usuario, int perfil, String contrasena, int estado, String foto) {
        this.id_Usuario = id_Usuario;
        this.perfil = perfil;
        this.contrasena = contrasena;
        this.estado = estado;
        this.foto = foto;
    }

    public String getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    
    
}
