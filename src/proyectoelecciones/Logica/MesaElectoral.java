package proyectoelecciones.Logica;

import java.util.ArrayList;
import java.util.List;

public class MesaElectoral {

    private String lugar;
    private String numeroMesa;
    private List<MiembroMesa> miembros;
    private List<ActaElectoral> actas;

    public MesaElectoral() {
        this.miembros = new ArrayList<>();
        this.actas = new ArrayList<>();
    }

    public MesaElectoral(String lugar, String numeroMesa) {
        this.lugar = lugar;
        this.numeroMesa = numeroMesa;
        this.miembros = new ArrayList<>();
        this.actas = new ArrayList<>();
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public List<MiembroMesa> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<MiembroMesa> miembros) {
        this.miembros = miembros;
    }

    public List<ActaElectoral> getActas() {
        return actas;
    }

    public void setActas(List<ActaElectoral> actas) {
        this.actas = actas;
    }

    // Métodos básicos
    public void agregarMiembro(MiembroMesa miembro) {
        if (miembro != null) {
            miembros.add(miembro);
        }
    }

    public void eliminarMiembro(MiembroMesa miembro) {
        miembros.remove(miembro);
    }

    public MiembroMesa buscarMiembroPorDni(String dni) {
        for (MiembroMesa miembro : miembros) {
            if (miembro.getDni().equals(dni)) {
                return miembro;
            }
        }
        return null;
    }

    public void agregarActa(ActaElectoral acta) {
        if (acta != null) {
            actas.add(acta);
        }
    }

    public void eliminarActa(ActaElectoral acta) {
        actas.remove(acta);
    }

    public ActaElectoral buscarActaPorNumero(String numeroActa) {
        for (ActaElectoral acta : actas) {
            if (acta.getNumeroActa().equals(numeroActa)) {
                return acta;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.numeroMesa;
    }
    
}
