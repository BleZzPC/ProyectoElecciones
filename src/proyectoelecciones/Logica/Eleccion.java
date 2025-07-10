/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoelecciones.Logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alvar
 */
public class Eleccion {
    private String titulo;
    private String fecha;
    private String tipo;
    private List<Candidato> candidatos;
    private List<MesaElectoral> mesas;

    public Eleccion() {
        this.candidatos = new ArrayList<>();
        this.mesas = new ArrayList<>();
    }

    public Eleccion(String titulo, String fecha, String tipo) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.tipo = tipo;
        this.candidatos = new ArrayList<>();
        this.mesas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public List<MesaElectoral> getMesas() {
        return mesas;
    }

    public void setMesas(List<MesaElectoral> mesas) {
        this.mesas = mesas;
    }

    public void agregarCandidato(Candidato candidato) {
        if (candidato != null) {
            candidatos.add(candidato);
        }
    }

    public Candidato buscarCandidato(String dni) {
        for (Candidato candidato : candidatos) {
            if (candidato.getDni().equals(dni)) {
                return candidato;
            }
        }
        return null;
    }

    public void eliminarCandidato(Candidato candidato) {
        candidatos.remove(candidato);
    }

    public void agregarMesa(MesaElectoral mesa) {
        if (mesa != null) {
            mesas.add(mesa);
        }
    }

    public MesaElectoral buscarMesa(String numeroMesa) {
        for (MesaElectoral mesa : mesas) {
            if (mesa.getNumeroMesa().equals(numeroMesa)) {
                return mesa;
            }
        }
        return null;
    }

    public void eliminarMesa(MesaElectoral mesa) {
        mesas.remove(mesa);
    }

    public int getTotalVotos() {
        int total = 0;
        for (MesaElectoral mesa : mesas) {
            for (ActaElectoral acta : mesa.getActas()) {
                total += acta.getTotalVotantesEfectivos();
            }
        }
        return total;
    }
}
