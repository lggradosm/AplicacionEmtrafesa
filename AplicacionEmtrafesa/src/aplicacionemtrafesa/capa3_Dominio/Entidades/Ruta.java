/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionemtrafesa.capa3_Dominio.Entidades;

import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class Ruta {
    private int rutaID;
    private String origen;
    private String destino;
    private Double precio;

    public Ruta() {
    }
    
    
    
    public Ruta(int rutaID, String origen, String destino, Double precio) {
        this.rutaID = rutaID;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;

    }

    public int getRutaID() {
        return rutaID;
    }

    public void setRutaID(int rutaID) {
        this.rutaID = rutaID;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public static ArrayList datosObligatorios(){
        ArrayList datosObligatorios = new ArrayList();
        datosObligatorios.add("origen");
        datosObligatorios.add("destino");
        datosObligatorios.add("precio");
        return datosObligatorios;
    }
    
}
