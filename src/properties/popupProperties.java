package properties;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import misc.*;

public class popupProperties {
    private static DefaultTableModel tabmode;
    static Connection conn = koneksi.koneksi;
    static Statement st;
    static ResultSet rs;
    static String a,b,c,d,e,f,g,h;
    static String source;
    
    public static void setSource(String param){
        source = param;
    }
    public static String getSource(){
        return source;
    }
}
