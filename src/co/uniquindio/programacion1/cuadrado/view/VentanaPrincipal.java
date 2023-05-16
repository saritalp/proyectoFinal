package co.uniquindio.programacion1.cuadrado.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnNewButton_2 = new JButton("Confiteria");
	private Confiteria vc;
	JButton btnNewButton_3 = new JButton("Asientos");
	private MatrizAsientos vm;
	JButton btnNewButton = new JButton("Registro");
	private SubRegistro vr;
	JButton btnNewButton_1 = new JButton("Usuario");
	private SubUsuario vu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Aerolinea Paisita");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 141, 59);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(141, 0, 141, 59);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(282, 0, 141, 59);
		panel.add(label_2);
		
		
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_3.setBounds(80, 59, 141, 59);
		btnNewButton_3.addActionListener(this);
		panel.add(btnNewButton_3);
		
		
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(220, 59, 141, 59);
		panel.add(btnNewButton);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(0, 118, 141, 59);
		panel.add(label_4);
		
		
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(80, 118, 141, 59);
		btnNewButton_1.addActionListener(this);
		panel.add(btnNewButton_1);
		
		
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2.setBounds(220, 118, 141, 59);
		btnNewButton_2.addActionListener(this);
		panel.add(btnNewButton_2);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(0, 177, 141, 59);
		panel.add(label_5);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnNewButton_2) {
			vc = new Confiteria(this);
			vc.abrirVenta();
			
		
		}
			
		if (e.getSource() == btnNewButton_3) {
				vm = new MatrizAsientos(this);
				vm.abrirVentaA();
				
			}
		if (e.getSource() == btnNewButton) {
			vr = new SubRegistro(this);
			vr.abrirVentaR();
		
		}
		if (e.getSource() == btnNewButton_1) {
			vu = new SubUsuario(this);
			vu.abrirVentaU();
		
		}
			
}
}
