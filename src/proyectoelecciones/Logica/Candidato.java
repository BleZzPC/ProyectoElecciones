/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoelecciones.Logica;

/**
 *
 * @author alvar
 */
public class Candidato extends Persona {

    private PartidoPolitico partido;

    public Candidato(String nombre, String apellido, String dni, PartidoPolitico partido) {
        super(nombre, apellido, dni);
        this.partido = partido;
    }

    public PartidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }
}
