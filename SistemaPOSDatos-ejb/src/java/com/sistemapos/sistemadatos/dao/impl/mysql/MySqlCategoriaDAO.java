/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dao.impl.mysql;

import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dto.CategoriaDTO;
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
public class MySqlCategoriaDAO {
    
      public int ingresar(CategoriaDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "insert into Categoria values(?,?,?);";

            stmt = conn.prepareCall(sql);

            stmt.setString(1, u.getCod_cat());
            stmt.setString(2, u.getNombre_cat()); 
            stmt.setString(3, u.getDesc_cat());
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

    
    public int eliminar(CategoriaDTO u)
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "delete from Categoria where cod_cat = (?);";

            stmt = conn.prepareCall(sql);

            stmt.setString(1, u.getCod_cat());
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
    

    
    public int actualizar(CategoriaDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "update Categoria set nombre_cat=(?), desc_cat=(?) where cod_cat=(?);";
              
            stmt = conn.prepareCall(sql);

            stmt.setString(1, u.getCod_cat());
            stmt.setString(2, u.getNombre_cat()); 
            stmt.setString(3, u.getDesc_cat());
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

    
    public List<CategoriaDTO> obtenerTodo() 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<CategoriaDTO> lista = new ArrayList<CategoriaDTO>();
        
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");

            String sql = "select * from Categoria;";

            stmt = conn.prepareCall(sql);

            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                CategoriaDTO cat = new CategoriaDTO();
                cat.setCod_cat(rs.getString(1));
                cat.setNombre_cat(rs.getString(2));
                cat.setDesc_cat(rs.getString(3));
                lista.add(cat);
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
