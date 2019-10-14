package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class RyncItem {

	
	// t1失去聚焦的时候，将1的内容同步到2
	public void syncItem(JTextField t1, JTextField t2,JTextField t3) {
		t1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println(Double.parseDouble(t1.getText().trim()));
				if (!t1.getText().equals(t2.getText())) {
					t2.setText(String.format("%.2f",0.0613*Double.parseDouble(t1.getText().trim())*Double.parseDouble(t3.getText().trim())));
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
	}

	
}
