package segundosemestre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela_mostrarnum extends JFrame {

	private JPanel contentPane;
	private JTextField textA;
	private JTextField textB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_mostrarnum frame = new tela_mostrarnum();
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
	public tela_mostrarnum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lbA = new JLabel("A:");
		
		JLabel lbB = new JLabel("B:");
		
		textA = new JTextField();
		textA.setColumns(10);
		
		textB = new JTextField();
		textB.setColumns(10);
		
		JButton btnNUM = new JButton("Mostrar N\u00FAmeros");
		btnNUM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String A = textA.getText();
				String B = textB.getText();
				
				int x = Integer.parseInt(A);
				int y = Integer.parseInt(B);
				String z= " ";
				
				for(int h=x;h<=y;h++) {
					if(h>x && h<y) {
						z = z  + " " + h;
					}
					
				}
				
				JOptionPane.showMessageDialog(contentPane, "números entre " + x + " e " + y + ":" + z);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(126, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lbB)
								.addComponent(lbA))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textA)
								.addComponent(textB, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
							.addGap(131))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnNUM)
							.addGap(148))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(87)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbA)
						.addComponent(textA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbB)
						.addComponent(textB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addComponent(btnNUM)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
