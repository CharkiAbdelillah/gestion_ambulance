/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import DATA.Client;
import DATA.UserClient;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author hp
 */
public class LOGIN_CLIENT extends javax.swing.JFrame {
    /**
     * Creates new form CLIENT
     */
    public LOGIN_CLIENT() {
        initComponents();
        this.icon2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cni = new javax.swing.JTextField();
        btnConnexion4 = new javax.swing.JButton();
        btnAnnuler4 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        icon2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel1.setText("Carte Nationale d'Identité(CNI)");

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel2.setText("Mots de passe");

        btnConnexion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_check_1930264.png"))); // NOI18N
        btnConnexion4.setText("Connexion");
        btnConnexion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnexion4ActionPerformed(evt);
            }
        });

        btnAnnuler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_Remove_27874.png"))); // NOI18N
        btnAnnuler4.setText("L'inscription");
        btnAnnuler4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnuler4ActionPerformed(evt);
            }
        });

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-invisible-32.png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-eye-32.png"))); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAnnuler4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cni, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConnexion4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(icon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnuler4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConnexion4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void getNom1(){
        
    }
    private void btnConnexion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnexion4ActionPerformed
        String u=cni.getText();
        String p=pass.getText();
        UserClient s=new UserClient();
        s.setUsername(u);
        s.setPassword(p); 
        if(s.loginClient()){            
            Client l=new Client();
            l.getName11(u);
            l.setCni(u);
            File fichier = new File("C:\\Users\\hp\\Desktop\\fichier.txt");
        FileWriter fw = null;
            try {
                fw = new FileWriter(fichier);
            } catch (IOException ex) {
                Logger.getLogger(LOGIN_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            }

        PrintWriter pw=new PrintWriter(fw);
        pw.print(u);
        pw.close();
            String nom=l.getNom();
            try {
            if(u.equals("ay1111")){
            DR d=new DR();
            d.setVisible(true);
            this.dispose();
            }
                else{
            CLIENT h=new CLIENT();
            h.setVisible(true);
               this.dispose(); 
//            System.out.println(l.getNom());
                }
               Socket client=new Socket("localhost",2019);
               ObjectOutputStream out=new ObjectOutputStream(client.getOutputStream());
               out.writeObject(l);
               out.flush();  
               client.close();
               
            } catch (IOException ex) {
                Logger.getLogger(LOGIN_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            }
            
//            Homme.Conversation c=new Homme.Conversation(socketClient, ERROR);
//            System.out.println(l.getNom());
                Homme n=new Homme();
//                n.setNom(l.getName11(u));
            
        }else{
            JOptionPane.showMessageDialog(null, "La connexion est échoué");
        }
    }//GEN-LAST:event_btnConnexion4ActionPerformed

   

    

    private void btnAnnuler4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnuler4ActionPerformed
        new INSCR_CLIENT().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnnuler4ActionPerformed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        
        icon2.setVisible(true);
        icon1.setVisible(false);
        pass.setEchoChar((char)0);
    }//GEN-LAST:event_icon1MousePressed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon2.setVisible(false);
        icon1.setVisible(true);
        pass.setEchoChar('*');
    }//GEN-LAST:event_icon2MousePressed

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
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            

        }  catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN_CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_CLIENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler4;
    private javax.swing.JButton btnConnexion4;
    private javax.swing.JTextField cni;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
