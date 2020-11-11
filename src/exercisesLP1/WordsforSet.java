package exercisesLP1;

import java.awt.EventQueue;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordsforSet {

	private JFrame frame;
	private Set<PalavraEn> palavra = new HashSet<PalavraEn>();
	private JTextField txt_word;
	private JTextField txt_trad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordsforSet window = new WordsforSet();
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
	public WordsforSet() {
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
		
		txt_word = new JTextField();
		txt_word.setBounds(207, 60, 145, 20);
		frame.getContentPane().add(txt_word);
		txt_word.setColumns(10);
		
		txt_trad = new JTextField();
		txt_trad.setBounds(207, 117, 145, 20);
		frame.getContentPane().add(txt_trad);
		txt_trad.setColumns(10);
		
		JLabel lblWord = new JLabel("Word:");
		lblWord.setBounds(108, 63, 46, 14);
		frame.getContentPane().add(lblWord);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PalavraEn word = new PalavraEn(txt_word.getText(), txt_trad.getText());
				if (palavra.contains(word)) {
					JOptionPane.showMessageDialog(frame, "Palavra já cadastrada!");
				}
				else {
				palavra.add(word);
				}
				System.out.println(palavra);
			}
		});
		btnSave.setBounds(108, 170, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnTraduzir = new JButton("Traduzir");
		btnTraduzir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String word = txt_word.getText();
				Integer result = 0;
				for(Iterator<PalavraEn> itr = palavra.iterator(); itr.hasNext();) {
					PalavraEn compare = itr.next();
					if (compare.getWord().contains(word)) {
						JOptionPane.showMessageDialog(frame, "Palavra: " + word + "\nTradução: " + compare.getTrad().toString());
						result += 1;
						break;
					}
				}
				if (result == 0) {
					JOptionPane.showMessageDialog(frame, "Palavra não cadastrada");
				}
			}
		});
		btnTraduzir.setBounds(263, 170, 89, 23);
		frame.getContentPane().add(btnTraduzir);
		
		JLabel lblTraduo = new JLabel("Tradu\u00E7\u00E3o");
		lblTraduo.setBounds(108, 120, 73, 14);
		frame.getContentPane().add(lblTraduo);
	}
}
