/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainForms;

import Connection.ConnectionDB;
import javax.swing.JFrame;

/**
 *
 * @author João Vitor
 */
public class MenuForm extends javax.swing.JFrame {
    
   
    /**
     * 
     * Creates new form MenuForm
     */
    public MenuForm() {
     
        initComponents();
        CentralizarForm();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBtnOptionTwo = new javax.swing.JButton();
        jBtnOptionOne = new javax.swing.JButton();
        jBtnOptionFive = new javax.swing.JButton();
        jBtnOptionFour = new javax.swing.JButton();
        jBtnOptionThree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 21)); // NOI18N
        jLabel1.setText("QUIZ - Conhecimentos Gerais ");

        jBtnOptionTwo.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jBtnOptionTwo.setText("Jogar");
        jBtnOptionTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOptionTwoActionPerformed(evt);
            }
        });

        jBtnOptionOne.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jBtnOptionOne.setText("Introdução");

        jBtnOptionFive.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jBtnOptionFive.setText("Sair");
        jBtnOptionFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOptionFiveActionPerformed(evt);
            }
        });

        jBtnOptionFour.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jBtnOptionFour.setText("Créditos");
        jBtnOptionFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOptionFourActionPerformed(evt);
            }
        });

        jBtnOptionThree.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jBtnOptionThree.setText("Classificação");
        jBtnOptionThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOptionThreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBtnOptionOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(jBtnOptionTwo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnOptionFive, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnOptionFour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnOptionThree, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jBtnOptionOne, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jBtnOptionTwo)
                .addGap(33, 33, 33)
                .addComponent(jBtnOptionThree)
                .addGap(34, 34, 34)
                .addComponent(jBtnOptionFour)
                .addGap(30, 30, 30)
                .addComponent(jBtnOptionFive)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void CentralizarForm() {
        this.setLocationRelativeTo(null);
    }
    private void jBtnOptionFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOptionFourActionPerformed
        // TODO add your handling code here:
        CreditsForm creditsForm = new CreditsForm();
        creditsForm.setVisible(true);
        MenuForm.this.dispose();
    }//GEN-LAST:event_jBtnOptionFourActionPerformed

    private void jBtnOptionFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOptionFiveActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtnOptionFiveActionPerformed

    private void jBtnOptionTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOptionTwoActionPerformed
        // TODO add your handling code here:
        UserGame formUser = new UserGame();
        formUser.setVisible(true);
        MenuForm.this.dispose();

        
        
    }//GEN-LAST:event_jBtnOptionTwoActionPerformed

    private void jBtnOptionThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOptionThreeActionPerformed
        // TODO add your handling code here:
        RankForm form = new RankForm();
        form.setVisible(true);
        MenuForm.this.dispose();
    }//GEN-LAST:event_jBtnOptionThreeActionPerformed

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
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 ConnectionDB conn = new ConnectionDB();
                 conn.CreateTables();
                 new MenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnOptionFive;
    private javax.swing.JButton jBtnOptionFour;
    private javax.swing.JButton jBtnOptionOne;
    private javax.swing.JButton jBtnOptionThree;
    private javax.swing.JButton jBtnOptionTwo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
