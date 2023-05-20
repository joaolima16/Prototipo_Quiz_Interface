package mainForms;

import DAO.UserDAO;
import Model.User;
import java.awt.Color;
import javax.swing.SwingConstants;

public final class FinalForm extends javax.swing.JFrame {

    private String user;
    private int points;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public FinalForm(String user) {
        UserDAO userDao = new UserDAO();
        User userGame = userDao.GetPoints(user);
        setUser(userGame.getUsername());
        setPoints(userGame.getPoints());
        initComponents();
        ComplementComponents();

    }


    public void FinalResponse(String user, int points) {
        txtCongratulations.setText("Parábens Jogador: " + user + " Você fez: " + points + " Pontos");
    }


    public void ComplementComponents() {
        var color = new Color(0x2A2C2E);
        getContentPane().setBackground(color);
        this.setLocationRelativeTo(null);
        txtCongratulations.setHorizontalAlignment(SwingConstants.CENTER);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        txtCongratulations = new javax.swing.JLabel();
        jBtnExit = new javax.swing.JButton();
        jBtnNewGame = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCongratulations.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        txtCongratulations.setForeground(new java.awt.Color(255, 255, 255));
        txtCongratulations.setText("Texto final");

        jBtnExit.setBackground(new java.awt.Color(102, 102, 102));
        jBtnExit.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jBtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jBtnExit.setText("Fechar Jogo");
        jBtnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        jBtnNewGame.setBackground(new java.awt.Color(102, 102, 102));
        jBtnNewGame.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jBtnNewGame.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNewGame.setText("Jogar Novamente");
        jBtnNewGame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCongratulations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtCongratulations, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBtnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewGameActionPerformed

        MenuForm formMenu = new MenuForm();
        formMenu.setVisible(true);
        FinalForm.this.dispose();
    }//GEN-LAST:event_jBtnNewGameActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jBtnExitActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalForm("Teste").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnNewGame;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel txtCongratulations;
    // End of variables declaration//GEN-END:variables
}
