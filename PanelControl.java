/* 사용되는 패널 간 전환을 관리하는 CONTROL PANEL */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class PanelControl extends JPanel{
	
	private FrogGame_new startPanel; // start
	private FrogPanel playPanel;// play
	private HelpPanel helpPanel; // help
	private CreditPanel creditPanel; // credit
	
	private ButtonListener btn;
        
	public PanelControl(){
		
		btn = new ButtonListener();
		
			setBackground(Color.white);
			setPreferredSize(new Dimension(800,600));
			setLayout(null);
		
            /*SET startPanel*/
			startPanel = new FrogGame_new();
			startPanel.setBounds(0,0,800,600);
			startPanel.setVisible(true);
			startPanel.button_1.addActionListener(btn);
			startPanel.button_2.addActionListener(btn);
			startPanel.button_3.addActionListener(btn);
			startPanel.button_4.addActionListener(btn);
			add(startPanel);
            
            /*SET playPanel*/
            playPanel = new FrogPanel();
            playPanel.setBounds(0,0,800,600);
            playPanel.setVisible(false);
            playPanel.btnMain.addActionListener(btn);
            add(playPanel);
                
            /*SET helpPanel*/
            helpPanel = new HelpPanel();
            helpPanel.setBounds(0,0,800,600);
            helpPanel.setVisible(false);
            helpPanel.out.addActionListener(btn);
            add(helpPanel);
            
            /*SET creditPanel*/
            creditPanel = new CreditPanel();
            creditPanel.setBounds(0,0,800,600);
            creditPanel.setVisible(false);
            creditPanel.out_C.addActionListener(btn);
            add(creditPanel);
                
	} // constructor
	
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
            Object obj = event.getSource();
            
            /*start -> play*/
            if(obj == startPanel.button_1){
            	playPanel.setVisible(true);
            	startPanel.setVisible(false);
            	playPanel.F_Panel.setVisible(true);
            	playPanel.EndingPanel.setVisible(false);
            	playPanel.INI();
            }
            
            /*start -> help*/
            if(obj == startPanel.button_2){
            	helpPanel.setVisible(true);
            	startPanel.setVisible(false);
            }
            
            /*help -> start*/
            if(obj == helpPanel.out){
            	helpPanel.setVisible(false);
				startPanel.setVisible(true);
            }
            
            /*start -> credit*/
            if(obj == startPanel.button_3){
            	creditPanel.setVisible(true);
            	startPanel.setVisible(false);
            }

            /*credit -> start*/
            if(obj == creditPanel.out_C){
            	creditPanel.setVisible(false);
            	startPanel.setVisible(true);
            }       
			
			/*back to start*/
			if(obj == playPanel.btnMain){
				playPanel.setVisible(false);
				startPanel.setVisible(true);
			}
			
			/*EXIT*/
			if(obj == startPanel.button_4){
				int answer = JOptionPane.showConfirmDialog(null,"정말 끝내개굴?");
				if(answer == JOptionPane.YES_OPTION){
					System.exit(0);
				}				
			}

        }
    } // ButtonListener
	
	
} // PanelControl class