import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HelpPanel extends JPanel{
    
    
    private JPanel first, second, third, forth;
    public JButton showImg, out;
    // 2016-06-05 by umji
    public int cnt = 0;
    private JLabel forth_lab1, forth_lab2, forth_lab_btn1, forth_lab_btn2, se_lab1, se_lab2, se_lab_btn1, se_lab_btn2, img_caution
    	, lblTitle, img, goal, lblout_C, lblshow_C, lab_btn1, lab_btn2, lab_btn3, lab_btn4;
    private ImageIcon button_icon = new ImageIcon("btnFace.gif");
    private ImageIcon baseImage = new ImageIcon("PatternBackground1.jpg");
    //
    private boolean isOn=false; 
    private ButtonListener btn;
    
    public HelpPanel(){

        btn = new ButtonListener();
        
        // 2016-06-05 by umji
        first = new JPanel(){
    		public void paintComponent(Graphics g){
    			super.paintComponent(g); 
    			g.drawImage(baseImage.getImage(), 0, 0, this);                       
    		}
 		};
 		//
        first.setPreferredSize(new Dimension(800,600));
        first.setBackground(Color.white);
        first.setVisible(true);
        first.setLayout(null);
        add(first);
        
        // 2016-06-05 BY UMJI
		lblshow_C = new JLabel("NEXT");
		//
       	lblshow_C.setBounds(499,515,60,40);
       	lblshow_C.setHorizontalAlignment(SwingConstants.CENTER);
       	lblshow_C.setVerticalAlignment(SwingConstants.CENTER);
       	lblshow_C.setOpaque(false);
       	first.add(lblshow_C);      
       		
       	lblout_C = new JLabel("�ݱ�");
       	lblout_C.setBounds(600,515,60,40);
       	lblout_C.setHorizontalAlignment(SwingConstants.CENTER);
       	lblout_C.setVerticalAlignment(SwingConstants.CENTER);
       	lblout_C.setOpaque(false);
       	first.add(lblout_C);    
        
        ImageIcon face = new ImageIcon("btnFace.gif");
        
        showImg = new JButton(face);
        showImg.setBounds(479,480,100,100);
        showImg.setBorderPainted(false);
        showImg.setContentAreaFilled(false);
        showImg.addActionListener(btn);
        first.add(showImg);
        
     	out = new JButton(face);
        out.setBounds(580,480,100,100);
        out.setBorderPainted(false);
        out.setContentAreaFilled(false);
        first.add(out);
     	
        lblTitle = new JLabel("How to play");
        // 2016-06-05 BY UMJI
        lblTitle.setBounds(0,25,800,100);
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 70));
        //  
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setVerticalAlignment(SwingConstants.CENTER);
        first.add(lblTitle);
        
        second = new JPanel();
        second.setBounds(100,170,600,300);
        second.setVisible(false);
        second.setLayout(null);
        first.add(second);
        
        // 2016-06-05 BY UMJI
        
        
        third = new JPanel();
        third.setBounds(100,170,600,300);
        third.setVisible(false);
        third.setLayout(null);
        first.add(third);	
        
        forth = new JPanel();
        forth.setBounds(100,170,600,300);
        forth.setVisible(false);
        forth.setLayout(null);
        first.add(forth);
        
        goal = new javax.swing.JLabel("<html>������ ���� <br><br> ����ġ ������ ����� ���� �������� ������ �˺��� 6�ܰ迡 ���� ������ ��ü���� �����Ű�� ���� �����̴�. �� �ܰ迡���� Ȱ�� ���� ���� ��ġ�� �־����� �� �ܰ迡 ���� ��ġ�� ������ ��� ���� �ܰ�� ��ȭ�Ѵ�. �� Ȱ���� ���ϰ� ����� �����ϰ� ���ӿ����� ������ �� �� �־� ������� ��̸� �����Ѵ�.</html>");
        goal.setBounds(100,150,600,250);
        goal.setFont(new Font("����", Font.BOLD, 20));
        goal.setHorizontalAlignment(SwingConstants.CENTER);
        goal.setVerticalAlignment(SwingConstants.CENTER);
        first.add(goal);
        
        // 2016-06-05 BY UMJI 
        img_caution = new JLabel("���� : �� Ȱ���� �ο��� ���� ������ ���� �������� ����� �� �ֽ��ϴ�.");
        img_caution.setBounds(40, 170, 600, 100);
        img_caution.setFont(new Font("����", Font.BOLD, 15));
        img_caution.setForeground(Color.RED);       
        second.add(img_caution);
        
        img = new javax.swing.JLabel("<html>�� ��ư�� Ŭ���ÿ��� �� ��ư�� �ش�Ǵ� Ȱ���� ����Ǹ� �� Ȱ���� <br> �ο���  ���� ��ġ�� ���� �������� ���� �ܰ�� �����Ѵ�.</html>");
        img.setBounds(40, 60, 600, 250);
        img.setFont(new Font("����", Font.BOLD, 15));
        img.setBackground(Color.gray);
        second.add(img);
        
        lab_btn1 = new JLabel("��", button_icon, SwingConstants.CENTER);
    	lab_btn1.setHorizontalTextPosition(SwingConstants.CENTER);
    	lab_btn1.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	lab_btn2 = new JLabel("�뷡", button_icon, SwingConstants.CENTER);
    	lab_btn2.setHorizontalTextPosition(SwingConstants.CENTER);
    	lab_btn2.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	lab_btn3 = new JLabel("û��", button_icon, SwingConstants.CENTER);
    	lab_btn3.setHorizontalTextPosition(SwingConstants.CENTER);
    	lab_btn3.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	lab_btn4 = new JLabel("��", button_icon, SwingConstants.CENTER);
    	lab_btn4.setHorizontalTextPosition(SwingConstants.CENTER);
    	lab_btn4.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	lab_btn1.setBounds(55, 30, 100, 100);
    	lab_btn2.setBounds(185, 30, 100, 100);
    	lab_btn3.setBounds(315, 30, 100, 100);
    	lab_btn4.setBounds(445, 30, 100, 100);
    	
    	second.add(lab_btn1);
    	second.add(lab_btn2);
    	second.add(lab_btn3);
    	second.add(lab_btn4);
    	
    	se_lab_btn1 = new JLabel("��", button_icon, SwingConstants.CENTER);
    	se_lab_btn1.setHorizontalTextPosition(SwingConstants.CENTER);
    	se_lab_btn1.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	se_lab_btn2 = new JLabel("�뷡", button_icon, SwingConstants.CENTER);
    	se_lab_btn2.setHorizontalTextPosition(SwingConstants.CENTER);
    	se_lab_btn2.setVerticalTextPosition(SwingConstants.CENTER);
    	
    		
    	se_lab1 = new JLabel("���������� ���� ���� �޽��� �ش�. (�����ġ : 5)");
    	se_lab2 = new javax.swing.JLabel("<html>�Ͻ������� �뷡�� Ʋ�������ν� ������ ������ ������ �ش�. <br> (�����ġ : 5)</html>");
    	
    	se_lab1.setBounds(150,40, 350, 100);
    	se_lab2.setBounds(150,160, 500, 100);
    	
    	se_lab1.setFont(new Font("����", Font.BOLD, 15));
    	se_lab2.setFont(new Font("����", Font.BOLD, 15));
    	
    	
    	se_lab_btn1.setBounds(30, 40, 100, 100);
    	se_lab_btn2.setBounds(30, 160, 100, 100);
    	
    	third.add(se_lab_btn1);
    	third.add(se_lab_btn2);
    	third.add(se_lab1);
    	third.add(se_lab2);
    	
    	forth_lab_btn1 = new JLabel("û��", button_icon, SwingConstants.CENTER);
    	forth_lab_btn1.setHorizontalTextPosition(SwingConstants.CENTER);
    	forth_lab_btn1.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	forth_lab_btn2 = new JLabel("��", button_icon, SwingConstants.CENTER);
    	forth_lab_btn2.setHorizontalTextPosition(SwingConstants.CENTER);
    	forth_lab_btn2.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	
    	forth_lab1 = new JLabel("���������� ������ �������� ��� û�Ҹ� �Ѵ�. (�����ġ : 10)");
    	forth_lab2 = new JLabel("���������� ���� �ش�. (�����ġ : 10)");
    	
    	
    	forth_lab1.setBounds(150,40, 500, 100);
    	forth_lab2.setBounds(150,160, 350, 100);
    	
    	forth_lab1.setFont(new Font("����", Font.BOLD, 15));
    	forth_lab2.setFont(new Font("����", Font.BOLD, 15));
    	
    	
    	forth_lab_btn1.setBounds(30, 40, 100, 100);
    	forth_lab_btn2.setBounds(30, 160, 100, 100);
    	
    	forth.add(forth_lab_btn1);
    	forth.add(forth_lab_btn2);
    	forth.add(forth_lab1);
    	forth.add(forth_lab2);
        //
        
    } // constructor
    
    
    /* ���� ���� ȭ�� ��ȯ ��ư ActionListener */
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Object obj = event.getSource();
            //2016-06-05 by umji
            //if(obj == showImg){
            	if(cnt == 0){
                	goal.setVisible(false);
                	//isOn = (isOn)?false:true; // on/off ���
                	second.setVisible(true);
                	cnt++;
                }
                else if(cnt == 1)
                {
                	second.setVisible(false);
                	third.setVisible(true);
                	cnt++;
                }
                else if(cnt == 2)
                {
                	lblshow_C.setVisible(false);
        			showImg.setVisible(false);
                	third.setVisible(false);
                	forth.setVisible(true);
                	cnt++;
                }
        }
    }
    	// ButtonListener
    
    
} // HelpPanel class