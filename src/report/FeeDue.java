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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FeeDue extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeDue frame = new FeeDue();
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
	public FeeDue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFeeDueMenu = new JLabel("Fee Due Menu");
		lblFeeDueMenu.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblFeeDueMenu.setBounds(266, 51, 245, 16);
		contentPane.add(lblFeeDueMenu);
		
		JLabel lblRollNo = new JLabel("Roll No:-");
		lblRollNo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblRollNo.setBounds(211, 124, 161, 16);
		contentPane.add(lblRollNo);
		
		textField = new JTextField();
		textField.setBounds(360, 121, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnFindDue = new JButton("Find Due");
		btnFindDue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=textField.getText();
				if(roll.trim().equals("")) {
					JOptionPane.showMessageDialog(FeeDue.this,"Please Enter a valid Roll Number!!");
					}
				else
				{
					int r=Integer.parseInt(roll);
					Student s = studentdb.getStudentByRollno(r);
					textField_1.setText(s.getname());
					textField_2.setText(s.getemail());
					textField_3.setText(s.getadd());
					textField_4.setText(String.valueOf(s.getdue()));
					
					
					
					
					
				}
			}
		});
		btnFindDue.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 13));
		btnFindDue.setBounds(288, 169, 97, 25);
		contentPane.add(btnFindDue);
		
		textField_1 = new JTextField();
		textField_1.setBounds(241, 226, 235, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(241, 261, 235, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(241, 296, 235, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblName.setBounds(141, 229, 161, 16);
		contentPane.add(lblName);
		
		JLabel lblEmal = new JLabel("Email");
		lblEmal.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblEmal.setBounds(141, 264, 161, 16);
		contentPane.add(lblEmal);
		
		JLabel lblAddres = new JLabel("Address");
		lblAddres.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblAddres.setBounds(141, 299, 193, 16);
		contentPane.add(lblAddres);
		
		JLabel label = new JLabel("");
		label.setBounds(120, 337, 56, 16);
		contentPane.add(label);
		
		JLabel lblDue = new JLabel("Due ");
		lblDue.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblDue.setBounds(141, 337, 161, 16);
		contentPane.add(lblDue);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(241, 331, 235, 22);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantSection.main(new String[] {});
				FeeDue.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 13));
		btnNewButton.setBounds(379, 385, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnGenerateBill = new JButton("Generate Bill");
		btnGenerateBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filename=textField_1.getText();
				int roll=Integer.parseInt(textField.getText());
				
				Student s=studentdb.getStudentByRollno(roll);			
				write.tofile(s,filename);
			
				
			}
		});
		btnGenerateBill.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 13));
		btnGenerateBill.setBounds(141, 385, 214, 25);
		contentPane.add(btnGenerateBill);
	}

}
