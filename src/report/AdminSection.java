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

public class AdminSection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSection frame = new AdminSection();
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
	public AdminSection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblAdminSection.setBounds(144, 13, 137, 55);
		contentPane.add(lblAdminSection);
		
		JButton btnAddAccountant = new JButton("Add Accountant");
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddAccountant.main(new String[]{});
				AdminSection.this.dispose();
			}
		});
		btnAddAccountant.setBounds(144, 81, 137, 50);
		contentPane.add(btnAddAccountant);
		
		JButton btnViewAccountant = new JButton("View Accountant");
		btnViewAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAccountant.main(new String[]{});
				AdminSection.this.dispose();
				
			}
		});
		btnViewAccountant.setBounds(144, 157, 137, 45);
		contentPane.add(btnViewAccountant);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AdminSection.this, "You are now Logged Out!!");
				AdminLogin.main(new String[] {});
				AdminSection.this.dispose();
			}
		});
		btnLogout.setBounds(144, 247, 137, 50);
		contentPane.add(btnLogout);
	}
}
