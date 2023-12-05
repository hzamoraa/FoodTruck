/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.Controller;


import foodtruck.entity.Tortillas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Hiran PC
 */
public class TortillasController {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    
    
    public TortillasController(){
    if(emf == null && em == null){
    emf = Persistence.createEntityManagerFactory("PU");
    em = emf.createEntityManager();
    }
    }
    
    public Tortillas instanceTortilla(String n){
        return new Tortillas(n);
    }
    
    public void CrearTortilla(String nombre)throws Exception{
        Tortillas T = new Tortillas(nombre);
        
        em.getTransaction().begin();
        em.persist(T);
        em.getTransaction().commit();
    }
    
    public void BorrarTortilla(Long id){
        Tortillas T = em.find(Tortillas.class, id);
        
//        
        
        em.getTransaction().begin();
        em.remove(T);
        em.getTransaction().commit();
                
    }
    
    public Tortillas getTortilla(Long id)throws Exception{
        return em.find(Tortillas.class, id);
    }
    
    public void Modificar(String nombre, Long id){
    
        Tortillas T;
   T = em.find(Tortillas.class, id);
    
    if(T!= null){
    T.setNombre(nombre);
    
    
    em.getTransaction().begin();
    em.persist(T);
    em.getTransaction().commit();
    }else{
            System.out.println("No existe la tortilla");
    }
    
    }
    
    
    public List<Tortillas> listar(){
        
     Query q = em.createQuery("Select T from Tortillas T");
     
      List<Tortillas> tortillas;
        tortillas = q.getResultList();
        return tortillas;
    }
        
    
    
    
   
    
    
    
    
}


