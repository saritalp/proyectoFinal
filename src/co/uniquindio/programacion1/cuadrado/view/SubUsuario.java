package co.uniquindio.programacion1.cuadrado.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class SubUsuario extends JFrame implements ActionListener {
	private JButton btnNewButtonVentanaPral;
	private JPanel contentPane;
	private JTextField textFieldIdMayor;
	private JTextField textFieldEdadProm;
	private VentanaPrincipal vp;
	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubUsuario frame = new SubUsuario();
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
	public SubUsuario(VentanaPrincipal u){
		vp=u;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		contentPane.add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblNewLabelConsultas = new JLabel("Consultas");
		lblNewLabelConsultas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabelConsultas.setHorizontalAlignment(SwingConstants.LEFT);
		panelSuperior.add(lblNewLabelConsultas);
		
		JPanel panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		
		JLabel lblNewLabelEdadPromedio = new JLabel("Nombre Usuario");
		lblNewLabelEdadPromedio.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		panelCentral.add(lblNewLabelEdadPromedio);
		
		textFieldEdadProm = new JTextField();
		panelCentral.add(textFieldEdadProm);
		textFieldEdadProm.setColumns(40);
		
		JLabel lblNewLabelIdmayor = new JLabel("Id del Usuario");
		lblNewLabelIdmayor.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		panelCentral.add(lblNewLabelIdmayor);
		
		textFieldIdMayor = new JTextField();
		panelCentral.add(textFieldIdMayor);
		textFieldIdMayor.setColumns(40);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelCentral.add(btnNewButton);
		
		btnNewButtonVentanaPral = new JButton("Volver ventana Principal");
		btnNewButtonVentanaPral.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButtonVentanaPral.addActionListener(this);
		panelCentral.add(btnNewButtonVentanaPral);
	}
	@SuppressWarnings("unused")
	private void SetImageLabel(JLabel labelName, String root) {
		ImageIcon image=new ImageIcon(root);
		Icon icon=new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(),labelName.getHeight() , Image.SCALE_DEFAULT));
		labelName.setIcon(icon);
		this.repaint();
				
	}
	
	public void abrirVentaU() {
		vp.setVisible(false);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButtonVentanaPral ) {
			vp.setVisible(true);
			this.setVisible(false);
		}
		
}
}
