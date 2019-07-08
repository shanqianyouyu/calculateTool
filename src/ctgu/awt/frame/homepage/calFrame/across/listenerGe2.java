package ctgu.awt.frame.homepage.calFrame.across;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class listenerGe2 {
	private int i = 0;
	public void listenerge2(JRadioButton checkBox01, JRadioButton checkBox02) {
		checkBox01.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox02.setSelected(false);
					i = 1;
					}
					else{
						checkBox02.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		checkBox02.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox01.setSelected(false);
					i = 1;
					}
					else{
						checkBox01.setSelected(false);
						i = 0;
					}
				}
			                   
		});
	}
	public void listenergek2(JCheckBox checkboxk1, JCheckBox checkboxk2) {
		checkboxk1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkboxk2.setSelected(false);
					i = 1;
					}
					else{
						checkboxk2.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		checkboxk2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkboxk1.setSelected(false);
					i = 1;
					}
					else{
						checkboxk1.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		
	}
}
