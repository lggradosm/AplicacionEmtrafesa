/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionemtrafesa.capa3_Dominio.Entidades;

import java.awt.List;
import java.util.Date;

/**
 *
 * @author Home
 */
public class Pasaje {
    private int pasajeID;
    private int serie;
    private int asiento;
    private Date fechaEmision;
    private Date fechaViaje;
    private String estado;
    private Ruta ruta;
    private Cliente cliente;
    private Bus bus;

    public Pasaje(int pasajeID, int serie, int asiento, Date fechaEmision, Date fechaViaje, String estado, Ruta ruta, Cliente cliente, Bus bus) {
        this.pasajeID = pasajeID;
        this.serie = serie;
        this.asiento = asiento;
        this.fechaEmision = fechaEmision;
        this.fechaViaje = fechaViaje;
        this.estado = estado;
        this.ruta = ruta;
        this.cliente = cliente;
        this.bus = bus;
    }

    public int getPasajeID() {
        return pasajeID;
    }

    public void setPasajeID(int pasajeID) {
        this.pasajeID = pasajeID;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

   
    
    
    
    
    
}
