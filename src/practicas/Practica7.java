package practicas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author eliwrosalesfernandez
 */
public class Practica7 extends javax.swing.JFrame {

    /**
     * Creates new form Practica7
     */
    public Practica7() {
        initComponents();
        
        this.lbHoras.setText(Integer.toString(this.slHoras.getValue()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        rbWindows = new javax.swing.JRadioButton();
        rbLinux = new javax.swing.JRadioButton();
        rbMac = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cbProgramacion = new javax.swing.JCheckBox();
        cbAdminis = new javax.swing.JCheckBox();
        cbDiseno = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        slHoras = new javax.swing.JSlider();
        lbHoras = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Encuesta");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Horas que le dedicas al ordenador");

        buttonGroup1.add(rbWindows);
        rbWindows.setSelected(true);
        rbWindows.setText("Windows");
        rbWindows.setToolTipText("");
        rbWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbWindowsActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbLinux);
        rbLinux.setText("Linux");
        rbLinux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLinuxActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMac);
        rbMac.setText("MacOs");
        rbMac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMacActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Elige tu Sistema Operativo");

        cbProgramacion.setText("Programacion");
        cbProgramacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProgramacionActionPerformed(evt);
            }
        });

        cbAdminis.setText("Administracion");
        cbAdminis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdminisActionPerformed(evt);
            }
        });

        cbDiseno.setText("Diseño Grafico");
        cbDiseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDisenoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Elige tu Especialidad ");

        slHoras.setMaximum(24);
        slHoras.setValue(0);
        slHoras.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slHorasStateChanged(evt);
            }
        });

        lbHoras.setText("4");
        lbHoras.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btGuardar.setText("Generar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbWindows)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbMac)
                            .addComponent(rbLinux))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(slHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(cbProgramacion)
                                        .addComponent(cbAdminis)
                                        .addComponent(cbDiseno))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbAdminis, cbDiseno, cbProgramacion});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rbLinux, rbMac, rbWindows});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbWindows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbLinux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMac)
                .addGap(8, 8, 8)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(cbProgramacion)
                .addGap(4, 4, 4)
                .addComponent(cbDiseno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAdminis)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btGuardar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //RadioButtons
    private void rbLinuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLinuxActionPerformed

    }//GEN-LAST:event_rbLinuxActionPerformed

    private void rbWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbWindowsActionPerformed
        
    }//GEN-LAST:event_rbWindowsActionPerformed

    private void rbMacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMacActionPerformed
        
    }//GEN-LAST:event_rbMacActionPerformed

    
    
    //CheckBoxs
    private void cbProgramacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProgramacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProgramacionActionPerformed

    private void cbDisenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDisenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDisenoActionPerformed

    private void cbAdminisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdminisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdminisActionPerformed

    
    
    //Slaider
    private void slHorasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slHorasStateChanged
        this.lbHoras.setText(Integer.toString(this.slHoras.getValue()));
    }//GEN-LAST:event_slHorasStateChanged

    
    
    //Button
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
       String sSisOper = "";
       String sProg = "N";
       String sDiseno = "N";
       String sAdmon = "N";
       String sHoras = "";
       
//       Sistema Operativo
       if(this.rbWindows.isSelected()){
           sSisOper = "Windows";
       }
       
       if(this.rbLinux.isSelected()){
           sSisOper = "Linux";
       }
       
       if(this.rbMac.isSelected()){
           sSisOper = "Mac";
       }
       
//       Especialidad

       if(this.cbProgramacion.isSelected()){
           sProg = "Programacion";
       }
       
       if(this.cbDiseno.isSelected()){
           sDiseno = "Diseño";
       }
       
       if(this.cbAdminis.isSelected()){
           sAdmon = "Administracion";
       }
       
       sHoras = String.valueOf(this.slHoras.getValue());
       
       guardarEnArchivo(sSisOper,sProg,sDiseno,sAdmon,sHoras);
        
       JOptionPane.showMessageDialog(this,"Guardado","Encuesta",JOptionPane.INFORMATION_MESSAGE );
    }//GEN-LAST:event_btGuardarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Practica7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbAdminis;
    private javax.swing.JCheckBox cbDiseno;
    private javax.swing.JCheckBox cbProgramacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbHoras;
    private javax.swing.JRadioButton rbLinux;
    private javax.swing.JRadioButton rbMac;
    private javax.swing.JRadioButton rbWindows;
    private javax.swing.JSlider slHoras;
    // End of variables declaration//GEN-END:variables

    private void guardarEnArchivo(String sSisOper, String sProg, String sDiseno, String sAdmon, String sHoras) {
    
        try {
            FileWriter fw = new FileWriter("encuesta.csv",true);
            fw.write(sSisOper+","+sProg+","+sDiseno+","+sAdmon+","+sHoras+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Practica7.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
