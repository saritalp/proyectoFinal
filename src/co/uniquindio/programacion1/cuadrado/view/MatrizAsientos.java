package co.uniquindio.programacion1.cuadrado.view;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

@SuppressWarnings("serial")
public class MatrizAsientos extends JFrame implements ActionListener {
	
		private JPanel contentPane;
		private JButton btnNewButton_1_1;
		private VentanaPrincipal vp;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		
		/**
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MatrizAsientos frame = new MatrizAsientos();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}*/

		public  MatrizAsientos (VentanaPrincipal m) {
			vp = m;
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 528, 347);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(240, 240, 240));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 255, 128));
			panel_1.setBounds(5, 23, 121, 125);
			contentPane.add(panel_1);
			panel_1.setLayout(new GridLayout(2, 2, 0, 0));
			JButton matrizBotonesPanel1[][] = new JButton[2][2];
			for(int i = 0; i < 2;i++) {
				for(int j = 0; j < 2; j++) {
					matrizBotonesPanel1[i][j] = new JButton(); 
					panel_1.add(matrizBotonesPanel1[i][j]);
					matrizBotonesPanel1[i][j].setText(""+(j+1));
				}
			}
			
			
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(255, 255, 128));
			panel_2.setBounds(217, 23, 121, 125);
			contentPane.add(panel_2);
			panel_2.setLayout(new GridLayout(2, 2, 0, 0));
			JButton matrizBotonesPanel2[][] = new JButton[2][2];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matrizBotonesPanel2[i][j] = new JButton();
					panel_2.add(matrizBotonesPanel2[i][j]);
					matrizBotonesPanel2[i][j].setText(""+(j+3));
				}
			}
			
			JPanel panel = new JPanel();
			panel.setBounds(5, 172, 333, 125);
			contentPane.add(panel);
			panel.setLayout(new GridLayout(7, 3, 0, 0));
			JButton matrizBotonesPanel[][] = new JButton[7][6];
			for(int i = 0; i < matrizBotonesPanel.length;i++) {
				for(int j = 0; j < matrizBotonesPanel[i].length;j++){
					matrizBotonesPanel[i][j] = new JButton();
					panel.add(matrizBotonesPanel[i][j]);
					matrizBotonesPanel[i][j].setText(""+(j+1));
				}
			}
			
			
			JLabel lblNewLabel = new JLabel("Disponible");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel.setBounds(369, 43, 60, 14);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Ocupado");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_1.setBounds(379, 73, 46, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Inactivo");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_2.setBounds(378, 98, 46, 14);
			contentPane.add(lblNewLabel_2);
			
			textField = new JTextField();
			textField.setBackground(new Color(0, 128, 0));
			textField.setBounds(348, 40, 22, 20);
			contentPane.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBackground(new Color(255, 0, 0));
			textField_1.setBounds(348, 70, 22, 20);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBackground(new Color(128, 128, 128));
			textField_2.setBounds(348, 95, 22, 20);
			contentPane.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("Estado del asiento:");
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_3.setBounds(348, 11, 101, 21);
			contentPane.add(lblNewLabel_3);
			
			JButton btnNewButton_1 = new JButton(" Reservar Asiento");
			btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			btnNewButton_1.setBounds(369, 185, 141, 23);
			
			contentPane.add(btnNewButton_1);
			
			btnNewButton_1_1 = new JButton("Volver Pantalla Principal");
			btnNewButton_1_1.addActionListener( this);
			btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			btnNewButton_1_1.setBounds(369, 232, 141, 23);
			contentPane.add(btnNewButton_1_1);
			
			JButton btnNewButton = new JButton("Inhabilitar Asiento");
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			btnNewButton.setBounds(369, 209, 141, 23);
			
			contentPane.add(btnNewButton);
			
			JLabel lblNewLabel_4 = new JLabel("A");
			lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_4.setBounds(10, -2, 46, 14);
			contentPane.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("B");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_5.setBounds(66, -2, 46, 14);
			contentPane.add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("E");
			lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_6.setBounds(217, -2, 46, 14);
			contentPane.add(lblNewLabel_6);
			
			JLabel lblNewLabel_8 = new JLabel("A");
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_8.setBounds(5, 159, 46, 14);
			contentPane.add(lblNewLabel_8);
			
			JLabel lblNewLabel_10 = new JLabel("C");
			lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_10.setBounds(129, 159, 46, 14);
			contentPane.add(lblNewLabel_10);
			
			JLabel lblNewLabel_11 = new JLabel("D");
			lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_11.setBounds(185, 159, 46, 14);
			contentPane.add(lblNewLabel_11);
			
			JLabel lblNewLabel_13 = new JLabel("F");
			lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_13.setBounds(283, 159, 46, 14);
			contentPane.add(lblNewLabel_13);
			
			JLabel lblNewLabel_5_1 = new JLabel("B");
			lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_5_1.setBounds(80, 159, 46, 14);
			contentPane.add(lblNewLabel_5_1);
			
			JLabel lblNewLabel_6_1 = new JLabel("E");
			lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_6_1.setBounds(227, 159, 46, 14);
			contentPane.add(lblNewLabel_6_1);
			
			JLabel lblNewLabel_13_1 = new JLabel("F");
			lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_13_1.setBounds(273, -2, 46, 14);
			contentPane.add(lblNewLabel_13_1);
			
			textField_3 = new JTextField();
			textField_3.setBackground(new Color(255, 255, 128));
			textField_3.setBounds(348, 123, 22, 20);
			contentPane.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel lblNewLabel_7 = new JLabel("VIP");
			lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			lblNewLabel_7.setBounds(379, 123, 46, 14);
			contentPane.add(lblNewLabel_7);
			
		}
		@SuppressWarnings("unused")
		private void SetImageLabel(JLabel labelName, String root) {
			ImageIcon image=new ImageIcon(root);
			Icon icon=new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(),labelName.getHeight() , Image.SCALE_DEFAULT));
			labelName.setIcon(icon);
			this.repaint();
					
		}
		
		public void abrirVentaA() {
			vp.setVisible(false);
			this.setVisible(true);
		}

public void actionPerformed(ActionEvent e) {
	if (e.getSource() == btnNewButton_1_1) {
		vp.setVisible(true);
		this.setVisible(false);
	}
}
}



	/**
	 * Launch the application.
	 */
	
