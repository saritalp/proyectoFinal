package co.uniquindio.programacion1.cuadrado.view;

import java.awt.EventQueue;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SubRegistro extends JFrame implements ActionListener {

	private JButton btnNewButton;
	private JPanel contentPane;
	private JTextField NombreText;
	private JTextField textId;
	private JTextField ApellidoText;
	private JTextField EdadText;
	private VentanaPrincipal vp;
	private ArrayList <ArrayList <String>> datosClientes = new ArrayList<>(5);
	
	/**
	 * Launch the application.
	 */
	/**
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { SubRegistro frame = new SubRegistro();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 * 
	 * /** Create the frame.
	 */
	public SubRegistro(VentanaPrincipal r) {
		vp = r;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);

		JLabel lblNewLabelId = new JLabel("Id");
		lblNewLabelId.setFont(new Font("Times New Roman", Font.PLAIN, 11));

		textId = new JTextField();
		textId.setColumns(45);

		JLabel lblNewLabelNombre = new JLabel("Nombre");
		lblNewLabelNombre.setFont(new Font("Times New Roman", Font.PLAIN, 11));

		NombreText = new JTextField();
		NombreText.setColumns(45);

		JLabel lblNewLabelApellido = new JLabel("Apellido");
		lblNewLabelApellido.setFont(new Font("Times New Roman", Font.PLAIN, 11));

		ApellidoText = new JTextField();
		ApellidoText.setColumns(45);

		JLabel lblNewLabelEdad = new JLabel("Edad");
		lblNewLabelEdad.setFont(new Font("Times New Roman", Font.PLAIN, 11));

		EdadText = new JTextField();
		EdadText.setColumns(45);

		JButton btnNewButtonCliente = new JButton("Guardar Cliente");
		btnNewButtonCliente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ArrayList<String> clientes = new ArrayList<>();
				String id = textId.getText();
				String Nombre = NombreText.getText();
				String Apellido = ApellidoText.getText();
				String Edad = EdadText.getText();
				clientes.add(id);
				clientes.add(Nombre);
				clientes.add(Apellido);
				clientes.add(Edad);
				datosClientes.add(clientes);
				JOptionPane.showMessageDialog(null, "Datos guardados");
				textId.setText("");
				NombreText.setText("");
				ApellidoText.setText("");
				EdadText.setText("");
			}
		});
		btnNewButtonCliente.setFont(new Font("Times New Roman", Font.PLAIN, 11));

		JButton btnNewButtonConsultas = new JButton("Realizar Consultas");
		btnNewButtonConsultas.setFont(new Font("Times New Roman", Font.PLAIN, 11));

		btnNewButton = new JButton("Regresar ventana principal");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton.addActionListener(this);
		

		JLabel lblNewLabel = new JLabel("Registro datos cliente");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(14)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup().addComponent(lblNewLabelEdad)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(EdadText, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(btnNewButtonCliente)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(btnNewButtonConsultas)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(btnNewButton))))
								.addGroup(gl_panel.createSequentialGroup().addContainerGap()
										.addComponent(lblNewLabelApellido).addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(ApellidoText, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup().addGap(20).addComponent(lblNewLabelId)
										.addGap(18).addComponent(textId, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup().addContainerGap()
										.addComponent(lblNewLabelNombre, GroupLayout.PREFERRED_SIZE, 37,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(NombreText,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup().addGap(151).addComponent(lblNewLabel)))
						.addContainerGap(27, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(27).addComponent(lblNewLabel).addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabelId).addComponent(
						textId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabelNombre).addComponent(
						NombreText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(15)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabelApellido)
						.addComponent(ApellidoText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabelEdad).addComponent(
						EdadText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButtonCliente)
						.addComponent(btnNewButtonConsultas).addComponent(btnNewButton))
				.addContainerGap(36, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
	}

	@SuppressWarnings("unused")
	private void SetImageLabel(JLabel labelName, String root) {
		ImageIcon image = new ImageIcon(root);
		Icon icon = new ImageIcon(
				image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
		labelName.setIcon(icon);
		this.repaint();

	}

	public void abrirVentaR() {
		vp.setVisible(false);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			vp.setVisible(true);
			this.setVisible(false);
		}
	}
}
