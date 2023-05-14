/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Questions;

import Model.Questions;
import java.util.ArrayList;
import DAO.UserDAO;
import DAO.QuestionDAO;
import java.util.Collections;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author João Vitor
 */
public final class QuestionsForm extends javax.swing.JFrame {
    
    
    private String user;
    private Integer IndexQuestions = 0;
    ArrayList<Questions> lsQuestions;
    
    
    public void setIndexQuestions() {
        if(this.IndexQuestions != lsQuestions.size() -1  ){
            this.IndexQuestions = this.IndexQuestions + 1;
        }    
        else{
            int confirmation = JOptionPane.showConfirmDialog(null, "Deseja encerrar o quiz? ");
            if(confirmation == 0){
                SetFinalForm();
            }
        }
    }

    public Integer getIndex() {
 
        return IndexQuestions;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return this.user;
    }

    public QuestionsForm(String user) throws SQLException {          

        initComponents();
        CentralizarForm();
        setUser(user);
        GenerateResponses();

    }

    public void CentralizarForm() throws SQLException {
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlabelQuestion = new javax.swing.JLabel();
        BtnResponse1 = new javax.swing.JButton();
        BtnResponse2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BtnResponse3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        JlabelQuestion.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        JlabelQuestion.setText("Questão 1 - Qual a fruta correta?");

        BtnResponse1.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        BtnResponse1.setText("Maça");
        BtnResponse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponse1ActionPerformed(evt);
            }
        });

        BtnResponse2.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        BtnResponse2.setText("Banana");
        BtnResponse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponse2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setText("Próxima Questão");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BtnResponse3.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        BtnResponse3.setText("Pera");
        BtnResponse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponse3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnResponse3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnResponse2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelQuestion)
                            .addComponent(BtnResponse1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(JlabelQuestion)
                .addGap(31, 31, 31)
                .addComponent(BtnResponse1)
                .addGap(36, 36, 36)
                .addComponent(BtnResponse2)
                .addGap(37, 37, 37)
                .addComponent(BtnResponse3)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void GenerateResponses() throws SQLException {
        QuestionDAO question = new QuestionDAO();
        lsQuestions = question.SelectQuestions();  
        JlabelQuestion.setText(lsQuestions.get(getIndex()).getQuestion());
        BtnResponse1.setText(lsQuestions.get(getIndex()).getResponse()[0]);
        BtnResponse2.setText(lsQuestions.get(getIndex()).getResponse()[1]);
        BtnResponse3.setText(lsQuestions.get(getIndex()).getResponse()[2]);
        
    }

    private void VerifyResponses(String response) {
         UserDAO game = new UserDAO();
         int confirmation = JOptionPane.showConfirmDialog(null, "Você confirma a alternativa escolhida? ");
         boolean correctQuestion = lsQuestions.get(0).verifyResponse(response,lsQuestions.get(getIndex()).getCorrectResponse());
  
        
        if (confirmation == 0) {
            try {
                    
                if (correctQuestion == true) {
                    JOptionPane.showMessageDialog(null, "Resposta correta! ");
                    game.updatePoints(getUser());
                } else {

                    JOptionPane.showMessageDialog(null, "Resposta incorreta! ");

                }
                if (BtnResponse1.getText().equalsIgnoreCase(lsQuestions.get(getIndex()).getCorrectResponse())) {
                    BtnResponse1.setBackground(Color.GREEN);
                    BtnResponse2.setBackground(Color.red);
                    BtnResponse3.setBackground(Color.red);

                }
                if (BtnResponse2.getText().equalsIgnoreCase(lsQuestions.get(getIndex()).getCorrectResponse())) {
                    BtnResponse2.setBackground(Color.GREEN);
                    BtnResponse1.setBackground(Color.red);
                    BtnResponse3.setBackground(Color.red);

                }
                if (BtnResponse3.getText().equalsIgnoreCase(lsQuestions.get(getIndex()).getCorrectResponse())) {
                    BtnResponse3.setBackground(Color.GREEN);
                    BtnResponse1.setBackground(Color.red);
                    BtnResponse2.setBackground(Color.red);

                }
            } catch (HeadlessException ex) {
                System.out.println(ex.getMessage());
                System.exit(1);
            }
        }

    }
    private void BtnResponse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResponse1ActionPerformed
        // TODO add your handling code here:
        VerifyResponses(BtnResponse1.getText());

    }//GEN-LAST:event_BtnResponse1ActionPerformed

    private void BtnResponse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResponse2ActionPerformed
            VerifyResponses(BtnResponse2.getText());

    }//GEN-LAST:event_BtnResponse2ActionPerformed
    private void SetFinalForm(){
     FinalForm finalForm = new FinalForm(getUser());
     finalForm.setVisible(true);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        NextQuestions();

    }//GEN-LAST:event_jButton3ActionPerformed
        
    private void BtnResponse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResponse3ActionPerformed
        VerifyResponses(BtnResponse3.getText());
    }//GEN-LAST:event_BtnResponse3ActionPerformed
    private void NextQuestions(){
        setIndexQuestions();
        System.out.println(getIndex());
        
        BtnResponse1.setBackground(Color.WHITE);
        BtnResponse2.setBackground(Color.WHITE);
        BtnResponse3.setBackground(Color.WHITE);
        
        try {
            
            GenerateResponses();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new QuestionsForm("teste").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(QuestionsForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnResponse1;
    private javax.swing.JButton BtnResponse2;
    private javax.swing.JButton BtnResponse3;
    private javax.swing.JLabel JlabelQuestion;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
