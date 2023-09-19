package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class signup extends JFrame {

	private JPanel contentPane;
	private JPasswordField spass;
	private JPasswordField aspass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
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
	public signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\small icon (1).png"));
		lblNewLabel_1_2.setBounds(10, 11, 110, 110);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel = new JLabel("SignUp");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 35));
		lblNewLabel.setBounds(153, 96, 133, 93);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter full Name ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(85, 176, 115, 29);
		contentPane.add(lblNewLabel_1);
		
		JTextField sname = new JTextField();
		sname.setHorizontalAlignment(SwingConstants.CENTER);
		sname.setBounds(210, 178, 154, 29);
		contentPane.add(sname);
		
		JTextField sid = new JTextField();
		sid.setHorizontalAlignment(SwingConstants.CENTER);
		sid.setFont(new Font("Tahoma", Font.BOLD, 11));
		sid.setBounds(210, 216, 154, 29);
		contentPane.add(sid);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter user ID ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(85, 216, 115, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel ibfghwr = new JLabel("Enter password ");
		ibfghwr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ibfghwr.setBounds(85, 256, 115, 29);
		contentPane.add(ibfghwr);
		
		spass = new JPasswordField();
		spass.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				
			}
		});
		spass.setEchoChar('*');
		spass.setFont(new Font("Tahoma", Font.BOLD, 11));
		spass.setHorizontalAlignment(SwingConstants.CENTER);
		spass.setBounds(210, 256, 154, 29);
		contentPane.add(spass);
		
		JLabel fghsrth = new JLabel("password again ");
		fghsrth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fghsrth.setBounds(85, 296, 115, 29);
		contentPane.add(fghsrth);
		
		aspass = new JPasswordField();
		aspass.setEchoChar('*');
		aspass.setFont(new Font("Tahoma", Font.BOLD, 11));
		aspass.setHorizontalAlignment(SwingConstants.CENTER);
		aspass.setBounds(210, 296, 154, 29);
		contentPane.add(aspass);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnSignup.setForeground(new Color(0, 100, 0));
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSignup.setBounds(197, 336, 95, 45);
		contentPane.add(btnSignup);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				home h=new home();
				h.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.BLUE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(369, 380, 89, 45);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Management System");
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD, 19));
		lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(139, 0, 0), new Color(178, 34, 34), new Color(139, 0, 0), new Color(178, 34, 34)));
		lblNewLabel_2.setBackground(new Color(70, 130, 180));
		lblNewLabel_2.setBounds(139, 11, 319, 85);
		contentPane.add(lblNewLabel_2);
	}
}
