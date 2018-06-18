/**
 * @(#)FrogGame.java
 *
 * FrogGame application
 *
 * @author 
 * @version 1.00 2016/5/31
 */
 
 import java.awt.Component;
 import javax.swing.*;
 import java.awt.*;
 import javax.swing.BoxLayout;
 import javax.swing.JPanel;
 import javax.swing.JFrame;
 import java.awt.Color;
 import java.awt.Graphics; 
 import javax.swing.ImageIcon;
 import javax.swing.JScrollPane;
 import javax.swing.JLabel;
 
public class FrogGame_new extends JPanel {
    public static JButton button_1,button_2,button_3,button_4;
    public JLabel lab_frog, lab_button1, lab_button2, lab_button3, lab_button4;
    public static JPanel Panel_new;
    private ImageIcon backgroud_icon = new ImageIcon("Background.jpg");
    private ImageIcon prog_icon = new ImageIcon("lv6.gif"); 
   	private ImageIcon button_icon = new ImageIcon("btnBig.gif"); 
    
    	public FrogGame_new(){
            
            setBackground(Color.white);
            setPreferredSize(new Dimension(800,600));
            setLayout(null);
               	
    	lab_frog = new JLabel("", prog_icon, SwingConstants.CENTER);
    	lab_frog.setHorizontalTextPosition(SwingConstants.RIGHT);
    	lab_frog.setVerticalTextPosition(SwingConstants.BOTTOM);
    	
    	lab_button1 = new JLabel("", button_icon, SwingConstants.CENTER);
    	lab_button1.setHorizontalTextPosition(SwingConstants.RIGHT);
    	lab_button1.setVerticalTextPosition(SwingConstants.BOTTOM);
    	
    	lab_button2 = new JLabel("", button_icon, SwingConstants.CENTER);
    	lab_button2.setHorizontalTextPosition(SwingConstants.RIGHT);
    	lab_button2.setVerticalTextPosition(SwingConstants.BOTTOM);
    	
    	lab_button3 = new JLabel("", button_icon, SwingConstants.CENTER);
    	lab_button3.setHorizontalTextPosition(SwingConstants.RIGHT);
    	lab_button3.setVerticalTextPosition(SwingConstants.BOTTOM);
    	
    	lab_button4 = new JLabel("", button_icon, SwingConstants.CENTER);
    	lab_button4.setHorizontalTextPosition(SwingConstants.RIGHT);
    	lab_button4.setVerticalTextPosition(SwingConstants.BOTTOM);
    	
 		Panel_new = new JPanel(){
    		public void paintComponent(Graphics g){
    			super.paintComponent(g); 
    			g.drawImage(backgroud_icon.getImage(), 0, 0, this);                       
    		}
 		};
 		Panel_new.setBounds(0,0,800,600);
 		Panel_new.setLayout(null);
 		Panel_new.setVisible(true);
 		add(Panel_new);
 
    	button_1 = new JButton("½ÃÀÛÇÏ°³±¼");
    	button_2 = new JButton("µµ¿ò¸»");
    	button_3 = new JButton("°³¹ßÁø");
    	button_4 = new JButton("³¡³»°³±¼");
    	
    	// 2016-06-05
    	Color lab_color = new Color (62, 121, 8);
    	button_1.setBackground(lab_color);
    	button_2.setBackground(lab_color);
    	button_3.setBackground(lab_color);
    	button_4.setBackground(lab_color);
    	
    	button_1.setForeground(Color.white);
    	button_2.setForeground(Color.white);
    	button_3.setForeground(Color.white);
    	button_4.setForeground(Color.white);
    	
    	button_1.setOpaque(false);
    	button_2.setOpaque(false);
    	button_3.setOpaque(false);
    	button_4.setOpaque(false);
    	
    	button_1.setFont(new Font("µ¸¿ò", Font.BOLD, 15));
    	button_2.setFont(new Font("µ¸¿ò", Font.BOLD, 15));
    	button_3.setFont(new Font("µ¸¿ò", Font.BOLD, 15));
    	button_4.setFont(new Font("µ¸¿ò", Font.BOLD, 15));
    	// by umji
    	
    	
    	lab_frog.setBounds(80,250,280,280);
    	lab_button1.setBounds(450,220,300,84);
    	lab_button2.setBounds(450,300,300,84);
    	lab_button3.setBounds(450,380,300,84);
    	lab_button4.setBounds(450,460,300,84);
    	
    	// by umji 2016-06-05
    	button_1.setBounds(560,245,145,35);
    	button_2.setBounds(560,325,145,35);
    	button_3.setBounds(560,405,145,35);
    	button_4.setBounds(560,485,145,35);
    	//
    	
    	Panel_new.add(button_1);
    	Panel_new.add(button_2);
    	Panel_new.add(button_3);
    	Panel_new.add(button_4);
    	
		Panel_new.add(lab_frog);
		Panel_new.add(lab_button1);
		Panel_new.add(lab_button2);
		Panel_new.add(lab_button3);
		Panel_new.add(lab_button4);
                
        }// constructor		

    } // FrogGame_new class
