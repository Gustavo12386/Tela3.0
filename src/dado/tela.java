package dado;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import carro.Carro;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
public class tela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
    private Carro carronovo;
    private JTable table;
    private JTextField textField4;
    private JTextField textField5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela frame = new tela();
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
	public tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Carro c1 = new Carro();
		
		JLabel lbMarca = new JLabel("Marca:");
		lbMarca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lbModelo = new JLabel("Modelo:");
		lbModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		
		JLabel lbPlaca = new JLabel("Placa:");
		lbPlaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		
		JLabel lbNome_Cliente = new JLabel("Nome do Cliente:");
		lbNome_Cliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		
		JLabel lbTelefone = new JLabel("Telefone:");
		lbTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carronovo = trataEventoBotaoInserir(c1);
			}
		});
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pesquisa(carronovo);
			}
		});
		
		table = new JTable();
		
		textField4 = new JTextField();
		textField4.setText("( ) -");
		textField4.setColumns(10);
		
		JLabel lbFiltrar = new JLabel("Filtrar:");
		lbFiltrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField5 = new JTextField();
		textField5.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lbMarca)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lbModelo)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lbPlaca)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(textField5, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(btnPesquisar))
										.addComponent(textField2, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(156)
							.addComponent(btnInserir, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
							.addGap(179))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbTelefone)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField4, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbNome_Cliente)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField3, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbFiltrar)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbMarca)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbModelo)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbPlaca)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbFiltrar)
						.addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisar))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbNome_Cliente))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbTelefone))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnInserir, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public Carro trataEventoBotaoInserir(Carro c) {
		c.setMarca(textField.getText());
		c.setModelo(textField1.getText());
	    c.setPlaca(textField2.getText());
	    c.setNome_cliente(textField3.getText());
	    c.setTelefone(textField4.getText());
		textField.setText("");
		textField1.setText("");
		textField2.setText("");
		textField3.setText("");
		textField4.setText("");
		
		return c;
	}
	public void Pesquisa(Carro c) {
		System.out.println(c.getPlaca());
		if(textField5.getText().equals(c.getPlaca())) {
			textField.setText("");
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
		} else {
			 JOptionPane.showMessageDialog(this,"Carro não encontrado");
		}
}
}