/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.views;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import foodtruck.Controller.TortillasController;
import foodtruck.entity.Tortillas;

/**
 *
 * @author Hiran PC
 */
public class CondimentosModel extends AbstractTableModel{
    @Override
    public int getRowCount() {
        TortillasController t = new TortillasController();
        try {
            return t.listar().size();
        } catch (Exception ex) {
            Logger.getLogger(CondimentosModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        TortillasController t = new TortillasController();
        List<Tortillas> ts;
        try {
            ts = t.listar();
            switch (columnIndex) {
            case 0:
                return ts.get(rowIndex).getId();
                //return a.listar().get(rowIndex).getId();
            case 1:
                return ts.get(rowIndex).getNombre();
            default:
                return null;
        }
        } catch (Exception ex) {
            Logger.getLogger(CondimentosModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        String[] nombres = {"ID", "Nombre"};
        return nombres[columnIndex];
    }
}
