package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import org.omg.CORBA.INTERNAL;

import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

public class listenerge {

	// 状态码
	private int A1;

	private int B1;

	private int C1;

	private int D1;

	private int i = 0;

	public int listenergek(JCheckBox checkBox01, JCheckBox checkBox02, JCheckBox checkBox03, JCheckBox checkBox04,
			JCheckBox checkBox05) {
		checkBox01.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox02.setSelected(false);
					checkBox03.setSelected(false);
					checkBox04.setSelected(false);
					checkBox05.setSelected(false);
					i = 1;
				} else {
					checkBox02.setSelected(false);
					checkBox03.setSelected(false);
					checkBox04.setSelected(false);
					checkBox05.setSelected(false);
					i = 0;
				}
				A1 = 1;
			}

		});
		checkBox02.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox01.setSelected(false);
					checkBox03.setSelected(false);
					checkBox04.setSelected(false);
					checkBox05.setSelected(false);
					i = 1;
				} else {
					checkBox01.setSelected(false);
					checkBox03.setSelected(false);
					checkBox04.setSelected(false);
					checkBox05.setSelected(false);
					i = 0;
				}
				A1 = 2;
			}

		});
		checkBox03.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox01.setSelected(false);
					checkBox02.setSelected(false);
					checkBox04.setSelected(false);
					checkBox05.setSelected(false);
					i = 1;
				} else {
					checkBox01.setSelected(false);
					checkBox02.setSelected(false);
					checkBox04.setSelected(false);
					checkBox05.setSelected(false);
					i = 0;
				}
				A1 = 3;
			}

		});
		checkBox04.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox02.setSelected(false);
					checkBox03.setSelected(false);
					checkBox01.setSelected(false);
					checkBox05.setSelected(false);
					i = 1;
				} else {
					checkBox02.setSelected(false);
					checkBox03.setSelected(false);
					checkBox01.setSelected(false);
					checkBox05.setSelected(false);
					i = 0;
				}
				A1 = 4;
			}

		});
		checkBox05.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox02.setSelected(false);
					checkBox03.setSelected(false);
					checkBox04.setSelected(false);
					checkBox01.setSelected(false);
					i = 1;
				} else {
					checkBox02.setSelected(false);
					checkBox03.setSelected(false);
					checkBox04.setSelected(false);
					checkBox01.setSelected(false);
					i = 0;
				}
				A1 = 5;
			}

		});
		return A1;
	}

	public int listenerge1(JRadioButton checkBox06, JRadioButton checkBox07, JRadioButton checkBox08,
			JRadioButton checkBox09, JRadioButton checkBox10, JRadioButton checkBox11) {
		checkBox06.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox07.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;

				} else {
					checkBox07.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 0;
				}
				B1 = 1;
			}
		});
		checkBox07.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
				} else {
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 0;
				}
				B1 = 2;
			}

		});
		checkBox08.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox06.setSelected(false);
					checkBox07.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
				} else {
					checkBox06.setSelected(false);
					checkBox07.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 0;
				}
				B1 = 3;
			}

		});
		checkBox09.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox07.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
				} else {
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox07.setSelected(false);
					checkBox10.setSelected(false);
					checkBox11.setSelected(false);
					i = 0;
				}
				B1 = 4;
			}

		});
		checkBox10.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox07.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
				} else {
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox07.setSelected(false);
					checkBox11.setSelected(false);
					i = 0;
				}
				B1 = 5;
			}

		});
		checkBox11.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox07.setSelected(false);
					i = 1;
				} else {
					checkBox06.setSelected(false);
					checkBox08.setSelected(false);
					checkBox09.setSelected(false);
					checkBox10.setSelected(false);
					checkBox07.setSelected(false);
					i = 0;
				}
				B1 = 6;
			}

		});
		return B1;
	}

	public int listenergek1(JCheckBox checkBox11, JCheckBox checkBox12, JCheckBox checkBox13, JCheckBox checkBox14) {
		checkBox11.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox12.setSelected(false);
					checkBox13.setSelected(false);
					checkBox14.setSelected(false);
					i = 1;
				} else {
					checkBox12.setSelected(false);
					checkBox13.setSelected(false);
					checkBox14.setSelected(false);
					i = 0;
				}
				C1 = 1;
			}

		});
		checkBox12.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox14.setSelected(false);
					checkBox13.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
				} else {
					checkBox14.setSelected(false);
					checkBox13.setSelected(false);
					checkBox11.setSelected(false);
					i = 0;
				}
				C1 = 2;
			}

		});
		checkBox13.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox14.setSelected(false);
					checkBox12.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
				} else {
					checkBox14.setSelected(false);
					checkBox12.setSelected(false);
					checkBox11.setSelected(false);
					i = 0;
				}
				C1 = 3;
			}

		});
		checkBox14.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkBox12.setSelected(false);
					checkBox13.setSelected(false);
					checkBox11.setSelected(false);
					i = 1;
				} else {
					checkBox12.setSelected(false);
					checkBox13.setSelected(false);
					checkBox11.setSelected(false);
					i = 0;
				}
				C1 = 4;
			}

		});
		return C1;
	}

	public int listenergeC(JCheckBox checkboxc1, JCheckBox checkboxc2) {
		
		checkboxc1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkboxc2.setSelected(false);
					i = 1;
				} else {
					checkboxc2.setSelected(false);
					i = 0;
				}
				D1 = 1;
			}

		});
		checkboxc2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					checkboxc1.setSelected(false);
					i = 1;
				} else {
					checkboxc1.setSelected(false);
					i = 0;
				}
				D1 = 2;
			}

		});
		return D1;
	}

}
