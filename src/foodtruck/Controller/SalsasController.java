/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.Controller;

import foodtruck.entity.Rellenos;
import foodtruck.entity.Salsas;
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
public class SalsasController {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    
    public SalsasController(){
        if(emf == null && em == null){
    emf = Persistence.createEntityManagerFactory("PU");
    em = emf.createEntityManager();
    }
    }
    public Salsas instanceSalsa(String n, int p){
        return new Salsas(n, p);
    }
    
    public void CrearSalsa(String nombre, int picor)throws Exception{
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
     public Salsas getSalsa(Long id)throws Exception{
        return em.find(Salsas.class, id);
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
        
    
    
    
    
    
    }
    
    
    
    
    

