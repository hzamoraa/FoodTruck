/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.Controller;

import foodtruck.entity.Rellenos;
import foodtruck.entity.Salsas;
import foodtruck.entity.Tortillas;
import foodtruck.views.SalsasView;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Hiran PC
 */
public class SalsasController {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    
    public SalsasController(){
    emf = Persistence.createEntityManagerFactory("PU");
    em = emf.createEntityManager();
    }
    
    
    public void CrearSalsa(String nombre, int picor){
        Salsas S = new Salsas(nombre, picor);
        
        em.getTransaction().begin();
        em.persist(S);
        em.getTransaction().commit();
    }
    
    public void BorrarSalsa(Long id){
        Salsas S = em.find(Salsas.class, id);
        
        
        
        em.getTransaction().begin();
        em.remove(S);
        em.getTransaction().commit();
                
    }
    
    public void Modificar(String nombre , int picor, Long id){
    
    Salsas S;
   S = em.find(Salsas.class, id);
    
    if(S!= null){
    S.setNombre(nombre);
    S.setPicor(picor);
   
    
    
    em.getTransaction().begin();
    em.persist(S);
    em.getTransaction().commit();
    }
    
    }
    
    
    public List<Salsas> listar(){
        
     Query q = em.createQuery("Select s from Salsas S");
     
     return q.getResultList();
    }
        
    
    
    
    public String getColumnName(int i){
    
        switch (i) {
            case 0:
                return "id";
               
            case 1:
                return "nombre";
                
            case 2:
                return "picor";
                
            default:
               return "";
        }
    
    }
    
    
    
    
    
}
