/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.sominprojectweb.persistencia;

import co.edu.sena.sominprojectweb.logica.Producto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahs43
 */
public class ControladoraPersistencia {
    
     ProductoJpaController productoJpaController = new ProductoJpaController();
   
     
     
     
     
    public void registrarProducto(Producto p){
    
        
         try {
             productoJpaController.create(p);
         } catch (Exception ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    
     
public List<Producto> listarProducto(){

return productoJpaController.findProductoEntities();

}
    
}
