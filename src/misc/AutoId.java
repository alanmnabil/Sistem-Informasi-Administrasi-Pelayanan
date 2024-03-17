package misc;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.*;
import javax.swing.*;

public class AutoId {
    public static String id;
    static Statement st;
    static ResultSet rs;
    static Connection conn;
    
    private AutoId() throws Exception{
    }
    
    public static void getId(JTextField txt, String switches, String table, String key, String param){
        switch(switches){
            case "normal" : {
                try{
                    conn = koneksi.getDatabase();
                    String sql = "SELECT MAX(right("+key+",4)) AS id FROM "+table+";";
                    st = conn.createStatement();
                    rs = st.executeQuery(sql);
                    while(rs.next()){
                        if (rs.first() == false){
                            id = param+"0001";
                            txt.setText(id);
                        }else{
                            rs.last();
                            int set_id = rs.getInt(1) + 1;
                            String num = String.valueOf(set_id);
                            int id_next = num.length();
                            for(int i = 0; i < 4 - id_next; i++){
                                num = "0" + num;
                            }
                            id = param+num;
                            txt.setText(id);
                        }
                    }
                }catch (Exception ex) {
                    Logger.getLogger(AutoId.class.getName()).log(Level.SEVERE, null, ex);
                }  
            }break;
            case "formatted" : {
                try{
                    conn = koneksi.getDatabase();
                    DateFormat df = new SimpleDateFormat("YYMMdd");
                    String strDate = df.format(new java.util.Date());
                    String sql = "SELECT MAX(substring("+key+",3)) AS id FROM "+table+";";
                    st = conn.createStatement();
                    rs = st.executeQuery(sql);
                    while(rs.next()){
                            rs.last();
                            if(rs.getString("id") == null){
                                txt.setText(param+strDate+"0001");
                            }else{
                                String dateId = rs.getString("id").substring(0,6);
                                String numId = rs.getString("id").substring(6);
                                if(dateId.contains(strDate)){
                                    int set_id = Integer.parseInt(numId) + 1;
                                    String num;
                                    if(set_id > 9999){
                                        num = "1";
                                    }else{
                                        num = Integer.toString(set_id);
                                    }
                                    int id_next = num.length();
                                    for(int i = 0; i < 4 - id_next; i++){
                                        num = "0" + num;
                                    }
                                    txt.setText(param+strDate+num);
                                }else{
                                    txt.setText(param+strDate+"0001");
                                }
                            }
                    }
                }catch (Exception e) {
                    Logger.getLogger(AutoId.class.getName()).log(Level.SEVERE, null, e);
                }
            }break;
            default :  {
            }break;
        }
    }
    
    public static String setId(String param, String table, String key){
        String txt = null;
        
        try{
            conn = koneksi.getDatabase();
            DateFormat df = new SimpleDateFormat("YYMMdd");
            String strDate = df.format(new java.util.Date());
            String sql = "SELECT MAX(substring("+key+",3)) AS id FROM "+table+";";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                    rs.last();
                    if(rs.getString("id") == null){
                        txt =param+strDate+"0001";
                    }else{
                        String dateId = rs.getString("id").substring(0,6);
                        String numId = rs.getString("id").substring(6);
                        if(dateId.contains(strDate)){
                            int set_id = Integer.parseInt(numId) + 1;
                            String num;
                            if(set_id > 9999){
                                num = "1";
                            }else{
                                num = Integer.toString(set_id);
                            }
                            int id_next = num.length();
                            for(int i = 0; i < 4 - id_next; i++){
                                num = "0" + num;
                            }
                            txt = param+strDate+num;
                        }else{
                            txt = param+strDate+"0001";
                        }
                    }
            }
        }catch (Exception e) {
            Logger.getLogger(AutoId.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return  txt;
    }
}
