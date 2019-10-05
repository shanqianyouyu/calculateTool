package ctgu.awt.frame.homepage.calFrame.across;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import org.omg.CORBA.INTERNAL;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Body1_1Impl;

public class listenerGe2 {
	
	//状态码
	private int B1;
	
	private int B2;
	
	
	private int i = 0;
	public int listenerge2(JRadioButton checkBox01, JRadioButton checkBox02) {
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
				B1 = 1;
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
				B1 = 2;
			}
			                   
		});
		return B1;
	}
	
	
	public int listenergek2(JCheckBox checkboxk1, JCheckBox checkboxk2) {
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
				B2 = 1;
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
				B2 = 2;
				}
			                   
		});
		return B2;
	}
}
