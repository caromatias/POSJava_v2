

package com.sistemapos.sistemadatos.dao.factory;


public class DAOFactory 
{     
    public enum type{MYSQL, SQLSERVER, ORACLE, DB2}
    
        public static DAOFactory getDAOFactory(type factory)
        {
            switch(factory)
            {
                 case MYSQL:
                    return new MySqlDAOFactory();
                 
                 default:
                    return null;
            }
        }
}
