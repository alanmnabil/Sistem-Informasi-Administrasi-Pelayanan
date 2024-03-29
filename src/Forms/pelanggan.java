package Forms;

import utils.Utils;
import java.sql.*; 
import javax.swing.*; 
import java.util.*;
import java.util.logging.*;
import misc.*;
import properties.*;

public class pelanggan extends javax.swing.JFrame {
    private final Utils utils = new Utils();
    /**
     * Creates new form pelanggan
     */
    public pelanggan() throws Exception{
        initComponents();
        inits();
    }
    
    static String idpgwi, commit;
    int posX = 0, posY = 0;
    private final Connection conn = koneksi.getDatabase(); 
    Statement st;
    ResultSet rs;
    static Object[] Baris = {"ID Pelanggan", "Nama", "Jenis Kelamin", "No. Telepon","Alamat"};
    
    private void inits(){
        namapelanggan.requestFocus();
        TableProperties.initTable(Baris, tabelAnggota);
        TableProperties.getColumns("SELECT id_pelanggan, nama_pelanggan, jenkel, notelp, alamat FROM pelanggan");
        TableProperties.showData(Baris, tabelAnggota, "SELECT id_pelanggan, nama_pelanggan, jenkel, notelp, alamat FROM pelanggan");
        kosong();
    }

    protected void kosong(){
        AutoId.getId(idpelanggan, "normal", "pelanggan", "id_pelanggan", "P");
        namapelanggan.setText(""); 
        notelp.setText("");
        iAlamatUser.setText("");            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelAnggota = new javax.swing.JTable();
        btnbatal = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        namapelanggan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        minimize = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        reportPegawai = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        searchTrans = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        idpelanggan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        perempuan = new javax.swing.JRadioButton();
        lakik = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        notelp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        iAlamatUser = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(768, 500));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(null);

        tabelAnggota.setForeground(new java.awt.Color(87, 131, 123));
        tabelAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID KARYAWAN", "NAMA", "USERNAME", "PASSWORD"
            }
        ));
        tabelAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAnggotaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelAnggota);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(330, 150, 420, 280);

        btnbatal.setBackground(new java.awt.Color(0, 153, 204));
        btnbatal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnbatal.setForeground(new java.awt.Color(244, 244, 244));
        btnbatal.setText("Batal");
        btnbatal.setBorder(null);
        btnbatal.setPreferredSize(new java.awt.Dimension(110, 40));
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });
        jPanel3.add(btnbatal);
        btnbatal.setBounds(70, 440, 90, 40);

        btnhapus.setBackground(new java.awt.Color(198, 71, 86));
        btnhapus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(244, 244, 244));
        btnhapus.setText("Hapus");
        btnhapus.setBorder(null);
        btnhapus.setPreferredSize(new java.awt.Dimension(110, 40));
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel3.add(btnhapus);
        btnhapus.setBounds(170, 440, 100, 40);

        btnsimpan.setBackground(new java.awt.Color(0, 153, 204));
        btnsimpan.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(244, 244, 244));
        btnsimpan.setText("Simpan");
        btnsimpan.setBorder(null);
        btnsimpan.setPreferredSize(new java.awt.Dimension(110, 40));
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel3.add(btnsimpan);
        btnsimpan.setBounds(90, 370, 140, 50);

        namapelanggan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        namapelanggan.setForeground(new java.awt.Color(87, 131, 123));
        namapelanggan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        namapelanggan.setPreferredSize(new java.awt.Dimension(156, 22));
        jPanel3.add(namapelanggan);
        namapelanggan.setBounds(140, 150, 150, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(87, 131, 123));
        jLabel3.setText("Nama");
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 150, 110, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(87, 131, 123));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DATA PELANGGAN");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 92, 103)));
        jPanel3.add(jLabel5);
        jLabel5.setBounds(100, 50, 600, 40);

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(768, 40));
        jPanel5.setLayout(null);

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
        jPanel5.add(minimize);
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
        jPanel5.add(exit);
        exit.setBounds(720, 0, 50, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sistem Administrasi");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(0, 0, 150, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText(userSession.getNama());
        jPanel5.add(jLabel8);
        jLabel8.setBounds(160, 0, 130, 40);

        jSeparator2.setForeground(java.awt.Color.white);
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(150, 7, 10, 25);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(0, 0, 768, 40);

        reportPegawai.setBackground(new java.awt.Color(24, 77, 71));
        reportPegawai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportPegawai.setForeground(new java.awt.Color(244, 244, 244));
        reportPegawai.setText("BUAT LAPORAN ");
        reportPegawai.setBorder(null);
        reportPegawai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportPegawai.setPreferredSize(new java.awt.Dimension(110, 40));
        reportPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportPegawaiActionPerformed(evt);
            }
        });
        jPanel3.add(reportPegawai);
        reportPegawai.setBounds(330, 440, 420, 40);

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(87, 131, 123));
        jLabel29.setText(":");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(470, 110, 10, 30);

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(87, 131, 123));
        jLabel32.setText("Cari Pelanggan");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(330, 110, 130, 30);

        searchTrans.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        searchTrans.setForeground(new java.awt.Color(87, 131, 123));
        searchTrans.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        searchTrans.setPreferredSize(new java.awt.Dimension(55, 30));
        searchTrans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTransKeyReleased(evt);
            }
        });
        jPanel3.add(searchTrans);
        searchTrans.setBounds(480, 110, 220, 30);

        jSeparator1.setBackground(new java.awt.Color(51, 92, 103));
        jSeparator1.setForeground(new java.awt.Color(87, 131, 123));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(310, 110, 10, 390);

        idpelanggan.setEditable(false);
        idpelanggan.setBackground(new java.awt.Color(255, 255, 255));
        idpelanggan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        idpelanggan.setForeground(new java.awt.Color(87, 131, 123));
        idpelanggan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        idpelanggan.setFocusable(false);
        idpelanggan.setPreferredSize(new java.awt.Dimension(156, 22));
        jPanel3.add(idpelanggan);
        idpelanggan.setBounds(140, 120, 150, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(87, 131, 123));
        jLabel9.setText("ID Pelanggan");
        jLabel9.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 120, 110, 22);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(87, 131, 123));
        jLabel10.setText("Jenis Kelamin");
        jLabel10.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 180, 110, 22);

        perempuan.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(perempuan);
        perempuan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        perempuan.setForeground(new java.awt.Color(87, 131, 123));
        perempuan.setText("Perempuan");
        jPanel3.add(perempuan);
        perempuan.setBounds(140, 210, 150, 29);

        lakik.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(lakik);
        lakik.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lakik.setForeground(new java.awt.Color(87, 131, 123));
        lakik.setText("Laki-laki");
        jPanel3.add(lakik);
        lakik.setBounds(140, 180, 150, 29);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(87, 131, 123));
        jLabel11.setText("Alamat");
        jLabel11.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 270, 110, 20);

        notelp.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        notelp.setForeground(new java.awt.Color(87, 131, 123));
        notelp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        notelp.setPreferredSize(new java.awt.Dimension(156, 22));
        jPanel3.add(notelp);
        notelp.setBounds(140, 240, 150, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(87, 131, 123));
        jLabel12.setText("No. Telepon");
        jLabel12.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 240, 110, 20);

        jScrollPane1.setBackground(java.awt.Color.white);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        iAlamatUser.setColumns(20);
        iAlamatUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iAlamatUser.setLineWrap(true);
        iAlamatUser.setRows(5);
        iAlamatUser.setWrapStyleWord(true);
        iAlamatUser.setCaretColor(new java.awt.Color(23, 23, 23));
        jScrollPane1.setViewportView(iAlamatUser);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(140, 270, 150, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(768, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAnggotaMouseClicked
        int bar = tabelAnggota.getSelectedRow();
        String sql = "Select * from pelanggan where id_pelanggan = '"+tabelAnggota.getValueAt(bar, 0)+"'";
        ArrayList<String> data = new ArrayList<>();
        try {
            TableProperties.getColumns(sql);
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for(String column : TableProperties.columns){
                    data.add(rs.getString(column));
                }
            }

            idpelanggan.setText(data.get(0));
            namapelanggan.setText(data.get(1));
            if (data.get(2).equals("Laki-laki")) {
                lakik.setSelected(true);
            }else{
                perempuan.setSelected(true);
            }
            notelp.setText(data.get(3));
            iAlamatUser.setText(data.get(4));
            TableProperties.columns.clear();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_tabelAnggotaMouseClicked

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        inits();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int bar = tabelAnggota.getSelectedRow();
        int ok = JOptionPane.showConfirmDialog(null, "hapus","Konfirmasi Dialog",
            JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from pelanggan where id_pelanggan='"+tabelAnggota.getValueAt(bar, 0)+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                namapelanggan.requestFocus();
                inits();
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e);
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if (idpelanggan.getText().length() == 0 || namapelanggan.getText().length() == 0 ||
            notelp.getText().length() == 0 || iAlamatUser.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "jangan kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
        }else{
            String jenkel;
            if (lakik.isSelected()) {
                jenkel = lakik.getText();
            }else{
                jenkel = perempuan.getText();
            }
            Object[] values = {idpelanggan.getText(), namapelanggan.getText(), jenkel,
                notelp.getText(), iAlamatUser.getText()};

            String sql = "SELECT * FROM pelanggan WHERE id_pelanggan = '"+idpelanggan.getText()+"'";
            commit = OlahData.commit(sql);
            try {
                if(commit.equals("update")){
                    OlahData.saveUpdate("normal",
                        "update pelanggan set id_pelanggan=?, nama_pelanggan=?, jenkel=?, notelp=?, alamat=? where id_pelanggan='"+idpelanggan.getText()+"'",
                        values);
                }else if(commit.equals("save")){
                    OlahData.saveUpdate("normal", "INSERT INTO pelanggan VALUE (?,?,?,?,?)", values);
                }
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");

                inits();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(newUser.class.getName()).log(Level.SEVERE, null, e);
            }
            sql = null;
            commit = null;
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
        try {
            new menu_utama().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void reportPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportPegawaiActionPerformed
         Connection connection = koneksi.koneksiDatabase();
         utils.bukaLaporan("datapelanggan", connection);
    }//GEN-LAST:event_reportPegawaiActionPerformed

    private void searchTransKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTransKeyReleased
        String search = searchTrans.getText();
        String query = "SELECT * FROM pelanggan WHERE id_pelanggan LIKE '%"+search+"%' "
            + "OR nama_pelanggan LIKE '%"+search+"%' "
            + "OR jenkel LIKE '%"+search+"%' "
            + "OR notelp LIKE '%"+search+"%' "
            + "OR alamat LIKE '%"+search+"%' ";
        TableProperties.getColumns(query);
        TableProperties.showData(Baris, tabelAnggota, query);
    }//GEN-LAST:event_searchTransKeyReleased

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

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
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pelanggan().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(pelanggan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exit;
    private javax.swing.JTextArea iAlamatUser;
    private javax.swing.JTextField idpelanggan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton lakik;
    private javax.swing.JButton minimize;
    private javax.swing.JTextField namapelanggan;
    private javax.swing.JTextField notelp;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JButton reportPegawai;
    private javax.swing.JTextField searchTrans;
    private javax.swing.JTable tabelAnggota;
    // End of variables declaration//GEN-END:variables
}
