/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.Controller;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import foodtruck.entity.Rellenos;
import foodtruck.entity.Salsas;
import foodtruck.entity.Tacos;
import foodtruck.entity.TacoStorage;
import foodtruck.entity.Tortillas;

/**
 *
 * @author meme
 */
public class TacosController {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    
    public TacosController(){
    if(emf == null && em == null){
        emf =Persistence.createEntityManagerFactory("PU");
    em = emf.createEntityManager();
    
    }
    }
    
    public void createTaco(Tortillas to, Rellenos r1, Rellenos r2, Rellenos r3, Salsas s) throws Exception {
        
        Tacos ta = new Tacos(to, r1, r2, r3, s, TacoStorage.Pedido, new Date());
        em.getTransaction().begin();
        em.persist(ta);
        em.getTransaction().commit();
    }

    public List<Tacos> getTacoList(String x, TacoStorage s){
        if("Tacos".equals(x)){
            return em.createNamedQuery("list "+x).getResultList();
        }else{
            Query q = em.createNamedQuery("list "+x);
            q.setParameter("e", s);
            return q.getResultList();
        }
        
    }
    
    public void deleteTaco(Long id){
        Tacos t;
        t = em.find(Tacos.class, id);
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
    }
    
    public Tacos getTaco(Long id){
        return em.find(Tacos.class, id);
    }
    
    public void updateTaco(Tortillas to, Rellenos r1, Rellenos r2, Rellenos r3, Salsas s, Long id){
        Tacos t = em.find(Tacos.class, id);
        
        if(t!=null){            
            t.setRelleno1(r1);
            t.setRelleno2(r2);
            t.setRelleno3(r3);
            t.setTortilla(to);
            t.setSalsa(s);
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }else{            
            System.out.println("NO EXISTE EL TACO");
        }        
    }
    
    public void updateStateTaco(Long id, TacoStorage s){
        Tacos t = em.find(Tacos.class, id);
        
        if(t!=null){            
            t.setState(s);
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }else{            
            System.out.println("NO EXISTE EL TACO");
        }  
    }
    
    
    
}
