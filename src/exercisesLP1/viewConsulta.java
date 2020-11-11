package exercisesLP1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class viewConsulta {

	static JFrame frame;
	private static JTextField txtNome;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewConsulta window = new viewConsulta();
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
	public viewConsulta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(38, 63, 94, 46);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNome.setBounds(142, 67, 197, 46);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, acharPerfil());
			}
		});
		btnConsultar.setBounds(250, 167, 89, 46);
		frame.getContentPane().add(btnConsultar);
		
		JButton btnNewButton_1_1 = new JButton("Voltar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewPessoaMenu.frame.setVisible(true);
				viewConsulta.frame.dispose();
			}
		});
		btnNewButton_1_1.setBounds(118, 167, 89, 46);
		frame.getContentPane().add(btnNewButton_1_1);
	}
	public String acharPerfil(){
		String perfil = "";
		Pessoa[] person = new Pessoa[5];
		person[0] = new Pessoa("Perry", "Masculino", "Preto", "Verde", "1.77");
		person[1] = new Pessoa("Gabi", "Feminino", "Vermelho", "Castanho", "1.87");
		person[2] = new Pessoa("Rodolfo", "Masculino", "Azul", "Castanho", "1.69");
		person[3] = new Pessoa("Bella", "Feminino", "Castanho", "Azul", "1.73");
		person[4] = new Pessoa("Milena", "Feminino", "Amarelo", "Cinza", "1.90");
		for(int i=0; i < 5; i++) {
			System.out.print(person[i].getNome());
			if (person[i].getNome().equals(txtNome.getText())) {
				perfil = person[i].returnTudo();
				break;
			}
			else {
				perfil = "Perfil não encontrado!";
			}
		}
		return perfil;
	}

}
