
package com.sistemapos.sistemadatos.dao.impl.mysql;

import com.sistemapos.sistemadatos.dao.factory.MySqlDAOFactory;
import com.sistemapos.sistemadatos.dao.interfaces.Arqueo_CajaDAOInterface;
import com.sistemapos.sistemadatos.dto.Arqueo_CajaDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;


public class MySqlArqueo_CajaDAO implements Arqueo_CajaDAOInterface
{
     @Override
     public int ingresar(Arqueo_CajaDTO u) 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Long resultado = new Long(-1);
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");
            
            String sql = "Arqueo_Caja into values(?,?,?);";

            stmt = conn.prepareCall(sql);

            stmt.setLong(1, u.getTrans_principal_id_trans());
            stmt.setString(2, u.getTrans_principal_fecha_trans()); 
            stmt.setInt(3, u.getMonto());
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
    public List<Arqueo_CajaDTO> obtenerTodo() 
    {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<Arqueo_CajaDTO> lista = new ArrayList<Arqueo_CajaDTO>();
        
        try 
        {
            conn = MySqlDAOFactory.createConnection("jdbc/duoc");

            String sql = "select * from Arqueo_Caja;";

            stmt = conn.prepareCall(sql);

            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Arqueo_CajaDTO arc = new Arqueo_CajaDTO();
                arc.setTrans_principal_id_trans(rs.getLong(1));
                arc.setTrans_principal_fecha_trans(rs.getString(2));
                arc.setMonto(rs.getInt(3));
                lista.add(arc);
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
