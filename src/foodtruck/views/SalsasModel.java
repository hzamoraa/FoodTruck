/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.views;

import foodtruck.Controller.SalsasController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.table.AbstractTableModel;




public class SalsasModel  extends AbstractTableModel {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    private SalsasController sc;
    
public SalsasModel(){

sc = new SalsasController();

}    
    

    @Override
    public int getRowCount() {
        return this.sc.listar().size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
         return sc.listar().get(rowIndex).getId();
       }
       if(columnIndex ==1){
         return  sc.listar().get(rowIndex).getNombre();
       }if(columnIndex == 2){
       return sc.listar().get(rowIndex).getPicor();
       }else{
       
       return "";
        
    }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        String[] nombres = {"ID", "Nombre", "Picor"};
        return nombres[columnIndex];
    }
    
}
