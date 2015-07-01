
package entidades;

/**
 * Esta clase define los objetos tanto enteros como de tipo cadena que forman 
 *parte del formulario de Usuarios 
 *@author Santiago Morales
 *@version Autosoft 1.0
 *
 */

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
    
    /**
     * La variable id_Usuario Contiene  lo que va ser la identificación del usuario 
     * @return Devuelve id_Usuario de tipo cadena
     */

    public String getId_Usuario() {
        return id_Usuario;
    }//Cierre del método 
    
    /**
     * La variable id_Usuario Contendrá   lo que va ser la identificación del usuario 
     * @param id_Usuario Recibe id_Usuario de tipo cadena
     */

    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }//Cierre del método 
    
    /**
     * La variable perfil Contiene  lo que va ser el perfil del usuario 
     * @return Devuelve perfil de tipo entero
     */

    public int getPerfil() {
        return perfil;
    }//Cierre del método 
    
    /**
     * La variable perfil Contendrá  lo que va ser el perfil del usuario 
     * @param perfil Recibe  perfil de tipo entero
     */

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }//Cierre del método 
    
    /**
     * la variable contrasena contiene lo que es la clave del usuario 
     * @return Devuelve contrasena de tipo cadena 
     */

    public String getContrasena() {
        return contrasena;
    }//Cierre del método 
    
    /**
     * la variable contrasena Contendrá  lo que es la clave del usuario 
     * @param contrasena Recibe contrasena de tipo cadena 
     */

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }//Cierre del método 
    
/**
 * La variable estado muestra la disponibilidad en que se encuentra el usuario
 * @return Devuelve estado de tipo entero 
 */
    public int getEstado() {
        return estado;
    }//Cierre del método 
    
    /**
     * La variable estado muestra la disponibilidad en que se encuentra el usuario
     * @param estado Recibe estado de tipo entero 
     */

    public void setEstado(int estado) {
        this.estado = estado;
    }//Cierre del método 
    
    /**
     * La variable foto contiene la foto del usuario 
     * @return Devuelve foto de tipo cadena 
     */

    public String getFoto() {
        return foto;
    }//Cierre del método 

 /**
 * La variable foto contiene la foto del usuario 
 * @param foto recibe foto de tipo cadena  
 */
    public void setFoto(String foto) {
        this.foto = foto;
    }//Cierre del método 

    
    
}
