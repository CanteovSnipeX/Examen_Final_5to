
package modeloDAO;

import configuracion.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

public class PersonaDAO implements CRUD{
    Conexion connect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona nuevaPersona = new Persona();

    @Override
    public List listar() {
        ArrayList<Persona> listaPersona = new ArrayList<>();
        String sql = "select * from persona";
        try{
           con = connect.getConexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
            while(rs.next()){
               Persona nuevaPersona = new Persona();
               nuevaPersona.setCodigoPersona(rs.getInt("codigoPersona"));
               nuevaPersona.setDPI(rs.getString("DPI"));
               nuevaPersona.setNombrePersona(rs.getString("nombrePersona"));
               listaPersona.add(nuevaPersona);
           }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaPersona;
    }

    @Override
    public Persona list(int id) {
        String sql = "select * from persona where codigoPersona =" + id;
        try{
            con = connect.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                nuevaPersona.setCodigoPersona(rs.getInt("codigoPersona"));
                nuevaPersona.setDPI(rs.getString("DPI"));
                nuevaPersona.setNombrePersona(rs.getString("nombrePersona"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return nuevaPersona;
    }

    @Override
    public boolean add(Persona per) {
        String sql = "insert into Persona(DPI, nombrePersona) value ('" + per.getDPI() + "','" + per.getNombrePersona() + "');";
        try{
            con = connect.getConexion();
            ps = con.prepareCall(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql = "update persona set DPI = '" + per.getDPI() + "', nombrePersona= '" + per.getNombrePersona()+ "' where codigoPersona= " + per.getCodigoPersona();
        try{
            con = connect.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from persona where codigoPersona =" + id;
        try{
            con = connect.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean validar(String nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
