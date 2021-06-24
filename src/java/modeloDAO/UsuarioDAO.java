/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;
import modelo.Usuario;

/**
 *
 * @author DiegoCanteo
 */
public class UsuarioDAO {
 
    Conexion connect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona nuevaPersona = new Persona();
 
    public List<Usuario> acceder(String usuario , String contra){
       List<Usuario> datos = new ArrayList<>();
       Connection con;
       PreparedStatement pst;
       ResultSet rs;
       String sql = "select usuario,nivel from usuario "
                + "where usuario='" + usuario + "' and  contra='" + contra + "'";
        try {
             con = connect.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                    datos.add(new Usuario(rs.getString("usuario"),
                                          rs.getInt("nivel")));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       return datos;
    }   
    
    
    

}
    

