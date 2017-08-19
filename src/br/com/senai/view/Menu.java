package br.com.senai.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setMetal();
        desktopPane.updateUI();
        setNimbus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImg = new JLabel();
        desktopPane = new JDesktopPane(){

            private ImageIcon picture = 
            new ImageIcon(getClass().getResource( "/br/com/senai/view/images/fundo.png" ));

            public void paintComponent( Graphics g ){
                super.paintComponent( g );
                Dimension desktopSize = this.getSize();
                Dimension pictureSize = new Dimension(picture.getIconWidth(), picture.getIconHeight());
                picture.paintIcon( this, g, (desktopSize.width - pictureSize.width) / 2,
                    (desktopSize.height - pictureSize.height) / 2 ); 
            }};
            ;
            menuBar = new JMenuBar();

            cadastroMenu = new JMenu();
            clienteMenuItem = new JMenuItem();
            bebidaMenuItem = new JMenuItem();
            consultaMenu = new JMenu();
            jMenuItemCliente = new JMenuItem();
            estoqueMenu = new JMenu();
            jMenuItemEstoque = new JMenuItem();
            vendaMenu = new JMenu();
            jMenuItemVendaBebida = new JMenuItem();

            jLabelImg.setHorizontalAlignment(SwingConstants.CENTER);
            jLabelImg.setIcon(new ImageIcon(getClass().getResource("/br/com/senai/view/images/fundo.png"))); // NOI18N

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setTitle("BarCode");
            setIconImage(new ImageIcon(getClass().getResource("/br/com/senai/view/images/ICON.png")).getImage());
            setPreferredSize(new Dimension(800, 600));

            desktopPane.setBackground(new Color(230, 204, 0));

            GroupLayout desktopPaneLayout = new GroupLayout(desktopPane);
            desktopPane.setLayout(desktopPaneLayout);
            desktopPaneLayout.setHorizontalGroup(desktopPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 800, Short.MAX_VALUE)
            );
            desktopPaneLayout.setVerticalGroup(desktopPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 577, Short.MAX_VALUE)
            );

            getContentPane().add(desktopPane, BorderLayout.CENTER);

            cadastroMenu.setMnemonic('C');
            cadastroMenu.setText("Cadastro");

            clienteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.SHIFT_MASK | InputEvent.CTRL_MASK));
            clienteMenuItem.setIcon(new ImageIcon(getClass().getResource("/br/com/senai/view/images/addClient16.png"))); // NOI18N
            clienteMenuItem.setMnemonic('c');
            clienteMenuItem.setText("Clientes");
            clienteMenuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    clienteMenuItemActionPerformed(evt);
                }
            });
            cadastroMenu.add(clienteMenuItem);

            bebidaMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.SHIFT_MASK | InputEvent.CTRL_MASK));
            bebidaMenuItem.setIcon(new ImageIcon(getClass().getResource("/br/com/senai/view/images/addDrink16.png"))); // NOI18N
            bebidaMenuItem.setMnemonic('b');
            bebidaMenuItem.setText("Bebidas");
            bebidaMenuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    bebidaMenuItemActionPerformed(evt);
                }
            });
            cadastroMenu.add(bebidaMenuItem);

            menuBar.add(cadastroMenu);

            consultaMenu.setMnemonic('l');
            consultaMenu.setText("Cliente");

            jMenuItemCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_MASK | InputEvent.CTRL_MASK));
            jMenuItemCliente.setIcon(new ImageIcon(getClass().getResource("/br/com/senai/view/images/client16.png"))); // NOI18N
            jMenuItemCliente.setMnemonic('c');
            jMenuItemCliente.setText("Gerenciar Clientes");
            jMenuItemCliente.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jMenuItemClienteActionPerformed(evt);
                }
            });
            consultaMenu.add(jMenuItemCliente);

            menuBar.add(consultaMenu);

            estoqueMenu.setMnemonic('E');
            estoqueMenu.setText("Estoque");

            jMenuItemEstoque.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_MASK | InputEvent.CTRL_MASK));
            jMenuItemEstoque.setIcon(new ImageIcon(getClass().getResource("/br/com/senai/view/images/Sem título-1.png"))); // NOI18N
            jMenuItemEstoque.setMnemonic('e');
            jMenuItemEstoque.setText("Gerenciar Estoque");
            jMenuItemEstoque.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jMenuItemEstoqueActionPerformed(evt);
                }
            });
            estoqueMenu.add(jMenuItemEstoque);

            menuBar.add(estoqueMenu);

            vendaMenu.setMnemonic('V');
            vendaMenu.setText("Venda");

            jMenuItemVendaBebida.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.ALT_MASK | InputEvent.CTRL_MASK));
            jMenuItemVendaBebida.setIcon(new ImageIcon(getClass().getResource("/br/com/senai/view/images/sale16.png"))); // NOI18N
            jMenuItemVendaBebida.setMnemonic('v');
            jMenuItemVendaBebida.setText("Venda de Bebidas");
            jMenuItemVendaBebida.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jMenuItemVendaBebidaActionPerformed(evt);
                }
            });
            vendaMenu.add(jMenuItemVendaBebida);

            menuBar.add(vendaMenu);

            setJMenuBar(menuBar);

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void clienteMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_clienteMenuItemActionPerformed
        this.jInternalFrameStuff(new CadastroClienteFrame());
    }//GEN-LAST:event_clienteMenuItemActionPerformed

    private void jInternalFrameStuff(JInternalFrame ji) {
        ji.setVisible(true);
        desktopPane.add(ji);
        Dimension desktopSize = desktopPane.getSize();
        Dimension jInternalFrameSize = ji.getSize();
        ji.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
        try {
            ji.setSelected(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }

    private void bebidaMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_bebidaMenuItemActionPerformed
        this.jInternalFrameStuff(new CadastroBebidaFrame());
    }//GEN-LAST:event_bebidaMenuItemActionPerformed

    private void jMenuItemClienteActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        this.jInternalFrameStuff(new ConsultaClienteFrame());
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemVendaBebidaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendaBebidaActionPerformed
        this.jInternalFrameStuff(new VendaFrame());
    }//GEN-LAST:event_jMenuItemVendaBebidaActionPerformed

    private void jMenuItemEstoqueActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstoqueActionPerformed
        this.jInternalFrameStuff(new ConsultaEstoqueFrame());
    }//GEN-LAST:event_jMenuItemEstoqueActionPerformed

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

    public static void setMetal() {
        /* Set the Metal look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JMenuItem bebidaMenuItem;
    private JMenu cadastroMenu;
    private JMenuItem clienteMenuItem;
    private JMenu consultaMenu;
    private JDesktopPane desktopPane;
    private JMenu estoqueMenu;
    private JLabel jLabelImg;
    private JMenuItem jMenuItemCliente;
    private JMenuItem jMenuItemEstoque;
    private JMenuItem jMenuItemVendaBebida;
    private JMenuBar menuBar;
    private JMenu vendaMenu;
    // End of variables declaration//GEN-END:variables
}
