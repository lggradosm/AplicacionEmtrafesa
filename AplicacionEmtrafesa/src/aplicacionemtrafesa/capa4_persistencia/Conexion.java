/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionemtrafesa.capa4_persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Home
 */
public class Conexion {
    private String url;
    private String usuario;
    private String contrasenya;
    private Connection cn = null;

    public Conexion() {
    }
    public Connection abrirConexion() {
        try{
            url="jdbc:postgresql://localhost:5434/EmtrafesaDB";
            usuario= "postgres";
            contrasenya = "promo2011";
            Class.forName("org.postgresql.Driver");
            cn = DriverManager.getConnection(url,usuario,contrasenya);
        }catch(Exception e){
            System.out.println("Error al establecer la conexion: "+e);
        }
        return cn;
    }
    public Connection cerrarConexion(){
        try{
            cn.close();
        }
        catch(Exception e){
            System.out.println("Error al cerrar la conexion: "+e);
        }
        return cn;
    }
    
}
