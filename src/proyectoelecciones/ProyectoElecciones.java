package proyectoelecciones;

import proyectoelecciones.Controller.CrudAll;
import proyectoelecciones.gui.RegistroOperador;

public class ProyectoElecciones {
    public static void main(String[] args) {
        CrudAll ca = new CrudAll();
        RegistroOperador re= new RegistroOperador(ca);
        re.setVisible(true);
        re.setLocationRelativeTo(null);
    }
}
