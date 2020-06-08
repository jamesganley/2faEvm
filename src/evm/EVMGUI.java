package evm;

import javax.swing.ButtonGroup;


/**
 *
 * @author James Ganley
 */
public class EVMGUI extends javax.swing.JFrame {

    /**
     * Creates new form EVMGUI
     */
    public EVMGUI() {
        initComponents();
        groupButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRadios = new javax.swing.JButton();
        rB1 = new javax.swing.JRadioButton();
        rB2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rB3 = new javax.swing.JRadioButton();
        rB4 = new javax.swing.JRadioButton();
        rB5 = new javax.swing.JRadioButton();
        rB6 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRadios.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        btnRadios.setText("Cast Vote");
        btnRadios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiosActionPerformed(evt);
            }
        });

        rB1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        rB1.setText("Jim Halbert");
        rB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rB1ActionPerformed(evt);
            }
        });

        rB2.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        rB2.setText("Kim Jong-un");
        rB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rB2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please select the candidate you wish to vote for and select cast vote");

        rB3.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        rB3.setText("George Washington");
        rB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rB3ActionPerformed(evt);
            }
        });

        rB4.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        rB4.setText("Mahatma Gandhi");
        rB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rB4ActionPerformed(evt);
            }
        });

        rB5.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        rB5.setText("Nelson Mandela");
        rB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rB5ActionPerformed(evt);
            }
        });

        rB6.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        rB6.setText("Napoleon Bonaparte");
        rB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rB6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRadios, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(438, 438, 438))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rB1)
                            .addComponent(rB2))
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rB3)
                            .addComponent(rB4))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rB6)
                            .addComponent(rB5))
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rB1)
                    .addComponent(rB3)
                    .addComponent(rB5))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rB2)
                    .addComponent(rB4)
                    .addComponent(rB6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnRadios)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupButton( ) {
        
        
    ButtonGroup bg1 = new ButtonGroup( );

    bg1.add(rB1);
    bg1.add(rB2);
    bg1.add(rB3);
    bg1.add(rB4);
    bg1.add(rB5);
    bg1.add(rB6);
    
    

}
    
    
    
    
    private void btnRadiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadiosActionPerformed
        // TODO add your handling code here:
        String radioText = "";
            int selection;
    selection = 0;

        
        if (rB1.isSelected()){
            radioText = rB1.getText();
            selection = 1;
        }
        if (rB2.isSelected()){
            radioText = rB2.getText();
            selection = 2;

        }
        if (rB3.isSelected()){
            radioText = rB3.getText();
            selection = 3;

        }
        if (rB4.isSelected()){
            radioText = rB4.getText();
            selection = 4;

        }
        if (rB5.isSelected()){
            radioText = rB5.getText();
            selection = 5;

        }
        if (rB6.isSelected()){
            radioText = rB6.getText();
            selection = 6;

        }
        
        
        
        
        javax.swing.JOptionPane.showMessageDialog( EVMGUI.this, "You are voting for '"+radioText+"'");
        System.exit(0);

    }//GEN-LAST:event_btnRadiosActionPerformed

    private void rB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rB1ActionPerformed

    private void rB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rB2ActionPerformed

    private void rB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rB3ActionPerformed

    private void rB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rB4ActionPerformed

    private void rB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rB6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rB6ActionPerformed

    private void rB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rB5ActionPerformed

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
            java.util.logging.Logger.getLogger(EVMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EVMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EVMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EVMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EVMGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRadios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rB1;
    private javax.swing.JRadioButton rB2;
    private javax.swing.JRadioButton rB3;
    private javax.swing.JRadioButton rB4;
    private javax.swing.JRadioButton rB5;
    private javax.swing.JRadioButton rB6;
    // End of variables declaration//GEN-END:variables
}
