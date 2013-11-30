
package com.sistemapos.sistemadatos.dto;

import java.io.Serializable;
import java.util.Objects;

 
public class Cod_PagoDTO implements Serializable
{
    private int cod_pag;
    private String nombre_pago;

    public Cod_PagoDTO()
    {
        
    }

    public Cod_PagoDTO(int cod_pag, String nombre_pago) 
    {
        this.cod_pag = cod_pag;
        this.nombre_pago = nombre_pago;
    }

    public int getCod_pag() 
    {
        return cod_pag;
    }

    public void setCod_pag(int cod_pag) 
    {
        this.cod_pag = cod_pag;
    }

    public String getNombre_pago() 
    {
        return nombre_pago;
    }

    public void setNombre_pago(String nombre_pago)
    {
        this.nombre_pago = nombre_pago;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.cod_pag;
        hash = 67 * hash + Objects.hashCode(this.nombre_pago);
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
        final Cod_PagoDTO other = (Cod_PagoDTO) obj;
        if (this.cod_pag != other.cod_pag) 
        {
            return false;
        }
        if (!Objects.equals(this.nombre_pago, other.nombre_pago))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Cod_pago{" + "cod_pag=" + cod_pag + ", nombre_pago=" + nombre_pago + '}';
    }
  
}
