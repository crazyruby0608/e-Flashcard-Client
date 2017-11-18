/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.event.ChangeListener;
import service.ServiceGetStringSubmit;

/**
 *
 * @author Welcome
 */
public class view2 extends javax.swing.JFrame {

    /**
     * Creates new form view2
     */
    public static view2 myIns;
    
    public static view2 getIns(){
        if (myIns == null) {
            myIns = new view2();
        }
        return myIns;
    }
    
    public view2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtWord = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        txtMean = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        checkShowMean = new javax.swing.JCheckBox();
        btnLibrary = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtWord.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtWord.setText("word");

        btnNext.setText("next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        txtMean.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMean.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMean.setText("meaning");

        btnPrev.setText("prev");

        checkShowMean.setText("show meaning");

        btnLibrary.setText("Library");
        btnLibrary.setActionCommand("Library");
        btnLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibraryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(btnPrev)
                .addGap(28, 28, 28)
                .addComponent(checkShowMean)
                .addGap(18, 18, 18)
                .addComponent(btnNext)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLibrary)
                        .addGap(43, 43, 43)
                        .addComponent(txtWord, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtMean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtWord, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnLibrary)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(txtMean, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrev)
                    .addComponent(checkShowMean))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibraryActionPerformed
        // TODO add your handling code here:
        view1 view11 = view1.getIns();
        view11.addListLibs();
        view11.setVisible(true);
        view2 view22 = view2.getIns();
        view22.setVisible(false);
    }//GEN-LAST:event_btnLibraryActionPerformed
    public void actionNext(ActionListener next){
        btnNext.addActionListener(next);
    }
    
    public boolean isShowMean(){
        return checkShowMean.isSelected();
    }
    public void checkShowMean(boolean state){
        checkShowMean.setSelected(state);
    }
    public void showMean(boolean state){
        txtMean.setVisible(state);
    }
    
    public void actionPrev(ActionListener prev){
        btnPrev.addActionListener(prev);
    }
    
    public void changeShowMean(ChangeListener l){
        checkShowMean.addChangeListener(l);
    }
    
    public void setWord(String word){
        txtWord.setText(word);
    }
    
    public void setMean(String mean){
        txtMean.setText(mean);
    }
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
            java.util.logging.Logger.getLogger(view2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view2().setVisible(true);
            }
        });
        try {
            ServerSocket ss = new ServerSocket(9090);
            Socket s = ss.accept();
            System.out.println("da ket noi!");
            DataInputStream inp = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            String data = "";
            while (true){
                data = ServiceGetStringSubmit.getString(inp);
                if (!data.equalsIgnoreCase("")){
                    System.out.println(data);
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibrary;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JCheckBox checkShowMean;
    private javax.swing.JLabel txtMean;
    private javax.swing.JLabel txtWord;
    // End of variables declaration//GEN-END:variables
}
