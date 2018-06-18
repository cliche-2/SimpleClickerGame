import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CreditPanel extends JPanel{
    
    public static JPanel first;
    public JButton out_C;
    private JLabel lblTitle, lbl_1,lbl_2,lbl_3, lblout_C;
    private ImageIcon baseImage = new ImageIcon("PatternBackground1.jpg"); // by umji 2016-06-05
    
    public CreditPanel(){
		
		// 2016-06-05
        first = new JPanel(){
    		public void paintComponent(Graphics g){
    			super.paintComponent(g); 
    			g.drawImage(baseImage.getImage(), 0, 0, this);                       
    		}
 		};
 		// by umji
 		
 		/*±âº» ÆÐ³Î*/
        first.setPreferredSize(new Dimension(800,600));
        first.setVisible(true);
        first.setLayout(null);
        add(first);
        
        
        /*°³¹ßÁø ¼Ò°³ Label*/
        lbl_1 = new JLabel("# ---"); //by umji 2016-06-05
        lbl_1.setBounds(220,170,600,100); //by umji 2016-06-05
        lbl_1.setFont(new Font("µ¸¿ò", Font.BOLD, 30));
        lbl_1.setVerticalAlignment(SwingConstants.CENTER);
        first.add(lbl_1);
        
        lbl_2 = new JLabel("# ---"); //by umji 2016-06-05
        lbl_2.setBounds(220,270,600,100); //by umji 2016-06-05
        lbl_2.setFont(new Font("µ¸¿ò", Font.BOLD, 30));
        lbl_2.setVerticalAlignment(SwingConstants.CENTER);
        first.add(lbl_2);
        
        lbl_3 = new JLabel("# ---"); //by umji 2016-06-05
        lbl_3.setBounds(220,370,600,100); //by umji 2016-06-05
        lbl_3.setFont(new Font("µ¸¿ò", Font.BOLD, 30));
        lbl_3.setVerticalAlignment(SwingConstants.CENTER);
        first.add(lbl_3);
   
   
   		/*´Ý±â*/
     	lblout_C = new JLabel("´Ý±â");
       	lblout_C.setBounds(600,465,60,40);
       	lblout_C.setForeground(Color.black);
       	lblout_C.setHorizontalAlignment(SwingConstants.CENTER);
       	lblout_C.setVerticalAlignment(SwingConstants.CENTER);
       	lblout_C.setOpaque(false);
       	first.add(lblout_C);
     	
     	ImageIcon face = new ImageIcon("btnFace.gif");
     	out_C = new JButton(face);
     	out_C.setBorderPainted(false);
        out_C.setContentAreaFilled(false);
       	out_C.setBounds(580,440,100,100);
       	first.add(out_C);
       	
       	
       	/*Å¸ÀÌÆ²*/
       	// 2016-06-05
        lblTitle = new JLabel("Credit");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 70));
        lblTitle.setBounds(280,30,500,100);
        first.add(lblTitle);
        // by umji
        
    } // constructor
    
} // HelpPanel class