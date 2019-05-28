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
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateStudent extends JFrame {
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
	private JTextArea textArea;
	private JTextField textField_12;
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent frame = new UpdateStudent();
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
	public UpdateStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 643);
		getContentPane().setLayout(null);
		
		JLabel lblRollNo = new JLabel("Roll No :- ");
		lblRollNo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblRollNo.setBounds(97, 25, 165, 16);
		getContentPane().add(lblRollNo);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblName.setBounds(97, 87, 165, 16);
		getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblPassword.setBounds(97, 116, 165, 16);
		getContentPane().add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblEmail.setBounds(97, 145, 165, 16);
		getContentPane().add(lblEmail);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblCourse.setBounds(97, 183, 165, 16);
		getContentPane().add(lblCourse);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblFee.setBounds(97, 212, 165, 16);
		getContentPane().add(lblFee);
		
		JLabel lblDue = new JLabel("Paid");
		lblDue.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblDue.setBounds(97, 247, 165, 16);
		getContentPane().add(lblDue);
		
		JLabel lblDue_1 = new JLabel("Due");
		lblDue_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblDue_1.setBounds(97, 276, 165, 16);
		getContentPane().add(lblDue_1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblAddress.setBounds(97, 321, 165, 16);
		getContentPane().add(lblAddress);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblCity.setBounds(97, 380, 165, 16);
		getContentPane().add(lblCity);
		
		textField = new JTextField();
		textField.setBounds(249, 22, 207, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_9 = new JLabel("------------------------------------------------------------------------------------------------------------------------------");
		label_9.setBounds(31, 58, 654, 16);
		getContentPane().add(label_9);
		
		JButton btnGo = new JButton("Load Data");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sr=textField.getText();
				if(sr.trim().equals(""))
				{
					JOptionPane.showMessageDialog(UpdateStudent.this,"Please Enter a Roll No");
					
				}
				else
				{
					int r=Integer.parseInt(sr);
					Student s= studentdb.getStudentByRollno(r);
					textField_1.setText(s.getname());
					textField_2.setText(s.getpass());
					textField_3.setText(s.getemail());
					textField_4.setText(s.getcourse());
					textField_5.setText(String.valueOf(s.getfee()));
					textField_6.setText(String.valueOf(s.getpaid()));
					textField_7.setText(String.valueOf(s.getdue()));
					textField_12.setText(s.getadd());
					textField_8.setText(s.getcity());
					textField_9.setText(s.getstate());
					textField_10.setText(s.getcount());
					textField_11.setText(s.getcon());
					
					
					
							}
					
					
				
				
			}
		});
		btnGo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnGo.setBounds(499, 21, 129, 25);
		getContentPane().add(btnGo);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblState.setBounds(97, 416, 165, 16);
		getContentPane().add(lblState);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblCountry.setBounds(97, 458, 165, 16);
		getContentPane().add(lblCountry);
		
		JLabel lblContactNo = new JLabel("Contact No.");
		lblContactNo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblContactNo.setBounds(97, 498, 165, 16);
		getContentPane().add(lblContactNo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(249, 84, 250, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(249, 116, 250, 22);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(249, 145, 250, 22);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(249, 180, 250, 22);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(249, 212, 250, 22);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(249, 247, 250, 22);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(249, 276, 250, 22);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(249, 377, 250, 22);
		getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(249, 413, 250, 22);
		getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(249, 455, 250, 22);
		getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(249, 495, 250, 22);
		getContentPane().add(textField_11);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status=0;
				int roll=Integer.parseInt(textField.getText());
				String name=textField_1.getText();
				String pass=textField_2.getText();
				String email=textField_3.getText();
				String course=textField_4.getText();
				int fee=Integer.parseInt(textField_5.getText());
				int paid=Integer.parseInt(textField_6.getText());
				int due=Integer.parseInt(textField_7.getText());
				String city=textField_8.getText();
				String state=textField_9.getText();
				String count=textField_10.getText();
				String con=textField_11.getText();
				String add=textField_12.getText();
				
				Student s= new Student(roll,name,pass,email,course,fee,paid,due,add,city,state,count,con);
				status=studentdb.update(s);
				if(status>0)
				{
					JOptionPane.showMessageDialog(UpdateStudent.this,"Student Record Updated Successfully");
				}
						
				else
				{
					JOptionPane.showMessageDialog(UpdateStudent.this,"Not updated !!!");
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		btnNewButton.setBounds(166, 545, 207, 38);
		getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AccountantSection.main(new String[] {});
				UpdateStudent.this.dispose();
			}
			
			
		});
		btnBack.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		btnBack.setBounds(403, 545, 207, 38);
		getContentPane().add(btnBack);
		
		textField_12 = new JTextField();
		textField_12.setBounds(249, 318, 250, 22);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);
	}
}
