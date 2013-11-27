/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dao.impl.mysql;

import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dao.interfaces.CompraDAOInterface;
import com.sistemapos.sistemadatos.dto.CompraDTO;
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
public class MySqlCompraDAO implements CompraDAOInterface{
    
    @Override
    public int ingresar(CompraDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "insert into Compra values(?,?,?,?,?,?,?);";

            stmt = conn.prepareCall(sql);

            stmt.setInt(1, u.getSecuencia());
            stmt.setLong(2, u.getTrans_principal_id_trans()); 
            stmt.setString(3, u.getTrans_principal_fecha_trans());
            stmt.setString(4, u.getCod_prov());
            stmt.setString(5, u.getCod_prod());
            stmt.setInt(6, u.getUnidades());
            stmt.setInt(7, u.getPrecio_unit());
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
    public int eliminar(CompraDTO u)
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "delete from Compra where secuencia = (?);";

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
    public int actualizar(CompraDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "update Compra set Trans_principal_id_trans=(?),Trans_principal_fecha_trans =(?), cod_prov=(?), cod_prod=(?), unidades=(?), precio_unit=(?) where secuencia=(?);";
              
            stmt = conn.prepareCall(sql);

            stmt.setInt(1, u.getSecuencia());
            stmt.setLong(2, u.getTrans_principal_id_trans()); 
            stmt.setString(3, u.getTrans_principal_fecha_trans());
            stmt.setString(4, u.getCod_prov());
            stmt.setString(5, u.getCod_prod());
            stmt.setInt(6, u.getUnidades());
            stmt.setInt(7, u.getPrecio_unit());
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
    public List<CompraDTO> obtenerTodo() 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<CompraDTO> lista = new ArrayList<CompraDTO>();
        
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");

            String sql = "select * from Compra;";

            stmt = conn.prepareCall(sql);

            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                CompraDTO com = new CompraDTO();
                com.setSecuencia(rs.getInt(1));
                com.setTrans_principal_id_trans(rs.getLong(2));
                com.setTrans_principal_fecha_trans(rs.getString(3));
                com.setCod_prov(rs.getString(4));
                com.setCod_prod(rs.getString(5));
                com.setUnidades(rs.getInt(6));
                com.setPrecio_unit(rs.getInt(7));                
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
