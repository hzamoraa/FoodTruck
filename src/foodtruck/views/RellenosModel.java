/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.views;

import foodtruck.Controller.RellenosController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hiran PC
 */
public class RellenosModel extends AbstractTableModel{
    
    
    private EntityManagerFactory emf;
    private EntityManager em;
    private RellenosController Rc;
    
    
    
    
    public RellenosModel(){
    
        Rc = new RellenosController();
        
    }
      
    
    
    

    @Override
    public int getRowCount() {
      return this.Rc.listar().size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
         if(columnIndex == 0){
         return Rc.listar().get(rowIndex).getId();
       }
       if(columnIndex ==1){
         return  Rc.listar().get(rowIndex).getNombre();
       }else{
       
       return "";
        
    } 
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        String[] nombres = {"ID", "Nombre"};
        return nombres[columnIndex];
    }
}
