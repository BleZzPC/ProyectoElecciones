/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoelecciones.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import proyectoelecciones.Logica.ActaElectoral;
import proyectoelecciones.Logica.Candidato;
import proyectoelecciones.Logica.Eleccion;
import proyectoelecciones.Logica.MesaElectoral;
import proyectoelecciones.Logica.MiembroMesa;
import proyectoelecciones.Logica.PartidoPolitico;

/**
 *
 * @author alvar
 */
public class CrudAll {
    
    private List<Eleccion> elecciones;
    private List<PartidoPolitico> partidos;
    private List<Candidato> candidatos;
    private List<MesaElectoral> mesas;
    private List<MiembroMesa> miembros;
    private List<ActaElectoral> actas;

    public CrudAll() {
        elecciones = new ArrayList<>();
        partidos = new ArrayList<>();
        candidatos = new ArrayList<>();
        mesas = new ArrayList<>();
        miembros = new ArrayList<>();
        actas = new ArrayList<>();
    }
    
    public void crearEleccion(String titulo, String fecha, String tipo) {
        Eleccion eleccion = new Eleccion(titulo, fecha, tipo);
        elecciones.add(eleccion);
    }

    public Eleccion buscarEleccion(String titulo) {
        for (Eleccion eleccion : elecciones) {
            if (eleccion.getTitulo().equals(titulo)) {
                return eleccion;
            }
        }
        return null;
    }

    public void eliminarEleccion(String titulo) {
        Eleccion eleccion = buscarEleccion(titulo);
        if (eleccion != null) {
            elecciones.remove(eleccion);
        }
    }

    public List<Eleccion> getElecciones() {
        return new ArrayList<>(elecciones);
    }

    public void crearPartido(String nombre, String sigla, String representanteLegal) {
        PartidoPolitico partido = new PartidoPolitico(nombre, sigla, representanteLegal);
        partidos.add(partido);
    }

    public PartidoPolitico buscarPartido(String nombre) {
        for (PartidoPolitico partido : partidos) {
            if (partido.getNombre().equals(nombre)) {
                return partido;
            }
        }
        return null;
    }

    public void eliminarPartido(String nombre) {
        PartidoPolitico partido = buscarPartido(nombre);
        if (partido != null) {
            partidos.remove(partido);
        }
    }

    public List<PartidoPolitico> getPartidos() {
        return partidos;
    }

    public void crearCandidato(String nombres, String apellidos, String dni, PartidoPolitico partido) {
        Candidato candidato = new Candidato(nombres, apellidos, dni, partido);
        candidatos.add(candidato);
    }

    public Candidato buscarCandidato(String dni) {
        for (Candidato candidato : candidatos) {
            if (candidato.getDni().equals(dni)) {
                return candidato;
            }
        }
        return null;
    }

    public void eliminarCandidato(String dni) {
        Candidato candidato = buscarCandidato(dni);
        if (candidato != null) {
            candidatos.remove(candidato);
        }
    }

    public List<Candidato> getCandidatos() {
        return new ArrayList<>(candidatos);
    }

    public void crearMesa(String lugar, String numeroMesa) {
        MesaElectoral mesa = new MesaElectoral(lugar, numeroMesa);
        mesas.add(mesa);
    }

    public MesaElectoral buscarMesa(String numeroMesa) {
        for (MesaElectoral mesa : mesas) {
            if (mesa.getNumeroMesa().equals(numeroMesa)) {
                return mesa;
            }
        }
        return null;
    }

    public void eliminarMesa(String numeroMesa) {
        MesaElectoral mesa = buscarMesa(numeroMesa);
        if (mesa != null) {
            mesas.remove(mesa);
        }
    }

    public List<MesaElectoral> getMesas() {
        return new ArrayList<>(mesas);
    }

    // Métodos para Miembros
    public void crearMiembro(String nombres, String apellidos, String dni, String tipo) {
        MiembroMesa miembro = new MiembroMesa(nombres, apellidos, dni, tipo);
        miembros.add(miembro);
    }

    public MiembroMesa buscarMiembro(String dni) {
        for (MiembroMesa miembro : miembros) {
            if (miembro.getDni().equals(dni)) {
                return miembro;
            }
        }
        return null;
    }

    public void eliminarMiembro(String dni) {
        MiembroMesa miembro = buscarMiembro(dni);
        if (miembro != null) {
            miembros.remove(miembro);
        }
    }

    public List<MiembroMesa> getMiembros() {
        return new ArrayList<>(miembros);
    }

    // Métodos para Actas
    public void crearActa(String titulo, String lugar,String fecha,String hora, MesaElectoral mesa, String numeroActa) {
        ActaElectoral acta = new ActaElectoral(titulo, lugar,fecha,hora, mesa, numeroActa);
        actas.add(acta);
        mesa.agregarActa(acta);
    }

    public ActaElectoral buscarActa(String numeroActa) {
        for (ActaElectoral acta : actas) {
            if (acta.getNumeroActa().equals(numeroActa)) {
                return acta;
            }
        }
        return null;
    }

    public void eliminarActa(String numeroActa) {
        ActaElectoral acta = buscarActa(numeroActa);
        if (acta != null) {
            MesaElectoral mesa = acta.getMesa();
            if (mesa != null) {
                mesa.eliminarActa(acta);
            }
            actas.remove(acta);
        }
    }

    public List<ActaElectoral> getActas() {
        return new ArrayList<>(actas);
    }
}
