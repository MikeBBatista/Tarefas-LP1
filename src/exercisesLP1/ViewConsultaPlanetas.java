package exercisesLP1;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewConsultaPlanetas {

	private JFrame frame;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewConsultaPlanetas window = new ViewConsultaPlanetas();
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
	public ViewConsultaPlanetas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Planetas Hábitaveis");
		frame.setResizable(false);
		frame.setSize(1305, 692);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSocorro = new JLabel("Nome do Planeta:");
		lblSocorro.setFont(new Font("Arial", Font.ITALIC, 32));
		lblSocorro.setForeground(Color.WHITE);
		lblSocorro.setBounds(212, 102, 259, 57);
		frame.getContentPane().add(lblSocorro);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 32));
		comboBox.setBounds(515, 118, 397, 29);
		comboBox.addItem("Selecione");
		comboBox.addItem("Kepler-438b");
		comboBox.addItem("Gliese 667 Cc");
		comboBox.addItem("KOI-3010.01");
		comboBox.addItem("Kepler-442b");
		comboBox.addItem("Kepler-62e");
		comboBox.addItem("Kepler-452b");
		comboBox.addItem("Gliese 832 c");
		frame.getContentPane().add(comboBox);
		
		JButton bntConsultar = new JButton("CONSULTAR");
		bntConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String itemselect = comboBox.getSelectedItem().toString();
				JOptionPane.showMessageDialog(null, planetInfo(itemselect));
			}
		});
		bntConsultar.setFont(new Font("Arial", Font.PLAIN, 32));
		bntConsultar.setBounds(515, 511, 397, 57);
		frame.getContentPane().add(bntConsultar);
		
		JLabel lblImage = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/planetarium.jpg")).getImage();
		lblImage.setIcon(new ImageIcon(img));
		lblImage.setIconTextGap(-745);
		lblImage.setBounds(0, 0, 1319, 663);
		frame.getContentPane().add(lblImage);



	}
	public String planetInfo(String item){
		String info = "";
		Planeta[] planet = new Planeta[7];
		planet[0] = new Planeta("Kepler-438b", "Quinto", "470", "2015");
		planet[1] = new Planeta("Gliese 667 Cc", "Primeiro", "23.6", "2011");
		planet[2] = new Planeta("KOI-3010.01", "Segundo", "1213.4", "2011");
		planet[3] = new Planeta("Kepler-442b", "Sexto", "1291.6", "2015");
		planet[4] = new Planeta("Kepler-62e", "Terceiro", "1199.7", "2013");
		planet[5] = new Planeta("Kepler-452b", "Sétimo", "1400", "2015");
		planet[6] = new Planeta("Gliese 832 c", "Quarto", "16.1", "2014");
		for(int i=0; i < 7; i++) {
			if (planet[i].getNome().equals(item)) {
				info = planet[i].returnInfo();
				break;
			}
			else {
				info = "Selecione um Planeta!";
			}
		}
		return info;
	}
}