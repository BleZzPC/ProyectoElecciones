package proyectoelecciones.Logica;

public class Operador {
    private String usuario;
    private String contra;
    
    public Operador(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContra() {
        return contra;
    }
    public void setContrasena(String contrasena) {
        this.contra = contrasena;
    }

    public boolean autenticar(String user, String contra) {
        return this.usuario.equals(user) && this.contra.equals(contra);
    }
}
