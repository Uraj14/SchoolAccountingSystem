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
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddStudent extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent frame = new AddStudent();
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
	public AddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 718);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblName.setBounds(43, 55, 56, 16);
		contentPane.add(lblName);
		
		JLabel lblAddStudent = new JLabel("Add Student");
		lblAddStudent.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblAddStudent.setBounds(279, 13, 165, 16);
		contentPane.add(lblAddStudent);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblPassword.setBounds(43, 91, 132, 16);
		contentPane.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblEmail.setBounds(43, 126, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblCourse.setBounds(43, 159, 121, 16);
		contentPane.add(lblCourse);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblFee.setBounds(43, 188, 56, 16);
		contentPane.add(lblFee);
		
		JLabel lblPaid = new JLabel("Paid");
		lblPaid.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblPaid.setBounds(43, 224, 56, 16);
		contentPane.add(lblPaid);
		
		JLabel lblDue = new JLabel("Due");
		lblDue.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblDue.setBounds(43, 264, 56, 16);
		contentPane.add(lblDue);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblAddress.setBounds(43, 306, 56, 16);
		contentPane.add(lblAddress);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblCity.setBounds(43, 402, 56, 16);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblState.setBounds(43, 451, 56, 16);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblCountry.setBounds(43, 506, 154, 16);
		contentPane.add(lblCountry);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblContactNumber.setBounds(43, 563, 170, 16);
		contentPane.add(lblContactNumber);
		
		textField = new JTextField();
		textField.setBounds(268, 52, 386, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(268, 123, 386, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(268, 156, 386, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(268, 185, 386, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(268, 220, 386, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(268, 261, 386, 22);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(268, 399, 386, 22);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(268, 448, 386, 22);
		contentPane.add(textField_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(268, 303, 386, 62);
		contentPane.add(textArea);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(268, 503, 386, 22);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(268, 560, 386, 22);
		contentPane.add(textField_9);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String name=textField.getText();
			String pass=textField_10.getText();
			String email=textField_1.getText();
			String course=textField_2.getText();
			int fee=Integer.parseInt(textField_3.getText());
			int paid=Integer.parseInt(textField_4.getText());
			int due=Integer.parseInt(textField_5.getText());
			String add=textArea.getText();
			String city=textField_6.getText();
			String state=textField_7.getText();
			String count=textField_8.getText();
			String con=textField_9.getText();
			
			Student s=new Student(name,pass,email,course,fee,paid,due,add,city,state,count,con);
			int status=studentdb.save(s);
			if(status>0) {
				JOptionPane.showMessageDialog(AddStudent.this,"Student Added Successfully");
				
			}
			else {
				JOptionPane.showMessageDialog(AddStudent.this,"Student not Added");
			}
			}
			
		});
		btnAddStudent.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		btnAddStudent.setBounds(169, 620, 165, 38);
		contentPane.add(btnAddStudent);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantSection.main(new String[] {});
				AddStudent.this.dispose();
			}
		});
		btnBack.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		btnBack.setBounds(402, 620, 165, 38);
		contentPane.add(btnBack);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(268, 88, 386, 22);
		contentPane.add(textField_10);
	}
}
