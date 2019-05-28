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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentLogin extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					StudentLogin frame = new StudentLogin();
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
	public StudentLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 475);
		getContentPane().setLayout(null);
		
		JLabel lblStudentLogiin = new JLabel("Student Login");
		lblStudentLogiin.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblStudentLogiin.setBounds(214, 66, 275, 16);
		getContentPane().add(lblStudentLogiin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblUsername.setBounds(50, 155, 182, 16);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblPassword.setBounds(50, 224, 162, 16);
		getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String pass=String.valueOf(passwordField.getPassword());
				
				boolean status=studentdb.validate(name, pass);
				int x=studentdb.getroll(name,pass);
				
				if(status)
				{
					JOptionPane.showMessageDialog(StudentLogin.this,"Login Successful");
					 StudentSection.main(new String[] {});
					 StudentLogin.this.dispose();
				}
				else {
					JOptionPane.showMessageDialog(StudentLogin.this,"Login Unsuccessful");
					
				}
			}
		});
		btnLogin.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnLogin.setBounds(247, 334, 133, 46);
		getContentPane().add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(292, 153, 214, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(292, 222, 214, 22);
		getContentPane().add(passwordField);
	}

}
