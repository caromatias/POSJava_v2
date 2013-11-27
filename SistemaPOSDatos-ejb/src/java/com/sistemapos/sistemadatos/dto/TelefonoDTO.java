
package com.sistemapos.sistemadatos.dto;

import java.util.Objects;


public class TelefonoDTO 
{
    private int id_tel;
    private String cod_dueno;
    private int numero;
    private int tipo_numero;
    private int categoria;

    public TelefonoDTO() 
    {
        
    }

    public TelefonoDTO(int id_tel, String cod_dueno, int numero, int tipo_numero, int categoria) 
    {
        this.id_tel = id_tel;
        this.cod_dueno = cod_dueno;
        this.numero = numero;
        this.tipo_numero = tipo_numero;
        this.categoria = categoria;
    }

    public int getId_tel() {
        return id_tel;
    }

    public void setId_tel(int id_tel) {
        this.id_tel = id_tel;
    }

    public String getCod_dueno() {
        return cod_dueno;
    }

    public void setCod_dueno(String cod_dueno) {
        this.cod_dueno = cod_dueno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo_numero() {
        return tipo_numero;
    }

    public void setTipo_numero(int tipo_numero) {
        this.tipo_numero = tipo_numero;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id_tel;
        hash = 17 * hash + Objects.hashCode(this.cod_dueno);
        hash = 17 * hash + this.numero;
        hash = 17 * hash + this.tipo_numero;
        hash = 17 * hash + this.categoria;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TelefonoDTO other = (TelefonoDTO) obj;
        if (this.id_tel != other.id_tel) {
            return false;
        }
        if (!Objects.equals(this.cod_dueno, other.cod_dueno)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.tipo_numero != other.tipo_numero) {
            return false;
        }
        if (this.categoria != other.categoria) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TelefonoDTO{" + "id_tel=" + id_tel + ", cod_dueno=" + cod_dueno + ", numero=" + numero + ", tipo_numero=" + tipo_numero + ", categoria=" + categoria + '}';
    }
    
    
    
    
    
}
