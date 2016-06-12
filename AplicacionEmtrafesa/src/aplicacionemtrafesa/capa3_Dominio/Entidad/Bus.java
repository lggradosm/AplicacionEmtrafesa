/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionemtrafesa.capa3_Dominio.Entidad;

/**
 *
 * @author Home
 */
public class Bus {
    private String matricula;
    private int numero;
    private String tipoServicio;
    private int numeroAsientos;
    private int numeroPisos;
    private String estado;

    public Bus() {
    }

    public Bus(String matricula, int numero, String tipoServicio, int numeroAsientos, int numeroPisos) {
        this.matricula = matricula;
        this.numero = numero;
        this.tipoServicio = tipoServicio;
        this.numeroAsientos = numeroAsientos;
        this.numeroPisos = numeroPisos;
        this.estado = "Activo";
    }

   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
