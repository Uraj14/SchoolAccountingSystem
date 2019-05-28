package report;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class FirstPage extends JFrame {

	private JPanel contentPane;
	static FirstPage frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
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
	public FirstPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToFee = new JLabel("Welcome To Fee Section");
		lblWelcomeToFee.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblWelcomeToFee.setBounds(94, 39, 304, 37);
		contentPane.add(lblWelcomeToFee);
		
		JButton btnNewButton = new JButton("Admin Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(FirstPage.this,"You are Being Redirected To Admin Page");
				AdminLogin.main(new String[] {});
				FirstPage.this.dispose();
			}
		});
		btnNewButton.setBounds(127, 110, 190, 65);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Accountant Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(FirstPage.this,"You are Being Redirected To Acountant Page");
				//AccountantLogin AccountantLogin = new AccountantLogin();
				//AccountantLogin.setVisible(true);
				AccountantLogin.main(new String[] {});
				FirstPage.this.dispose();
			}
		});
		btnNewButton_1.setBounds(127, 202, 190, 65);
		contentPane.add(btnNewButton_1);
		
		JButton btnStudentLogin = new JButton("Student Login");
		btnStudentLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentLogin.main(new String[] {});
				FirstPage.this.dispose();
			}
		});
		btnStudentLogin.setBounds(127, 295, 190, 65);
		contentPane.add(btnStudentLogin);
	}
}
