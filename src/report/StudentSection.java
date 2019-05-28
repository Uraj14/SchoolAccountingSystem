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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentSection extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSection frame = new StudentSection();
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
	public StudentSection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(61, 50, 146, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setHorizontalAlignment(SwingConstants.LEFT);
		lblPass.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblPass.setBounds(61, 79, 146, 16);
		contentPane.add(lblPass);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblEmail.setBounds(61, 112, 146, 16);
		contentPane.add(lblEmail);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblCourse.setBounds(61, 141, 146, 16);
		contentPane.add(lblCourse);
		
		JLabel lblRollNo = new JLabel("Roll No-");
		lblRollNo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblRollNo.setBounds(61, 170, 146, 16);
		contentPane.add(lblRollNo);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblAddress.setBounds(61, 199, 146, 16);
		contentPane.add(lblAddress);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblCity.setBounds(61, 233, 146, 16);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblState.setBounds(61, 267, 146, 16);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblCountry.setBounds(61, 309, 146, 16);
		contentPane.add(lblCountry);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblContactNo.setBounds(61, 349, 146, 16);
		contentPane.add(lblContactNo);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblFee.setBounds(61, 384, 146, 16);
		contentPane.add(lblFee);
		
		JLabel lblPaid = new JLabel("Paid");
		lblPaid.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblPaid.setBounds(61, 413, 146, 16);
		contentPane.add(lblPaid);
		
		JLabel lblDjej = new JLabel("Due");
		lblDjej.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblDjej.setBounds(61, 449, 146, 16);
		contentPane.add(lblDjej);
		
		JLabel lblStudentSection = new JLabel("Student Section");
		lblStudentSection.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblStudentSection.setBounds(246, 13, 227, 16);
		contentPane.add(lblStudentSection);
		
		textField = new JTextField();
		textField.setBounds(234, 47, 268, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(234, 76, 268, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(234, 105, 268, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(234, 138, 268, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(234, 167, 268, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(234, 196, 268, 22);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(234, 230, 268, 22);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(234, 264, 268, 22);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(234, 306, 268, 22);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(234, 346, 268, 22);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(234, 378, 268, 22);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(234, 410, 268, 22);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(234, 446, 268, 22);
		contentPane.add(textField_12);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnUpdate.setBounds(44, 491, 181, 47);
		contentPane.add(btnUpdate);
		
		JButton btnGenerateFile = new JButton("Generate File");
		btnGenerateFile.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnGenerateFile.setBounds(246, 491, 181, 47);
		contentPane.add(btnGenerateFile);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(StudentSection.this, "You are now Logged Out!!");
				StudentLogin.main(new String[] {});
				StudentSection.this.dispose();
				
			}
		});
		btnLogout.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnLogout.setBounds(445, 491, 181, 47);
		contentPane.add(btnLogout);
	}

}
