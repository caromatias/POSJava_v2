
package com.sistemapos.sistemadatos.dto;

import java.io.Serializable;
import java.util.Objects;


public class Tipo_UserDTO implements Serializable
{
    private int cod_tip_user;
    private String nombre_tipo;
    private String desc_tipo_usr;

    public Tipo_UserDTO()
    {
        
    }

    public Tipo_UserDTO(int cod_tip_user, String nombre_tipo, String desc_tipo_usr) 
    {
        this.cod_tip_user = cod_tip_user;
        this.nombre_tipo = nombre_tipo;
        this.desc_tipo_usr = desc_tipo_usr;
    }

    public int getCod_tip_user() 
    {
        return cod_tip_user;
    }

    public void setCod_tip_user(int cod_tip_user) 
    {
        this.cod_tip_user = cod_tip_user;
    }

    public String getNombre_tipo() 
    {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) 
    {
        this.nombre_tipo = nombre_tipo;
    }

    public String getDesc_tipo_usr() 
    {
        return desc_tipo_usr;
    }

    public void setDesc_tipo_usr(String desc_tipo_usr) 
    {
        this.desc_tipo_usr = desc_tipo_usr;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 43 * hash + this.cod_tip_user;
        hash = 43 * hash + Objects.hashCode(this.nombre_tipo);
        hash = 43 * hash + Objects.hashCode(this.desc_tipo_usr);
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
        final Tipo_UserDTO other = (Tipo_UserDTO) obj;
        if (this.cod_tip_user != other.cod_tip_user) 
        {
            return false;
        }
        if (!Objects.equals(this.nombre_tipo, other.nombre_tipo)) 
        {
            return false;
        }
        if (!Objects.equals(this.desc_tipo_usr, other.desc_tipo_usr)) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Tipo_UserDTO{" + "cod_tip_user=" + cod_tip_user + ", nombre_tipo=" + nombre_tipo + ", desc_tipo_usr=" + desc_tipo_usr + '}';
    }
 
}
