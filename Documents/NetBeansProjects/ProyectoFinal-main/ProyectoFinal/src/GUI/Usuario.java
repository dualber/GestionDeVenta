package GUI;

public class Usuario {

    private String usuario;
    private String correo;
    private String contrasena;
    
    public Usuario(String usuario, String correo, String contrasena) {
        this.usuario = usuario;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


}

    