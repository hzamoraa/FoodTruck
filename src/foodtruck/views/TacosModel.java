/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtruck.views;

import foodtruck.Controller.TacosController;
import foodtruck.entity.TacoStorage;
import foodtruck.entity.Tacos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hiran PC
 */
public class TacosModel extends AbstractTableModel{
    
    String query;
    TacoStorage estado;

    public TacosModel(String s, TacoStorage e) {
        this.query = s;
        this.estado = e;
    }

    public TacosModel() {
        this.query = "Tacos";
        this.estado = TacoStorage.Pedido;
    }

    @Override
    public int getRowCount() {
        TacosController t = new TacosController();
        return t.getTacoList(this.query, this.estado).size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TacosController t = new TacosController();
        List<Tacos> tl = t.getTacoList(this.query, this.estado);
        switch (columnIndex) {
            case 0:
                return tl.get(rowIndex).getId();
            case 1:
                return tl.get(rowIndex).getTortilla().getNombre();
            case 2:
                return tl.get(rowIndex).getRelleno1().getNombre();
            case 3:
                if (tl.get(rowIndex).getRelleno2() != null) {
                    return tl.get(rowIndex).getRelleno2().getNombre();
                } else {
                    return " - ";
                }
            case 4:
                if (tl.get(rowIndex).getRelleno3() != null) {
                    return tl.get(rowIndex).getRelleno3().getNombre();
                } else {
                    return " - ";
                }
            case 5:
                return tl.get(rowIndex).getSalsa().getNombre();
            case 6:
                return tl.get(rowIndex).getState();
            case 7:
                return tl.get(rowIndex).getDate().toString();
            default:
                return null;

        }

    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] nombres = {"ID", "Tortilla", "Relleno 1", "Relleno 2", "Relleno 3", "Salsa", "Estado", "Fecha"};
        return nombres[columnIndex];
    }
}
