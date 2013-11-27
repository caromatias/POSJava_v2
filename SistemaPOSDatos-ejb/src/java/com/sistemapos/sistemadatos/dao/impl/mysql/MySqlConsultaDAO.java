/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.impl.mysql;

import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dao.interfaces.ConsultaDAOInterface;
import com.sistemapos.sistemadatos.dto.ConsultaDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author cmeza
 */
public class MySqlConsultaDAO implements ConsultaDAOInterface{
    
     public int ingresar(ConsultaDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "insert into Consulta values(?,?,?,?,?);";

            stmt = conn.prepareCall(sql);

            stmt.setLong(1, u.getSecuencia());
            stmt.setLong(2, u.getTrans_principal_id_trans()); 
            stmt.setString(3, u.getTrans_principal_fecha_trans());
            stmt.setString(4, u.getCod_prod());
            stmt.setInt(5, u.getMonto());
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
    public int eliminar(ConsultaDTO u)
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "delete from Consulta where secuencia = (?);";

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
    public int actualizar(ConsultaDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "update Consulta set Trans_principal_id_trans=(?),Trans_principal_fecha_trans =(?), monto=(?), cod_prod=(?) where secuencia=(?);";
              
            stmt = conn.prepareCall(sql);

            stmt.setLong(1, u.getSecuencia());
            stmt.setLong(2, u.getTrans_principal_id_trans()); 
            stmt.setString(3, u.getTrans_principal_fecha_trans());
            stmt.setInt(4, u.getMonto());
            stmt.setString(5, u.getCod_prod());
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
    public List<ConsultaDTO> obtenerTodo() 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<ConsultaDTO> lista = new ArrayList<ConsultaDTO>();
        
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");

            String sql = "select * from Consulta;";

            stmt = conn.prepareCall(sql);

            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                ConsultaDTO cons = new ConsultaDTO();
                cons.setSecuencia(rs.getLong(1));
                cons.setTrans_principal_id_trans(rs.getLong(2));
                cons.setTrans_principal_fecha_trans(rs.getString(3));
                cons.setMonto(rs.getInt(4));
                cons.setCod_prod(rs.getString(5));
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
