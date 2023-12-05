/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.NamedQuery;

/**
 *
 * @author Hiran PC
 */
@Entity
@Table(name = "Rellenos")
@NamedQuery(name="list Rellenos", query="SELECT p FROM Rellenos p")
public class Rellenos implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    @Column(name = "Nombre")
    private String nombre;
    
    
    
    
    

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
     @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.id);
        hash = 61 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rellenos other = (Rellenos) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
    public Rellenos(){}
    
    
    public Rellenos(String nombre){
   
    this.nombre=nombre;
    }


    @Override
    public String toString() {
        return "Relleno{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
