/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionemtrafesa.capa4_persistencia.daoPostgreSql;

import aplicacionemtrafesa.capa3_Dominio.Entidades.Ruta;
import aplicacionemtrafesa.capa4_persistencia.GestorJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class RutaDAOPostgre {
    GestorJDBC gestorJDBC;
    
    public RutaDAOPostgre(GestorJDBC gestorJDBC){
        this.gestorJDBC = gestorJDBC;
    }
    
    public List<Ruta> buscar(String partida) throws SQLException{
        ArrayList<Ruta> rutas = new ArrayList();
        Ruta ruta;
        ResultSet resultado;
        String sentenciaSQL;
        
        sentenciaSQL="select rutaid, origen,destino,precio"+ 
                " from ruta where partida like '%"+ partida+"%' order by nombre";
         
        resultado = gestorJDBC.ejecutarConsulta(sentenciaSQL);
        while(resultado.next()){
            ruta = new Ruta();
            ruta.setRutaID(resultado.getInt("rutaid"));
            ruta.setOrigen(resultado.getString("origen"));
            ruta.setDestino(resultado.getString("destino"));
            ruta.setPrecio(resultado.getDouble("precio"));
            rutas.add(ruta);
        }
        resultado.close();
        return rutas;
    }
    
    public int ingresar(Ruta ruta) throws SQLException{
        String sentenciaSQL= "insert into ruta(origen,destino,precio)" 
                + "values(?,?,?)";
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1,ruta.getOrigen());
        sentencia.setString(2, ruta.getDestino());
        sentencia.setDouble(3, ruta.getPrecio());
        return sentencia.executeUpdate();
    }   
    
    public int modificar(Ruta ruta) throws SQLException{
        String sentenciaSQL = "update ruta set origen = ?, partida = ?, precio = ?"
                + "where rutaid = ?";
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, ruta.getOrigen());
        sentencia.setString(2,ruta.getDestino());
        sentencia.setDouble(3, ruta.getPrecio());
        return sentencia.executeUpdate();
    }
    
    public int eliminar(Ruta ruta) throws SQLException{
        String sentenciaSQL = "delete from ruta where rutaid = ?";
        PreparedStatement sentencia =  gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setInt(1, ruta.getRutaID());
        return sentencia.executeUpdate();
        
    }
}
