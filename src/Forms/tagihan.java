package Forms;

import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import misc.*;
import misc.OlahData;
import misc.koneksi;
import properties.*;
import utils.Utils;

public class tagihan extends javax.swing.JFrame {
    private final Utils utils = new Utils();
    /**
     * Creates new form transList
     */
    public tagihan() throws Exception {
        initComponents();   
        inits();
    }

    static String idpgwi, commit;
    static String Idbayar = AutoId.setId("T", "tagihan", "id_tagihan");
    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
    int posX = 0, posY = 0;
    private final Connection conn = koneksi.getDatabase(); 
    Statement st;
    ResultSet rs;
    static Object[] Baris = {"ID Tagihan", "ID Pelanggan", "Nama", "Paket", "Tenggat", "Total", "Status"};
    
    private void inits(){
        namaPelanggan.requestFocus();
        TableProperties.initTable(Baris, tabeltagihan);
        TableProperties.getColumns("SELECT * FROM tagihan");
        TableProperties.showData(Baris, tabeltagihan, "SELECT * FROM tagihan");
        kosong();
    }

    protected void kosong(){
        AutoId.getId(IDtagihan, "normal", "tagihan", "id_tagihan", "T");
        IDpelanggan.setText("");
        namaPelanggan.setText("");
        paket.setText("");
        tenggat.setText("");
        total.setText("");
        status.setText("");
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        repOption = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltagihan = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        reportTransaksi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        minimize = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        searchbar = new javax.swing.JTextField();
        IDtagihan = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tenggat = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        paket = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        IDpelanggan = new javax.swing.JTextField();
        namaPelanggan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 768));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jScrollPane1.setForeground(new java.awt.Color(87, 131, 123));

        tabeltagihan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Transaksi", "Nama Member", "Total Pembelian"
            }
        ));
        tabeltagihan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltagihanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeltagihan);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(530, 160, 450, 330);

        jSeparator1.setBackground(new java.awt.Color(51, 92, 103));
        jSeparator1.setForeground(new java.awt.Color(87, 131, 123));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(510, 120, 10, 470);

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(87, 131, 123));
        jLabel19.setText("ID Pelanggan");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(30, 160, 200, 30);

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(87, 131, 123));
        jLabel20.setText(":");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(240, 200, 10, 30);

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(87, 131, 123));
        jLabel22.setText("Paket");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(30, 240, 200, 30);

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(87, 131, 123));
        jLabel23.setText(":");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(240, 240, 10, 30);

        reportTransaksi.setBackground(new java.awt.Color(0, 153, 204));
        reportTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportTransaksi.setForeground(new java.awt.Color(244, 244, 244));
        reportTransaksi.setText("BUAT LAPORAN");
        reportTransaksi.setBorder(null);
        reportTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportTransaksi.setPreferredSize(new java.awt.Dimension(110, 40));
        reportTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportTransaksiActionPerformed(evt);
            }
        });
        jPanel1.add(reportTransaksi);
        reportTransaksi.setBounds(530, 500, 450, 40);

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
        minimize.setBounds(900, 0, 50, 40);

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
        exit.setBounds(950, 0, 50, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText(userSession.getNama());
        jPanel3.add(jLabel7);
        jLabel7.setBounds(160, 0, 130, 40);

        jSeparator2.setForeground(java.awt.Color.white);
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(150, 7, 10, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sistem Administrasi");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 0, 150, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1000, 40);

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(87, 131, 123));
        jLabel28.setText(":");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(240, 120, 10, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(87, 131, 123));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TAGIHAN");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 92, 103)));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 50, 400, 40);

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(87, 131, 123));
        jLabel31.setText("ID Tagihan");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(30, 120, 200, 30);

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(87, 131, 123));
        jLabel29.setText(":");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(650, 120, 10, 30);

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(87, 131, 123));
        jLabel32.setText("Cari Tagihan");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(530, 120, 130, 30);

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(87, 131, 123));
        jLabel24.setText("Total ");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(30, 320, 200, 30);

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(87, 131, 123));
        jLabel25.setText(":");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(240, 280, 10, 30);

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(87, 131, 123));
        jLabel27.setText("Status Pembayaran");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(30, 360, 200, 40);

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(87, 131, 123));
        jLabel33.setText(":");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(240, 160, 10, 30);

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(87, 131, 123));
        jLabel26.setText("Tenggat Waktu");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(30, 280, 200, 30);

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(87, 131, 123));
        jLabel34.setText(":");
        jPanel1.add(jLabel34);
        jLabel34.setBounds(240, 360, 10, 30);

        btnsimpan.setBackground(new java.awt.Color(0, 153, 204));
        btnsimpan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(244, 244, 244));
        btnsimpan.setText("Tambah");
        btnsimpan.setBorder(null);
        btnsimpan.setPreferredSize(new java.awt.Dimension(110, 40));
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnsimpan);
        btnsimpan.setBounds(200, 500, 110, 40);

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
        jPanel1.add(btnbatal);
        btnbatal.setBounds(70, 500, 110, 40);

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
        jPanel1.add(btnhapus);
        btnhapus.setBounds(330, 500, 110, 40);

        searchbar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        searchbar.setForeground(new java.awt.Color(87, 131, 123));
        searchbar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarActionPerformed(evt);
            }
        });
        jPanel1.add(searchbar);
        searchbar.setBounds(660, 120, 150, 30);

        IDtagihan.setEditable(false);
        IDtagihan.setBackground(new java.awt.Color(255, 255, 255));
        IDtagihan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        IDtagihan.setForeground(new java.awt.Color(87, 131, 123));
        IDtagihan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        jPanel1.add(IDtagihan);
        IDtagihan.setBounds(260, 122, 230, 30);

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(87, 131, 123));
        jLabel21.setText("Nama Pelanggan");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(30, 200, 200, 30);

        tenggat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tenggat.setForeground(new java.awt.Color(87, 131, 123));
        tenggat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        tenggat.setPreferredSize(new java.awt.Dimension(156, 22));
        jPanel1.add(tenggat);
        tenggat.setBounds(260, 282, 230, 30);

        total.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        total.setForeground(new java.awt.Color(87, 131, 123));
        total.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        total.setPreferredSize(new java.awt.Dimension(156, 22));
        jPanel1.add(total);
        total.setBounds(260, 322, 230, 30);

        paket.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        paket.setForeground(new java.awt.Color(87, 131, 123));
        paket.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        jPanel1.add(paket);
        paket.setBounds(260, 242, 230, 30);

        status.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        status.setForeground(new java.awt.Color(87, 131, 123));
        status.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        jPanel1.add(status);
        status.setBounds(260, 362, 230, 30);

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(87, 131, 123));
        jLabel35.setText(":");
        jPanel1.add(jLabel35);
        jLabel35.setBounds(240, 320, 10, 30);

        IDpelanggan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        IDpelanggan.setForeground(new java.awt.Color(87, 131, 123));
        IDpelanggan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        jPanel1.add(IDpelanggan);
        IDpelanggan.setBounds(260, 170, 230, 22);

        namaPelanggan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        namaPelanggan.setForeground(new java.awt.Color(87, 131, 123));
        namaPelanggan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        jPanel1.add(namaPelanggan);
        namaPelanggan.setBounds(260, 210, 230, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 610);

        setSize(new java.awt.Dimension(1000, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void reportTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportTransaksiActionPerformed
         utils.bukaLaporan("datatagihan1", conn);
    }//GEN-LAST:event_reportTransaksiActionPerformed

    private void tabeltagihanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltagihanMouseClicked
        int bar = tabeltagihan.getSelectedRow();
        IDtagihan.setText(tabeltagihan.getValueAt(bar, 0).toString());
        IDpelanggan.setText(tabeltagihan.getValueAt(bar, 1).toString());
        namaPelanggan.setText(tabeltagihan.getValueAt(bar, 2).toString());
        paket.setText(tabeltagihan.getValueAt(bar, 3).toString());
        tenggat.setText(tabeltagihan.getValueAt(bar, 4).toString());
        total.setText(tabeltagihan.getValueAt(bar, 5).toString());
        status.setText(tabeltagihan.getValueAt(bar, 6).toString());
    }//GEN-LAST:event_tabeltagihanMouseClicked

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

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if (IDtagihan.getText().length() == 0 || IDpelanggan.getText().length() == 0 ||
            namaPelanggan.getText().length() == 0 || paket.getText().length() == 0 ||
            tenggat.getText().length() == 0 || total.getText().length() == 0 ||
                status.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "jangan kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
        }else{
            Object[] values = {IDtagihan.getText(), IDpelanggan.getText(),namaPelanggan.getText(),
                paket.getText(), tenggat.getText(),total.getText(),status.getText()};

            String sql = "SELECT * FROM tagihan WHERE id_tagihan = '"+IDtagihan.getText()+"'";
            commit = OlahData.commit(sql);
            try {
                if(commit.equals("update")){
                    OlahData.saveUpdate("normal",
                        "update tagihan set id_tagihan=?, id_pelanggan=?, nama_pelanggan=?,paket=?, tenggat_waktu=?, total=?, status=? where id_tagihan='"+IDtagihan.getText()+"'",
                        values);
                }else if(commit.equals("save")){
                    OlahData.saveUpdate("normal", "INSERT INTO tagihan VALUE (?,?,?,?,?,?,?)", values);

                }
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");

                inits();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(datapaket.class.getName()).log(Level.SEVERE, null, e);
            }
            sql = null;
            commit = null;
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        inits();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int bar = tabeltagihan.getSelectedRow();
        int ok = JOptionPane.showConfirmDialog(null, "hapus","Konfirmasi Dialog",
            JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from tagihan where id_tagihan='"+tabeltagihan.getValueAt(bar, 0)+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                namaPelanggan.requestFocus();
                inits();
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e);
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void searchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbarActionPerformed

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
            java.util.logging.Logger.getLogger(tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new tagihan().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(tagihan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDpelanggan;
    private javax.swing.JTextField IDtagihan;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton minimize;
    private javax.swing.JTextField namaPelanggan;
    private javax.swing.JTextField paket;
    private javax.swing.ButtonGroup repOption;
    private javax.swing.JButton reportTransaksi;
    private javax.swing.JTextField searchbar;
    private javax.swing.JTextField status;
    private javax.swing.JTable tabeltagihan;
    private javax.swing.JTextField tenggat;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
