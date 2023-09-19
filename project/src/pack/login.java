package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class login extends JFrame implements KeyListener
{

	private JPanel contentPane;
	private JTextField uid;
	private JPasswordField upass;
	public int d;
	private JButton reset;
	private JButton login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 474);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setForeground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("login");
		lblNewLabel.setForeground(new Color(106, 90, 205));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 35));
		lblNewLabel.setBounds(179, 109, 106, 97);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(135, 228, 65, 34);
		contentPane.add(lblNewLabel_1);
		
		uid = new JTextField();
		uid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		uid.setFont(new Font("Tahoma", Font.BOLD, 11));
		uid.setHorizontalAlignment(SwingConstants.CENTER);
		uid.setBounds(210, 228, 154, 27);
		contentPane.add(uid);
		uid.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(132, 272, 79, 34);
		contentPane.add(lblNewLabel_1_1);
		
		upass = new JPasswordField();
		upass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		upass.setFont(new Font("Tahoma", Font.BOLD, 11));
		upass.setEchoChar('*');
		upass.setHorizontalAlignment(SwingConstants.CENTER);
		upass.setBounds(210, 272, 154, 27);
		contentPane.add(upass);
		
        EmployeeDao ed=new EmployeeDao();
        employeeportal ep=new employeeportal();
        Employee emp=new Employee();
		
		login = new JButton("Login");
		login.setEnabled(false);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
				String id=emp.getId();
				String pass=emp.getPassword();
				if(id.equals(uid)&&pass.equals(upass))
				{
					JOptionPane.showMessageDialog(getParent(), "Login Successfully");
					ep.setVisible(rootPaneCheckingEnabled);
					ep.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(getParent(), "Please check your id password");
				}
			}

			
		});
		login.setForeground(new Color(0, 100, 0));
		login.setFont(new Font("Tahoma", Font.BOLD, 20));
		login.setBounds(142, 317, 89, 45);
		contentPane.add(login);
		
		reset = new JButton("Reset");
		reset.setEnabled(false);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				uid.setText("");
				upass.setText("");
			}
		});
		reset.setForeground(new Color(0, 100, 0));
		reset.setFont(new Font("Tahoma", Font.BOLD, 19));
		reset.setBounds(269, 317, 89, 45);
		contentPane.add(reset);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				home h=new home();
				h.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 0, 255));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(208, 380, 89, 45);
		contentPane.add(btnBack);
		
		
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\image-110x110.jpg"));
		lblNewLabel_1_2.setBounds(22, 11, 110, 110);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Employee Management System");
		lblNewLabel_1_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_3.setFont(new Font("Stencil", Font.BOLD, 19));
		lblNewLabel_1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(139, 0, 0), new Color(178, 34, 34), new Color(139, 0, 0), new Color(178, 34, 34)));
		lblNewLabel_1_3.setBackground(new Color(70, 130, 180));
		lblNewLabel_1_3.setBounds(141, 11, 319, 85);
		contentPane.add(lblNewLabel_1_3);
		
		uid.addKeyListener(this);
		upass.addKeyListener(this);
	}

	private void data() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) 
	{
		if(!(uid.getText().equals("")||upass.getText().equals("")))
		{
			login.setEnabled(true);
			reset.setEnabled(true);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}