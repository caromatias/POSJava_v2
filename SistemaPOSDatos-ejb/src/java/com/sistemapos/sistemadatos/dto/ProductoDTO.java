
package com.sistemapos.sistemadatos.dto;

import java.util.Objects;


public class ProductoDTO 
{
    private String cod_prod;
    private String categoria_cod_cat;//fk categoria
    private String nombre_prod;
    private String desc_prod;
    private int precio_venta;

    public ProductoDTO() 
    {
    }

    public ProductoDTO(String cod_prod, String categoria_cod_cat, String nombre_prod, String desc_prod, int precio_venta) 
    {
        this.cod_prod = cod_prod;
        this.categoria_cod_cat = categoria_cod_cat;
        this.nombre_prod = nombre_prod;
        this.desc_prod = desc_prod;
        this.precio_venta = precio_venta;
    }

    public String getCod_prod() 
    {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) 
    {
        this.cod_prod = cod_prod;
    }

    public String getCategoria_cod_cat() 
    {
        return categoria_cod_cat;
    }

    public void setCategoria_cod_cat(String categoria_cod_cat) 
    {
        this.categoria_cod_cat = categoria_cod_cat;
    }

    public String getNombre_prod() 
    {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) 
    {
        this.nombre_prod = nombre_prod;
    }

    public String getDesc_prod() 
    {
        return desc_prod;
    }

    public void setDesc_prod(String desc_prod) 
    {
        this.desc_prod = desc_prod;
    }

    public int getPrecio_venta() 
    {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) 
    {
        this.precio_venta = precio_venta;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.cod_prod);
        hash = 53 * hash + Objects.hashCode(this.categoria_cod_cat);
        hash = 53 * hash + Objects.hashCode(this.nombre_prod);
        hash = 53 * hash + Objects.hashCode(this.desc_prod);
        hash = 53 * hash + this.precio_venta;
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
        final ProductoDTO other = (ProductoDTO) obj;
        if (!Objects.equals(this.cod_prod, other.cod_prod)) 
        {
            return false;
        }
        if (!Objects.equals(this.categoria_cod_cat, other.categoria_cod_cat)) 
        {
            return false;
        }
        if (!Objects.equals(this.nombre_prod, other.nombre_prod)) 
        {
            return false;
        }
        if (!Objects.equals(this.desc_prod, other.desc_prod))
        {
            return false;
        }
        if (this.precio_venta != other.precio_venta) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "ProductoDTO{" + "cod_prod=" + cod_prod + ", categoria_cod_cat=" + categoria_cod_cat + ", nombre_prod=" + nombre_prod + ", desc_prod=" + desc_prod + ", precio_venta=" + precio_venta + '}';
    }
    
    
    
    
}
