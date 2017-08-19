    package br.com.senai.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class LoginFrame extends javax.swing.JFrame {

    private final String USER = "ti01n";
    private final String PASS = "senai2015";

    public LoginFrame() {

        initComponents();
        setWindows();
        jTextFieldUsuario.updateUI();
        jPasswordFieldSenha.updateUI();
        setNimbus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelAll = new JPanel();
        jPanelBody = new JPanel();
        jPanelcenter = new JPanel();
        jLabelUsuario = new JLabel();
        jTextFieldUsuario = new JTextField();
        jLabelSenha = new JLabel();
        jPasswordFieldSenha = new JPasswordField();
        jPanelNorth = new JPanel();
        jPanelSouth = new JPanel();
        jPanelWest = new JPanel();
        jPanelEast = new JPanel();
        jPanelHead = new JPanel();
        jLabel1 = new JLabel();
        jPanelButtons = new JPanel();
        jButtonlogin = new JButton();
        jButtonCancel = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("BarCode");
        setIconImage(new ImageIcon(getClass().getResource("/br/com/senai/view/images/ICON.png")).getImage());
        setPreferredSize(new Dimension(370, 413));
        setResizable(false);

        JPanelAll.setBackground(new Color(230, 204, 0));
        JPanelAll.setLayout(new BorderLayout());

        jPanelBody.setBorder(BorderFactory.createTitledBorder(null, "LogIn", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("sansserif", 1, 18))); // NOI18N
        jPanelBody.setOpaque(false);
        jPanelBody.setLayout(new BorderLayout());

        jPanelcenter.setOpaque(false);
        jPanelcenter.setLayout(new GridLayout(4, 1, 5, 5));

        jLabelUsuario.setFont(new Font("sansserif", 0, 18)); // NOI18N
        jLabelUsuario.setText("Usuário: ");
        jPanelcenter.add(jLabelUsuario);

        jTextFieldUsuario.setFont(new Font("sansserif", 1, 14)); // NOI18N
        jTextFieldUsuario.setText("TI01N");
        jTextFieldUsuario.setPreferredSize(new Dimension(28, 28));
        jTextFieldUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jTextFieldUsuario.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextFieldUsuarioKeyPressed(evt);
            }
        });
        jPanelcenter.add(jTextFieldUsuario);

        jLabelSenha.setFont(new Font("sansserif", 0, 18)); // NOI18N
        jLabelSenha.setText("Senha: ");
        jPanelcenter.add(jLabelSenha);

        jPasswordFieldSenha.setText("senai2015");
        jPasswordFieldSenha.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        jPanelcenter.add(jPasswordFieldSenha);

        jPanelBody.add(jPanelcenter, BorderLayout.CENTER);

        jPanelNorth.setOpaque(false);
        jPanelNorth.setPreferredSize(new Dimension(0, 15));

        GroupLayout jPanelNorthLayout = new GroupLayout(jPanelNorth);
        jPanelNorth.setLayout(jPanelNorthLayout);
        jPanelNorthLayout.setHorizontalGroup(jPanelNorthLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        jPanelNorthLayout.setVerticalGroup(jPanelNorthLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanelBody.add(jPanelNorth, BorderLayout.NORTH);

        jPanelSouth.setName(""); // NOI18N
        jPanelSouth.setOpaque(false);
        jPanelSouth.setPreferredSize(new Dimension(0, 25));

        GroupLayout jPanelSouthLayout = new GroupLayout(jPanelSouth);
        jPanelSouth.setLayout(jPanelSouthLayout);
        jPanelSouthLayout.setHorizontalGroup(jPanelSouthLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        jPanelSouthLayout.setVerticalGroup(jPanelSouthLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanelBody.add(jPanelSouth, BorderLayout.SOUTH);

        jPanelWest.setOpaque(false);
        jPanelWest.setPreferredSize(new Dimension(45, 0));

        GroupLayout jPanelWestLayout = new GroupLayout(jPanelWest);
        jPanelWest.setLayout(jPanelWestLayout);
        jPanelWestLayout.setHorizontalGroup(jPanelWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelWestLayout.setVerticalGroup(jPanelWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        jPanelBody.add(jPanelWest, BorderLayout.WEST);

        jPanelEast.setOpaque(false);
        jPanelEast.setPreferredSize(new Dimension(45, 0));

        GroupLayout jPanelEastLayout = new GroupLayout(jPanelEast);
        jPanelEast.setLayout(jPanelEastLayout);
        jPanelEastLayout.setHorizontalGroup(jPanelEastLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelEastLayout.setVerticalGroup(jPanelEastLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        jPanelBody.add(jPanelEast, BorderLayout.EAST);

        JPanelAll.add(jPanelBody, BorderLayout.CENTER);

        jPanelHead.setOpaque(false);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/br/com/senai/view/images/logo.png"))); // NOI18N
        jPanelHead.add(jLabel1);

        JPanelAll.add(jPanelHead, BorderLayout.PAGE_START);

        jPanelButtons.setOpaque(false);
        jPanelButtons.setLayout(new GridLayout(1, 2));

        jButtonlogin.setBackground(new Color(0, 0, 0));
        jButtonlogin.setFont(new Font("sansserif", 1, 18)); // NOI18N
        jButtonlogin.setForeground(new Color(230, 204, 0));
        jButtonlogin.setText("Entrar");
        jButtonlogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        jPanelButtons.add(jButtonlogin);

        jButtonCancel.setBackground(new Color(0, 0, 0));
        jButtonCancel.setFont(new Font("sansserif", 1, 18)); // NOI18N
        jButtonCancel.setForeground(new Color(230, 204, 0));
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanelButtons.add(jButtonCancel);

        JPanelAll.add(jPanelButtons, BorderLayout.PAGE_END);

        getContentPane().add(JPanelAll, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonloginActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        String user = this.jTextFieldUsuario.getText();
        String pass = this.jPasswordFieldSenha.getText();

        if (user.equalsIgnoreCase(USER) && pass.equals(PASS)) {
            Menu menu = new Menu();
            menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
            menu.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonloginActionPerformed

    private void jButtonCancelActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jPasswordFieldSenhaKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonloginActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

    private void jTextFieldUsuarioKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonloginActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyPressed

    private void jTextFieldUsuarioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    public static void setNimbus() {
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    public static void setWindows() {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    public static void main(String args[]) {
        setNimbus();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel JPanelAll;
    private JButton jButtonCancel;
    private JButton jButtonlogin;
    private JLabel jLabel1;
    private JLabel jLabelSenha;
    private JLabel jLabelUsuario;
    private JPanel jPanelBody;
    private JPanel jPanelButtons;
    private JPanel jPanelEast;
    private JPanel jPanelHead;
    private JPanel jPanelNorth;
    private JPanel jPanelSouth;
    private JPanel jPanelWest;
    private JPanel jPanelcenter;
    private JPasswordField jPasswordFieldSenha;
    private JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
