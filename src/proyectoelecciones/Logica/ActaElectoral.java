package proyectoelecciones.Logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActaElectoral {

    private String titulo;
    private String fecha;
    private String hora;
    private String lugar;
    private MesaElectoral mesa;
    private List<MiembroMesa> miembrosMesa;
    private int totalVotantesRegistrados;
    private int totalVotantesEfectivos;
    private int votosEnBlanco;
    private int votosNulos;
    private String observaciones;
    private String firmas;
    private String selloOficial;
    private String numeroActa;
    private List<Candidato> candidatos;
    private Map<Candidato, Integer> votosPorCandidato = new HashMap<>();
    private Map<Candidato, Integer> votosPreferenciales = new HashMap<>();

    public ActaElectoral() {
        this.candidatos = new ArrayList<>();
        this.miembrosMesa = new ArrayList<>();
    }

    public ActaElectoral(String titulo,String fecha,String hora, String lugar, MesaElectoral mesa, String numeroActa) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.mesa = mesa;
        this.numeroActa = numeroActa;
        this.candidatos = new ArrayList<>();
        this.miembrosMesa = mesa.getMiembros();
    }

    public Map<Candidato, Integer> getVotosPorCandidato() {
        return votosPorCandidato;
    }

    public void setVotosPorCandidato(Map<Candidato, Integer> votosPorCandidato) {
        this.votosPorCandidato = votosPorCandidato;
    }

    public Map<Candidato, Integer> getVotosPreferenciales() {
        return votosPreferenciales;
    }

    public void setVotosPreferenciales(Map<Candidato, Integer> votosPreferenciales) {
        this.votosPreferenciales = votosPreferenciales;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public MesaElectoral getMesa() {
        return mesa;
    }

    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
    }

    public List<MiembroMesa> getMiembrosMesa() {
        return miembrosMesa;
    }

    public void setMiembrosMesa(List<MiembroMesa> miembrosMesa) {
        this.miembrosMesa = miembrosMesa;
    }

    public int getTotalVotantesRegistrados() {
        return totalVotantesRegistrados;
    }

    public void setTotalVotantesRegistrados(int totalVotantesRegistrados) {
        this.totalVotantesRegistrados = totalVotantesRegistrados;
    }

    public int getTotalVotantesEfectivos() {
        return totalVotantesEfectivos;
    }

    public void setTotalVotantesEfectivos(int totalVotantesEfectivos) {
        this.totalVotantesEfectivos = totalVotantesEfectivos;
    }

    public int getVotosEnBlanco() {
        return votosEnBlanco;
    }

    public void setVotosEnBlanco(int votosEnBlanco) {
        this.votosEnBlanco = votosEnBlanco;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFirmas() {
        return firmas;
    }

    public void setFirmas(String firmas) {
        this.firmas = firmas;
    }

    public String getSelloOficial() {
        return selloOficial;
    }

    public void setSelloOficial(String selloOficial) {
        this.selloOficial = selloOficial;
    }

    public String getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(String numeroActa) {
        this.numeroActa = numeroActa;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
    
}
