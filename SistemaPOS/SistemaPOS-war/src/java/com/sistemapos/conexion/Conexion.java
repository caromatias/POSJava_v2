/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemapos.conexion;

import java.io.*;
import java.sql.*;

/**
 *
 * @author marcelo
 */
public class Conexion {

    static String db="";
    static String host="";
    static String url="";
    static String user="";
    static String pass= "";
    private static ResultSet rs;
    private static Statement st;
    private String anystring;
    private Connection cnn = null;

    public String leer(int op)
    {
        String StrConexion = null;
        if (op ==1){
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            String variable = null;
            try {
                archivo = new File(System.getProperty("user.dir")+"\\src\\parametros\\parametros.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    anystring = linea;
                    variable = Caracter("=");
                    char indice = variable.charAt(0);
                    switch (indice)
                    {
                        case '1':
                            host = Caracter(";").substring(1);
                            break;
                        case '3':
                            db = Caracter(";").substring(1);
                            break;
                        case '5':
                            user = Caracter(";").substring(1);
                            break;
                        case '7':
                            pass = Caracter(";").substring(1);
                            break;
                    }
                    StrConexion="jdbc:mysql://"+ host +":1433";
                 }
              }
              catch(Exception e){
                 e.printStackTrace();
              }finally{
                 try{
                    if( null != fr ){
                       fr.close();
                    }
                 }catch (Exception e2){
                    e2.printStackTrace();
                 }
              }
        }else if (op ==2){
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            String variable = null;
            try {
                archivo = new File(System.getProperty("user.dir")+"\\src\\parametros\\parametros.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    anystring = linea;
                    variable = Caracter("=");
                    char indice = variable.charAt(0);
                    switch (indice)
                    {
                        case '2':
                            host = Caracter(";").substring(1);
                            break;
                        case '4':
                            db = Caracter(";").substring(1);
                            break;
                        case '6':
                            user = Caracter(";").substring(1);
                            break;
                        case '8':
                            pass = Caracter(";").substring(1);
                            break;
                    }
                    StrConexion="jdbc:mysql://"+ host +":1433";
                 }
              }
              catch(Exception e){
                 e.printStackTrace();
              }finally{
                 try{
                    if( null != fr ){
                       fr.close();
                    }
                 }catch (Exception e2){
                    e2.printStackTrace();
                 }
              }
        }
        return StrConexion;
    }

    public String Caracter(String delim) {
		String Caracter = null;
		int posicion = 0;
		posicion =  anystring.indexOf(delim);
		if ( posicion > 0 ) {
			Caracter = anystring.substring(0, posicion);
			anystring = anystring.substring(posicion, anystring.length()-1);
		}
		 else {
			Caracter = anystring;
			anystring = "";
		}
		return Caracter;
	}

    public void Conectar()
    {
        url = leer(1);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            this.cnn = DriverManager.getConnection(url,user,pass);
            st = cnn.createStatement();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("ERROR:CONECTAR"+e.getMessage());
        }
        catch(SQLException e)
        {
            url = leer(2);
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                this.cnn = DriverManager.getConnection(url,user,pass);
                st = cnn.createStatement();
            }
            catch(ClassNotFoundException ex)
            {
                System.out.println("ERROR:CONECTAR"+ex.getMessage());
            }
            catch(SQLException exp)
            {
                System.out.println("ERROR:CONECTAR"+exp.getMessage());
            }
        }
    }

    public void Cerrar()
    {
        if(cnn!=null)
        try
        {
            cnn.close();
        }
        catch(SQLException e)
        {
            System.out.println("ERROR:CERRAR"+e.getMessage());
        }
    }


}
