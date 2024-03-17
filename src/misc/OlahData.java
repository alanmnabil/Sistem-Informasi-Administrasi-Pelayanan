package misc;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OlahData{
    private OlahData() throws Exception{
    }
    
    static Connection conn = koneksi.koneksi;
    static Statement st;
    static ResultSet rs;
    static String commit;
    
    public static String commit(String sql){
        try{
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                if(rs.next()){
                    commit = "update";
                }else{
                    commit = "save";
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        return commit;
    }
    
    public static void saveUpdate(String param, String sql, Object[] values){
        switch (param){
            case "normal" : {
                try {
                    PreparedStatement stat = conn.prepareStatement(sql);
                    for (int i = 0; i < values.length; i++) {
                        if (values[i].getClass().getSimpleName().equals("String")) {
                            System.out.println(values[i].getClass().getSimpleName());
                            stat.setString(i+1, values[i].toString());
                        }else if(values[i].getClass().getSimpleName().equals("Integer")){
                            System.out.println(values[i].getClass().getSimpleName());
                            stat.setInt(i+1, (Integer)values[i]);
                        }else if(values[i].getClass().getSimpleName().equals("Double")){
                            System.out.println(values[i].getClass().getSimpleName());
                            stat.setDouble(i+1, (Double)values[i]);
                        }
                    }
                        stat.executeUpdate();
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data Gagal Disimpan\n"+e.getMessage());
                    Logger.getLogger(OlahData.class.getName()).log(Level.SEVERE, null, e);
                }
            }break;
            default : break;
        }
    }
    
    public static void delete(String table, String key, String param){
        int ok = JOptionPane.showConfirmDialog(null, "Hapus data ini?","Konfirmasi Hapus",
            JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            try{
                PreparedStatement stat = conn.prepareStatement("DELETE FROM "+table+" WHERE "+key+" = '"+param+"'");
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e);
                Logger.getLogger(OlahData.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    

}
