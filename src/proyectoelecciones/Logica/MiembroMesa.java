package proyectoelecciones.Logica;

public class MiembroMesa extends Persona {
    private String tipo;
    
    public MiembroMesa(String nombre, String apellido, String dni, String tipo) {
        super(nombre, apellido, dni);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
