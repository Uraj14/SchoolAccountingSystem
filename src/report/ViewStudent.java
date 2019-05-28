package report;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.util.List;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewStudent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStudent frame = new ViewStudent();
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
	public ViewStudent() {
		List<Student> list=studentdb.view();
		int size=list.size();
		
		String data[][]=new String[size][13];
		int row=0;
		for(Student s:list){
			data[row][0]=String.valueOf(s.getroll());
			data[row][1]=s.getname();
			data[row][2]=s.getpass();
			data[row][3]=s.getemail();
			data[row][4]=s.getcourse();
			data[row][5]=String.valueOf(s.getfee());
			data[row][6]=String.valueOf(s.getpaid());
			data[row][7]=String.valueOf(s.getdue());
			data[row][8]=s.getadd();
			data[row][9]=s.getcity();
			data[row][10]=s.getstate();
			data[row][11]=s.getcount();
			data[row][12]=s.getcon();
			
			row++;
		}
		String columnNames[]={"Rollno","Name","Password","Email","Course","Fee","Paid","Due","Address","City","State","Country","Contact No"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		getContentPane().add(sp);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AccountantSection.main(new String[] {});
				ViewStudent.this.dispose();
				
			}
		});
		btnBack.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		sp.setRowHeaderView(btnBack);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
	}

}
