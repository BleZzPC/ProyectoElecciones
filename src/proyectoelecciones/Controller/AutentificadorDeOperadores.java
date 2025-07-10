/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoelecciones.Controller;

import java.util.ArrayList;
import java.util.List;
import proyectoelecciones.Logica.Operador;

/**
 *
 * @author alvar
 */
public class AutentificadorDeOperadores {

    private List<Operador> operadores;

    public AutentificadorDeOperadores() {
        operadores = new ArrayList<>();
        // Aquí agregas los operadores válidos (hardcodeados o cargados de algún lado)
        operadores.add(new Operador("admin", "123"));
        operadores.add(new Operador("usuario", "1234"));
        // ...etc
    }

    public boolean autenticar(String usuario, String contra) {
        for (Operador op : operadores) {
            if (op.getUsuario().equals(usuario) && op.getContra().equals(contra)) {
                return true;
            }
        }
        return false;
    }
    } 



