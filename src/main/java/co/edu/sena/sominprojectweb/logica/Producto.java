/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.sominprojectweb.logica;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Producto implements Serializable {
    
    @Id
   private int id;
   private String nombre;
   private int valor;
   private int existencias;

    public Producto(int id, String nombre, int valor, int existencias) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.existencias = existencias;
    }

    public Producto() {
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", valor=" + valor + ", existencias=" + existencias + '}';
    }
   
   
    
    
}
