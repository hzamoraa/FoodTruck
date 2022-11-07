/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author meme
 */
public class TacosController {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    
    public TacosController(){
    emf =Persistence.createEntityManagerFactory("PU");
    em = emf.createEntityManager();
    
    }
    
    
    
    
    
    
}
