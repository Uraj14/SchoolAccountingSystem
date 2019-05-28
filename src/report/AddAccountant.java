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

public class AddAccountant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAccountant frame = new AddAccountant();
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
	public AddAccountant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddAccountant = new JLabel("Add Accountant");
		lblAddAccountant.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblAddAccountant.setBounds(159, 36, 288, 34);
		contentPane.add(lblAddAccountant);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblName.setBounds(37, 137, 118, 25);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblPassword.setBounds(37, 175, 118, 25);
		contentPane.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblEmail.setBounds(37, 213, 118, 25);
		contentPane.add(lblEmail);
		
		JLabel lblContactNo = new JLabel("Contact No.");
		lblContactNo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblContactNo.setBounds(37, 251, 118, 25);
		contentPane.add(lblContactNo);
		
		textField = new JTextField();
		textField.setBounds(209, 139, 218, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(209, 253, 218, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(209, 215, 218, 22);
		contentPane.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 177, 218, 22);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Add Accountant");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				char ch[]=passwordField.getPassword();
				String pass=String.valueOf(ch);
				String email=textField_2.getText();
				String con=textField_1.getText();
				
				Accountant a=new Accountant(name,pass,email,con);
				int status=accountdb.save(a);
				if(status>0)
				{
					JOptionPane.showMessageDialog(AddAccountant.this,"Accountant Entry Updated Successfully!!");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					passwordField.setText("");
					
					
				}
				else {
					JOptionPane.showMessageDialog(AddAccountant.this, "Accountant Not Added !! ");
				}
			}
		});
		btnNewButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnNewButton.setBounds(67, 337, 218, 82);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection.main(new String[]{});
				AddAccountant.this.dispose();
			}
		});
		btnNewButton_1.setBounds(330, 337, 97, 76);
		contentPane.add(btnNewButton_1);
	}

}
