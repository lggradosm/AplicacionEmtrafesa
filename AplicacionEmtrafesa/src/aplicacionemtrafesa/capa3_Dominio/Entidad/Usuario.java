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
public class Usuario {
    private String nombre;
    private String usuario;
    private String contrasena;
    private String permiso;
    private String estado;

    public Usuario() {
    }

    public Usuario(String nombre, String usuario ,String contrasena, String permiso) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.permiso = permiso;
        this.estado = "Activo";
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
}
