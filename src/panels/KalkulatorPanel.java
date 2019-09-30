package panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KalkulatorPanel extends JPanel {
	
	JLabel label;
	JTextField tfAngka1;
	JTextField tfAngka2;
	JLabel labelHasil;
	JButton btnPengurangan;
	JButton btnKalkulasi;
	JButton btnBagi;
	JButton btnKali;
	
	
	public KalkulatorPanel() {
		
		label = new JLabel("Inputkan Angka");
		
		
		tfAngka1 = new JTextField();
		tfAngka2 = new JTextField();
		labelHasil = new JLabel("0");
		btnKalkulasi = new JButton("Kalkulasi");
		btnPengurangan = new JButton("Pengurangan");
		btnKali = new JButton("Perkalian");
		btnBagi = new JButton("Bagi");
		tfAngka1.setColumns(12);
		tfAngka2.setColumns(12);
		labelHasil.setFont(new Font(null, 0, 20));
		labelHasil.setForeground(Color.RED);
	
	
	btnKalkulasi.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int angka1 = Integer.valueOf(tfAngka1.getText().toString());
			int angka2 = Integer.valueOf(tfAngka2.getText().toString());
			int hasil = angka1 + angka2;
			labelHasil.setText(String.valueOf(hasil));
		}
		});
	
	btnPengurangan.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int angka1 = Integer.valueOf(tfAngka1.getText().toString());
			int angka2 = Integer.valueOf(tfAngka2.getText().toString());
			int hasil = angka1 - angka2;
			labelHasil.setText(String.valueOf(hasil));
		}
		});
	
	btnKali.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int angka1 = Integer.valueOf(tfAngka1.getText().toString());
			int angka2 = Integer.valueOf(tfAngka2.getText().toString());
			int hasil = angka1 * angka2;
			labelHasil.setText(String.valueOf(hasil));
		}
		});
	
	btnBagi.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int angka1 = Integer.valueOf(tfAngka1.getText().toString());
			int angka2 = Integer.valueOf(tfAngka2.getText().toString());
			int hasil = angka1 / angka2;
			labelHasil.setText(String.valueOf(hasil));
	}
	});

    add(label);
	add(tfAngka1);
	add(tfAngka2);
	add(btnKalkulasi);
	add(btnPengurangan);
	add(btnKali);
	add(btnBagi);
	add(labelHasil);
	}
	
}
