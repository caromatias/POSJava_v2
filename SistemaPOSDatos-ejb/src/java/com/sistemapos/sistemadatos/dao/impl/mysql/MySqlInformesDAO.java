/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.sistemadatos.dao.impl.mysql;

import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dao.interfaces.InformesDAOInterface;
import com.sistemapos.sistemadatos.dto.InformesDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author Alto Andes
 */
public class MySqlInformesDAO implements InformesDAOInterface{

    @Override
    public int ingresar(InformesDTO u) {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "Informes into values(?,?,?,?,?);";

            stmt = conn.prepareCall(sql);

            stmt.setInt(1, u.getSecuencia());
            stmt.setLong(2, u.getTrans_principal_id_trans()); 
            stmt.setString(3, u.getTrans_principal_fecha_trans());
            stmt.setInt(4, u.getTipo_inf());
            stmt.setString(5, u.getRuta());
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
    public int eliminar(InformesDTO u) {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "delete from Informes where secuencia = (?);";

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
    public int actualizar(InformesDTO u) {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "update Informes set Trans_principal_id_trans=(?),Trans_principal_fecha_trans =(?), num_boleta=(?), cod_prod=(?), monto=(?) where secuencia=(?);";
              
            stmt = conn.prepareCall(sql);

            stmt.setInt(1, u.getSecuencia());
            stmt.setLong(2, u.getTrans_principal_id_trans()); 
            stmt.setString(3, u.getTrans_principal_fecha_trans());
            stmt.setInt(4, u.getTipo_inf());
            stmt.setString(5, u.getRuta());
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
    public List<InformesDTO> obtenerTodo() {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<InformesDTO> lista = new ArrayList<InformesDTO>();
        
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");

            String sql = "select * from Anulacion;";

            stmt = conn.prepareCall(sql);

            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                InformesDTO anu = new InformesDTO();
                anu.setSecuencia(rs.getInt(1));
                anu.setTrans_principal_id_trans(rs.getLong(2));
                anu.setTrans_principal_fecha_trans(rs.getString(3));
                anu.setTipo_inf(rs.getInt(4));
                anu.setRuta(rs.getString(5));
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
