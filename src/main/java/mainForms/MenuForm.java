package mainForms;

import Connection.ConnectionDB;
import java.awt.Color;

public class MenuForm extends javax.swing.JFrame {

    public MenuForm() {
        initComponents();
        ComplementComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBtnOptionTwo = new javax.swing.JButton();
        jBtnOptionFive = new javax.swing.JButton();
        jBtnOptionFour = new javax.swing.JButton();
        jBtnOptionThree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUIZ - Conhecimentos Gerais ");

        jBtnOptionTwo.setBackground(new java.awt.Color(140, 142, 145));
        jBtnOptionTwo.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jBtnOptionTwo.setForeground(new java.awt.Color(255, 255, 255));
        jBtnOptionTwo.setText("Jogar");
        jBtnOptionTwo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnOptionTwo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnOptionTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOptionTwoActionPerformed(evt);
            }
        });

        jBtnOptionFive.setBackground(new java.awt.Color(140, 142, 145));
        jBtnOptionFive.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jBtnOptionFive.setForeground(new java.awt.Color(255, 255, 255));
        jBtnOptionFive.setText("Sair");
        jBtnOptionFive.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnOptionFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOptionFiveActionPerformed(evt);
            }
        });

        jBtnOptionFour.setBackground(new java.awt.Color(140, 142, 145));
        jBtnOptionFour.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jBtnOptionFour.setForeground(new java.awt.Color(255, 255, 255));
        jBtnOptionFour.setText("Créditos");
        jBtnOptionFour.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnOptionFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOptionFourActionPerformed(evt);
            }
        });

        jBtnOptionThree.setBackground(new java.awt.Color(140, 142, 145));
        jBtnOptionThree.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jBtnOptionThree.setForeground(new java.awt.Color(255, 255, 255));
        jBtnOptionThree.setText("Classificação");
        jBtnOptionThree.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jBtnOptionTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnOptionThree, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(jBtnOptionFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnOptionFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jBtnOptionTwo)
                .addGap(26, 26, 26)
                .addComponent(jBtnOptionThree)
                .addGap(30, 30, 30)
                .addComponent(jBtnOptionFour)
                .addGap(27, 27, 27)
                .addComponent(jBtnOptionFive)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public final void ComplementComponents() {
        this.setLocationRelativeTo(null);
        var color = new Color(0x2A2C2E);
        getContentPane().setBackground(color);
        setResizable(false);
    }
    private void jBtnOptionFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOptionFourActionPerformed

        CreditsForm creditsForm = new CreditsForm();
        creditsForm.setVisible(true);
        MenuForm.this.dispose();
    }//GEN-LAST:event_jBtnOptionFourActionPerformed

    private void jBtnOptionFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOptionFiveActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jBtnOptionFiveActionPerformed

    private void jBtnOptionTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOptionTwoActionPerformed

        UserGame formUser = new UserGame();
        formUser.setVisible(true);
        MenuForm.this.dispose();
    }//GEN-LAST:event_jBtnOptionTwoActionPerformed

    private void jBtnOptionThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOptionThreeActionPerformed

        RankForm form = new RankForm();
        form.setVisible(true);
        MenuForm.this.dispose();
    }//GEN-LAST:event_jBtnOptionThreeActionPerformed

    public static void main(String args[]) {

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
    private javax.swing.JButton jBtnOptionThree;
    private javax.swing.JButton jBtnOptionTwo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
