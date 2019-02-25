package com.smartpro.odev.calculator.program;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class HesapMakinesi {
	
	private static HesapMakinesi nesne;	
	private JFrame anaCerceve;
		
	public HesapMakinesi() {
		anaCerceve = new JFrame("Hesap Makinesi");
		anaCerceve.setSize(500, 500);
		anaCerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		anaCerceve.setLocationRelativeTo(null);
			
		JPanel anaPanel = new JPanel();	
		// RAKAMLARI OLUŞTUR
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				String butonAdi = Integer.toString(j+7-3*i);
				JButton buton = new JButton(butonAdi);
				anaPanel.add(buton);		
			}
		}
		//RAKAMLAR OLUŞTURULDU
		anaCerceve.add(anaPanel);
		
		anaCerceve.setVisible(true);


	}
	
	public void olustur() {
		
		// EKRANI OLUŞTUR
		// sJTextField ekran = new JTextField("MERHABA");
		//anaPanel.add(ekran);
		

						
	}
	
	public static HesapMakinesi getNESNE() {
		if(nesne==null) {nesne = new HesapMakinesi();}		
		return nesne;
	}
}
