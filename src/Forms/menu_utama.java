/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class menu_utama extends javax.swing.JFrame {

    /**
     * Creates new form menu_utama
     */
    String _name = userSession.getNama();
    
    public menu_utama() throws Exception{
        initComponents();
        welcome.setText("Selamat Datang, "+_name);
    }
    
    int posX = 0, posY = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        minimize = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bPengembalian = new javax.swing.JButton();
        bInventaris = new javax.swing.JButton();
        tKaryawan = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        bAnggota = new javax.swing.JButton();
        bPeminjaman = new javax.swing.JButton();
        bDataBuku = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 15));
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(768, 500));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(768, 40));
        jPanel3.setLayout(null);

        minimize.setBackground(new java.awt.Color(0, 153, 204));
        minimize.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        minimize.setForeground(java.awt.Color.white);
        minimize.setText("-");
        minimize.setBorderPainted(false);
        minimize.setFocusable(false);
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        jPanel3.add(minimize);
        minimize.setBounds(670, 0, 50, 40);

        exit.setBackground(new java.awt.Color(0, 153, 204));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setForeground(java.awt.Color.white);
        exit.setText("X");
        exit.setBorderPainted(false);
        exit.setFocusable(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel3.add(exit);
        exit.setBounds(720, 0, 50, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Menu Utama");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 0, 100, 40);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(22, 26, 29));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bPengembalian.setBackground(new java.awt.Color(0, 153, 204));
        bPengembalian.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bPengembalian.setForeground(java.awt.Color.white);
        bPengembalian.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\bill.png")); // NOI18N
        bPengembalian.setText("Tagihan");
        bPengembalian.setBorder(null);
        bPengembalian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPengembalian.setFocusable(false);
        bPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPengembalianActionPerformed(evt);
            }
        });
        jPanel2.add(bPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 270, 100));

        bInventaris.setBackground(new java.awt.Color(0, 153, 204));
        bInventaris.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bInventaris.setForeground(new java.awt.Color(255, 255, 255));
        bInventaris.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\history.png")); // NOI18N
        bInventaris.setText("<html>Riwayat<br>Pembayaran</html>");
        bInventaris.setBorder(null);
        bInventaris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bInventaris.setFocusable(false);
        bInventaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInventarisActionPerformed(evt);
            }
        });
        jPanel2.add(bInventaris, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 270, 90));

        tKaryawan.setBackground(new java.awt.Color(0, 153, 204));
        tKaryawan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        tKaryawan.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\admin.png")); // NOI18N
        tKaryawan.setText("Karyawan");
        tKaryawan.setBorder(null);
        tKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tKaryawan.setFocusable(false);
        tKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKaryawanActionPerformed(evt);
            }
        });
        jPanel2.add(tKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 270, 90));

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(87, 131, 123));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Selamat Datang");
        welcome.setOpaque(true);
        jPanel2.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 770, 40));

        bAnggota.setBackground(new java.awt.Color(0, 153, 204));
        bAnggota.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bAnggota.setForeground(new java.awt.Color(255, 255, 255));
        bAnggota.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\customer.png")); // NOI18N
        bAnggota.setText("Pelanggan");
        bAnggota.setBorder(null);
        bAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAnggota.setFocusable(false);
        bAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnggotaActionPerformed(evt);
            }
        });
        jPanel2.add(bAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 270, 90));

        bPeminjaman.setBackground(new java.awt.Color(0, 153, 204));
        bPeminjaman.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bPeminjaman.setForeground(java.awt.Color.white);
        bPeminjaman.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\online-payment (1).png")); // NOI18N
        bPeminjaman.setText(" Pembayaran");
        bPeminjaman.setBorder(null);
        bPeminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPeminjaman.setFocusable(false);
        bPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPeminjamanActionPerformed(evt);
            }
        });
        jPanel2.add(bPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 270, 100));

        bDataBuku.setBackground(new java.awt.Color(0, 153, 204));
        bDataBuku.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bDataBuku.setForeground(new java.awt.Color(255, 255, 255));
        bDataBuku.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\computer.png")); // NOI18N
        bDataBuku.setText("Data Paket");
        bDataBuku.setBorder(null);
        bDataBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bDataBuku.setFocusable(false);
        bDataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDataBukuActionPerformed(evt);
            }
        });
        jPanel2.add(bDataBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 270, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 630, 430));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(87, 131, 123));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Wudonet IT Partner");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 92, 103)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 540, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 768, 550);

        setSize(new java.awt.Dimension(768, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPengembalianActionPerformed
     dispose();
        try {
            new tagihan().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bPengembalianActionPerformed

    private void tKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKaryawanActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new karyawan().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tKaryawanActionPerformed

    private void bInventarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInventarisActionPerformed
        this.dispose();
        try {
            new riwayatPem().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bInventarisActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        String[] option = {"Ya", "Tidak", "Log Out"};
        int result = JOptionPane.showOptionDialog(null, "Anda Ingin Keluar?", "Konfirmasi", 
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
                    null, option, option[0]);
        if(result == 0){
            System.exit(0);
        } else if(result == 2){
            dispose();
            try {
                new login().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_exitActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        posX=evt.getX();
        posY=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void bAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnggotaActionPerformed
        this.setVisible(false);
        try {
            new pelanggan().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bAnggotaActionPerformed

    private void bPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPeminjamanActionPerformed
        this.setVisible(false);
        try {
            new pembayaran().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bPeminjamanActionPerformed

    private void bDataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDataBukuActionPerformed
        this.setVisible(false);
        try {
            new datapaket().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bDataBukuActionPerformed

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
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new menu_utama().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnggota;
    private javax.swing.JButton bDataBuku;
    private javax.swing.JButton bInventaris;
    private javax.swing.JButton bPeminjaman;
    private javax.swing.JButton bPengembalian;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton minimize;
    private javax.swing.JButton tKaryawan;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

}
