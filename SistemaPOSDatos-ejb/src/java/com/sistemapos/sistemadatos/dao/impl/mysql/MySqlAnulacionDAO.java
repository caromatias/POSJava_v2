/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dao.impl.mysql;

import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dao.interfaces.AnulacionDAOInterface;
import com.sistemapos.sistemadatos.dto.AnulacionDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author Christian
 */
public class MySqlAnulacionDAO implements AnulacionDAOInterface{
    
    @Override
     public int ingresar(AnulacionDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "Anulacion into values(?,?,?,?,?,?);";

            stmt = conn.prepareCall(sql);

            stmt.setInt(1, u.getSecuencia());
            stmt.setLong(2, u.getTrans_principal_id_trans()); 
            stmt.setString(3, u.getTrans_principal_fecha_trans());
            stmt.setInt(4, u.getNum_boleta());
            stmt.setInt(5, u.getCod_prod());
            stmt.setInt(6, u.getMonto());
            stmt.execute();
            resultado = 1L;
        } 
        catch (NamingException e) 
        {
            e.printStackTrace();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                MySqlDAOFactory.closeAll(conn, stmt, rs);
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        return resultado.intValue();
    }
        
    @Override
    public int eliminar(AnulacionDTO u)
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "delete from Anulacion where secuencia = (?);";

            stmt = conn.prepareCall(sql);

            stmt.setInt(1, u.getSecuencia());
            stmt.execute();
            resultado = 1L;

        } 
        catch (NamingException e) 
        {
            e.printStackTrace();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                MySqlDAOFactory.closeAll(conn, stmt, rs);
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        return resultado.intValue();
    }
    

    @Override
    public int actualizar(AnulacionDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "update Anulacion set Trans_principal_id_trans=(?),Trans_principal_fecha_trans =(?), num_boleta=(?), cod_prod=(?), monto=(?) where secuencia=(?);";
              
            stmt = conn.prepareCall(sql);

            stmt.setInt(1, u.getSecuencia());
            stmt.setLong(2, u.getTrans_principal_id_trans()); 
            stmt.setString(3, u.getTrans_principal_fecha_trans());
            stmt.setInt(4, u.getNum_boleta());
            stmt.setInt(5, u.getCod_prod());
            stmt.setInt(6, u.getMonto());
            stmt.execute();
            resultado = 1L;
        } 
        catch (NamingException e) 
        {
            e.printStackTrace();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                MySqlDAOFactory.closeAll(conn, stmt, rs);
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        return resultado.intValue();
    }
   
     /**
     *
     * @return
     */
    @Override
    public List<AnulacionDTO> obtenerTodo() 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<AnulacionDTO> lista = new ArrayList<AnulacionDTO>();
        
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");

            String sql = "select * from Anulacion;";

            stmt = conn.prepareCall(sql);

            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                AnulacionDTO anu = new AnulacionDTO();
                anu.setSecuencia(rs.getInt(1));
                anu.setTrans_principal_id_trans(rs.getLong(2));
                anu.setTrans_principal_fecha_trans(rs.getString(3));
                anu.setNum_boleta(rs.getInt(4));
                anu.setCod_prod(rs.getInt(5));
                anu.setMonto(rs.getInt(6));
                lista.add(anu);
            }

        } 
        catch (NamingException e) 
        {
            e.printStackTrace();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try {
                     MySqlDAOFactory.closeAll(conn, stmt, rs);
                } 
            catch (Exception e) 
                {
                     e.printStackTrace();
                }
        }
        return lista;
    } 
    
}
