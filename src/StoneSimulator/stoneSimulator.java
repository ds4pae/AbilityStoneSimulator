package StoneSimulator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class stoneSimulator extends JFrame{
	 private JFrame frame;
	 private LineBorder bb = new LineBorder(Color.black, 4, true);
	 public introPanel introPanel = new introPanel();
	 public btnPanel btnPanel = new btnPanel(this);
	 public resetPanel resetPanel = new resetPanel(this);
	 
	    String[] engraveName = {"기습의 대가", "아드레날린", "공격력 감소"};
	    String[] engraveLevel = {"", "", ""};
	   JLabel engraveName1 = new JLabel(engraveName[0]);
	   JLabel engraveName2 = new JLabel(engraveName[1]);
	   JLabel engraveName3 = new JLabel(engraveName[2]);
	   JLabel engraveLevel1 = new JLabel();
	   JLabel engraveLevel2 = new JLabel();
	   JLabel engraveLevel3 = new JLabel();
	   JLabel currentLv1 = new JLabel("+0");
	   JLabel currentLv2 = new JLabel("+0");
	   JLabel currentLv3 = new JLabel("+0");
	   public String[] currentLV = {"🔷🔷🔷🔷🔷🔷🔷🔷🔷🔷", "🔷🔷🔷🔷🔷🔷🔷🔷🔷🔷", "🔷🔷🔷🔷🔷🔷🔷🔷🔷🔷"};
	   
	   
	   
	public void createAndShowGUI() {
		frame = new JFrame("돌깎기 시뮬레이터 ver. 1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLayout(new BorderLayout());
        
        JPanel inputPanel = new JPanel(new GridLayout(3, 3));
        engraveLevel1.setForeground(Color.blue);
        engraveLevel2.setForeground(Color.blue);
        engraveLevel3.setForeground(Color.RED);
        currentLv1.setForeground(Color.blue);
        currentLv2.setForeground(Color.blue);
        currentLv3.setForeground(Color.RED);
        
        inputPanel.add(engraveName1);
        inputPanel.add(engraveLevel1);
        inputPanel.add(currentLv1);
        inputPanel.add(engraveName2);
        inputPanel.add(engraveLevel2);
        inputPanel.add(currentLv2);
        inputPanel.add(engraveName3);
        inputPanel.add(engraveLevel3);
        inputPanel.add(currentLv3);
        
        engraveName1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        engraveName2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        engraveName3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        engraveLevel1.setFont(new Font("", Font.BOLD, 15));
        engraveLevel2.setFont(new Font("", Font.BOLD, 15));
        engraveLevel3.setFont(new Font("", Font.BOLD, 15));
        inputPanel.setBorder(bb);    //원하는 라벨에 사용
        inputPanel.setBounds(161, 109, 164, 42);
        frame.add(introPanel,BorderLayout.NORTH);
        frame.add(inputPanel, BorderLayout.CENTER);
		frame.add(resetPanel, BorderLayout.SOUTH);
        frame.add(btnPanel, BorderLayout.EAST);
        // 프레임 보이기
        frame.setVisible(true);
        
	}
}
