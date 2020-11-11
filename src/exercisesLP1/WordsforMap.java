package exercisesLP1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class WordsforMap {

	private JFrame frame;
	private JTextField txt_en;
	private JTextField txt_pt;
	private Map<String, PalavraPt> words = new HashMap<String, PalavraPt>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordsforMap window = new WordsforMap();
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
	public WordsforMap() {
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
		
		JLabel lblPalavra = new JLabel("Palavra:");
		lblPalavra.setBounds(70, 51, 46, 14);
		frame.getContentPane().add(lblPalavra);
		
		JLabel lblTraduo = new JLabel("Tradu\u00E7\u00E3o:");
		lblTraduo.setBounds(70, 111, 65, 14);
		frame.getContentPane().add(lblTraduo);
		
		txt_en = new JTextField();
		txt_en.setBounds(156, 48, 171, 20);
		frame.getContentPane().add(txt_en);
		txt_en.setColumns(10);
		
		txt_pt = new JTextField();
		txt_pt.setColumns(10);
		txt_pt.setBounds(156, 108, 171, 20);
		frame.getContentPane().add(txt_pt);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PalavraPt pt = new PalavraPt(txt_pt.getText());
				String eng = txt_en.getText();
				words.put(eng, pt);
				System.out.println(words);
			}
		});
		btnSave.setBounds(82, 179, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnVoltar = new JButton("Consultar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Tradução da palavra " + txt_en.getText() + " é: " + words.get(txt_en.getText()));
			}
		});
		btnVoltar.setBounds(208, 179, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
	}
}
