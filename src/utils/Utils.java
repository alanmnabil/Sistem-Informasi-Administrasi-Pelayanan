package utils;

import java.sql.Connection;
import java.util.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class Utils {
        final Locale locale = new Locale("id", "ID");
        
         public void bukaLaporan(String namaFile, Connection con) {
        try {
            Map params = new HashMap();
            params.put(JRParameter.REPORT_LOCALE, locale);
            String reportFolder = System.getProperty("user.dir") + "/src/report/";
            String reportDirectory = reportFolder + namaFile;
            String reportSource = reportDirectory  + ".jrxml";
            String reportDestination = reportDirectory + ".jasper";
            params.putIfAbsent("REPORTS_DIR", reportFolder);

            JasperReport report = JasperCompileManager.compileReport(reportSource);
            JasperPrint print = JasperFillManager.fillReport(report, params, con);
            JasperExportManager.exportReportToHtmlFile(print, reportDestination);
            JasperViewer viewer = new JasperViewer(print, false, locale);
            viewer.setAlwaysOnTop(true);
            viewer.setVisible(true);
        } catch(JRException ex) {
            System.out.println(ex);
        }
    }
}