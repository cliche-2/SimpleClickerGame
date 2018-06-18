/* driver class*/


// 2016-06-05
import javax.swing.JFrame;
import java.awt.Component;
// by umji
    	

 import javax.swing.*;
 import java.awt.*;


public class FrogSimulator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("FrogSimulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 2016-06-05
        frame.setBounds(0,0,800,600);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((dim.width/2)-(frame.getWidth()/2), (dim.height/2)-(frame.getHeight()/2));
		// by umji
    	
        frame.setResizable(false);
        
        PanelControl primary = new PanelControl();
        
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
        } // main()
} // FrogSimulator class
