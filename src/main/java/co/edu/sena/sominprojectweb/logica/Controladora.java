/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.sominprojectweb.logica;

import co.edu.sena.sominprojectweb.persistencia.ControladoraPersistencia;
import java.util.List;




/**
 *
 * @author ahs43
 */
public class Controladora {
    
    
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void registrarProducto(Producto p){
    
    controladoraPersistencia.registrarProducto(p);
    
    }
    
    
   public List<Producto>listarProducto(){
   
       return controladoraPersistencia.listarProducto();
   
   }
   
   }        
   
   
   
 
