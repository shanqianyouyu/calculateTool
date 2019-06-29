package qmx.awt.main.calFrame.derrickCal.square;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class listenerge {

	private int i = 0;

	public void listenergek(JCheckBox checkBox01, JCheckBox checkBox02, JCheckBox checkBox03, JCheckBox checkBox04,
			JCheckBox checkBox05) {
		checkBox01.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox02.setEnabled(false);
					checkBox03.setEnabled(false);
					checkBox04.setEnabled(false);
					checkBox05.setEnabled(false);
					i = 1;
				} else {
					checkBox02.setEnabled(true);
					checkBox03.setEnabled(true);
					checkBox04.setEnabled(true);
					checkBox05.setEnabled(true);
					i = 0;
				}
			}

		});
		checkBox02.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox01.setEnabled(false);
					checkBox03.setEnabled(false);
					checkBox04.setEnabled(false);
					checkBox05.setEnabled(false);
					i = 1;
				} else {
					checkBox01.setEnabled(true);
					checkBox03.setEnabled(true);
					checkBox04.setEnabled(true);
					checkBox05.setEnabled(true);
					i = 0;
				}
			}

		});
		checkBox03.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox01.setEnabled(false);
					checkBox02.setEnabled(false);
					checkBox04.setEnabled(false);
					checkBox05.setEnabled(false);
					i = 1;
				} else {
					checkBox01.setEnabled(true);
					checkBox02.setEnabled(true);
					checkBox04.setEnabled(true);
					checkBox05.setEnabled(true);
					i = 0;
				}
			}

		});
		checkBox04.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox02.setEnabled(false);
					checkBox03.setEnabled(false);
					checkBox01.setEnabled(false);
					checkBox05.setEnabled(false);
					i = 1;
				} else {
					checkBox02.setEnabled(true);
					checkBox03.setEnabled(true);
					checkBox01.setEnabled(true);
					checkBox05.setEnabled(true);
					i = 0;
				}
			}

		});
		checkBox05.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox02.setEnabled(false);
					checkBox03.setEnabled(false);
					checkBox04.setEnabled(false);
					checkBox01.setEnabled(false);
					i = 1;
				} else {
					checkBox02.setEnabled(true);
					checkBox03.setEnabled(true);
					checkBox04.setEnabled(true);
					checkBox01.setEnabled(true);
					i = 0;
				}
			}

		});
	}

	public void listenerge1(JRadioButton checkBox06, JRadioButton checkBox07, JRadioButton checkBox08,
			JRadioButton checkBox09, JRadioButton checkBox10, JRadioButton checkBox11) {
		checkBox06.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox07.setEnabled(false);
					checkBox08.setEnabled(false);
					checkBox09.setEnabled(false);
					checkBox10.setEnabled(false);
					checkBox11.setEnabled(false);
					i = 1;
				} else {
					checkBox07.setEnabled(true);
					checkBox08.setEnabled(true);
					checkBox09.setEnabled(true);
					checkBox10.setEnabled(true);
					checkBox11.setEnabled(true);
					i = 0;
				}
			}

		});
		checkBox07.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox06.setEnabled(false);
					checkBox08.setEnabled(false);
					checkBox09.setEnabled(false);
					checkBox10.setEnabled(false);
					checkBox11.setEnabled(false);
					i = 1;
				} else {
					checkBox06.setEnabled(true);
					checkBox08.setEnabled(true);
					checkBox09.setEnabled(true);
					checkBox10.setEnabled(true);
					checkBox11.setEnabled(true);
					i = 0;
				}
			}

		});
		checkBox08.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox06.setEnabled(false);
					checkBox07.setEnabled(false);
					checkBox09.setEnabled(false);
					checkBox10.setEnabled(false);
					checkBox11.setEnabled(false);
					i = 1;
				} else {
					checkBox06.setEnabled(true);
					checkBox07.setEnabled(true);
					checkBox09.setEnabled(true);
					checkBox10.setEnabled(true);
					checkBox11.setEnabled(true);
					i = 0;
				}
			}

		});
		checkBox09.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox06.setEnabled(false);
					checkBox08.setEnabled(false);
					checkBox07.setEnabled(false);
					checkBox10.setEnabled(false);
					checkBox11.setEnabled(false);
					i = 1;
				} else {
					checkBox06.setEnabled(true);
					checkBox08.setEnabled(true);
					checkBox07.setEnabled(true);
					checkBox10.setEnabled(true);
					checkBox11.setEnabled(true);
					i = 0;
				}
			}

		});
		checkBox10.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox06.setEnabled(false);
					checkBox08.setEnabled(false);
					checkBox09.setEnabled(false);
					checkBox07.setEnabled(false);
					checkBox11.setEnabled(false);
					i = 1;
				} else {
					checkBox06.setEnabled(true);
					checkBox08.setEnabled(true);
					checkBox09.setEnabled(true);
					checkBox07.setEnabled(true);
					checkBox11.setEnabled(true);
					i = 0;
				}
			}

		});
		checkBox11.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox06.setEnabled(false);
					checkBox08.setEnabled(false);
					checkBox09.setEnabled(false);
					checkBox10.setEnabled(false);
					checkBox07.setEnabled(false);
					i = 1;
				} else {
					checkBox06.setEnabled(true);
					checkBox08.setEnabled(true);
					checkBox09.setEnabled(true);
					checkBox10.setEnabled(true);
					checkBox07.setEnabled(true);
					i = 0;
				}
			}

		});

	}

}
