package properties;

import java.awt.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.*;
import javax.swing.*;

public class WindowProperties {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    private final int winWidth = (int) size.getWidth();
    private final int winHeight = (int) size.getHeight();
    private static int posX = 0, posY = 0;
    
//    public void setWinSize(JFrame frame){
//        System.out.println(winWidth + "X" +winHeight);
//        System.out.println(frame.getWidth() + "X" + frame.getHeight());
//        if(winWidth <= 1366 && winHeight <= 768){
//            frame.setExtendedState(MAXIMIZED_BOTH);
//        }
//    }
    
    public static void getWinPosition(MouseEvent evt){
        posX = evt.getX();
        posY = evt.getY();
    }
    
    public static void setWinPosition(JFrame pan, MouseEvent evt){
        pan.setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }
}
