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
public class Sede {
    private int sedeID;
    private String RUC;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String estado;

    public Sede(int sedeID, String RUC, String ciudad, String direccion, String telefono) {
        this.sedeID = sedeID;
        this.RUC = RUC;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = "Activo";
    }

    public int getSedeID() {
        return sedeID;
    }

    public void setSedeID(int sedeID) {
        this.sedeID = sedeID;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
