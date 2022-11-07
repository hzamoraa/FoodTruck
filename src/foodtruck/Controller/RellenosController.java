/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.Controller;

import foodtruck.entity.Rellenos;
import foodtruck.entity.Tortillas;
import foodtruck.views.RellenosView;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Hiran PC
 */
public class RellenosController {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    
    
    public RellenosController(){
    emf = Persistence.createEntityManagerFactory("PU");
    em = emf.createEntityManager();
    }
    
    
    
    
    public void CrearRelleno(String nombre){
        Rellenos Re = new Rellenos(nombre);
        
        em.getTransaction().begin();
        em.persist(Re);
        em.getTransaction().commit();
        
    }
    
    public void BorrarRelleno(Long id){
    
    Rellenos Re = em.find(Rellenos.class, id);
    
    
        em.getTransaction().begin();
        em.remove(Re);
        em.getTransaction().commit();
    
     }
    
    public void ModificarRelleno(String nombre, Long id){
       Rellenos  R;
   R = em.find(Rellenos.class, id);
    
    if(R!= null){
    R.setNombre(nombre);
    
    
    em.getTransaction().begin();
    em.persist(R);
    em.getTransaction().commit();
    }
    }
    
    public List<Rellenos> listar (){
    
    Query q = em.createQuery("Select Re from Rellenos Re");
    
    return q.getResultList();
    }
    
     public String getColumnName(int i){
    
        switch (i) {
            case 0:
                return "id";
               
            case 1:
                return "nombre";
                
                
            default:
               return "";
        }
    
    }
    
    
    
    
}
