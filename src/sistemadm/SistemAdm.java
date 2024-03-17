package sistemadm;

import misc.*;
import Forms.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class SistemAdm {

    public static void main(String[] args) throws Exception{
        try {
            koneksi.koneksiDatabase();
            Connection connection;
            connection = koneksi.getDatabase();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM pegawai;");
            while(rs.next()){
                int count = rs.getInt("COUNT(*)");
                if(count!=0){
                    new login().setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(null,"Belum ada user yang terdaftar, daftar untuk login.");
//                    new login().setVisible(true);
                    new newUser().setVisible(true);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(SistemAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
