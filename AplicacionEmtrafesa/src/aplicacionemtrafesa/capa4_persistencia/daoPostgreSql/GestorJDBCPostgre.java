/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionemtrafesa.capa4_persistencia.daoPostgreSql;


import aplicacionemtrafesa.capa4_persistencia.GestorJDBC;
import java.sql.DriverManager;

/**
 *
 * @author Lain
 */
public class GestorJDBCPostgre extends GestorJDBC {    

    @Override
    public void abrirConexion() throws Exception{        
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/baseemtrafesa";
        conexion = DriverManager.getConnection(url, "postgres", "administrador");   
    }
    
}
