import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FrogPanel extends JPanel implements Runnable{
    
    public JPanel F_Panel, EndingPanel; // "Play" and "Ending" Panel
    private ImageIcon baseImage = new ImageIcon("PatternBackground.jpg");
    private Thread chk; // life Manager
    public static boolean WATER_CHECKER = false; // to control Water
  
    /*Play screen*/
	private int growth, growthLv, randNum;
	public static int cleanLv, lifeLv; // water에서도 객체없이 공유되는 변수
	private JPanel lifeLevelPanel;
	private JLabel do_1, do_2, do_3, do_4;
	private JLabel[] imgLife;
	private JButton doEat, doSleep, doSing, doClean;
    private ButtonListener buttonAct;
    private Water water;
    private JLabel FROG[];
    
    
    /*Ending screen*/
    private JPanel imagePanel, txtPanel;
    private JLabel[] imgEnd;
    private JLabel txtEnd, txtEnd_2;
    private JButton btnRetry;
    public JButton btnMain;
    private int Ending;
    private EndingListener buttonEnd;
        
        
	public FrogPanel(){
		
		chk = null; // life Manager init
		
		/*Play screen*/
		growth=0;
		growthLv=1;
		lifeLv=3;
		cleanLv=2;
		randNum=0;
		buttonAct = new ButtonListener();

	 	setBackground(Color.white);
	 	setPreferredSize(new Dimension(800,600));
	 	setLayout(null);
	 	
	 	F_Panel = new JPanel(){
	 		public void paintComponent(Graphics g){
	 			super.paintComponent(g);
	 			g.drawImage(baseImage.getImage(),0,0,this);
	 		}
	 	};
	 	F_Panel.setBounds(0,0,800,600);
	 	F_Panel.setLayout(null);
	 	F_Panel.setVisible(true);
	 	add(F_Panel);

		/* GUI */
		lifeLevelPanel = new JPanel();
		lifeLevelPanel.setBounds(500,50,150,40);
		lifeLevelPanel.setOpaque(false);
		F_Panel.add(lifeLevelPanel);
		
		imgLife = new JLabel[3];
		ImageIcon R = new ImageIcon("Heart.gif");
		for(int i=0;i<3;i++){
				imgLife[i] = new JLabel(R);
				imgLife[i].setVisible(true);
				lifeLevelPanel.add(imgLife[i]);
		}
		imgLife[0].setBounds(582,50,40,40);
		imgLife[1].setBounds(541,50,40,40);
		imgLife[2].setBounds(500,50,40,40);
		
		
		FROG = new JLabel[5];
		
	ImageIcon f1 = new ImageIcon("lv1.gif");
	ImageIcon f2 = new ImageIcon("lv2.gif");
	ImageIcon f3 = new ImageIcon("lv3.gif");
	ImageIcon f4 = new ImageIcon("lv4.gif");
	ImageIcon f5 = new ImageIcon("lv5.gif");

	FROG[0] = new JLabel(f1);
	FROG[1] = new JLabel(f2);
	FROG[2] = new JLabel(f3);
	FROG[3] = new JLabel(f4);
	FROG[4] = new JLabel(f5);

	for(int k=0;k<5;k++){
	FROG[k].setVisible(false);
	FROG[k].setBounds(300,180,200,200);
	F_Panel.add(FROG[k]);
	}

	water = new Water();
		water.setBounds(150,140,500,300);
		water.setOpaque(false);
		F_Panel.add(water);
		
		doEat = new JButton("먹기");
		doEat.setBounds(200,475,100,40);
        doEat.setBorderPainted(false);
        doEat.setContentAreaFilled(false);
        doEat.addActionListener(buttonAct);
        doEat.setFocusPainted(false);
		F_Panel.add(doEat);
		
		doClean = new JButton("수조청소");
		doClean.setBounds(300,475,100,40);
        doClean.setBorderPainted(false);
        doClean.setContentAreaFilled(false);
        doClean.addActionListener(buttonAct);
        doClean.setFocusPainted(false);
		F_Panel.add(doClean);
		
		doSing = new JButton("노래");
		doSing.setBounds(400,475,100,40);
        doSing.setBorderPainted(false);
        doSing.setContentAreaFilled(false);
        doSing.addActionListener(buttonAct);
        doSing.setFocusPainted(false);
		F_Panel.add(doSing);
		
		doSleep = new JButton("잠");
		doSleep.setBounds(500,475,100,40);
        doSleep.setBorderPainted(false);
        doSleep.setContentAreaFilled(false);
        doSleep.addActionListener(buttonAct);
        doSleep.setFocusPainted(false);
		F_Panel.add(doSleep);
		
		ImageIcon btnFace = new ImageIcon("btnFace.gif");
		
		do_1 = new JLabel(btnFace);	
		do_1.setBounds(200,450,100,100);
		F_Panel.add(do_1);
		do_2 = new JLabel(btnFace);	
		do_2.setBounds(300,450,100,100);
		F_Panel.add(do_2);
		do_3 = new JLabel(btnFace);	
		do_3.setBounds(400,450,100,100);
		F_Panel.add(do_3);
		do_4 = new JLabel(btnFace);	
		do_4.setBounds(500,450,100,100);
		F_Panel.add(do_4);
		
		/**********************************************************/
		
		/*Ending*/
		imgEnd = new JLabel[7];
		buttonEnd = new EndingListener();
		
        EndingPanel = new JPanel(){
	 		public void paintComponent(Graphics g){
	 			super.paintComponent(g);
	 			g.drawImage(baseImage.getImage(),0,0,this);
	 		}
	 	};
	 	EndingPanel.setBounds(0,0,800,600);
		EndingPanel.setLayout(null);
		EndingPanel.setVisible(false);
        add(EndingPanel);
		
		/*GUI*/
		imagePanel = new JPanel();
		imagePanel.setBounds(200,170,400,210);
		imagePanel.setOpaque(false);
		EndingPanel.add(imagePanel);
		
		txtPanel = new JPanel();
		txtPanel.setBounds(200,50,400,40);
		txtPanel.setBackground(new Color(0,0,0,100));
		EndingPanel.add(txtPanel);
		
		txtEnd = new JLabel("");
		txtEnd.setFont(new Font("굴림", Font.BOLD, 20));
		txtEnd.setForeground(Color.white);
		txtEnd.setVerticalAlignment(SwingConstants.TOP);
		txtEnd.setHorizontalAlignment(SwingConstants.CENTER);
		txtPanel.add(txtEnd);
		
		txtEnd_2 = new JLabel("");
		txtEnd_2.setFont(new Font("돋움", Font.PLAIN, 11));
		txtEnd_2.setForeground(Color.white);
		txtEnd_2.setVerticalAlignment(SwingConstants.CENTER);
		txtEnd_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtPanel.add(txtEnd_2);
	        
		btnRetry = new JButton("다시하개굴");
		btnRetry.setBounds(250,450,100,40);
		btnRetry.setBackground(Color.white);
		btnRetry.addActionListener(buttonEnd);
		EndingPanel.add(btnRetry);		
		
		btnMain = new JButton("시작화면");
		btnMain.setBounds(420,450,100,40);
		btnMain.setBackground(Color.white);
		EndingPanel.add(btnMain);
		
		
        /*엔딩 이미지 지정*/
		ImageIcon e1 = new ImageIcon("HappyEnding.gif");
		ImageIcon e2 = new ImageIcon("e0.gif");
		ImageIcon e3 = new ImageIcon("e1.gif");
		ImageIcon e4 = new ImageIcon("e2.gif");
		ImageIcon e5 = new ImageIcon("e3.gif");
		ImageIcon e6 = new ImageIcon("e4.gif");
		ImageIcon e7 = new ImageIcon("e5.gif");        
		
		imgEnd[0] = new JLabel(e1); // happy
		imgEnd[1] = new JLabel(e2);
		imgEnd[2] = new JLabel(e3);
		imgEnd[3] = new JLabel(e4);
		imgEnd[4] = new JLabel(e5);
		imgEnd[5] = new JLabel(e6);
		imgEnd[6] = new JLabel(e7);
		
		for(int i=0;i<7;i++){
			imgEnd[i].setBounds(300,180,200,200);
			imgEnd[i].setVisible(false);
			imagePanel.add(imgEnd[i]);
		}
	} // constructor()
	
      
      /* 성장 단계에 따른 개구리 이미지 변경 method */
public void FROG_CHECKER(int g){
switch(g){
case 1:
FROG[0].setVisible(true);
FROG[1].setVisible(false);
FROG[2].setVisible(false);
FROG[3].setVisible(false);
FROG[4].setVisible(false);
break;
case 2:
FROG[0].setVisible(false);
FROG[1].setVisible(true);
FROG[2].setVisible(false);
FROG[3].setVisible(false);
FROG[4].setVisible(false);
break;
case 3:
FROG[0].setVisible(false);
FROG[1].setVisible(false);
FROG[2].setVisible(true);
FROG[3].setVisible(false);
FROG[4].setVisible(false);
break;
case 4:
FROG[0].setVisible(false);
FROG[1].setVisible(false);
FROG[2].setVisible(false);
FROG[3].setVisible(true);
FROG[4].setVisible(false);
break;
case 5:
FROG[0].setVisible(false);
FROG[1].setVisible(false);
FROG[2].setVisible(false);
FROG[3].setVisible(false);
FROG[4].setVisible(true);
break;
default: break;
}
} // FROG_CHECKER();

      
	/*게임 변수 및 화면 초기화 method*/
	public void INI(){
		growth = 0;
		growthLv = 1;
		lifeLv = 3;
		cleanLv = 2;
		randNum = 0;
		for(int i=0;i<7;i++){ // ending 이미지 OFF
			imgEnd[i].setVisible(false);
		}
		for(int j=0;j<3;j++){ // 하트 이미지 ON
			imgLife[j].setVisible(true);
		}
		for(int k=1;k<5;k++){ // 수조 속 개구리 이미지 초기화
			FROG[k].setVisible(false);	 
		}
		FROG[0].setVisible(true);
		F_Panel.setVisible(true); // play 화면 ON
		EndingPanel.setVisible(false); // ending 화면 OFF
		if(WATER_CHECKER == false) water.start(); // water THREAD Init
		WATER_CHECKER = false;
		water.w_1.setVisible(false);
		water.w_2.setVisible(true);
		start(); // Life checker THREAD Init
		
		System.out.println("initiate"); // test
	} // INI()
	
	
	/*ending screen ON & 엔딩 종류에 따라 보여줄 텍스트*/
	public void showEnding(int e, int lv){
		EndingPanel.setVisible(true);
		F_Panel.setVisible(false);
		imgEnd[lv].setVisible(true);
		switch(e){
            case 1: // OverEating
                txtEnd.setText("과식으로 사망");
                txtEnd_2.setText("오늘따라 밥을 주는대로 먹더라니...");
                break;
            case 2: // GetStressed
                txtEnd.setText("스트레스로 사망");
                txtEnd_2.setText("노래가 너무 시끄러웠어요");
                break;            
            case 3: // WinterNap
                txtEnd.setText("자다가 사망");
                txtEnd_2.setText("겨울잠을 자다가 그만..");
                break;                    
            case 4:// -
            	txtEnd.setText("관리 부실로 사망");
            	txtEnd_2.setText("관심 좀 가져주세요");
            	break;
            case 5: // HappyEnd
                txtEnd.setText("HAPPY END");
                txtEnd_2.setText("개구리가 완전하게 성장했어요 !");
                break;                    
		}
		water.stop();
		stop();
	} // showEnding()
	
		
	/*활동 ActionListener 내 활동 알고리즘 구현*/
	private class ButtonListener implements ActionListener{
	   public void actionPerformed(ActionEvent event){
		Object obj = event.getSource();
			   	
        /*Eat*/        
		if(obj == doEat){
			growth += 10;
			System.out.println("EAT"); // test
			if((growth/50+1) != growthLv){
				growthLv = growth/50+1;
				FROG_CHECKER(growthLv);
			}
			/*	RandomEvent
				20%확률로 Random Event 발생
				사망확률은 성장단계와 반비례한다*/
			randNum = (int) (Math.random()*(10*growthLv)); // 0 to 9
			if (randNum < 2) {
				F_Panel.setVisible(false);
				showEnding(1,growthLv);
			}
		}
		
		/*Clean*/
		if(obj == doClean){
			growth += 5;
			System.out.println("CLEAN"); //test
			if((growth/50+1) != growthLv){
				growthLv = growth/50+1;
				FROG_CHECKER(growthLv);
			}
			/*청결단계를 초기화하고 화면 상 수조를 깨끗하게 한다*/
			water.w_2.setVisible(true);
			cleanLv = 2;
			// popup
		}
		
		/*Sing*/		
		if(obj == doSing){
			growth += 10;
			System.out.println("LISTEN"); //test
			if((growth/50+1) != growthLv){
				growthLv = growth/50+1;
				FROG_CHECKER(growthLv);
			}
			randNum = (int) (Math.random()*(10*growthLv));
			if (randNum < 2) {
				F_Panel.setVisible(false);
				showEnding(2,growthLv);
			}
		}
		
		/*Sleep*/
		if(obj == doSleep){
			growth += 10;
			System.out.println("SLEEP"); //test
			if((growth/50+1) != growthLv){
				growthLv = growth/50+1;
				FROG_CHECKER(growthLv);
			}
			randNum = (int) (Math.random()*(10*growthLv));
			if (randNum < 2) {
				F_Panel.setVisible(false);
				showEnding(3,growthLv);
			}
		}
		
		System.out.println("성장수치:"+growth); //test
		System.out.println("레벨:"+growthLv);
		
		/*	Happy End - 
			성장수치가 300이상이 되면 엔딩5를 보여준다*/
		if (growth >= 300){
			F_Panel.setVisible(false);
			showEnding(5,0);
		}
		
	   }
	}// ButtonListener class
	
	
	/*RETRY - 재시작 클릭 시 초기화를 진행하는 버튼의 ActionListner*/
	private class EndingListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			Object obj = event.getSource();
			if(obj == btnRetry){
                INI();
			}
		}
	}
	
	
	/*life check manager THREAD*/
	public void start(){
		if(chk == null){chk = new Thread(this); System.out.println(" new heart"); }
		chk.start();
	}

	public void stop(){
		if(chk != null){chk.stop();	System.out.println(" reset heart"); }
		chk = null;
	}

	public void run(){
		try{
			while(true){
				switch(lifeLv){
					/*	lifeLv에 따라 화면상 보여지는 하트 개수를 조정하고
						lifeLv이 0이 되면 엔딩 화면을 보여준다*/
					case 2:
						imgLife[2].setVisible(false);
						break;
					case 1:
						imgLife[1].setVisible(false);
						break;
					case 0:
						imgLife[0].setVisible(false);
						System.out.println("heart zero");
						showEnding(4,growthLv);
						break;
				}
			}			
		} catch(Exception e){ System.out.println("error: "+e);	}
	}
        
} // FrogPanel class

