package pekan7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class Aritmatika {

	private JFrame frame;
	private JTextField A;
	private JTextField B;
	private JTextField C;
	private JButton op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aritmatika window = new Aritmatika();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aritmatika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 351, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		A = new JTextField();
		A.setBounds(117, 30, 107, 34);
		frame.getContentPane().add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setColumns(10);
		B.setBounds(117, 124, 107, 34);
		frame.getContentPane().add(B);
		
		C = new JTextField();
		C.setColumns(10);
		C.setBounds(115, 287, 109, 26);
		frame.getContentPane().add(C);
		
		JLabel lblNewLabel = new JLabel("hasil");
		lblNewLabel.setBounds(153, 264, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox OPcb = new JComboBox();
		OPcb.setFont(new Font("STSong", Font.PLAIN, 10));
		OPcb.setModel(new DefaultComboBoxModel(new String[] {"pilih", "+", "-", "*", "/", "%"}));
		OPcb.setToolTipText("");
		OPcb.setBounds(87, 74, 165, 26);
		frame.getContentPane().add(OPcb);
		
		op = new JButton("Proses");
		op.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int A1= Integer.parseInt(A.getText());
				int A2= Integer.parseInt(B.getText());
				int hasil;
				int op= OPcb.getSelectedIndex();
				if(op == 1) {
					hasil = A1+A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 2) {
					hasil = A1-A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 3) {
					hasil = A1*A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 4) {
					hasil = A1/A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 5) {
					hasil = A1%A2;
					C.setText(String.valueOf(hasil));
			}
				
			}});
		op.setBounds(117, 168, 107, 34);
		frame.getContentPane().add(op);
	}	}
	

