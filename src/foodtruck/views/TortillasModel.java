/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.views;

import foodtruck.Controller.TortillasController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hiran PC
 */
public class TortillasModel  extends AbstractTableModel{

    private EntityManagerFactory emf;
    private EntityManager em;
    private TortillasController tc;
    
    
    public TortillasModel(){
     
        tc = new TortillasController();
        
    } 
    
    
    @Override
    public int getRowCount() {
        return this.tc.listar().size();     
        
    }

  

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       if(columnIndex == 0){
         return tc.listar().get(rowIndex).getId();
       }
       if(columnIndex ==1){
         return  tc.listar().get(rowIndex).getNombre();
       }else{
       
       return "";
        
    }
    }

    @Override
    public int getColumnCount() {
    
    return 2;
    }

    
    
}





