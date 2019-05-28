package report;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {
    static AdminLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToAdmin = new JLabel("Welcome To Admin Menu");
		lblWelcomeToAdmin.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblWelcomeToAdmin.setBounds(99, 29, 230, 87);
		contentPane.add(lblWelcomeToAdmin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblUsername.setBounds(36, 114, 148, 46);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblPassword.setBounds(36, 188, 116, 28);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(187, 129, 155, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(187, 188, 155, 24);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=textField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				if(name.equals("admin")&&password.equals("admin123")){
					JOptionPane.showMessageDialog(AdminLogin.this,"Successful Login");
					String s[]={};
					AdminSection.main(s);
					AdminLogin.this.dispose();
				}
				else {
					JOptionPane.showMessageDialog(AdminLogin.this,"Please Enter Correct Username/Password");
					passwordField.setText("");
					textField.setText("");
				}
				}
			});
		
		btnLogin.setBounds(63, 262, 116, 46);
		contentPane.add(btnLogin);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage.main(new String[]{});
				AdminLogin.this.dispose();
			}
		});
		btnNewButton.setBounds(243, 262, 116, 46);
		contentPane.add(btnNewButton);
	}
}
