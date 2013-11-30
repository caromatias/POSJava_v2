
package com.sistemapos.sistemadatos.dto;

import java.io.Serializable;
import java.util.Objects;


public class ClienteDTO implements Serializable
{
    private String cod_cli;
    private String nombre_cli;
    private String fec_nace;

    public ClienteDTO() 
    {
        
    }
      
    public ClienteDTO(String cod_cli, String nombre_cli, String fec_nace)
    {
        this.cod_cli = cod_cli;
        this.nombre_cli = nombre_cli;
        this.fec_nace = fec_nace;
    }

    public String getCod_cli() 
    {
        return cod_cli;
    }

    public void setCod_cli(String cod_cli)
    {
        this.cod_cli = cod_cli;
    }

    public String getNombre_cli() 
    {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) 
    {
        this.nombre_cli = nombre_cli;
    }

    public String getFec_nace() 
    {
        return fec_nace;
    }

    public void setFec_nace(String fec_nace) 
    {
        this.fec_nace = fec_nace;
    }

    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.cod_cli);
        hash = 13 * hash + Objects.hashCode(this.nombre_cli);
        hash = 13 * hash + Objects.hashCode(this.fec_nace);
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
        final ClienteDTO other = (ClienteDTO) obj;
        if (!Objects.equals(this.cod_cli, other.cod_cli)) 
        {
            return false;
        }
        if (!Objects.equals(this.nombre_cli, other.nombre_cli))
        {
            return false;
        }
        if (!Objects.equals(this.fec_nace, other.fec_nace)) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "ClienteDTO{" + "cod_cli=" + cod_cli + ", nombre_cli=" + nombre_cli + ", fec_nace=" + fec_nace + '}';
    }
        
}