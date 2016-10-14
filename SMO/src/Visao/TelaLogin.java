/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControleLogin;
import Model.Usuario;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author CassianoK
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    
    ControleLogin controle = new ControleLogin();
    Usuario user;
    
    public TelaLogin() {
        initComponents();
        this.setTitle("Tela de Login");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sairLogin = new javax.swing.JButton();
        acessarLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        sairLogin.setText("Sair");
        sairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairLoginActionPerformed(evt);
            }
        });
        getContentPane().add(sairLogin);
        sairLogin.setBounds(230, 190, 140, 30);

        acessarLogin.setText("Acessar");
        acessarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(acessarLogin);
        acessarLogin.setBounds(91, 190, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Usuário.:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 120, 70, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Senha.:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 150, 70, 26);

        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jUsuario);
        jUsuario.setBounds(170, 120, 200, 25);
        getContentPane().add(jPassword);
        jPassword.setBounds(170, 150, 200, 26);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 460, 350);

        setSize(new java.awt.Dimension(476, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairLoginActionPerformed
        // QUANDO CLICAR NO BOTAO DE SAIR FECHA O APLICATIVO
        System.exit(0);
    }//GEN-LAST:event_sairLoginActionPerformed

    private void acessarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarLoginActionPerformed
        // QUANDO O USUÁRIO E A SENHA ESTIVEREM CORRETAS ENTRA
        if(verificaLogin()){
            TelaPrincipal tela = new TelaPrincipal(user);
            tela.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!!!");
        }
    }//GEN-LAST:event_acessarLoginActionPerformed

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acessarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUsuario;
    private javax.swing.JButton sairLogin;
    // End of variables declaration//GEN-END:variables
    
    private boolean verificaLogin(){
        List result = controle.findUser(jUsuario.getText());
        Iterator iterator = result.iterator();
        if(iterator.hasNext()){
            user = (Usuario) iterator.next();
            if(user.getSenha().equals(String.valueOf(jPassword.getPassword()))){
                return true;
            }
        }
        return false;
    }
}