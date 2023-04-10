package StoneSimulator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class btnPanel extends JPanel implements ActionListener{
	public stoneSimulator gui;
	private JButton button1 = new JButton("기습");
	private JButton button2 = new JButton("아드");
    private JButton button3 = new JButton("감소");
    static int btnCount[] = {0,0,0};
    static double successPercent = 75.0;
    static String engraveLevelString[] = {"","",""};
    static int successCount[] = {0,0,0};
    public static String successString = Double.toString(successPercent);
	public btnPanel(stoneSimulator gui) {
		this.gui = gui;
		setLayout(new GridLayout(3,1));
        
        button1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        button2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        button3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        button1.setPreferredSize(new Dimension(100, 100));
        button2.setPreferredSize(new Dimension(100, 100));
        button3.setPreferredSize(new Dimension(100, 100));
        add(button1);
        add(button2);
        add(button3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == button1) {
	    	if(btnCount[0] != 10) {
	    		// 75% 확률로 성공
	            double percent = new Random().nextDouble(100); 
	            if ( percent < successPercent) {
	                engraveLevelString[0] += "◆";
	                successCount[0]++;
	                gui.currentLv1.setText("+" + successCount[0]);	                
	                if(successPercent > 25.0) {
	                    successPercent -= 10.0;
	                }
	            } else {
	                engraveLevelString[0] += "◇";
	                if(successPercent < 75.0) {
	                    successPercent += 10.0;
	                }
	            }
	            String returnString1 = engraveLevelString[0];
	            while(returnString1.length() != 10) {
	            	returnString1 = returnString1 + "□";		//마름모 수정 필요 (오류 발생)
	            }
	            gui.engraveLevel1.setText(returnString1);
	           btnCount[0]++;
	    	}
	    	else {
	    		System.out.println("기습 10회 소진");
	    	}
	    }
	        	
	    if (e.getSource() == button2) {
	    	if(btnCount[1] != 10) {
	    		// 75% 확률로 성공
	            double percent = new Random().nextDouble(100);
	            if ( percent < successPercent) {
	                engraveLevelString[1] += "◆";
	                successCount[1]++;
	                gui.currentLv2.setText("+" + successCount[1]);
	                if(successPercent > 25.0) {
	                    successPercent -= 10.0;
	                }
	            } else {
	                engraveLevelString[1] += "◇";
	                if(successPercent < 75.0) {
	                    successPercent += 10.0;
	                }
	            }
	            String returnString2 = engraveLevelString[1];
	            while(returnString2.length() != 10) {
	            	returnString2 = returnString2 + "□";		//마름모 수정 필요 (오류 발생)
	            }
	            gui.engraveLevel2.setText(returnString2);
	           btnCount[1]++;
	    	}
	    	else {
	    		System.out.println("아드 10회 소진");
	    	}
	    }
	    
	    if (e.getSource() == button3) {
	    	if(btnCount[2] != 10) {
	    		
	    		// 75% 확률로 성공
	            double percent = new Random().nextDouble(100); 
	            if (percent < successPercent) {
	                engraveLevelString[2] += "◆";
	                successCount[2]++;
	                if(successPercent > 25.0) {
	                    successPercent -= 10.0;
	                }
	            } else {
	                engraveLevelString[2] += "◇";
	                if(successPercent < 75.0) {
	                    successPercent += 10.0;
	                }
	            }
	            String returnString3 = engraveLevelString[2];
	            while(returnString3.length() != 10) {
	            	returnString3 = returnString3 + "□";		//마름모 수정 필요 (오류 발생)
	            }
	            gui.engraveLevel3.setText(returnString3);
	           btnCount[2]++;
	    	}
	    	else {
	    		System.out.println("감소 10회 소진");
	    	}
	    }
	
	    
	    gui.currentLv3.setText("+" + successCount[2]);
	    String successString = Double.toString(successPercent);
	    introPanel.percentageLabel.setText("확률 : " + successString + "%");
	    }
	}

