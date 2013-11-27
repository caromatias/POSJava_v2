
package com.sistemapos.sistemadatos.dto;

import java.util.Objects;


public class Master_StockDTO 
{
    private String fecha_stock;
    private String cod_prod;
    private int cantidad;

    public Master_StockDTO() 
    {
        
    }

    public Master_StockDTO(String fecha_stock, String cod_prod, int cantidad) 
    {
        this.fecha_stock = fecha_stock;
        this.cod_prod = cod_prod;
        this.cantidad = cantidad;
    }

    public String getFecha_stock() 
    {
        return fecha_stock;
    }

    public void setFecha_stock(String fecha_stock) 
    {
        this.fecha_stock = fecha_stock;
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
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.fecha_stock);
        hash = 37 * hash + Objects.hashCode(this.cod_prod);
        hash = 37 * hash + this.cantidad;
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
        final Master_StockDTO other = (Master_StockDTO) obj;
        if (!Objects.equals(this.fecha_stock, other.fecha_stock)) 
        {
            return false;
        }
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
        return "Master_StockDTO{" + "fecha_stock=" + fecha_stock + ", cod_prod=" + cod_prod + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
    
    
    
}
 