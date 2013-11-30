package com.sistemapos.sistemadatos.dao.factory;


import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlAnulacionDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlArqueo_CajaDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlCategoriaDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlClienteDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlCod_PagoDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlCompraDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlConsultaDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlDescuentoDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlDevolucionDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlInformesDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlInventarioDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlMaster_StockDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlProductoDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlProveedorDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlStock_DiaDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlTelefonoDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlTipo_InformeDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlTipo_UserDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlTransaccion_PrincipalDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlUsuarioDAO;
import com.sistemapos.sistemadatos.dao.impl.mysql.MySqlVentasDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class MySqlDAOFactory extends DAOFactory 
{

    public MySqlDAOFactory() 
    {
       
    }
     public static Connection createConnection(String dataSource)
     throws NamingException, SQLException
     {
        Connection myConn = null;
        Context ic = new InitialContext();
        DataSource ds = (DataSource) ic.lookup(dataSource);
        myConn = ds.getConnection();
        return myConn;
     }

     public static void closeAll(Connection conn, Statement stmt, ResultSet rs)
     throws Exception 
     {
        boolean closeError = false;
        Exception closeException = null;
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
                closeError = true;
                closeException = e;
            }
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
                closeError = true;
                closeException = e;
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                closeError = true;
                closeException = e;
            }
        }

        if (closeError) {
            throw new Exception(
                    "No ha sido posible liberar los recursos utilizados.",
                    closeException);
        }
    }
     public MySqlUsuarioDAO getUsuarioDAO()
    {
        return new MySqlUsuarioDAO();
    }
    public MySqlClienteDAO getClienteDAO()
    {
        return new MySqlClienteDAO();
    }
    public MySqlArqueo_CajaDAO getArqueo_CajaDAO()
    {
        return new MySqlArqueo_CajaDAO();
    }
    public MySqlAnulacionDAO getAnulacionDAO()
    {
        return new MySqlAnulacionDAO();
    }
    public MySqlCategoriaDAO getCategoriaDAO()
    {
        return new MySqlCategoriaDAO();
    }
    public MySqlCod_PagoDAO getCod_PagoDAO()
    {
        return new MySqlCod_PagoDAO();
    }
    public MySqlCompraDAO getCompraDAO()
    {
        return new MySqlCompraDAO();
    }
     public MySqlConsultaDAO getConsultaDAO()
    {
        return new MySqlConsultaDAO();
    }
     public MySqlDescuentoDAO getDescuentoDAO()
    {
        return new MySqlDescuentoDAO();
    }
    public MySqlDevolucionDAO getDevolucionDAO()
    {
        return new MySqlDevolucionDAO();
    }
    public MySqlInformesDAO getInformesDAO()
    {
        return new MySqlInformesDAO();
    }
    public MySqlInventarioDAO getInventarioDAO()
    {
        return new MySqlInventarioDAO();
    }
    public MySqlMaster_StockDAO getMaster_StockDAO()
    {
        return new MySqlMaster_StockDAO();
    }
    public MySqlProductoDAO getProductoDAO()
    {
        return new MySqlProductoDAO();
    }
    public MySqlProveedorDAO getProveedorDAO()
    {
        return new MySqlProveedorDAO();
    }
    public MySqlStock_DiaDAO getStock_DiaDAO()
    {
        return new MySqlStock_DiaDAO();
    }
    public MySqlTelefonoDAO getTelefonoDAO()
    {
        return new MySqlTelefonoDAO();
    }
    public MySqlTipo_InformeDAO getTipo_InformeDAO()
    {
        return new MySqlTipo_InformeDAO();
    }
    
    public MySqlTipo_UserDAO getTipo_UserDAO()
    {
        return new MySqlTipo_UserDAO();
    }
    public MySqlTransaccion_PrincipalDAO getTransaccion_PrincipalDAO()
    {
        return new MySqlTransaccion_PrincipalDAO();
    }
    public MySqlVentasDAO getVentasDAO()
    {
        return new MySqlVentasDAO();
    }
    
 }
    

