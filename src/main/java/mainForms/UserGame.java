package mainForms;
import Questions.QuestionsForm;
import DAO.UserDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserGame extends javax.swing.JFrame {

    public UserGame() {
        initComponents();
        ComplementComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txbUser = new javax.swing.JTextField();
        btnInit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio do jogo");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciando Jogo...");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite o nome do jogador");

        txbUser.setBackground(new java.awt.Color(242, 242, 242));
        txbUser.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txbUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnInit.setBackground(new java.awt.Color(140, 142, 145));
        btnInit.setFont(new java.awt.Font("SansSerif", 1, 19)); // NOI18N
        btnInit.setForeground(new java.awt.Color(255, 255, 255));
        btnInit.setText("Iniciar");
        btnInit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnInit, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInit)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public final void ComplementComponents() {
    this.setLocationRelativeTo(null);
    var color = new Color(0x2A2C2E);
    getContentPane().setBackground(color);
    }
   
    private void btnInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitActionPerformed

        UserDAO conn = new UserDAO();
        boolean userExists = conn.InsertUser(txbUser.getText());
        
        if(userExists == false || txbUser.getText().equals("") == false) {
              QuestionsForm formQuestion = null;
            try {
                formQuestion = new QuestionsForm(txbUser.getText());
            } catch (SQLException ex) {
                Logger.getLogger(UserGame.class.getName()).log(Level.SEVERE, null, ex);
            }
              formQuestion.setVisible(true);
              UserGame.this.dispose();     
        }
        else{
              JOptionPane.showMessageDialog(null, "Usuário já existe, por favor insira outro "); 
            }
    
    }//GEN-LAST:event_btnInitActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txbUser;
    // End of variables declaration//GEN-END:variables
}
