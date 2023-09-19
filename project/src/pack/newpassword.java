package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newpassword extends JFrame {

	private JPanel contentPane;
	private JPasswordField upass;
	private JPasswordField newpass;
	private JPasswordField newpass1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newpassword frame = new newpassword();
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
	public newpassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password Portal");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(133, 10, 207, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Current password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(41, 103, 173, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("New password");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(41, 189, 173, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel ljgiuiyfg = new JLabel("New password");
		ljgiuiyfg.setFont(new Font("Tahoma", Font.BOLD, 18));
		ljgiuiyfg.setHorizontalAlignment(SwingConstants.CENTER);
		ljgiuiyfg.setBounds(41, 273, 173, 30);
		contentPane.add(ljgiuiyfg);
		
		JLabel lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(231, 103, 15, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(":");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(231, 189, 15, 30);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel(":");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(231, 273, 15, 30);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				employeeportal emp=new employeeportal();
				emp.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.BLUE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(371, 383, 89, 45);
		contentPane.add(btnBack);
		
		upass = new JPasswordField();
		upass.setHorizontalAlignment(SwingConstants.CENTER);
		upass.setFont(new Font("Tahoma", Font.BOLD, 18));
		upass.setBounds(256, 103, 173, 28);
		contentPane.add(upass);
		
		newpass = new JPasswordField();
		newpass.setHorizontalAlignment(SwingConstants.CENTER);
		newpass.setFont(new Font("Tahoma", Font.BOLD, 18));
		newpass.setBounds(256, 189, 173, 28);
		contentPane.add(newpass);
		
		newpass1 = new JPasswordField();
		newpass1.setHorizontalAlignment(SwingConstants.CENTER);
		newpass1.setFont(new Font("Tahoma", Font.BOLD, 18));
		newpass1.setBounds(256, 273, 173, 28);
		contentPane.add(newpass1);
		
		
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 			
			{
				
				
			}
		});
		btnConfirm.setForeground(Color.BLUE);
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConfirm.setBounds(178, 335, 124, 45);
		contentPane.add(btnConfirm);
	}
}
