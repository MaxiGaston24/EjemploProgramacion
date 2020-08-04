package com.inezpre5.modelo;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Modelos {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nombre;
    private Marcas marca;
 
    public Modelos() {
        super();
    }
    public Modelos(String nombre, Marcas marca) {
        this.nombre = nombre;
        this.marca = marca;
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
        this.nombre = nombre;
    }
    public Marcas getMarca() {
        return marca;
    }
    public void setMarca(Marcas marca) {
        this.marca = marca;
    }
    ;
}