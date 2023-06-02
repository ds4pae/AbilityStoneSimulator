package StoneSimulator;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class introPanel extends JPanel{
	static JLabel percentageLabel = new JLabel();
	public introPanel() {
		percentageLabel.setText("확률 : " + btnPanel.successString + "%");
		add(percentageLabel);
	}
}
