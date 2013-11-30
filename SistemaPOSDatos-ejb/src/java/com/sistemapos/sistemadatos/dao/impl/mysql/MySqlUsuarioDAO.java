/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemapos.sistemadatos.dao.impl.mysql;

import com.sistemapos.sistemadatos.dao.interfaces.UsuarioDAOInterface;
import com.sistemapos.sistemadatos.dto.UsuarioDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import com.sistemapos.sistemadatos.dao.factory.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.NamingException;


/**
 *
 * @author Fabian Menares
 */
public class MySqlUsuarioDAO implements UsuarioDAOInterface 
{

    @Override
    public int ingresar(UsuarioDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "insert into usuario values(?,?,?,?,?);";

            stmt = conn.prepareCall(sql);

            stmt.setString(1, u.getCod_user());
            stmt.setString(2, u.getNombre_user()); 
            stmt.setInt(3, u.getTipo_user());
            stmt.setInt(4, u.getEdad());
            stmt.setString(5, u.getPass());
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
    public int eliminar(UsuarioDTO u)
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "delete from usuario where cod_user = (?);";

            stmt = conn.prepareCall(sql);

            stmt.setString(1, u.getCod_user());
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
    public int actualizar(UsuarioDTO u) 
    {
       Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "update usuario set nombre_user=(?), tipo_user=(?), edad=(?), pass =(?) where cos_user=(?);";
              
            stmt = conn.prepareCall(sql);

            stmt.setString(1, u.getCod_user());
            stmt.setString(2, u.getNombre_user()); 
            stmt.setInt(3, u.getTipo_user());
            stmt.setInt(4, u.getEdad());
            stmt.setString(5, u.getPass());
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
    public List<UsuarioDTO> obtenerTodo() 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<UsuarioDTO> lista = new ArrayList<UsuarioDTO>();
        
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");

            String sql = "select * from usuario;";

            stmt = conn.prepareCall(sql);

            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                UsuarioDTO user = new UsuarioDTO();
                user.setCod_user(rs.getString(1));
                user.setNombre_user(rs.getString(2));
                user.setTipo_user(rs.getInt(3));
                user.setEdad(rs.getInt(4));
                user.setPass(rs.getString(5));
                lista.add(user);
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
    @Override
    public List<UsuarioDTO> login() 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<UsuarioDTO> lista = new ArrayList<UsuarioDTO>();
        
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");

            String sql = "select * from usuario;";

            stmt = conn.prepareCall(sql);

            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                UsuarioDTO user = new UsuarioDTO();
                user.setCod_user(rs.getString(1));
                user.setNombre_user(rs.getString(2));
                user.setTipo_user(rs.getInt(3));
                user.setEdad(rs.getInt(4));
                user.setPass(rs.getString(5));
                lista.add(user);
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