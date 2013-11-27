
package com.sistemapos.sistemadatos.dto;

import java.util.Objects;


public class UsuarioDTO 
{
    private String cod_user;
    private String nombre_user;
    private int tipo_user;
    private int edad;
    private String pass;

    
    
     public UsuarioDTO() 
    {
        
    }
     
     public UsuarioDTO(String cod_user, String nombre_user, int tipo_user, int edad, String pass)
    {
        this.cod_user = cod_user;
        this.nombre_user = nombre_user;
        this.tipo_user = tipo_user;
        this.edad = edad;
        this.pass = pass;
    }

    public String getCod_user() 
    {
        return cod_user;
    }

    public void setCod_user(String cod_user)
    {
        this.cod_user = cod_user;
    }

    public String getNombre_user() 
    {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user)
    {
        this.nombre_user = nombre_user;
    }

    public int getTipo_user() 
    {
        return tipo_user;
    }

    public void setTipo_user(int tipo_user) 
    {
        this.tipo_user = tipo_user;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public String getPass()
    {
        return pass;
    }

    public void setPass(String pass) 
    {
        this.pass = pass;
    }
    
      @Override
    public int hashCode() 
      {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.cod_user);
        hash = 37 * hash + Objects.hashCode(this.nombre_user);
        hash = 37 * hash + this.tipo_user;
        hash = 37 * hash + this.edad;
        hash = 37 * hash + Objects.hashCode(this.pass);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final UsuarioDTO other = (UsuarioDTO) obj;
        if (!Objects.equals(this.cod_user, other.cod_user)) 
        {
            return false;
        }
        if (!Objects.equals(this.nombre_user, other.nombre_user)) 
        {
            return false;
        }
        if (this.tipo_user != other.tipo_user) 
        {
            return false;
        }
        if (this.edad != other.edad) 
        {
            return false;
        }
        if (!Objects.equals(this.pass, other.pass)) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "UsuarioDTO{" + "cod_user=" + cod_user + ", nombre_user=" + nombre_user + ", tipo_user=" + tipo_user + ", edad=" + edad + ", pass=" + pass + '}';
    }
   
}
