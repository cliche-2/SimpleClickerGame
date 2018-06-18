import java.awt.*;
import javax.swing.*;

public class Water extends JPanel implements Runnable{
	
	private Thread aThread;
	public JLabel w_1,w_2;
	public ImageIcon clearWater = new ImageIcon("water_2.gif");
	public ImageIcon dirtyWater = new ImageIcon("water_1.gif");
		
	public Water(){
		super();
		
		w_2 = new JLabel("", clearWater, SwingConstants.CENTER);
		add(w_2);
		
		w_1 = new JLabel("", dirtyWater, SwingConstants.CENTER);
		add(w_1);
		w_1.setVisible(false);
				
		aThread = null;
	} // constructor
	
	public void start(){
		if(aThread == null) {aThread = new Thread(this); System.out.println(" new water");}
		aThread.start(); // call run()
	} // start()
	
	public void stop(){
		if(aThread != null) {aThread.stop(); System.out.println("change water");}
		aThread = null;
	} // stop()
	
	public void run(){
		try{
			while(FrogPanel.lifeLv != 0){
				/*	생명 수치가 존재할 경우
					7초 간격으로 청결수치를 감소시키고 이를 가시화한다 */
				aThread.sleep(7000);
				switch(FrogPanel.cleanLv){
					case 2:
						FrogPanel.cleanLv --;
						w_1.setVisible(true);
						w_2.setVisible(false);
						break;
					case 1:
						FrogPanel.lifeLv --;
						System.out.println("lifeLv --:"+FrogPanel.lifeLv);
						break;
					default: break;
				}
			}
			FrogPanel.WATER_CHECKER = true; // to control Water
			/* */
		} catch(Exception e){
			System.out.println("error = "+e);
		}
	} // run()

} // Water class