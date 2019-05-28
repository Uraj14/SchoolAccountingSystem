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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountantSection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountantSection frame = new AccountantSection();
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
	public AccountantSection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAccountantSection = new JLabel("Accountant Section");
		lblAccountantSection.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 19));
		lblAccountantSection.setBounds(218, 32, 274, 71);
		contentPane.add(lblAccountantSection);
		
		JButton btnNewButton = new JButton("Add Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(new String[]{});
				AccountantSection.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnNewButton.setBounds(64, 142, 222, 71);
		contentPane.add(btnNewButton);
		
		JButton btnUpdateStudent = new JButton("Update Student");
		btnUpdateStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudent.main(new String[] {});
				AccountantSection.this.dispose();
			}
		});
		btnUpdateStudent.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnUpdateStudent.setBounds(396, 142, 222, 71);
		contentPane.add(btnUpdateStudent);
		
		JButton btnViewStudent = new JButton("View Student");
		btnViewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStudent.main(new String[] {});
				AccountantSection.this.dispose();
			}
		});
		btnViewStudent.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnViewStudent.setBounds(64, 263, 222, 71);
		contentPane.add(btnViewStudent);
		
		JButton btnFeeDue = new JButton("Fee Due");
		btnFeeDue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeDue.main(new String[] {});
				AccountantSection.this.dispose();
			}
		});
		btnFeeDue.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnFeeDue.setBounds(396, 263, 222, 71);
		contentPane.add(btnFeeDue);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AccountantSection.this, "You are now Logged Out!!");
				AccountantLogin.main(new String[] {});
				AccountantSection.this.dispose();
			}
		});
		btnLogout.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnLogout.setBounds(243, 372, 222, 71);
		contentPane.add(btnLogout);
	}
}
