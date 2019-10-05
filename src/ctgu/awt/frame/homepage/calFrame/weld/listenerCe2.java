package ctgu.awt.frame.homepage.calFrame.weld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import org.omg.CORBA.INTERNAL;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Body1_1Impl;

public class listenerCe2 {
	
	//状态码
	private int B1;
	
	private int B2;
	
	
	private int i = 0;
		
	public int listenerge2(JRadioButton radioButton, JRadioButton radioButton_1, JRadioButton radioButton_2,
			JRadioButton radioButton_3, JRadioButton radioButton_4, JRadioButton radioButton_5,
			JRadioButton radioButton_6, JRadioButton radioButton_7, JRadioButton radioButton_8) {
		radioButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					radioButton_1.setSelected(false);
					radioButton_2.setSelected(false);
					radioButton_3.setSelected(false);
					radioButton_4.setSelected(false);
					radioButton_5.setSelected(false);
					radioButton_6.setSelected(false);
					radioButton_7.setSelected(false);
					radioButton_8.setSelected(false);
					i = 1;
					}
					else{
						radioButton_1.setSelected(false);
						radioButton_2.setSelected(false);
						radioButton_3.setSelected(false);
						radioButton_4.setSelected(false);
						radioButton_5.setSelected(false);
						radioButton_6.setSelected(false);
						radioButton_7.setSelected(false);
						radioButton_8.setSelected(false);
						i = 0;
					}
				B1 = 1;
				}
			                 
		});
		radioButton_1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					radioButton.setSelected(false);
					radioButton_2.setSelected(false);
					radioButton_3.setSelected(false);
					radioButton_4.setSelected(false);
					radioButton_5.setSelected(false);
					radioButton_6.setSelected(false);
					radioButton_7.setSelected(false);
					radioButton_8.setSelected(false);
					i = 1;
					}
					else{
						radioButton.setSelected(false);
						radioButton_2.setSelected(false);
						radioButton_3.setSelected(false);
						radioButton_4.setSelected(false);
						radioButton_5.setSelected(false);
						radioButton_6.setSelected(false);
						radioButton_7.setSelected(false);
						radioButton_8.setSelected(false);
						i = 0;
					}
				B1 = 2;
			}
			                   
		});
		radioButton_2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					radioButton_1.setSelected(false);
					radioButton.setSelected(false);
					radioButton_3.setSelected(false);
					radioButton_4.setSelected(false);
					radioButton_5.setSelected(false);
					radioButton_6.setSelected(false);
					radioButton_7.setSelected(false);
					radioButton_8.setSelected(false);
					i = 1;
					}
					else{
						radioButton_1.setSelected(false);
						radioButton.setSelected(false);
						radioButton_3.setSelected(false);
						radioButton_4.setSelected(false);
						radioButton_5.setSelected(false);
						radioButton_6.setSelected(false);
						radioButton_7.setSelected(false);
						radioButton_8.setSelected(false);
						i = 0;
					}
				B1 = 3;
			}
			                   
		});
		radioButton_3.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					radioButton_1.setSelected(false);
					radioButton_2.setSelected(false);
					radioButton.setSelected(false);
					radioButton_4.setSelected(false);
					radioButton_5.setSelected(false);
					radioButton_6.setSelected(false);
					radioButton_7.setSelected(false);
					radioButton_8.setSelected(false);
					i = 1;
					}
					else{
						radioButton_1.setSelected(false);
						radioButton_2.setSelected(false);
						radioButton.setSelected(false);
						radioButton_4.setSelected(false);
						radioButton_5.setSelected(false);
						radioButton_6.setSelected(false);
						radioButton_7.setSelected(false);
						radioButton_8.setSelected(false);
						i = 0;
					}
				B1 = 4;
			}
			                   
		});
		radioButton_4.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					radioButton_1.setSelected(false);
					radioButton_2.setSelected(false);
					radioButton_3.setSelected(false);
					radioButton.setSelected(false);
					radioButton_5.setSelected(false);
					radioButton_6.setSelected(false);
					radioButton_7.setSelected(false);
					radioButton_8.setSelected(false);
					i = 1;
					}
					else{
						radioButton_1.setSelected(false);
						radioButton_2.setSelected(false);
						radioButton_3.setSelected(false);
						radioButton.setSelected(false);
						radioButton_5.setSelected(false);
						radioButton_6.setSelected(false);
						radioButton_7.setSelected(false);
						radioButton_8.setSelected(false);
						i = 0;
					}
				B1 = 5;
			}
			                   
		});
		radioButton_5.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					radioButton_1.setSelected(false);
					radioButton_2.setSelected(false);
					radioButton_3.setSelected(false);
					radioButton_4.setSelected(false);
					radioButton.setSelected(false);
					radioButton_6.setSelected(false);
					radioButton_7.setSelected(false);
					radioButton_8.setSelected(false);
					i = 1;
					}
					else{
						radioButton_1.setSelected(false);
						radioButton_2.setSelected(false);
						radioButton_3.setSelected(false);
						radioButton_4.setSelected(false);
						radioButton.setSelected(false);
						radioButton_6.setSelected(false);
						radioButton_7.setSelected(false);
						radioButton_8.setSelected(false);
						i = 0;
					}
				B1 = 6;
			}
			                   
		});
		radioButton_6.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					radioButton_1.setSelected(false);
					radioButton_2.setSelected(false);
					radioButton_3.setSelected(false);
					radioButton_4.setSelected(false);
					radioButton_5.setSelected(false);
					radioButton.setSelected(false);
					radioButton_7.setSelected(false);
					radioButton_8.setSelected(false);
					i = 1;
					}
					else{
						radioButton_1.setSelected(false);
						radioButton_2.setSelected(false);
						radioButton_3.setSelected(false);
						radioButton_4.setSelected(false);
						radioButton_5.setSelected(false);
						radioButton.setSelected(false);
						radioButton_7.setSelected(false);
						radioButton_8.setSelected(false);
						i = 0;
					}
				B1 = 7;
			}
			                   
		});
		radioButton_7.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					radioButton_1.setSelected(false);
					radioButton_2.setSelected(false);
					radioButton_3.setSelected(false);
					radioButton_4.setSelected(false);
					radioButton_5.setSelected(false);
					radioButton_6.setSelected(false);
					radioButton.setSelected(false);
					radioButton_8.setSelected(false);
					i = 1;
					}
					else{
						radioButton_1.setSelected(false);
						radioButton_2.setSelected(false);
						radioButton_3.setSelected(false);
						radioButton_4.setSelected(false);
						radioButton_5.setSelected(false);
						radioButton_6.setSelected(false);
						radioButton.setSelected(false);
						radioButton_8.setSelected(false);
						i = 0;
					}
				B1 = 8;
			}
			                   
		});
		radioButton_8.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					radioButton_1.setSelected(false);
					radioButton_2.setSelected(false);
					radioButton_3.setSelected(false);
					radioButton_4.setSelected(false);
					radioButton_5.setSelected(false);
					radioButton_6.setSelected(false);
					radioButton_7.setSelected(false);
					radioButton.setSelected(false);
					i = 1;
					}
					else{
						radioButton_1.setSelected(false);
						radioButton_2.setSelected(false);
						radioButton_3.setSelected(false);
						radioButton_4.setSelected(false);
						radioButton_5.setSelected(false);
						radioButton_6.setSelected(false);
						radioButton_7.setSelected(false);
						radioButton.setSelected(false);
						i = 0;
					}
				B1 = 9;
			}
			                   
		});
		return B1;
	}
	
	
	public int listenergeK2(JCheckBox checkBox,JCheckBox checkBox_1,JCheckBox checkBox_2
			) {
		checkBox.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox_1.setSelected(false);
					checkBox_2.setSelected(false);
					i = 1;
					}
					else{
						checkBox_1.setSelected(false);
						checkBox_2.setSelected(false);
						i = 0;
					}
				B2 = 1;
				}
			                 
		});
		checkBox_1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox.setSelected(false);
					checkBox_2.setSelected(false);
					i = 1;
					}
					else{
						checkBox.setSelected(false);
						checkBox_2.setSelected(false);
						i = 0;
					}
				B2 = 2;
			}
			                   
		});
		checkBox_2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox_1.setSelected(false);
					checkBox.setSelected(false);
					i = 1;
					}
					else{
						checkBox_1.setSelected(false);
						checkBox.setSelected(false);
						i = 0;
					}
				B2 = 3;
			}
			                   
		});
		return B2;
	}
}
