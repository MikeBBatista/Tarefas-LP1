package exercisesLP1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewPessoa {

	static JFrame frame;
	private JTextField txtNome;
	private JTextField txtCabelo;
	private JTextField txtOlhos;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewPessoa window = new viewPessoa();
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
	public viewPessoa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(22, 56, 46, 25);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(113, 58, 137, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(22, 93, 46, 14);
		frame.getContentPane().add(lblSexo);
		
		JLabel lblNewLabel_2 = new JLabel("Cor do Cabelo");
		lblNewLabel_2.setBounds(22, 121, 81, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cor dos Olhos");
		lblNewLabel_3.setBounds(22, 146, 81, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(113, 90, 137, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Selecione");
		comboBox.addItem("Masculino");
		comboBox.addItem("Feminino");
		
		txtCabelo = new JTextField();
		txtCabelo.setBounds(113, 118, 137, 20);
		frame.getContentPane().add(txtCabelo);
		txtCabelo.setColumns(10);
		
		txtOlhos = new JTextField();
		txtOlhos.setBounds(113, 143, 137, 20);
		frame.getContentPane().add(txtOlhos);
		txtOlhos.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(22, 171, 46, 14);
		frame.getContentPane().add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(113, 174, 137, 20);
		frame.getContentPane().add(txtAltura);
		txtAltura.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pessoa person = new Pessoa(txtNome.getText(), comboBox.getSelectedItem().toString(), txtCabelo.getText(), txtOlhos.getText(), txtAltura.getText());
				JOptionPane.showMessageDialog(null, person.returnTudo());
			}
		});
		btnCadastrar.setBounds(147, 216, 91, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnCadastrar_1 = new JButton("Voltar");
		btnCadastrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewPessoaMenu menu = new viewPessoaMenu();
				menu.frame.setVisible(true);
				viewPessoa.frame.dispose();
			}
		});
		btnCadastrar_1.setBounds(44, 216, 91, 23);
		frame.getContentPane().add(btnCadastrar_1);
	}
}
