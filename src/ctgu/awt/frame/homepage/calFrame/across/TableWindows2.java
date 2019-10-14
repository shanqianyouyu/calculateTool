package ctgu.awt.frame.homepage.calFrame.across;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TableWindows2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableWindows2 frame = new TableWindows2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TableWindows2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1194, 739);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1157, 668);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("表二：跨越架与带电梯最小安全距离");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 30));
		lblNewLabel.setBounds(15, 15, 686, 48);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(15, 62, 1117, 576);
		panel.add(lblNewLabel_1);
		
		
		lblNewLabel_1.setText("<html><body> <table style=\"text-align: center;\" border=\"1\" cellpadding=\"20px\" cellspacing=\"0\">\r\n" + 
				"            <tr>\r\n" + 
				"                <th rowspan=\"2\" colspan=\"3\" >跨越架部位</th>\r\n" + 
				"                <th colspan=\"5\">被跨越电力线电压（KV）</th>\r\n" + 
				"                <!-- <th>次坚土</th>\r\n" + 
				"                <th>普通土</th>\r\n" + 
				"                <th>软土</th> -->\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"               <th>小于等于10</th> \r\n" + 
				"               <th>35</th> \r\n" + 
				"               <th>60-110</th> \r\n" + 
				"               <th>220</th> \r\n" + 
				"               <th>330</th>               \r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"                <th colspan=\"3\">架面与导线的水平距离（m）①/th> \r\n" + 
				"                <td>1.5</td> \r\n" + 
				"                <td>1.5</td> \r\n" + 
				"                <td>2.0</td>  \r\n" + 
				"                <td>2.5</td> \r\n" + 
				"                <td>3.5</td>                  \r\n" + 
				"             </tr>\r\n" + 
				"             <tr>\r\n" + 
				"                <th colspan=\"2\" rowspan=\"2\">无地线时，与带电体垂直距离（m）</th> \r\n" + 
				"                <th>封顶杆②</th>\r\n" + 
				"                <td>2.0</td> \r\n" + 
				"                <td>2.0</td> \r\n" + 
				"                <td>2.5</td> \r\n" + 
				"                <td>3.0</td> \r\n" + 
				"                <td>4.0</td>                  \r\n" + 
				"             </tr>\r\n" + 
				"             <tr>\r\n" + 
				"                <th>封顶网③</th> \r\n" + 
				"                <td>3.0</td> \r\n" + 
				"                <td>3.0</td> \r\n" + 
				"                <td>3.5</td>    \r\n" + 
				"                <td>4.0</td> \r\n" + 
				"                <td>5.0</td>              \r\n" + 
				"             </tr>   \r\n" + 
				"             <tr>\r\n" + 
				"                <th colspan=\"2\" rowspan=\"2\">有地线时，与地线垂直距离（m）</th> \r\n" + 
				"                <th>封顶杆②</th>\r\n" + 
				"                <td>1.0</td> \r\n" + 
				"                <td>1.0</td> \r\n" + 
				"                <td>1.5</td> \r\n" + 
				"                <td>2.0</td> \r\n" + 
				"                <td>2.5</td>                  \r\n" + 
				"             </tr>\r\n" + 
				"             <tr>\r\n" + 
				"                <th>封顶网③</th> \r\n" + 
				"                <td>2.0</td> \r\n" + 
				"                <td>2.0</td> \r\n" + 
				"                <td>2.5</td>    \r\n" + 
				"                <td>3.0</td> \r\n" + 
				"                <td>3.5</td>              \r\n" + 
				"             </tr>       \r\n" + 
				"        </table></body></html>");
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setBounds(1009, 639, 123, 29);
		panel.add(btnCancel);
		
		
		btnCancel.setActionCommand("cancel");
		
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
	}
	
	

}
