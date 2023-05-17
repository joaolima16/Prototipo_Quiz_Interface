/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Questions;

import mainForms.FinalForm;
import Model.Questions;
import java.util.ArrayList;
import DAO.UserDAO;
import DAO.QuestionDAO;
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
        if (this.IndexQuestions != lsQuestions.size() - 1) {
            this.IndexQuestions = this.IndexQuestions + 1;
        } else {
            int confirmation = JOptionPane.showConfirmDialog(null, "Deseja encerrar o quiz? ");
            if (confirmation == 0) {
                SetFinalForm();
            }
        }
    }
    public void PreviousQuestion(){
        if(this.IndexQuestions != 0){
            this.IndexQuestions = this.IndexQuestions - 1; 
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
        var color = new Color(0x2A2C2E);
        getContentPane().setBackground(color);
        
    }

    public  void CentralizarForm() {
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelNumberQ = new javax.swing.JLabel();
        JLabelQuestion = new javax.swing.JLabel();
        BtnResponse1 = new javax.swing.JButton();
        BtnResponse2 = new javax.swing.JButton();
        BtnResponse3 = new javax.swing.JButton();
        jBtnNext = new javax.swing.JButton();
        jBtnPrevious = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        JLabelNumberQ.setBackground(new java.awt.Color(255, 255, 255));
        JLabelNumberQ.setFont(new java.awt.Font("SansSerif", 1, 23)); // NOI18N
        JLabelNumberQ.setForeground(new java.awt.Color(255, 255, 255));
        JLabelNumberQ.setText("Questão - 1");
        JLabelNumberQ.setFocusable(false);
        JLabelNumberQ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLabelQuestion.setBackground(new java.awt.Color(255, 255, 255));
        JLabelQuestion.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        JLabelQuestion.setForeground(new java.awt.Color(255, 255, 255));
        JLabelQuestion.setText("Qual a fruta correta?");
        JLabelQuestion.setFocusable(false);
        JLabelQuestion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnResponse1.setBackground(new java.awt.Color(102, 102, 102));
        BtnResponse1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        BtnResponse1.setForeground(new java.awt.Color(255, 255, 255));
        BtnResponse1.setText("Maça");
        BtnResponse1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnResponse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponse1ActionPerformed(evt);
            }
        });

        BtnResponse2.setBackground(new java.awt.Color(102, 102, 102));
        BtnResponse2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnResponse2.setForeground(new java.awt.Color(255, 255, 255));
        BtnResponse2.setText("Banana");
        BtnResponse2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnResponse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponse2ActionPerformed(evt);
            }
        });

        BtnResponse3.setBackground(new java.awt.Color(102, 102, 102));
        BtnResponse3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        BtnResponse3.setForeground(new java.awt.Color(255, 255, 255));
        BtnResponse3.setText("Pera");
        BtnResponse3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnResponse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponse3ActionPerformed(evt);
            }
        });

        jBtnNext.setBackground(new java.awt.Color(102, 102, 102));
        jBtnNext.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jBtnNext.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNext.setText("Próxima Questão");
        jBtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNextActionPerformed(evt);
            }
        });

        jBtnPrevious.setBackground(new java.awt.Color(102, 102, 102));
        jBtnPrevious.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jBtnPrevious.setForeground(new java.awt.Color(255, 255, 255));
        jBtnPrevious.setText("Questão anterior");
        jBtnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPreviousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(JLabelNumberQ))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnResponse2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnResponse1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnResponse3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 134, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(JLabelNumberQ)
                .addGap(24, 24, 24)
                .addComponent(JLabelQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnResponse1)
                .addGap(18, 18, 18)
                .addComponent(BtnResponse2)
                .addGap(18, 18, 18)
                .addComponent(BtnResponse3)
                .addGap(18, 18, 18)
                .addComponent(jBtnNext)
                .addGap(18, 18, 18)
                .addComponent(jBtnPrevious)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void GenerateResponses() throws SQLException {
        QuestionDAO question = new QuestionDAO();
        lsQuestions = question.SelectQuestions();
        JLabelNumberQ.setText("Questão - " + getIndex());
        JLabelQuestion.setText(lsQuestions.get(getIndex()).getQuestion());
        BtnResponse1.setText(lsQuestions.get(getIndex()).getResponse()[0]);
        BtnResponse2.setText(lsQuestions.get(getIndex()).getResponse()[1]);
        BtnResponse3.setText(lsQuestions.get(getIndex()).getResponse()[2]);

    }

    private void VerifyResponses(String response) {
        UserDAO game = new UserDAO();
        var Colorcrq = new Color(0x009933);
        var Colorirq = new Color(0xb30000);
        int confirmation = JOptionPane.showConfirmDialog(null, "Você confirma a alternativa escolhida? ");
        boolean correctQuestion = lsQuestions.get(0).verifyResponse(response, lsQuestions.get(getIndex()).getCorrectResponse());

        if (confirmation == 0) {
            try {

                if (correctQuestion == true) {
                    JOptionPane.showMessageDialog(null, "Resposta correta! ");
                    game.updatePoints(getUser());
                } else {

                    JOptionPane.showMessageDialog(null, "Resposta incorreta! ");

                }
                if (BtnResponse1.getText().equalsIgnoreCase(lsQuestions.get(getIndex()).getCorrectResponse())) {
                    BtnResponse1.setBackground(Colorcrq);
                    BtnResponse2.setBackground(Colorirq);
                    BtnResponse3.setBackground(Colorirq);

                }
                if (BtnResponse2.getText().equalsIgnoreCase(lsQuestions.get(getIndex()).getCorrectResponse())) {
                    BtnResponse2.setBackground(Colorcrq);
                    BtnResponse1.setBackground(Colorirq);
                    BtnResponse3.setBackground(Colorirq);

                }
                if (BtnResponse3.getText().equalsIgnoreCase(lsQuestions.get(getIndex()).getCorrectResponse())) {
                    BtnResponse3.setBackground(Colorcrq);
                    BtnResponse1.setBackground(Colorirq);
                    BtnResponse2.setBackground(Colorirq);

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
    private void SetFinalForm() {
        FinalForm finalForm = new FinalForm(getUser());
        finalForm.setVisible(true);
    }
    private void jBtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNextActionPerformed
        NextQuestions();

    }//GEN-LAST:event_jBtnNextActionPerformed

    private void BtnResponse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResponse3ActionPerformed
        VerifyResponses(BtnResponse3.getText());
    }//GEN-LAST:event_BtnResponse3ActionPerformed

    private void jBtnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPreviousActionPerformed
        PreviousQuestion();
        SetColorButtons();
        try {
            GenerateResponses();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnPreviousActionPerformed
    private void NextQuestions() {
        setIndexQuestions();
        SetColorButtons();
        try {
            GenerateResponses();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void SetColorButtons(){
            var color = new Color(0X666666);
            BtnResponse1.setBackground(color);
            BtnResponse2.setBackground(color);
            BtnResponse3.setBackground(color);
    
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new QuestionsForm("").setVisible(true);
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
    private javax.swing.JLabel JLabelNumberQ;
    private javax.swing.JLabel JLabelQuestion;
    private javax.swing.JButton jBtnNext;
    private javax.swing.JButton jBtnPrevious;
    // End of variables declaration//GEN-END:variables
}
