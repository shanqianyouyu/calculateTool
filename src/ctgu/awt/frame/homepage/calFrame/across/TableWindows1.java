package ctgu.awt.frame.homepage.calFrame.across;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.text.html.HTML;

import com.sun.glass.ui.Window;
import com.sun.java.swing.plaf.windows.resources.windows;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.event.AncestorEvent;

public class TableWindows1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableWindows1 frame = new TableWindows1();
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
	public TableWindows1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1027, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 15, 975, 546);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("表一：跨越架与被跨越物的最小安全距离（m）:");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 30));
		lblNewLabel.setBounds(15, 15, 674, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(15, 64, 945, 467);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_1.setText("<html><body><table style=\"text-align: center;\" border=\"1\" cellpadding=\"20px\" cellspacing=\"0\">\r\n" + 
				"            <tr>\r\n" + 
				"                <th rowspan=\"2\" colspan=\"2\" >跨越架部位</th>\r\n" + 
				"                <th colspan=\"3\">被跨越物名称</th>\r\n" + 
				"                <!-- <th>次坚土</th>\r\n" + 
				"                <th>普通土</th>\r\n" + 
				"                <th>软土</th> -->\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"               <th>铁路</th> \r\n" + 
				"               <th>公路</th> \r\n" + 
				"               <th>弱电线</th>              \r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"                <th colspan=\"2\">与架面水平距离①</th> \r\n" + 
				"                <td>3(至路中心)</td> \r\n" + 
				"                <td>0.6(至路边)</td> \r\n" + 
				"                <td>0.6</td>                 \r\n" + 
				"             </tr>\r\n" + 
				"             <tr>\r\n" + 
				"                <th colspan=\"2\">与封顶杆垂直距离②</th> \r\n" + 
				"                <td>7.0(至轨顶)</td> \r\n" + 
				"                <td>6.0(至路边)</td> \r\n" + 
				"                <td>1.5</td>                 \r\n" + 
				"             </tr>\r\n" + 
				"             <tr>\r\n" + 
				"                <th colspan=\"2\">与绝缘网垂直距离③</th> \r\n" + 
				"                <td>8.0(至轨顶)</td> \r\n" + 
				"                <td>7.0(至路边)</td> \r\n" + 
				"                <td>2.5</td>                 \r\n" + 
				"             </tr>           \r\n" + 
				"        </table></body></html>");
		
		JButton btnNewButton = new JButton("cancel");
		btnNewButton.setBounds(781, 502, 123, 29);
		panel.add(btnNewButton);
		
		btnNewButton.setActionCommand("cancel");
		
		btnNewButton.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
				
	}
}
