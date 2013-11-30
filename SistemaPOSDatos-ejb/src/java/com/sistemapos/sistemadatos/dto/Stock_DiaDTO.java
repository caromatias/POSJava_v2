
package com.sistemapos.sistemadatos.dto;

import java.io.Serializable;
import java.util.Objects;


public class Stock_DiaDTO implements Serializable
{
    private String cod_prod;
    private int cantidad;

    public Stock_DiaDTO() 
    {
        
    }

    public Stock_DiaDTO(String cod_prod, int cantidad) 
    {
        this.cod_prod = cod_prod;
        this.cantidad = cantidad;
    }

    public String getCod_prod() 
    {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) 
    {
        this.cod_prod = cod_prod;
    }

    public int getCantidad() 
    {
        return cantidad;
    }

    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.cod_prod);
        hash = 79 * hash + this.cantidad;
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
        final Stock_DiaDTO other = (Stock_DiaDTO) obj;
        if (!Objects.equals(this.cod_prod, other.cod_prod)) 
        {
            return false;
        }
        if (this.cantidad != other.cantidad)
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Stock_diaDTO{" + "cod_prod=" + cod_prod + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
   
}
