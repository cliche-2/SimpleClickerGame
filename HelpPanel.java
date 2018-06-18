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
       		
       	lblout_C = new JLabel("닫기");
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
        
        goal = new javax.swing.JLabel("<html>게임의 목적 <br><br> 개복치 게임의 비슷한 류의 게임으로 개구리 알부터 6단계에 걸쳐 개구리 성체까지 성장시키는 육성 게임이다. 각 단계에서는 활동 별로 성장 수치가 주어지며 각 단계에 성장 수치를 충족할 경우 다음 단계로 진화한다. 각 활동을 과하게 수행시 랜덤하게 게임오버의 요인이 될 수 있어 사용자의 흥미를 유발한다.</html>");
        goal.setBounds(100,150,600,250);
        goal.setFont(new Font("돋움", Font.BOLD, 20));
        goal.setHorizontalAlignment(SwingConstants.CENTER);
        goal.setVerticalAlignment(SwingConstants.CENTER);
        first.add(goal);
        
        // 2016-06-05 BY UMJI 
        img_caution = new JLabel("주의 : 각 활동에 부여된 랜덤 변수에 따라 개구리가 즉사할 수 있습니다.");
        img_caution.setBounds(40, 170, 600, 100);
        img_caution.setFont(new Font("돋움", Font.BOLD, 15));
        img_caution.setForeground(Color.RED);       
        second.add(img_caution);
        
        img = new javax.swing.JLabel("<html>위 버튼을 클릭시에는 각 버튼에 해당되는 활동이 수행되며 각 활동에 <br> 부여된  성장 수치에 따라 개구리가 다음 단계로 성장한다.</html>");
        img.setBounds(40, 60, 600, 250);
        img.setFont(new Font("돋움", Font.BOLD, 15));
        img.setBackground(Color.gray);
        second.add(img);
        
        lab_btn1 = new JLabel("잠", button_icon, SwingConstants.CENTER);
    	lab_btn1.setHorizontalTextPosition(SwingConstants.CENTER);
    	lab_btn1.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	lab_btn2 = new JLabel("노래", button_icon, SwingConstants.CENTER);
    	lab_btn2.setHorizontalTextPosition(SwingConstants.CENTER);
    	lab_btn2.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	lab_btn3 = new JLabel("청소", button_icon, SwingConstants.CENTER);
    	lab_btn3.setHorizontalTextPosition(SwingConstants.CENTER);
    	lab_btn3.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	lab_btn4 = new JLabel("밥", button_icon, SwingConstants.CENTER);
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
    	
    	se_lab_btn1 = new JLabel("잠", button_icon, SwingConstants.CENTER);
    	se_lab_btn1.setHorizontalTextPosition(SwingConstants.CENTER);
    	se_lab_btn1.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	se_lab_btn2 = new JLabel("노래", button_icon, SwingConstants.CENTER);
    	se_lab_btn2.setHorizontalTextPosition(SwingConstants.CENTER);
    	se_lab_btn2.setVerticalTextPosition(SwingConstants.CENTER);
    	
    		
    	se_lab1 = new JLabel("개구리에게 잠을 통한 휴식을 준다. (성장수치 : 5)");
    	se_lab2 = new javax.swing.JLabel("<html>일시적으로 노래를 틀어줌으로써 개구리 마음에 안정을 준다. <br> (성장수치 : 5)</html>");
    	
    	se_lab1.setBounds(150,40, 350, 100);
    	se_lab2.setBounds(150,160, 500, 100);
    	
    	se_lab1.setFont(new Font("돋움", Font.BOLD, 15));
    	se_lab2.setFont(new Font("돋움", Font.BOLD, 15));
    	
    	
    	se_lab_btn1.setBounds(30, 40, 100, 100);
    	se_lab_btn2.setBounds(30, 160, 100, 100);
    	
    	third.add(se_lab_btn1);
    	third.add(se_lab_btn2);
    	third.add(se_lab1);
    	third.add(se_lab2);
    	
    	forth_lab_btn1 = new JLabel("청소", button_icon, SwingConstants.CENTER);
    	forth_lab_btn1.setHorizontalTextPosition(SwingConstants.CENTER);
    	forth_lab_btn1.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	forth_lab_btn2 = new JLabel("밥", button_icon, SwingConstants.CENTER);
    	forth_lab_btn2.setHorizontalTextPosition(SwingConstants.CENTER);
    	forth_lab_btn2.setVerticalTextPosition(SwingConstants.CENTER);
    	
    	
    	forth_lab1 = new JLabel("랜덤적으로 수조가 더러워질 경우 청소를 한다. (성장수치 : 10)");
    	forth_lab2 = new JLabel("개구리에게 밥을 준다. (성장수치 : 10)");
    	
    	
    	forth_lab1.setBounds(150,40, 500, 100);
    	forth_lab2.setBounds(150,160, 350, 100);
    	
    	forth_lab1.setFont(new Font("돋움", Font.BOLD, 15));
    	forth_lab2.setFont(new Font("돋움", Font.BOLD, 15));
    	
    	
    	forth_lab_btn1.setBounds(30, 40, 100, 100);
    	forth_lab_btn2.setBounds(30, 160, 100, 100);
    	
    	forth.add(forth_lab_btn1);
    	forth.add(forth_lab_btn2);
    	forth.add(forth_lab1);
    	forth.add(forth_lab2);
        //
        
    } // constructor
    
    
    /* 도움말 설명 화면 전환 버튼 ActionListener */
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Object obj = event.getSource();
            //2016-06-05 by umji
            //if(obj == showImg){
            	if(cnt == 0){
                	goal.setVisible(false);
                	//isOn = (isOn)?false:true; // on/off 기능
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