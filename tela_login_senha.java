package segundosemestre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela_login_senha extends JFrame {

	private JPanel contentPane;
	private JTextField textlogin;
	private JTextField textsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_login_senha frame = new tela_login_senha();
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
	public tela_login_senha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textlogin = new JTextField();
		textlogin.setColumns(10);
		
		textsenha = new JTextField();
		textsenha.setColumns(10);
		
		JLabel lblogin = new JLabel("Login:");
		
		JLabel lbsenha = new JLabel("Senha:");
		
		JButton btnok = new JButton("Ok");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			if("admin".equals(textlogin.getText()) && "swordfish".equals(textsenha.getText())) {
				JOptionPane.showMessageDialog(contentPane, "acesso permitido");	
			}
			else 
				JOptionPane.showMessageDialog(contentPane, "login ou senha inválidos");		
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblogin)
								.addComponent(lbsenha))
							.addGap(53)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textsenha)
								.addComponent(textlogin, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(178)
							.addComponent(btnok)))
					.addContainerGap(151, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(77)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblogin)
						.addComponent(textlogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbsenha)
						.addComponent(textsenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addComponent(btnok)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
