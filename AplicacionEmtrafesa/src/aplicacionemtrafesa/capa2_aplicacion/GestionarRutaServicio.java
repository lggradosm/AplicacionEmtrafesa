/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionemtrafesa.capa2_aplicacion;

import aplicacionemtrafesa.capa3_Dominio.Entidades.Ruta;
import aplicacionemtrafesa.capa4_persistencia.GestorJDBC;
import aplicacionemtrafesa.capa4_persistencia.daoPostgreSql.GestorJDBCPostgre;
import aplicacionemtrafesa.capa4_persistencia.daoPostgreSql.RutaDAOPostgre;
import java.util.List;

/**
 *
 * @author Home
 */
public class GestionarRutaServicio {
    private GestorJDBC gestorJDBC;
    private RutaDAOPostgre rutaDAO;
    
    public GestionarRutaServicio(){
        gestorJDBC = new GestorJDBCPostgre();
        rutaDAO = new RutaDAOPostgre(gestorJDBC);
    }
    
    public List<Ruta> buscarRutas(String partida) throws Exception{
        gestorJDBC.abrirConexion();
        List<Ruta> rutas = rutaDAO.buscar(partida);
        gestorJDBC.cerrarConexion();
        return rutas;
    } 
    
    public int crearRuta(Ruta ruta) throws Exception{
        gestorJDBC.abrirConexion();
        int registros_afectados = rutaDAO.ingresar(ruta);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }
    
    public int modificarRuta(Ruta ruta) throws Exception{
        gestorJDBC.abrirConexion();
        int registros_afectados = rutaDAO.modificar(ruta);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }
    
    public int eliminarRuta(Ruta ruta) throws Exception{
        gestorJDBC.abrirConexion();
        int registros_afectados = rutaDAO.eliminar(ruta);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }
}
