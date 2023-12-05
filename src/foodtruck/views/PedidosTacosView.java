/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package foodtruck.views;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import foodtruck.Controller.RellenosController;
import foodtruck.Controller.SalsasController;
import foodtruck.Controller.TacosController;
import foodtruck.Controller.TortillasController;

/**
 *
 * @author Hiran PC
 */
public class PedidosTacosView extends javax.swing.JPanel {

    /**
     * Creates new form PedidosTacosView
     */
    public PedidosTacosView() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtTittle = new javax.swing.JLabel();
        txTortilla = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txRelleno1 = new javax.swing.JLabel();
        txRelleno2 = new javax.swing.JLabel();
        txRelleno3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txSalsa = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdateBD = new javax.swing.JButton();

        jTable1.setModel(new CondimentosModel());
        jScrollPane1.setViewportView(jTable1);

        txtTittle.setText("TACO :");

        jLabel1.setText("Tortilla");

        jLabel2.setText("Rellenos");

        jLabel3.setText("Salsa");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tortilla", "Relleno", "Salsa" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirmar Pedido");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnClear.setText("Nuevo Pedido");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUpdateBD.setText("Actualizar Base de Datos");
        btnUpdateBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtTittle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnAdd)
                        .addGap(60, 60, 60)
                        .addComponent(btnConfirm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addGap(60, 60, 60)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btnUpdateBD))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txTortilla, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txRelleno1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txRelleno2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txRelleno3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTittle)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txTortilla, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txRelleno1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txRelleno2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txRelleno3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear)
                    .addComponent(btnUpdateBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnConfirm))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String s = (String) this.jComboBox1.getSelectedItem();
        switch(s){
            case "Tortilla":{
                this.addTortilla();
                break;
            }
            case "Salsa":{
                this.addSalsa();
                break;
            }
            case "Relleno":{
                this.addRellno();
                break;
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         String s = (String) this.jComboBox1.getSelectedItem();
        switch(s){
            case "Tortilla":{
                this.jTable1.setModel(new CondimentosModel());
                this.jTable1.updateUI();
                break;
            }
            case "Salsa":{                
                this.jTable1.setModel(new SalsasModel());
                this.jTable1.updateUI();
                break;
            }
            case "Relleno":{
                this.jTable1.setModel(new RellenosModel());
                this.jTable1.updateUI();
                break;
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
         this.clearTaco();
        this.jComboBox1ActionPerformed(evt);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        if(!this.txRelleno1.getText().isEmpty()  && !this.txTortilla.getText().isEmpty() && !this.txSalsa.getText().isEmpty()){
            try {
                this.tacosController.createTaco(
                        this.tortillasController.getTortilla(idTortilla),
                        this.rellenosController.getRelleno(idsRelleno[0]),
                        this.rellenosController.getRelleno(idsRelleno[1]),
                        this.rellenosController.getRelleno(idsRelleno[2]),
                        this.salsasController.getSalsa(idSalsa));               
            } catch (Exception ex) {
                Logger.getLogger(PedidosTacosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.clearTaco();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnUpdateBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBDActionPerformed
        // TODO add your handling code here:
        this.jTable1.updateUI();
    }//GEN-LAST:event_btnUpdateBDActionPerformed
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
            java.util.logging.Logger.getLogger(PedidosTacosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidosTacosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidosTacosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidosTacosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidosTacosView().setVisible(true);
            }
        });
    }


    private Long[] idsRelleno={0l, 0l, 0l};
    private Long idTortilla=0l;
    private Long idSalsa=0l;
    private TacosController tacosController = new TacosController();
    private TortillasController tortillasController = new TortillasController();
    private SalsasController salsasController = new SalsasController();
    private RellenosController rellenosController= new RellenosController();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnUpdateBD;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txRelleno1;
    private javax.swing.JLabel txRelleno2;
    private javax.swing.JLabel txRelleno3;
    private javax.swing.JLabel txSalsa;
    private javax.swing.JLabel txTortilla;
    private javax.swing.JLabel txtTittle;
    // End of variables declaration//GEN-END:variables


private void addTortilla(){
        int row = this.jTable1.getSelectedRow();
        idTortilla = (Long) this.jTable1.getValueAt(row, 0);
        try {
            this.txTortilla.setText(this.tortillasController.getTortilla(idTortilla).getNombre());
        } catch (Exception ex) {
            Logger.getLogger(PedidosTacosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void addRellno(){
        int row = this.jTable1.getSelectedRow();
        if(row>-1){
            if(idsRelleno[0]!=0l){
                if(idsRelleno[1]!=0l){
                    if(idsRelleno[2]==0l){
                      if(!Objects.equals(this.jTable1.getValueAt(row, 0), idsRelleno[0]) && !Objects.equals(this.jTable1.getValueAt(row, 0), idsRelleno[1])){
                        idsRelleno[2]= (Long) this.jTable1.getValueAt(row, 0);
                        try {
                            this.txRelleno3.setText(this.rellenosController.getRelleno(idsRelleno[2]).getNombre());
                        } catch (Exception ex) {
                            Logger.getLogger(PedidosTacosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                      }
                    }                    
                }else{
                    if(!Objects.equals(this.jTable1.getValueAt(row, 0), idsRelleno[0])){
                        idsRelleno[1]= (Long) this.jTable1.getValueAt(row, 0);
                        try {
                            this.txRelleno2.setText(this.rellenosController.getRelleno(idsRelleno[1]).getNombre());
                        } catch (Exception ex) {
                            Logger.getLogger(PedidosTacosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }else{
                idsRelleno[0]= (Long) this.jTable1.getValueAt(row, 0);
                try {
                    this.txRelleno1.setText(this.rellenosController.getRelleno(idsRelleno[0]).getNombre());
                } catch (Exception ex) {
                    Logger.getLogger(PedidosTacosView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    private void addSalsa(){
        int row = this.jTable1.getSelectedRow();
        idSalsa = (Long) this.jTable1.getValueAt(row, 0);
        try {
            this.txSalsa.setText(this.salsasController.getSalsa(idSalsa).getNombre());
        } catch (Exception ex) {
            Logger.getLogger(PedidosTacosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clearTaco(){
        idSalsa=0l;
        idTortilla=0l;
        idsRelleno[0]= 0l;
        idsRelleno[1]= 0l;
        idsRelleno[2]= 0l;
        this.txRelleno1.setText("");
        this.txRelleno2.setText("");
        this.txRelleno3.setText("");
        this.txTortilla.setText("");
        this.txSalsa.setText("");
    }





}