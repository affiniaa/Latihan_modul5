/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
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

        jLabel1 = new javax.swing.JLabel();
        hasilalamat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        editnama = new javax.swing.JTextField();
        editkelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editalamat = new javax.swing.JTextField();
        hasilnama = new javax.swing.JTextField();
        hasilkelas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Data Isian");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 90, 20);

        hasilalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilalamatActionPerformed(evt);
            }
        });
        getContentPane().add(hasilalamat);
        hasilalamat.setBounds(90, 300, 180, 30);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 50, 20);

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 50, 20);

        editnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnamaActionPerformed(evt);
            }
        });
        getContentPane().add(editnama);
        editnama.setBounds(90, 70, 180, 30);

        editkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editkelasActionPerformed(evt);
            }
        });
        getContentPane().add(editkelas);
        editkelas.setBounds(90, 110, 180, 30);

        jLabel4.setText("Kelas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 50, 20);

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 190, 90, 20);

        editalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editalamatActionPerformed(evt);
            }
        });
        getContentPane().add(editalamat);
        editalamat.setBounds(90, 150, 180, 30);

        hasilnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilnamaActionPerformed(evt);
            }
        });
        getContentPane().add(hasilnama);
        hasilnama.setBounds(90, 220, 180, 30);

        hasilkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilkelasActionPerformed(evt);
            }
        });
        getContentPane().add(hasilkelas);
        hasilkelas.setBounds(90, 260, 180, 30);

        jLabel8.setText("Nama");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 220, 50, 20);

        jLabel9.setText("Alamat");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 300, 50, 20);

        jLabel10.setText("Kelas");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 260, 50, 20);

        setSize(new java.awt.Dimension(378, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hasilalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilalamatActionPerformed

    private void editnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editnamaActionPerformed

    private void editkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editkelasActionPerformed

    private void editalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editalamatActionPerformed

    private void hasilnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilnamaActionPerformed

    private void hasilkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilkelasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama=editnama.getText();
        hasilnama.setText(nama);
        String kelas=editkelas.getText();
        hasilkelas.setText(kelas);
        String alamat=editalamat.getText();
        hasilalamat.setText(alamat);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editalamat;
    private javax.swing.JTextField editkelas;
    private javax.swing.JTextField editnama;
    private javax.swing.JTextField hasilalamat;
    private javax.swing.JTextField hasilkelas;
    private javax.swing.JTextField hasilnama;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
