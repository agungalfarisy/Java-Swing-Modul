package frames;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JLabel;

import panels.KalkulatorPanel;

public class KalkulatorFrame extends JFrame{

	public KalkulatorFrame() {
		KalkulatorPanel kp = new KalkulatorPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Kalkulator");
		setLocationRelativeTo(null);
		setSize(220, 250);
		
		add(kp);
	}

}
