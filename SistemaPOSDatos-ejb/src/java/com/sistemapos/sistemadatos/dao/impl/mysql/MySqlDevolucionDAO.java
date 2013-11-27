/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dao.impl.mysql;

import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dao.interfaces.DevolucionDAOInterface;
import com.sistemapos.sistemadatos.dto.DevolucionDTO;
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
public class MySqlDevolucionDAO implements DevolucionDAOInterface
{
    
    @Override
    public int ingresar(DevolucionDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "insert into Devolucion values(?,?,?,?,?,?);";

            stmt = conn.prepareCall(sql);

            stmt.setLong(1, u.getSecuencia());
            stmt.setLong(2, u.getTrans_principal_id_trans()); 
            stmt.setString(3, u.getTrans_principal_fecha_trans());
            stmt.setInt(4, u.getCantidad());
            stmt.setInt(5, u.getMonto());
            stmt.setString(6, u.getCod_prod());
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
    public int eliminar(DevolucionDTO u)
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "delete from Devolucion where cod_user = (?);";

            stmt = conn.prepareCall(sql);

            stmt.setLong(1, u.getSecuencia());
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
    public int actualizar(DevolucionDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "update Devolucion set Trans_principal_id_trans=(?),Trans_principal_fecha_trans =(?), cantidad=(?), monto=(?), cod_prod=(?) where secuencia=(?);";
              
            stmt = conn.prepareCall(sql);

            stmt.setLong(1, u.getSecuencia());
            stmt.setLong(2, u.getTrans_principal_id_trans()); 
            stmt.setString(3, u.getTrans_principal_fecha_trans());
            stmt.setInt(4, u.getCantidad());
            stmt.setInt(5, u.getMonto());
            stmt.setString(6, u.getCod_prod());
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
    public List<DevolucionDTO> obtenerTodo() 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<DevolucionDTO> lista = new ArrayList<DevolucionDTO>();
        
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");

            String sql = "select * from Devolucion;";

            stmt = conn.prepareCall(sql);

            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                DevolucionDTO com = new DevolucionDTO();
                com.setSecuencia(rs.getInt(1));
                com.setTrans_principal_id_trans(rs.getLong(2));
                com.setTrans_principal_fecha_trans(rs.getString(3));
                com.setCantidad(rs.getInt(4));
                com.setMonto(rs.getInt(5));
                com.setCod_prod(rs.getString(6));
                lista.add(com);
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
