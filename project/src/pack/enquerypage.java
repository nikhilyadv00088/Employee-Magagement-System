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
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class enquerypage extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private JTextField gmail1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					enquerypage frame = new enquerypage();
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
	public enquerypage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\school-icon-png-14054 (1).png"));
		lblNewLabel_1_2.setBounds(24, 11, 110, 110);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(108, 146, 56, 40);
		contentPane.add(lblNewLabel);
		
		name1 = new JTextField();
		name1.setHorizontalAlignment(SwingConstants.CENTER);
		name1.setBounds(194, 144, 194, 42);
		contentPane.add(name1);
		name1.setColumns(10);
		
		JLabel lblPhoneNo = new JLabel("Gmail ID");
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhoneNo.setBounds(99, 197, 85, 40);
		contentPane.add(lblPhoneNo);
		
		gmail1 = new JTextField();
		gmail1.setHorizontalAlignment(SwingConstants.CENTER);
		gmail1.setColumns(10);
		gmail1.setBounds(194, 197, 194, 42);
		contentPane.add(gmail1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name=new String(name1.getText());
				String gamil=gmail1.getText();
				JOptionPane.showMessageDialog(getParent(),"we contact you as soon as possible");
				home h=new home();
				h.setVisible(rootPaneCheckingEnabled);
				setVisible(false);
			}
		});
		btnSubmit.setForeground(new Color(0, 100, 0));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit.setBounds(108, 298, 95, 45);
		contentPane.add(btnSubmit);
		
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
		btnBack.setBounds(370, 380, 89, 45);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Management System");
		lblNewLabel_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 19));
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(139, 0, 0), new Color(178, 34, 34), new Color(139, 0, 0), new Color(178, 34, 34)));
		lblNewLabel_1.setBackground(new Color(70, 130, 180));
		lblNewLabel_1.setBounds(140, 11, 319, 85);
		contentPane.add(lblNewLabel_1);
	}
}
