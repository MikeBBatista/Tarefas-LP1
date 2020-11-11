package exercisesLP1;

import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WordsforList {

	private JFrame frame;
	private ArrayList<PalavraPt> palavra = new ArrayList<PalavraPt>();;
	private JTextField txt_word;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordsforList window = new WordsforList();
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
	public WordsforList() {
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
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PalavraPt word = new PalavraPt(txt_word.getText());
				palavra.add(word);
			}
		});
		btnSalvar.setBounds(98, 149, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		JLabel lblPalavra = new JLabel("Palavra");
		lblPalavra.setBounds(98, 63, 70, 14);
		frame.getContentPane().add(lblPalavra);
		
		txt_word = new JTextField();
		txt_word.setBounds(178, 60, 154, 20);
		frame.getContentPane().add(txt_word);
		txt_word.setColumns(10);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String word = txt_word.getText();
				Integer result = 0;
				for (int i = 0; i < palavra.size(); i++) {
					String compare = palavra.get(i).toString();
					if (compare.equals(word)) {
						result += 1;
					}
					else {
						result += 0;
					}
				}
				if (result == 0) {
					JOptionPane.showMessageDialog(frame, "A palavra " + txt_word.getText() + " ainda não foi cadastrada! ");
				}
				else if (result == 1) {
					JOptionPane.showMessageDialog(frame, "A palavra '" + txt_word.getText() + "' já foi cadastrada " + result + " vez.");
				}
				else {
					JOptionPane.showMessageDialog(frame, "A palavra '" + txt_word.getText() + "' já foi cadastrada " + result + " vezes.");
				}
				System.out.println(palavra);
			}
		});
		btnVerificar.setBounds(243, 149, 89, 23);
		frame.getContentPane().add(btnVerificar);
	}

}
