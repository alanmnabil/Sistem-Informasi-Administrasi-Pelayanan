package properties;

import misc.koneksi;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableProperties {
    static Connection conn;
    static Statement st;
    static ResultSet rs;
    public static DefaultTableModel tabmode, cart, cart1;
    public static ArrayList<String> columns = new ArrayList<>();
    public static ArrayList<Object> rowContents = new ArrayList<>();
    
    public TableProperties() throws Exception{
    }
    
    public static void initTable(Object[] Baris, JTable tab){ 
            tabmode = new DefaultTableModel(null,Baris);
            tab.setModel(tabmode);
    }
    public static void initCart(Object[] Baris, JTable tab){ 
            cart = new DefaultTableModel(null,Baris);
            tab.setModel(cart);
    }
    
    public static void getColumns(String param){
        try {
            conn = koneksi.getDatabase();
            st = conn.createStatement();
            rs = st.executeQuery(param);
            ResultSetMetaData metaData = rs.getMetaData();
            int count = metaData.getColumnCount(); //number of column
            for (int i = 1; i<=count; i++) {
                columns.add(metaData.getColumnLabel(i));
                System.out.println(metaData.getColumnLabel(i));
            }
        }
        catch (Exception ex) {
            Logger.getLogger(TableProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void showData(Object[] rows, JTable tab, String sql){
        ArrayList<Object> data = new ArrayList<>();
        initTable(rows, tab);
        try{             
            st = conn.createStatement();             
            rs = st.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();  
            while (rs.next()) {     
                for (String column : columns) {
                    String column_name = metaData.getColumnTypeName(columns.indexOf(column)+1);
                    if(column_name.equals("INT")){
                        data.add(rs.getInt(column));
                    }else{
                        data.add(rs.getString(column));
                    }
                }
                tabmode.addRow(data.toArray());
                data.clear();
            }
            columns.clear();
        }catch(SQLException sqle){                      
            JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);      
            Logger.getLogger(TableProperties.class.getName()).log(Level.SEVERE, null, sqle);
        } 
    }
    
    public static void showCart(Object[] rows, JTable tab, String sql){
        ArrayList<Object> data = new ArrayList<>();
        initTable(rows, tab);
        try{             
            st = conn.createStatement();             
            rs = st.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();  
            while (rs.next()) {     
                for (String column : columns) {
                    String column_name = metaData.getColumnTypeName(columns.indexOf(column)+1);
                    if(column_name.equals("INT")){
                        data.add(rs.getInt(column));
                    }else{
                        data.add(rs.getString(column));
                    }
                }
                tabmode.addRow(data.toArray());
                data.clear();
            }
            columns.clear();
        }catch(SQLException sqle){                      
            JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);      
            Logger.getLogger(TableProperties.class.getName()).log(Level.SEVERE, null, sqle);
        } 
    }
}
