/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package foodtruck.views;
import java.util.logging.Level;
import java.util.logging.Logger;
import foodtruck.entity.Rellenos;
import foodtruck.entity.Salsas;
import foodtruck.entity.Tortillas;
import foodtruck.Controller.RellenosController;
import foodtruck.Controller.TortillasController;
import foodtruck.Controller.SalsasController;

/**
 *
 * @author Hiran PC
 */
public class CondimentosView extends javax.swing.JPanel {

    /**
     * Creates new form CondimentosView
     */
    public CondimentosView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        etNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etPicor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel1.setText("Nombre");

        etNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Picor");

        jTable1.setModel(new CondimentosModel());
        jScrollPane1.setViewportView(jTable1);

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelete.setText("Borrar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Modificar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tortillas", "Rellenos", "Salsas" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(etPicor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDelete)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnUpdate)))
                                .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(37, 37, 37)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etPicor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnNew)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void etNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNombreActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String s = (String) this.jComboBox1.getSelectedItem();
        switch(s){
            case "Tortilla":{
                this.jTable1.setModel(new CondimentosModel());
                this.jTable1.updateUI();
                this.lockSaveComponents(false);
                break;
            }
            case "Salsa":{                
                this.jTable1.setModel(new SalsasModel());
                this.jTable1.updateUI();
                this.lockSaveComponents(false);
                break;
            }
            case "Relleno":{
                this.jTable1.setModel(new RellenosModel());
                this.jTable1.updateUI();
                this.lockSaveComponents(false);
                break;
            }
            
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
//save
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String s = (String) this.jComboBox1.getSelectedItem();
        switch(s){
            case "Tortilla":
                this.saveTortilla();
                break;
            case "Salsa":
                this.saveSalsa();
                break;
            case "Relleno":
                this.saveRelleno();
        }
        this.emptyEditTexts();
        lockSaveComponents(false);
        this.btnDelete.setEnabled(true);
        this.btnUpdate.setEnabled(true);
        this.jTable1.updateUI();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        lockSaveComponents(true);
        this.emptyEditTexts();
        this.btnDelete.setEnabled(false);
        this.btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int i =this.jTable1.getSelectedRow();
        if(i>-1){
            String selec = (String) this.jComboBox1.getSelectedItem();
            switch(selec){
                case "Tortilla":
                    this.deleteTortilla(i);
                    break;
                case "Salsa":
                    this.deleteSalsa(i);
                    break;
                case "Relleno":
                    this.deleteRelleno(i);
            }
            this.jTable1.updateUI();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row>-1){
            String selec = (String) this.jComboBox1.getSelectedItem();
            switch(selec){
                case "Tortilla":
                    this.modifyTortilla(row);
                    break;
                case "Salsa":
                    this.modifySalsa(row);
                    break;
                case "Relleno":
                    this.modifyRelleno(row);
            }
            this.lockSaveComponents(true);
            this.btnDelete.setEnabled(false);
            this.btnUpdate.setEnabled(false);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void emptyEditTexts() {
        etNombre.setText("");
        etPicor.setText("");
        this.jLabel3.setText("");
    }
    

    private void lockSaveComponents(boolean l) {
        this.etNombre.setEnabled(l);
        this.etPicor.setEnabled(l);
        this.btnSave.setEnabled(l);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CondimentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CondimentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CondimentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CondimentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CondimentosView().setVisible(true);                
            }
        });

    }
Long id = 0L;
    private TortillasController tortillaController = new TortillasController();
    private SalsasController salsaController = new SalsasController();
    private RellenosController rellenoController= new RellenosController();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField etNombre;
    private javax.swing.JTextField etPicor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


public void saveTortilla(){
        if(this.id == 0){
            if (!"".equals(etNombre.getText())) {
                try {
                    tortillaController.CrearTortilla(etNombre.getText());


                } catch (Exception e) {
                    this.jLabel3.setText(e.getMessage());
                }

            }
        }else{
            try {
                this.tortillaController.Modificar(this.etNombre.getText(), this.id);
            } catch (Exception ex) {
                Logger.getLogger(CondimentosView.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.id=0L;
        }
    }
    
    public void modifyTortilla(int row){
        Long idTortilla = (Long) this.jTable1.getValueAt(row, 0);
        Tortillas tortilla;
        try {
            tortilla = tortillaController.getTortilla(idTortilla);            
            this.etNombre.setText(tortilla.getNombre());
            this.id = tortilla.getId();
        } catch (Exception ex) {
            Logger.getLogger(CondimentosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteTortilla(int i){
        Long idT = (Long) this.jTable1.getValueAt(i, 0);
        try {
            tortillaController.BorrarTortilla(idT);

        } catch (Exception ex) {
            Logger.getLogger(CondimentosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodos de Salsa
    public void saveSalsa(){
        if(this.id == 0){
            if (!"".equals(etNombre.getText())&&!"".equals(etPicor.getText())) {
                try {
                    salsaController.CrearSalsa(etNombre.getText(), Integer.parseInt(etPicor.getText()));


                } catch (Exception e) {
                    this.jLabel3.setText(e.getMessage());
                }

            }
        }else{
            try {
                this.salsaController.Modificar(this.etNombre.getText(), Integer.parseInt(this.etPicor.getText()), this.id);
            } catch (Exception ex) {
                Logger.getLogger(CondimentosView.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.id=0L;
        }
    }
    
    public void modifySalsa(int row){
        Long idSalsa = (Long) this.jTable1.getValueAt(row, 0);
            Salsas salsa;
            try {
                salsa = salsaController.getSalsa(idSalsa);            
                this.etNombre.setText(salsa.getNombre());
                this.etPicor.setText(Integer.toString(row));
                this.id = salsa.getId();
            } catch (Exception ex) {
                Logger.getLogger(CondimentosView.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void deleteSalsa(int i){
        Long idS = (Long) this.jTable1.getValueAt(i, 0);
            try {
                salsaController.BorrarSalsa(idS);

            } catch (Exception ex) {
                Logger.getLogger(CondimentosView.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    //metodos de Relleno
    public void saveRelleno(){
        if(this.id == 0){
            if (!"".equals(etNombre.getText())) {
                try {
                    this.rellenoController.CrearRelleno(this.etNombre.getText());
                } catch (Exception e) {
                    this.jLabel3.setText(e.getMessage());
                }
            }
        }else{
            try {
                this.rellenoController.ModificarRelleno(this.etNombre.getText(), this.id);
            } catch (Exception ex) {
                Logger.getLogger(CondimentosView.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.id=0L;
        }
    }
    
    public void modifyRelleno(int row){
        Long idRelleno = (Long) this.jTable1.getValueAt(row, 0);
        Rellenos relleno;
        try {
            relleno = this.rellenoController.getRelleno(idRelleno);
            this.etNombre.setText(relleno.getNombre());
            this.id = relleno.getId();
        } catch (Exception ex) {
            Logger.getLogger(CondimentosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteRelleno(int i){
        Long idT = (Long) this.jTable1.getValueAt(i, 0);
        try {
            this.rellenoController.BorrarRelleno(idT);

        } catch (Exception ex) {
            Logger.getLogger(CondimentosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }





}


