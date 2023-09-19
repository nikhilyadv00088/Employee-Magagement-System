package pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484,474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\image-110x110.jpg"));
		lblNewLabel_1.setBounds(21, 11, 110, 110);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				login lf=new login();
				lf.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 13));
		btnNewButton.setBounds(21, 163, 110, 54);
		contentPane.add(btnNewButton);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				signup su=new signup();
				su.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnSignup.setFont(new Font("Stencil", Font.PLAIN, 13));
		btnSignup.setForeground(new Color(0, 100, 0));
		btnSignup.setBounds(21, 255, 110, 54);
		contentPane.add(btnSignup);
		
		JButton btnLogin = new JButton("Enquiry");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				enquerypage ep=new enquerypage();
				ep.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnLogin.setForeground(new Color(0, 100, 0));
		btnLogin.setFont(new Font("Stencil", Font.PLAIN, 13));
		btnLogin.setBounds(21, 342, 110, 54);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\image-270x298.jpg"));
		lblNewLabel_3.setBounds(177, 127, 270, 298);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Management System");
		lblNewLabel_1_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Stencil", Font.BOLD, 19));
		lblNewLabel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(139, 0, 0), new Color(178, 34, 34), new Color(139, 0, 0), new Color(178, 34, 34)));
		lblNewLabel_1_1.setBackground(new Color(70, 130, 180));
		lblNewLabel_1_1.setBounds(141, 11, 319, 85);
		contentPane.add(lblNewLabel_1_1);
	}
}
