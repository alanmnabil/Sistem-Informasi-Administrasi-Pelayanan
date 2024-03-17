package Forms;

import java.sql.*; 
import javax.swing.*; 
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.*;
import misc.*;
import properties.*;
import utils.Utils;
 
public class karyawan extends javax.swing.JFrame {
    private final Utils utils = new Utils();

    public karyawan() throws Exception{
        initComponents();
        kosong();   
        Locale locale = new Locale ("id","ID");
        Locale.setDefault(locale);
        aktif();         
        datatable(); 
    }
    
    static String idpgwi, commit;
    int posX = 0, posY = 0;
    private final Connection conn = koneksi.getDatabase(); 
    Statement st;
    ResultSet rs;
    private DefaultTableModel tabmode; 

    protected void aktif(){        
        NamaKaryawan.requestFocus();     
    } 

    protected void kosong(){
        AutoId.getId(kodePegawai, "normal", "pegawai", "id_pegawai", "K");
        NamaKaryawan.setText("");         
        usernameKaryawan.setText("");
        iJabatan.setText("");
        notelp.setText("");
        iAlamatUser.setText("");
        usernameKaryawan.setText(""); 
        iPassword.setText("");              
    }
    
    public void search(String sc) {
        Object[] Baris = {"ID Pegawai", "Nama", "Username"};
        DefaultTableModel jTable = new DefaultTableModel(null, Baris);
        tabelKaryawan.setModel(jTable);
        String sql = "SELECT * "
                + "FROM pegawai "
                + "where id_pegawai LIKE '%"+ sc +"%' "
                + "OR nama LIKE '%"+ sc +"%' "
                + "OR username LIKE '%"+ sc +"%';";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("id_pegawai");
                String b = hasil.getString("nama");
                String c = hasil.getString("username");
                String[] data = {a, b, c};
                jTable.addRow(data);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Data Gagal Masuk Tabel \n" + sqle);
        }
    }


    protected void datatable(){                 
            Object[] Baris = {"ID Pegawai", "Nama", "Username"};         
            tabmode = new DefaultTableModel(null, Baris);         
            tabelKaryawan.setModel(tabmode);         
            String sql = "select * from pegawai;";         
            try{             
                java.sql.Statement stat = conn.createStatement();             
                ResultSet hasil = stat.executeQuery(sql);            
                while (hasil.next()){                
                    String id_pegawai = hasil.getString("id_pegawai");               
                    String nama = hasil.getString("nama");                                 
                   String username = hasil.getString("username");;                                  
                   String[] data = {id_pegawai,nama,username};                 
                   tabmode.addRow(data);                      
                }       
            }catch(SQLException sqle){                      
                JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);      
            }         

    } 
 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jk = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelKaryawan = new javax.swing.JTable();
        btnbatal = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        usernameKaryawan = new javax.swing.JTextField();
        NamaKaryawan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        kodePegawai = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        perempuan = new javax.swing.JRadioButton();
        lakik = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        notelp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        iAlamatUser = new javax.swing.JTextArea();
        iPassword = new javax.swing.JPasswordField();
        showPass = new javax.swing.JToggleButton();
        iJabatan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Karyawan");
        setBackground(new java.awt.Color(255, 0, 204));
        setUndecorated(true);
        getContentPane().setLayout(null);

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

        tabelKaryawan.setForeground(new java.awt.Color(87, 131, 123));
        tabelKaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKaryawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelKaryawan);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(330, 150, 420, 440);

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
        btnbatal.setBounds(50, 600, 100, 40);

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
        btnhapus.setBounds(170, 600, 100, 40);

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
        btnsimpan.setBounds(90, 530, 140, 60);

        usernameKaryawan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        usernameKaryawan.setForeground(new java.awt.Color(87, 131, 123));
        usernameKaryawan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        usernameKaryawan.setPreferredSize(new java.awt.Dimension(156, 22));
        jPanel3.add(usernameKaryawan);
        usernameKaryawan.setBounds(140, 390, 150, 22);

        NamaKaryawan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        NamaKaryawan.setForeground(new java.awt.Color(87, 131, 123));
        NamaKaryawan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        NamaKaryawan.setPreferredSize(new java.awt.Dimension(156, 22));
        jPanel3.add(NamaKaryawan);
        NamaKaryawan.setBounds(140, 150, 150, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(87, 131, 123));
        jLabel4.setText("USERNAME");
        jLabel4.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 390, 110, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(87, 131, 123));
        jLabel3.setText("NAMA");
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 150, 110, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(87, 131, 123));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DATA KARYAWAN");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 92, 103)));
        jPanel3.add(jLabel5);
        jLabel5.setBounds(244, 50, 320, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(87, 131, 123));
        jLabel6.setText("PASSWORD");
        jLabel6.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 420, 110, 22);

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
        reportPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportPegawaiMouseClicked(evt);
            }
        });
        reportPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportPegawaiActionPerformed(evt);
            }
        });
        jPanel3.add(reportPegawai);
        reportPegawai.setBounds(330, 600, 420, 40);

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(87, 131, 123));
        jLabel29.setText(":");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(450, 110, 10, 30);

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(87, 131, 123));
        jLabel32.setText("Cari Karyawan");
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
        searchTrans.setBounds(460, 110, 220, 30);

        jSeparator1.setBackground(new java.awt.Color(51, 92, 103));
        jSeparator1.setForeground(new java.awt.Color(87, 131, 123));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(310, 110, 10, 530);

        kodePegawai.setEditable(false);
        kodePegawai.setBackground(new java.awt.Color(255, 255, 255));
        kodePegawai.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        kodePegawai.setForeground(new java.awt.Color(87, 131, 123));
        kodePegawai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        kodePegawai.setFocusable(false);
        kodePegawai.setPreferredSize(new java.awt.Dimension(156, 22));
        jPanel3.add(kodePegawai);
        kodePegawai.setBounds(140, 120, 150, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(87, 131, 123));
        jLabel9.setText("ID Karyawan");
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
        jk.add(perempuan);
        perempuan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        perempuan.setForeground(new java.awt.Color(87, 131, 123));
        perempuan.setText("Perempuan");
        jPanel3.add(perempuan);
        perempuan.setBounds(140, 210, 150, 29);

        lakik.setBackground(new java.awt.Color(255, 255, 255));
        jk.add(lakik);
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
        jLabel11.setBounds(20, 310, 110, 20);

        notelp.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        notelp.setForeground(new java.awt.Color(87, 131, 123));
        notelp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        notelp.setPreferredSize(new java.awt.Dimension(156, 22));
        jPanel3.add(notelp);
        notelp.setBounds(140, 280, 150, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(87, 131, 123));
        jLabel12.setText("No. Telepon");
        jLabel12.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 280, 110, 20);

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
        jScrollPane1.setBounds(140, 310, 150, 70);

        iPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iPassword.setForeground(new java.awt.Color(87, 131, 123));
        iPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        jPanel3.add(iPassword);
        iPassword.setBounds(140, 420, 120, 22);

        showPass.setBackground(java.awt.Color.white);
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-eye-25 black.png"))); // NOI18N
        showPass.setBorder(null);
        showPass.setContentAreaFilled(false);
        showPass.setFocusable(false);
        showPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-hide-24 black.png"))); // NOI18N
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        jPanel3.add(showPass);
        showPass.setBounds(270, 420, 25, 20);

        iJabatan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        iJabatan.setForeground(new java.awt.Color(87, 131, 123));
        iJabatan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(87, 131, 123)));
        iJabatan.setPreferredSize(new java.awt.Dimension(156, 22));
        jPanel3.add(iJabatan);
        iJabatan.setBounds(140, 250, 150, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(87, 131, 123));
        jLabel13.setText("Jabatan");
        jLabel13.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 250, 110, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-1, -1, 768, 650);

        setSize(new java.awt.Dimension(768, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if (kodePegawai.getText().length() == 0 || NamaKaryawan.getText().length() == 0 || 
                notelp.getText().length() == 0 || iAlamatUser.getText().length() == 0 || new String(iPassword.getPassword()).length() == 0) {
            JOptionPane.showMessageDialog(this, "jangan kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
        }else{
            String jenkel;
            if (lakik.isSelected()) {
                jenkel = lakik.getText();
            }else{
                jenkel = perempuan.getText();
            }
           Object[] values = {kodePegawai.getText(), NamaKaryawan.getText(), jenkel,
                iJabatan.getText(), notelp.getText(), iAlamatUser.getText(), usernameKaryawan.getText(), new String(iPassword.getPassword())};
            
            String sql = "SELECT * FROM pegawai WHERE id_pegawai = '"+kodePegawai.getText()+"'";
            commit = OlahData.commit(sql);
            try {
                if(commit.equals("update")){
                    OlahData.saveUpdate("normal",
                        "update pegawai set id_pegawai=?, nama=?, jenkel=?, jabatan=?, notelp=?, alamat=?, username=?, password=? where id_pegawai='"+kodePegawai.getText()+"'",
                        values);
                }else if(commit.equals("save")){
                    OlahData.saveUpdate("normal", "INSERT INTO pegawai VALUE (?,?,?,?,?,?,?,?)", values);
                }
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                
                kosong();
                aktif();
                datatable();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(newUser.class.getName()).log(Level.SEVERE, null, e);
            }
            commit = null;
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int bar = tabelKaryawan.getSelectedRow();
        int ok = JOptionPane.showConfirmDialog(null, "hapus","Konfirmasi Dialog",
            JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from pegawai where id_pegawai='"+tabelKaryawan.getValueAt(bar, 0)+"'";
            try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                NamaKaryawan.requestFocus();
                datatable();
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e);
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void tabelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKaryawanMouseClicked
        int bar = tabelKaryawan.getSelectedRow();
        String sql = "Select * from pegawai where id_pegawai = '"+tabelKaryawan.getValueAt(bar, 0)+"'";
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

            kodePegawai.setText(data.get(0));
            NamaKaryawan.setText(data.get(1));     
            if (data.get(2).equals("Laki-laki")) {
                lakik.setSelected(true);
            }else{
                perempuan.setSelected(true);
            }
            iJabatan.setText(data.get(3));
            notelp.setText(data.get(4));
            iAlamatUser.setText(data.get(5));
            usernameKaryawan.setText(data.get(6)); 
            iPassword.setText(data.get(7)); 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_tabelKaryawanMouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_jPanel3MouseDragged

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
        
    }//GEN-LAST:event_reportPegawaiActionPerformed

    private void searchTransKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTransKeyReleased
        // TODO add your handling code here:
        search(searchTrans.getText());
    }//GEN-LAST:event_searchTransKeyReleased

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if(showPass.isSelected()){
            iPassword.setEchoChar((char)0);
        }else{
            iPassword.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void reportPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportPegawaiMouseClicked
        try{
            utils.bukaLaporan("datakaryawan", conn);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_reportPegawaiMouseClicked

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
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new karyawan().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NamaKaryawan;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton exit;
    private javax.swing.JTextArea iAlamatUser;
    private javax.swing.JTextField iJabatan;
    private javax.swing.JPasswordField iPassword;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.ButtonGroup jk;
    private javax.swing.JTextField kodePegawai;
    private javax.swing.JRadioButton lakik;
    private javax.swing.JButton minimize;
    private javax.swing.JTextField notelp;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JButton reportPegawai;
    private javax.swing.JTextField searchTrans;
    private javax.swing.JToggleButton showPass;
    private javax.swing.JTable tabelKaryawan;
    private javax.swing.JTextField usernameKaryawan;
    // End of variables declaration//GEN-END:variables
}
