package com.inezpre5.modelo;
 
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
 
@Entity
@Table(name="marcas")
public class Marcas{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nombre;
    private Modelos modelos;
 
    public Marcas() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    public Marcas(String nombre) {
        nombre = nombre;
    }
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        nombre = nombre;
    }
    public Modelos getModelos() {
        return modelos;
    }
    public void setModelos(Modelos modelos) {
        this.modelos = modelos;
    }
 
}