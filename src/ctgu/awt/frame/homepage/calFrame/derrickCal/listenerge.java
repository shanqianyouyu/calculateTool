package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class listenerge {

	private int i = 0;
	public void listenergek(JCheckBox checkBox01, JCheckBox checkBox02, JCheckBox checkBox03, JCheckBox checkBox04,
			JCheckBox checkBox05) {
		checkBox01.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox02.setSelected(false);
					checkBox03.setSelected(false);
					checkBox04.setSelected(false);
					checkBox05.setSelected(false);
					i = 1;
					}
					else{
						checkBox02.setSelected(false);
						checkBox03.setSelected(false);
						checkBox04.setSelected(false);
						checkBox05.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		checkBox02.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox01.setSelected(false);
					checkBox03.setSelected(false);
					checkBox04.setSelected(false);
					checkBox05.setSelected(false);
					i = 1;
					}
					else{
						checkBox01.setSelected(false);
						checkBox03.setSelected(false);
						checkBox04.setSelected(false);
						checkBox05.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		checkBox03.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox01.setSelected(false);
					checkBox02.setSelected(false);
					checkBox04.setSelected(false);
					checkBox05.setSelected(false);
					i = 1;
					}
					else{
						checkBox01.setSelected(false);
						checkBox02.setSelected(false);
						checkBox04.setSelected(false);
						checkBox05.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		checkBox04.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox02.setSelected(false);
					checkBox03.setSelected(false);
					checkBox01.setSelected(false);
					checkBox05.setSelected(false);
					i = 1;
					}
					else{
						checkBox02.setSelected(false);
						checkBox03.setSelected(false);
						checkBox01.setSelected(false);
						checkBox05.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		checkBox05.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox02.setSelected(false);
					checkBox03.setSelected(false);
					checkBox04.setSelected(false);
					checkBox01.setSelected(false);
					i = 1;
					}
					else{
						checkBox02.setSelected(false);
						checkBox03.setSelected(false);
						checkBox04.setSelected(false);
						checkBox01.setSelected(false);
						i = 0;
					}
				}
			                   
		});
	}
	public void listenerge1(JRadioButton checkBox06, JRadioButton checkBox07, JRadioButton checkBox08,
			JRadioButton checkBox09, JRadioButton checkBox10, JRadioButton checkBox11) {
		checkBox06.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
				checkBox07.setSelected(false);
				checkBox08.setSelected(false);
				checkBox09.setSelected(false);
				checkBox10.setSelected(false);
				checkBox11.setSelected(false);
				i = 1;
				}
				else{
					checkBox07.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 0;
				}
			}
			                   
		}); 
		checkBox07.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
					}
					else{
						checkBox06.setSelected(false);
						checkBox08.setSelected(false);
						checkBox09.setSelected(false);
						checkBox10.setSelected(false);
						checkBox11.setSelected(false);
						i = 0;
					}
				}
			                   
		}); 
		checkBox08.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox06.setSelected(false);
					checkBox07.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
					}
					else{
						checkBox06.setSelected(false);
						checkBox07.setSelected(false);
						checkBox09.setSelected(false);
						checkBox10.setSelected(false);
						checkBox11.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		checkBox09.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox07.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
					}
					else{
						checkBox06.setSelected(false);
						checkBox08.setSelected(false);
						checkBox07.setSelected(false);
						checkBox10.setSelected(false);
						checkBox11.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		checkBox10.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox07.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
					}
					else{
						checkBox06.setSelected(false);
						checkBox08.setSelected(false);
						checkBox09.setSelected(false);
						checkBox07.setSelected(false);
						checkBox11.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		checkBox11.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox07.setSelected(false);
					i = 1;
					}
					else{
						checkBox06.setSelected(false);
						checkBox08.setSelected(false);
						checkBox09.setSelected(false);
						checkBox10.setSelected(false);
						checkBox07.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		
	}
	public void listenergek1(JCheckBox checkBox11, JCheckBox checkBox12, JCheckBox checkBox13, JCheckBox checkBox14) {
		checkBox11.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox12.setSelected(false);
					checkBox13.setSelected(false);
					checkBox14.setSelected(false);
				i = 1;
				}
				else{
					checkBox12.setSelected(false);
					checkBox13.setSelected(false);
					checkBox14.setSelected(false);
					i = 0;
				}
			}
			                   
		}); 
		checkBox12.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox14.setSelected(false);
					checkBox13.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
					}
					else{
						checkBox14.setSelected(false);
						checkBox13.setSelected(false);
						checkBox11.setSelected(false);
						i = 0;
					}
				}
			                   
		}); 
		checkBox13.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox14.setSelected(false);
					checkBox12.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
					}
					else{
						checkBox14.setSelected(false);
						checkBox12.setSelected(false);
						checkBox11.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		checkBox14.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(i == 0){
					checkBox12.setSelected(false);
					checkBox13.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
					}
					else{
						checkBox12.setSelected(false);
						checkBox13.setSelected(false);
						checkBox11.setSelected(false);
						i = 0;
					}
				}
			                   
		});
		
	}
	

}
