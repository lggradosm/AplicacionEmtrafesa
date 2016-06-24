/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionemtrafesa.capa3_Dominio.Entidades;

/**
 *
 * @author Home
 */
public class Ruta {
    private int rutaID;
    private Sede partida;
    private Sede destino;
    private Double precio;
    private String estado;

    public Ruta(int rutaID, Sede partida, Sede destino, Double precio) {
        this.rutaID = rutaID;
        this.partida = partida;
        this.destino = destino;
        this.precio = precio;
        this.estado = "Activo";
    }

    public int getRutaID() {
        return rutaID;
    }

    public void setRutaID(int rutaID) {
        this.rutaID = rutaID;
    }

    public Sede getPartida() {
        return partida;
    }

    public void setPartida(Sede partida) {
        this.partida = partida;
    }

    public Sede getDestino() {
        return destino;
    }

    public void setDestino(Sede destino) {
        this.destino = destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void obtenerPrecio(){
        new ObtenerPrecio();
    }
}
