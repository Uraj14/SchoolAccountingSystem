package report;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountantLogin extends JFrame {

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
					AccountantLogin frame = new AccountantLogin();
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
	public AccountantLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAccountantLogin = new JLabel("Accountant Login");
		lblAccountantLogin.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblAccountantLogin.setBounds(121, 27, 231, 50);
		contentPane.add(lblAccountantLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblUsername.setBounds(33, 112, 160, 33);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblPassword.setBounds(33, 177, 160, 33);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username=textField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				boolean status=accountdb.validate(username, password);
				if(status) {
					JOptionPane.showMessageDialog(AccountantLogin.this,"Login Successful");
					AccountantSection.main(new String[]{});
					AccountantLogin.this.dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(AccountantLogin.this,"Invalid Username/Password!!");
					passwordField.setText("");
					textField.setText("");
				}
			}
		});
		btnLogin.setBounds(82, 258, 97, 44);
		contentPane.add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(183, 118, 169, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 183, 169, 22);
		contentPane.add(passwordField);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage.main(new String[]{});
				AccountantLogin.this.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setBounds(242, 258, 97, 44);
		contentPane.add(btnBack);
	}
}
