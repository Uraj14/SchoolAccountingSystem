package report;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.util.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ViewAccountant extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAccountant frame = new ViewAccountant();
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
	public ViewAccountant() {
		
		List<Accountant> list=accountdb.view();
		int size=list.size();
		
		String data[][]=new String[size][5];
		int row=0;
		for(Accountant a:list){
			data[row][0]=String.valueOf(a.getid());
			data[row][1]=a.getname();
			data[row][2]=a.getpass();
			data[row][3]=a.getemail();
			data[row][4]=a.getcon();
			row++;
		}
		String columnNames[]={"Id","Name","Password","Email","Contact No"};
		getContentPane().setLayout(null);
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		sp.setBounds(0, 0, 782, 353);
		getContentPane().add(sp);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection.main(new String[] {});
				ViewAccountant.this.dispose();
			}
			
		});
		sp.setRowHeaderView(btnBack);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		
	}

}
