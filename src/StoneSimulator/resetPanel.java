package StoneSimulator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class resetPanel extends JPanel implements ActionListener{
	public stoneSimulator gui;
	JButton resetButton = new JButton("¸®¼Â");
	
	public resetPanel(stoneSimulator gui) {
			this.gui = gui;
		add(resetButton);
		 
		 resetButton.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == resetButton) {
			for(int i = 0 ; i < 3 ; i++) {
				btnPanel.btnCount[i] = 0;
				btnPanel.engraveLevelString[i] = "";
				btnPanel.successCount[i] = 0;
			}
			btnPanel.successPercent = 75.0;
			gui.engraveLevel1.setText("");
			gui.engraveLevel2.setText("");
			gui.engraveLevel3.setText("");
			String perText = "È®·ü : 75.0%";
			introPanel.percentageLabel.setText(perText);
			gui.currentLv1.setText("+0");
			gui.currentLv2.setText("+0");
			gui.currentLv3.setText("+0");
			
		}
	}
}
