package ctgu.awt.frame.homepage.calFrame.weld;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class Review {

	public int ReviewCaculate(double a,double b,double a1,double b1){
		if(Math.sqrt(a*a/a1*a1 + b*b) <= b1){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	// t1失去聚焦的时候，将1的内容同步到2
	public void syncItem(JTextField t1, JTextField t2) {
		t1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if (!t1.getText().equals(t2.getText())) {
					t2.setText(String.format("%.2f",1.2*Double.parseDouble(t1.getText().trim())));
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
	}

	public void syncItem1(JTextField t1, JTextField t2) {
		t1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if (!t1.getText().equals(t2.getText())) {
					t2.setText(String.format("%.2f",1.5*Math.sqrt(Double.parseDouble(t1.getText().trim()))));
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
	}
}
