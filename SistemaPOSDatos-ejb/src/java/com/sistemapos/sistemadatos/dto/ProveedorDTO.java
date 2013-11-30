
package com.sistemapos.sistemadatos.dto;

import java.io.Serializable;
import java.util.Objects;


public class ProveedorDTO implements Serializable
{
    private String cod_prov;
    private String nombre_prov;

    public ProveedorDTO() 
    {
        
    }

    public ProveedorDTO(String cod_prov, String nombre_prov)
    {
        this.cod_prov = cod_prov;
        this.nombre_prov = nombre_prov;
    }

    public String getCod_prov() 
    {
        return cod_prov;
    }

    public void setCod_prov(String cod_prov) 
    {
        this.cod_prov = cod_prov;
    }

    public String getNombre_prov() 
    {
        return nombre_prov;
    }

    public void setNombre_prov(String nombre_prov) 
    {
        this.nombre_prov = nombre_prov;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.cod_prov);
        hash = 17 * hash + Objects.hashCode(this.nombre_prov);
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
        final ProveedorDTO other = (ProveedorDTO) obj;
        if (!Objects.equals(this.cod_prov, other.cod_prov)) 
        {
            return false;
        }
        if (!Objects.equals(this.nombre_prov, other.nombre_prov)) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "ProovedorDTO{" + "cod_prov=" + cod_prov + ", nombre_prov=" + nombre_prov + '}';
    }
    
}
