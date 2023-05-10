/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Questions;

import Model.Questions;
import DAO.UserDAO;
import Model.User;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author João Vitor
 */
public final class QuestionTwoForm extends javax.swing.JFrame {

    /**
     * Creates new form QuestionTwoForm
     */
    public QuestionTwoForm() {
        initComponents();
        GenerateResponses();
        CentralizarForm();
    }
    
    
      public void CentralizarForm() {
        this.setLocationRelativeTo(null);
    }
        private void GenerateResponses(){
     
           ArrayList<String> arrResponses = new ArrayList<String>();
           arrResponses.add("Rússia");
           arrResponses.add("Canadá");
           arrResponses.add("Estados Unidos");
    
         Collections.shuffle(arrResponses);
         btnResponseOne.setText(arrResponses.get(0));
         btnResponseTwo.setText(arrResponses.get(1));
         btnResponseThree.setText(arrResponses.get(2));
           }
          
    private void VerifyResponses(String response) {
        UserDAO game = new UserDAO();
        final String correctResponse = "Rússia";
        int confirmation = JOptionPane.showConfirmDialog(null, "Você confirma a alternativa escolhida? ");

        if (confirmation == 0) {
            try {
                Questions question = new Questions(correctResponse, response);
                if (question.verifyResponse().equals("correta")) {
                    JOptionPane.showMessageDialog(null, "Resposta correta! ");
                    // game.updatePoints(User.getUsername());

                } else {

                    JOptionPane.showMessageDialog(null, "Resposta incorreta! ");

                }
                if (btnResponseOne.getText().equals(correctResponse)) {
                    btnResponseOne.setBackground(Color.GREEN);
                    btnResponseTwo.setBackground(Color.red);
                    btnResponseThree.setBackground(Color.red);

                }
                if (btnResponseTwo.getText().equals(correctResponse)) {
                    btnResponseTwo.setBackground(Color.GREEN);
                    btnResponseOne.setBackground(Color.red);
                    btnResponseThree.setBackground(Color.red);

                }
                if (btnResponseThree.getText().equals(correctResponse)) {
                    btnResponseThree.setBackground(Color.GREEN);
                    btnResponseOne.setBackground(Color.red);
                    btnResponseTwo.setBackground(Color.red);

                }
            } catch (Exception ex) {
                System.out.println(ex);
                System.exit(1);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnResponseTwo = new javax.swing.JButton();
        btnResponseThree = new javax.swing.JButton();
        btnResponseOne = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel1.setText("Qual é o maior país do mundo em área territorial?");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Questão-2");

        btnResponseTwo.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnResponseTwo.setText("jButton1");
        btnResponseTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponseTwoActionPerformed(evt);
            }
        });

        btnResponseThree.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnResponseThree.setText("jButton1");
        btnResponseThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponseThreeActionPerformed(evt);
            }
        });

        btnResponseOne.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnResponseOne.setText("jButton1");
        btnResponseOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponseOneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnResponseThree, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResponseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResponseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnResponseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResponseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnResponseThree, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponseOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponseOneActionPerformed
        // TODO add your handling code here:
        VerifyResponses(btnResponseOne.getText());
    }//GEN-LAST:event_btnResponseOneActionPerformed

    private void btnResponseTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponseTwoActionPerformed
        // TODO add your handling code here:
         VerifyResponses(btnResponseTwo.getText());
    }//GEN-LAST:event_btnResponseTwoActionPerformed

    private void btnResponseThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponseThreeActionPerformed
        // TODO add your handling code here:
        
         VerifyResponses(btnResponseThree.getText());
    }//GEN-LAST:event_btnResponseThreeActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionTwoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionTwoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionTwoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionTwoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionTwoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResponseOne;
    private javax.swing.JButton btnResponseThree;
    private javax.swing.JButton btnResponseTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
