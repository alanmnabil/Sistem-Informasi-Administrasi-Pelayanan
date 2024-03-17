package misc;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.Timer;
/**
 *
 * @author Agriel
 */
public class dateTime {
            
     public static String getTanggal(){
        Date sekarang = new java.util.Date();
        String tanggal = new SimpleDateFormat("EEEE, dd MMMMM yyyy",new Locale("id")).format(sekarang);
        return tanggal;
    }
    
    public static void setWaktu(JLabel waktu){
        ActionListener taskPerformer = (ActionEvent) -> {
            String nol_jam = "", nol_menit = "",nol_detik = "";
            Date dateTime = new java.util.Date();
            int nilai_jam = dateTime.getHours();
            int nilai_menit = dateTime.getMinutes();
            if(nilai_jam <= 9) nol_jam= "0";
            if(nilai_menit <= 9) nol_menit= "0";
            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String sekarang = jam+":"+menit;
            waktu.setText(sekarang);
        };
        new Timer(1, taskPerformer).start();
    }
}