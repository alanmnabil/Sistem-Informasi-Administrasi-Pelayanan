package misc;

import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class koneksi  {
    
    static String dbName = "sistem_adm";
    public static Connection koneksi;
    public static String url = "jdbc:mysql://localhost/"+dbName;   
    
    public static Connection koneksiDatabase() {
        if(koneksi==null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
             try {
                 // INISIALISASI CONNECTION
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, "root", "");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"ERROR KONEKSI :" + ex.getMessage());
            }
        }
        return koneksi;
    }

    public static Connection getDatabase() throws Exception{
        try{        
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
               System.out.println("Database Connected.");
               koneksi = DriverManager.getConnection(url, "root", "");
               System.out.println("Database Found.");
        }    
        catch(SQLException ex)
        {
            if(ex.getMessage().toLowerCase().contains("unknown database")){
                JOptionPane.showMessageDialog(null,"Database Belum Tersedia, Membuat Database...");
                makeDatabase();
            }else if(ex.getMessage().toLowerCase().contains("communications link failure")){
                JOptionPane.showMessageDialog(null, "Koneksi Gagal, Pastikan XAMPP sudah aktif dan module Apache & MySQL sudah aktif. \n"+ex); 
                System.err.println(ex);                
            }else{
                throw ex;
            }
        }
        return koneksi;
    }
    
    public static Connection makeDatabase(){
        try {
            System.out.println("Mencoba membuat database...");
            Statement stat = koneksi.createStatement();
            stat.executeUpdate("create database if not exists "+dbName+";");
            stat.close();
            System.out.println("Database Created.");

            try {
                koneksi = DriverManager.getConnection(url, "root", "");
                Statement st = koneksi.createStatement();
                st.executeUpdate("create table if not exists pegawai(id_pegawai varchar(30) NOT NULL,"
                        + "nama varchar(100) NOT NULL,"
                        + "jenkel varchar(20) NOT NULL,"
                        + "jabatan varchar(10) NOT NULL,"
                        + "notelp varchar (20) NOT NULL,"
                        + "alamat text NOT NULL,"
                        + "username varchar(100) NOT NULL,"
                        + "password varchar(20) NOT NULL, "
                        + "PRIMARY KEY (id_pegawai));");
                
                st.executeUpdate("create table if not exists pelanggan(id_pelanggan varchar(30) NOT NULL,"
                        + "nama_pelanggan varchar(100) NOT NULL,"
                        + "jenkel varchar(20) NOT NULL,"
                        + "notelp varchar (20) NOT NULL,"
                        + "alamat text NOT NULL,"
                        + "PRIMARY KEY (id_pelanggan));");
                
                st.executeUpdate("create table if not exists data_paket(id_paket varchar(30) NOT NULL,"
                        + "nama varchar(100) NOT NULL,"
                        + "kecepatan varchar(100) NOT NULL,"
                        + "harga varchar(100) NOT NULL,"
                        + "PRIMARY KEY (id_paket));");
                
                st.executeUpdate("CREATE TABLE IF NOT EXISTS pembayaran(id_pembayaran varchar(30) NOT NULL, "
                        + "id_pelanggan varchar(30) NOT NULL, "
                        + "tgl_bayar varchar(30) NOT NULL, "
                        + "tenggat_waktu varchar(30) NOT NULL, "
                        + "total varchar(20) NOT NULL, "
                        + "PRIMARY KEY (id_pembayaran));");
                
                st.executeUpdate("CREATE TABLE IF NOT EXISTS tagihan(id_tagihan varchar(30) NOT NULL, "
                        + "id_pelanggan varchar(30) NOT NULL, "
                        + "nama_pelanggan varchar(30) NOT NULL, "
                        + "paket varchar(20) NOT NULL, "
                        + "tenggat_waktu varchar(30) NOT NULL, "
                        + "total varchar(20) NOT NULL, "
                        + "status varchar(30) NOT NULL), "
                        + "PRIMARY KEY (id_tagihan);");
                
                
               } catch (SQLException e) {
               System.err.print(e);
               JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
               System.exit(0);
           }
        } catch (SQLException ex1) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return koneksi;
    }
    
}
