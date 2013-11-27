
package com.sistemapos.sistemadatos.dto;

import java.util.Objects;


public class Tipo_InformeDTO 
{
    private int tipo_inf;
    private String nombre_informe;
    private String descr_informe;

    public Tipo_InformeDTO() 
    {
        
    }

    public Tipo_InformeDTO(int tipo_inf, String nombre_informe, String descr_informe) 
    {
        this.tipo_inf = tipo_inf;
        this.nombre_informe = nombre_informe;
        this.descr_informe = descr_informe;
    }

    public int getTipo_inf() 
    {
        return tipo_inf;
    }

    public void setTipo_inf(int tipo_inf) 
    {
        this.tipo_inf = tipo_inf;
    }

    public String getNombre_informe() 
    {
        return nombre_informe;
    }

    public void setNombre_informe(String nombre_informe) 
    {
        this.nombre_informe = nombre_informe;
    }

    public String getDescr_informe() 
    {
        return descr_informe;
    }

    public void setDescr_informe(String descr_informe) 
    {
        this.descr_informe = descr_informe;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 67 * hash + this.tipo_inf;
        hash = 67 * hash + Objects.hashCode(this.nombre_informe);
        hash = 67 * hash + Objects.hashCode(this.descr_informe);
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
        final Tipo_InformeDTO other = (Tipo_InformeDTO) obj;
        if (this.tipo_inf != other.tipo_inf) 
        {
            return false;
        }
        if (!Objects.equals(this.nombre_informe, other.nombre_informe)) 
        {
            return false;
        }
        if (!Objects.equals(this.descr_informe, other.descr_informe)) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Tipo_Informe{" + "tipo_inf=" + tipo_inf + ", nombre_informe=" + nombre_informe + ", descr_informe=" + descr_informe + '}';
    }

}
