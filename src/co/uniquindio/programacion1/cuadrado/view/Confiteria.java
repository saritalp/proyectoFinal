package co.uniquindio.programacion1.cuadrado.view;

import java.awt.EventQueue;

import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;


import javax.swing.Icon;

import java.awt.Font;
import javax.swing.SwingConstants;


public class Confiteria extends JFrame implements ActionListener { 

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=281,-31
	 */
	private final JPanel contentPane_1 = new JPanel();
	@SuppressWarnings("unused")
	private JButton btnNewButton_7;
	private VentanaPrincipal vp;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confiteria frame = new Confiteria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//this.setLocationRelativeTo(this);
		
	}*/

	/**
	 * Create the frame.
	 * 
	 */
	int contadorVino=0;
	int contadorAlmuerzo=0;
	int contadorDesayuno=0;
	int contadorPostre=0;
	int contadorCafe=0;
	int contadorGaseosa=0;
	public Confiteria(VentanaPrincipal p) {
		vp = p;
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton BotonAlmuerzo_1 = new JButton("New button");
		BotonAlmuerzo_1.setBounds(178, 23, 106, 89);
		contentPane_1.add(BotonAlmuerzo_1);
		
		JButton BotonVino_1 = new JButton("New button");
		BotonVino_1.setBounds(344, 146, 99, 89);
		contentPane_1.add(BotonVino_1);
		
		JButton BotonDesayuno_1 = new JButton("");
		BotonDesayuno_1.setBounds(32, 23, 106, 89);
		contentPane_1.add(BotonDesayuno_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(344, 23, 99, 76);
		contentPane_1.add(label_1);
		
		JButton BotonPostre_1 = new JButton("");
		BotonPostre_1.setBounds(331, 23, 112, 89);
		contentPane_1.add(BotonPostre_1);
		
		JButton BotonCafe_1 = new JButton("New button");
		BotonCafe_1.setBounds(32, 143, 106, 95);
		contentPane_1.add(BotonCafe_1);
		
		JLabel lblVino_1 = new JLabel("Vino");
		lblVino_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblVino_1.setBounds(446, 128, -3, 125);
		contentPane_1.add(lblVino_1);
		
		JButton BotonGaseosa_1 = new JButton("New button");
		BotonGaseosa_1.setBounds(178, 143, 106, 95);
		contentPane_1.add(BotonGaseosa_1);
		
		JLabel lblNewLabel_5 = new JLabel("Confiteria");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(178, -2, 92, 14);
		contentPane_1.add(lblNewLabel_5);
		
		JButton btnNewButton_8 = new JButton("Desayuno");
		btnNewButton_8.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_8.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_8.setBounds(29, 110, 77, 23);
		contentPane_1.add(btnNewButton_8);
		
		JButton btnNewButton_1_1 = new JButton("Almuerzo");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_1_1.setBounds(178, 109, 77, 23);
		contentPane_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Postre");
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_2_1.setBounds(331, 112, 68, 23);
		contentPane_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("Caf\u00E9");
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_3_1.setBounds(32, 238, 62, 23);
		contentPane_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("Gaseosa");
		btnNewButton_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_4_1.setBounds(178, 238, 77, 23);
		contentPane_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("Vino");
		btnNewButton_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_5_1.setBounds(344, 238, 62, 23);
		contentPane_1.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cant");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(110, 114, 46, 14);
		contentPane_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cant");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(256, 114, 46, 14);
		contentPane_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Cant");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(409, 114, 46, 14);
		contentPane_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("0");
		lblNewLabel_4_1.setBounds(134, 114, 46, 14);
		contentPane_1.add(lblNewLabel_4_1);
		
		JButton btnNewButton_6_1 = new JButton("Pagar");
		btnNewButton_6_1.setBounds(220, 272, 89, 23);
		contentPane_1.add(btnNewButton_6_1);
		
		
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Cant");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2_1_1.setBounds(92, 242, 46, 14);
		contentPane_1.add(lblNewLabel_2_1_1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel labelAlmuerzo = new JLabel("0");
		labelAlmuerzo.setBounds(321, 181, 46, 14);
		contentPane.add(labelAlmuerzo);
	
		JButton BotonAlmuerzo = new JButton("New button");
		BotonAlmuerzo.setBounds(208, 81, 120, 89);
		ImageIcon icono1=new ImageIcon("C:\\Users\\Sarita\\Downloads\\Almuerzo.jpeg");
		BotonAlmuerzo.setIcon(icono1);
		@SuppressWarnings("unused")
		Icon iconouno= new ImageIcon(icono1.getImage().getScaledInstance(BotonAlmuerzo.getWidth(), BotonAlmuerzo.getHeight(),Image.SCALE_DEFAULT));
		
		BotonAlmuerzo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contadorAlmuerzo++;
				labelAlmuerzo.setText("" + contadorAlmuerzo);
				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(BotonAlmuerzo);
		
				
		JLabel labelDesayuno = new JLabel("0");
		labelDesayuno.setBounds(143, 181, 46, 14);
		contentPane.add(labelDesayuno);
		
		JButton BotonDesayuno = new JButton("");
		BotonDesayuno.setBounds(32, 81, 120, 89);
		ImageIcon icono2 = new ImageIcon("C:\\Users\\Sarita\\Downloads\\Desayuno.jpg");
		BotonDesayuno.setIcon(icono2);
		@SuppressWarnings("unused")
		Icon iconodos= new ImageIcon(icono2.getImage().getScaledInstance(BotonDesayuno.getWidth(), BotonDesayuno.getHeight(),Image.SCALE_DEFAULT));
		BotonDesayuno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					contadorDesayuno++;
					labelDesayuno.setText("" + contadorDesayuno);
					
					
				}
			});
		contentPane.add(BotonDesayuno);
		
		JLabel labelVino = new JLabel("0");
		labelVino.setBounds(501, 326, 46, 14);
		contentPane.add(labelVino);
		
		JButton BotonVino = new JButton("New button");
		BotonVino.setBounds(388, 226, 120, 89);
		ImageIcon icono6=(new ImageIcon("C:\\Users\\Sarita\\Downloads\\Vino.jpeg"));
		BotonVino.setIcon(icono6);
		@SuppressWarnings("unused")
		Icon iconoseis= new ImageIcon(icono6.getImage().getScaledInstance(BotonVino.getWidth(), BotonVino.getHeight(),Image.SCALE_DEFAULT));
		BotonVino.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contadorVino++;
				labelVino.setText("" + contadorVino);
				
				
			}
		});
		contentPane.add(BotonVino);
	
		JLabel labelPostre = new JLabel("0");
		labelPostre.setBounds(487, 181, 46, 14);
		contentPane.add(labelPostre);
		
		JButton BotonPostre = new JButton("");
		BotonPostre.setBounds(385, 81, 112, 89);
		ImageIcon icono3=new ImageIcon("C:\\Users\\Sarita\\Downloads\\Postres.jpg");
		BotonPostre.setIcon(icono3);
		BotonPostre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						contadorPostre++;
						labelPostre.setText("" + contadorPostre);
						
				
			}
		});
		@SuppressWarnings("unused")
		Icon iconotres= new ImageIcon(icono3.getImage().getScaledInstance(BotonPostre.getWidth(), BotonPostre.getHeight(),Image.SCALE_DEFAULT));
		
		JLabel label = new JLabel("");
		label.setBounds(398, 94, 99, 76);
		contentPane.add(label);
		contentPane.add(BotonPostre);
		
		JLabel labelCafe = new JLabel("0");
		labelCafe.setBounds(121, 326, 46, 14);
		contentPane.add(labelCafe);
		
		JButton BotonCafe = new JButton("New button");
		BotonCafe.setBounds(32, 223, 120, 95);
		ImageIcon icono4=new ImageIcon("C:\\Users\\Sarita\\Downloads\\Cafe.jpeg");
		BotonCafe.setIcon(icono4);
		@SuppressWarnings("unused")
		Icon iconocuatro= new ImageIcon(icono4.getImage().getScaledInstance(BotonCafe.getWidth(), BotonCafe.getHeight(),Image.SCALE_DEFAULT));
		contentPane.add(BotonCafe);
		BotonCafe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contadorCafe++;
				labelCafe.setText("" + contadorCafe);
				
			}
		});
		
		JLabel labelGaseosa = new JLabel("0");
		labelGaseosa.setBounds(307, 326, 46, 14);
		contentPane.add(labelGaseosa);
	
		JButton BotonGaseosa = new JButton("New button");
		BotonGaseosa.setBounds(210, 223, 118, 95);
		ImageIcon icono5=new ImageIcon("C:\\Users\\Sarita\\Downloads\\Gaseosas.jpeg");
		BotonGaseosa.setIcon(new ImageIcon("C:\\Users\\Sarita\\Downloads\\WhatsApp Image 2023-04-29 at 5.29.49 PM.jpeg"));
		@SuppressWarnings("unused")
		Icon iconocinco= new ImageIcon(icono5.getImage().getScaledInstance(BotonGaseosa.getWidth(), BotonGaseosa.getHeight(),Image.SCALE_DEFAULT));
		BotonGaseosa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contadorGaseosa++;
				labelGaseosa.setText("" + contadorGaseosa);
				
				
			}
		});
		JLabel lblVino = new JLabel("Vino");
		lblVino.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblVino.setBounds(446, 128, -3, 125);
		contentPane.add(lblVino);
		contentPane.add(BotonGaseosa);
		
		JLabel lblNewLabel = new JLabel("Confiteria");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(236, 31, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cant");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(121, 181, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cant");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(296, 181, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cant");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(462, 181, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		
		
		JButton btnNewButton_6 = new JButton("Pagar");
		btnNewButton_6.setBounds(296, 368, 89, 23);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("Volver pantalla principal");
		btnNewButton_7.addActionListener(this);
		btnNewButton_7.setBounds(409, 368, 156, 23);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cant");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(92, 326, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Cant");
		lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2_1_2.setBounds(282, 326, 46, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Cant");
		lblNewLabel_2_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2_1_3.setBounds(465, 326, 46, 14);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_4 = new JLabel("Desayuno $15000");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(31, 181, 92, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Almuerzo $25000");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(210, 181, 85, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Postre $10000");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(388, 181, 74, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Cafe $4000");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(32, 326, 56, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Gaseosa $5000");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(207, 326, 77, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Vino $20000");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(388, 326, 67, 14);
		contentPane.add(lblNewLabel_10);
		

	}
	@SuppressWarnings("unused")
	private void SetImageLabel(JLabel labelName, String root) {
		ImageIcon image=new ImageIcon(root);
		Icon icon=new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(),labelName.getHeight() , Image.SCALE_DEFAULT));
		labelName.setIcon(icon);
		this.repaint();
				
	}
	
	public void abrirVenta() {
		vp.setVisible(false);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_7) {
			vp.setVisible(true);
			this.setVisible(false);
		}
		
	}
}
