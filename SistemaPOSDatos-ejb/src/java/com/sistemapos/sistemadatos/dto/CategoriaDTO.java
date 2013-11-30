
package com.sistemapos.sistemadatos.dto;

import java.io.Serializable;
import java.util.Objects;


public class CategoriaDTO implements Serializable
{
    private String cod_cat;
    private String nombre_cat;
    private String desc_cat;

    public CategoriaDTO() 
    {
        
    }

    public CategoriaDTO(String cod_cat, String nombre_cat, String desc_cat) 
    {
        this.cod_cat = cod_cat;
        this.nombre_cat = nombre_cat;
        this.desc_cat = desc_cat;
    }

    public String getCod_cat() 
    {
        return cod_cat;
    }

    public void setCod_cat(String cod_cat) 
    {
        this.cod_cat = cod_cat;
    }

    public String getNombre_cat() 
    {
        return nombre_cat;
    }

    public void setNombre_cat(String nombre_cat) 
    {
        this.nombre_cat = nombre_cat;
    }

    public String getDesc_cat() 
    {
        return desc_cat;
    }

    public void setDesc_cat(String desc_cat) 
    {
        this.desc_cat = desc_cat;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.cod_cat);
        hash = 47 * hash + Objects.hashCode(this.nombre_cat);
        hash = 47 * hash + Objects.hashCode(this.desc_cat);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final CategoriaDTO other = (CategoriaDTO) obj;
        if (!Objects.equals(this.cod_cat, other.cod_cat)) 
        {
            return false;
        }
        if (!Objects.equals(this.nombre_cat, other.nombre_cat)) 
        {
            return false;
        }
        if (!Objects.equals(this.desc_cat, other.desc_cat)) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "CategoriaDTO{" + "cod_cat=" + cod_cat + ", nombre_cat=" + nombre_cat + ", desc_cat=" + desc_cat + '}';
    }
    
}
