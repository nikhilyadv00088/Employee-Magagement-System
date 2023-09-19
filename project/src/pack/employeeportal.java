package pack;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class employeeportal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employeeportal frame = new employeeportal();
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
	public employeeportal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 474);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Portal");
		lblNewLabel.setForeground(new Color(123, 104, 238));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(103, 21, 258, 46);
		contentPane.add(lblNewLabel);
		
		JButton btnShowDetails = new JButton("Show Details");
		btnShowDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				showdetails sh=new showdetails();
				sh.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnShowDetails.setHorizontalAlignment(SwingConstants.LEADING);
		btnShowDetails.setForeground(new Color(0, 100, 0));
		btnShowDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnShowDetails.setBounds(45, 151, 163, 45);
		contentPane.add(btnShowDetails);
		
		JButton btnNewPassword = new JButton("New password");
		btnNewPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				newpassword np=new newpassword();
				np.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnNewPassword.setForeground(new Color(0, 100, 0));
		btnNewPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewPassword.setBounds(284, 151, 163, 45);
		contentPane.add(btnNewPassword);
		
		JButton btnPaySlip = new JButton("Pay Slip");
		btnPaySlip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				payslip ps=new payslip();
				ps.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnPaySlip.setForeground(new Color(0, 100, 0));
		btnPaySlip.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPaySlip.setBounds(45, 232, 163, 45);
		contentPane.add(btnPaySlip);
		
		JButton btnContactUs = new JButton("Contact Us");
		btnContactUs.setForeground(new Color(0, 100, 0));
		btnContactUs.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnContactUs.setBounds(284, 232, 163, 45);
		contentPane.add(btnContactUs);
		
		JButton btnAttendance = new JButton("Feedback");
		btnAttendance.setForeground(new Color(0, 100, 0));
		btnAttendance.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAttendance.setBounds(45, 310, 163, 45);
		contentPane.add(btnAttendance);
		
		JButton btnHelp = new JButton("Help?");
		btnHelp.setForeground(new Color(0, 100, 0));
		btnHelp.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnHelp.setBounds(284, 310, 163, 45);
		contentPane.add(btnHelp);
		
		JButton btnBack = new JButton("Logout");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				home h=new home();
				h.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 0, 255));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnBack.setBounds(180, 380, 119, 45);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 89, 80, 24);
		contentPane.add(lblNewLabel_1);
		

		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("User ID:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(284, 89, 67, 24);
		contentPane.add(lblNewLabel_1_1);
		
		
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setBounds(100, 89, 84, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel();
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2_1.setBounds(351, 89, 84, 26);
		contentPane.add(lblNewLabel_2_1);
		
		
	}

	

	}
	

