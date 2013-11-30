/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.impl.mysql;

import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dao.interfaces.ProductoDAOInterface;
import com.sistemapos.sistemadatos.dto.ProductoDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author dafro_000
 */
public class MySqlProductoDAO implements ProductoDAOInterface{
    
     public int ingresar(ProductoDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "insert into Producto values(?,?,?,?,?);";

            stmt = conn.prepareCall(sql);

            stmt.setString(1, u.getCod_prod());
            stmt.setString(2, u.getCategoria_cod_cat());
            stmt.setInt(3, u.getPrecio_venta());
            stmt.setString(4, u.getDesc_prod());
            stmt.setString(5, u.getNombre_prod());
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
    public int eliminar(ProductoDTO u)
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "delete from Producto where Cod_Pro = (?);";

            stmt = conn.prepareCall(sql);

            stmt.setString(1, u.getCod_prod());
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
    public int actualizar(ProductoDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "update Consulta set Categoria_cod_cat =(?), Precio_venta=(?), Desc_prod =(?), Nombre_prod =(?) where Cod_prod=(?);";
              
            stmt = conn.prepareCall(sql);

            stmt.setString(1, u.getCod_prod());
            stmt.setString(2, u.getCategoria_cod_cat());
            stmt.setInt(3, u.getPrecio_venta());
            stmt.setString(4, u.getDesc_prod());
            stmt.setString(5, u.getNombre_prod());
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
    public List<ProductoDTO> obtenerTodo() 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<ProductoDTO> lista = new ArrayList<ProductoDTO>();
        
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");

            String sql = "select * from Producto;";

            stmt = conn.prepareCall(sql);

            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                ProductoDTO cons = new ProductoDTO();
                cons.setCod_prod(rs.getString(1));
                cons.setCategoria_cod_cat(rs.getString(2));
                cons.setDesc_prod(rs.getString(3));
                cons.setPrecio_venta(rs.getInt(4));
                cons.setNombre_prod(rs.getString(5));
                lista.add(cons);
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
