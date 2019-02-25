package com.smartpro.odev.calculator.program;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener
{
	static double sayi1,sayi2,sonuc=0;
	static int operator=0;
	
	static JFrame anaFrame ;
	JPanel anaPanel;
	JTextField sayiGiris;
	JButton btnSifir,btnBir,btnIki,btnUc,btnDort,btnBes,btnAlti,btnYedi,btnSekiz,btnDokuz
	,btnToplama,btnCikarma,btnCarpma,btnBolme,btnSilme,btnTemizle,btnEsittir,btnNokta,btnYuzde,btnCe,btnArtiEksi,btnKarakok;
	public Calculator()
	{
		
		
		anaFrame=new JFrame("Calculator");
		anaPanel=new JPanel();
		sayiGiris=new JTextField();
		btnSifir=new JButton("0");
		btnBir = new JButton("1");
		btnIki = new JButton("2");
		btnUc= new JButton("3");
		btnDort = new JButton("4");
		btnBes = new JButton("5");
		btnAlti = new JButton("6");
		btnYedi = new JButton("7");
		btnSekiz = new JButton("8");
		btnDokuz = new JButton("9");
		btnCikarma = new JButton("-");
		btnToplama = new JButton("+");
		btnCarpma = new JButton("*");
		btnBolme = new JButton("/");
		btnSilme = new JButton("◀");
		btnTemizle = new JButton("C");
		btnEsittir= new JButton("=");		
		btnNokta = new JButton(".");
		btnCe= new JButton("CE");
		btnArtiEksi= new JButton("±");
		
		//Renk Düzenlenmesi
		sayiGiris.setFont(new Font("Verdana",Font.BOLD,40));
		btnBir.setFont(new Font("Verdana",Font.BOLD,12));
		btnIki.setFont(new Font("Verdana",Font.BOLD,12));
		btnUc.setFont(new Font("Verdana",Font.BOLD,12));
		btnDort.setFont(new Font("Verdana",Font.BOLD,12));
		btnBes.setFont(new Font("Verdana",Font.BOLD,12));
		btnAlti.setFont(new Font("Verdana",Font.BOLD,12));
		btnYedi.setFont(new Font("Verdana",Font.BOLD,12));
		btnSekiz.setFont(new Font("Verdana",Font.BOLD,12));
		btnDokuz.setFont(new Font("Verdana",Font.BOLD,12));
		btnSifir.setFont(new Font("Verdana",Font.BOLD,12));
		
		btnIki.setBackground(Color.gray);
		btnUc.setBackground(Color.gray);
		btnDort.setBackground(Color.gray);
		btnBes.setBackground(Color.gray);
		btnAlti.setBackground(Color.gray);
		btnYedi.setBackground(Color.gray);
		btnSekiz.setBackground(Color.gray);
		btnDokuz.setBackground(Color.gray);
		btnSifir.setBackground(Color.gray);
		btnBir.setBackground(Color.gray);
				
		anaFrame.getContentPane().setBackground(Color.lightGray);
		//EKleme
		
		anaFrame.add(sayiGiris,BorderLayout.NORTH);
		//1.rows
		
		anaPanel.add(btnCe);
		anaPanel.add(btnTemizle);
		anaPanel.add(btnSilme);
		anaPanel.add(btnBolme);
		//2.rows
		anaPanel.add(btnYedi);
		anaPanel.add(btnSekiz);
		anaPanel.add(btnDokuz);
		anaPanel.add(btnCarpma);
		//3.rows
		anaPanel.add(btnDort);
		anaPanel.add(btnBes);
		anaPanel.add(btnAlti);
		anaPanel.add(btnCikarma);
		//4.rows
		anaPanel.add(btnBir);
		anaPanel.add(btnIki);
		anaPanel.add(btnUc);
		anaPanel.add(btnToplama);
		//5.rows
		anaPanel.add(btnArtiEksi);
		anaPanel.add(btnSifir);
		anaPanel.add(btnNokta);
		anaPanel.add(btnEsittir);
		
		//frame düzenleme
		
		
		
		
	
		anaPanel.setLayout(new GridLayout(5, 4));
		anaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		anaFrame.pack();
		anaFrame.setResizable(false);
		anaFrame.setSize(500,500);
		anaFrame.add(anaPanel);
		anaFrame.setVisible(true);
		anaPanel.setVisible(true);
		
		btnBir.addActionListener(this);
		btnSifir.addActionListener(this);
		btnIki.addActionListener(this);
		btnUc.addActionListener(this);
		btnBes.addActionListener(this);
		btnDort.addActionListener(this);
		btnAlti.addActionListener(this);
		btnYedi.addActionListener(this);
		btnSekiz.addActionListener(this);
		btnDokuz.addActionListener(this);
		btnCarpma.addActionListener(this);
		btnToplama.addActionListener(this);
		btnCikarma.addActionListener(this);
		btnBolme.addActionListener(this);
		btnEsittir.addActionListener(this);
		btnSilme.addActionListener(this);
		btnTemizle.addActionListener(this);
		sayiGiris.addActionListener(this);
		btnNokta.addActionListener(this);
	
			
	}




	@Override
	public void actionPerformed(ActionEvent e) 
	{

		if(e.getSource()==btnBir)
			sayiGiris.setText(sayiGiris.getText().concat("1"));
		
		if(e.getSource()==btnIki)
			sayiGiris.setText(sayiGiris.getText().concat("2"));
		
		if(e.getSource()==btnUc)
			sayiGiris.setText(sayiGiris.getText().concat("3"));
		
		if(e.getSource()==btnDort)
			sayiGiris.setText(sayiGiris.getText().concat("4"));
		
		if(e.getSource()==btnBes)
			sayiGiris.setText(sayiGiris.getText().concat("5"));
		
		if(e.getSource()==btnAlti)
			sayiGiris.setText(sayiGiris.getText().concat("6"));
		
		if(e.getSource()==btnYedi)
			sayiGiris.setText(sayiGiris.getText().concat("7"));
		
		if(e.getSource()==btnSekiz)
			sayiGiris.setText(sayiGiris.getText().concat("8"));
		
		if(e.getSource()==btnDokuz)
			sayiGiris.setText(sayiGiris.getText().concat("9"));
		
		if(e.getSource()==btnSifir)
			sayiGiris.setText(sayiGiris.getText().concat("0"));
		
		if(e.getSource()==btnNokta)
			sayiGiris.setText(sayiGiris.getText().concat("."));
		
		if(e.getSource()==btnToplama)
		{
			sayi1=Integer.parseInt(sayiGiris.getText());
			operator=1;
			sayiGiris.setText("");
		} 
		
		
		if(e.getSource()==btnCikarma)
		{
			sayi1=Integer.parseInt(sayiGiris.getText());
			operator=2;
			sayiGiris.setText("");
		}
		
		if(e.getSource()==btnCarpma)
		{
			sayi1=Integer.parseInt(sayiGiris.getText());
			operator=3;
			sayiGiris.setText("");
		}
		
		if(e.getSource()==btnBolme)
		{
			sayi1=Integer.parseInt(sayiGiris.getText());
			operator=4;
			sayiGiris.setText("");
		}
		if(e.getSource()==btnYuzde)
		{
		sayi1=Integer.parseInt(sayiGiris.getText());
		operator=5;
		sayiGiris.setText("");
		}
		if(e.getSource()==btnArtiEksi)
		{
			
			double artiEksi=Double.parseDouble(String.valueOf(sayiGiris.getText()));
			
			artiEksi*=-1;
			
			sayiGiris.setText(String.valueOf(artiEksi));
			
		}
		
		if(e.getSource()==btnEsittir)
		{
			sayi2=Integer.parseInt(sayiGiris.getText());
		
			switch(operator)
			{
				case 1: sonuc=sayi1+sayi2;
					break;
		
				case 2: sonuc=sayi1-sayi2;
					break;
		
				case 3: sonuc=sayi1*sayi2;
					break;
		
				case 4: sonuc=sayi1/sayi2;
					break;
				case 5: sonuc=sayi1%sayi2;
					break;
		
				default: sonuc=0;
			}
		
			sayiGiris.setText(""+sonuc);
		}
		
		if(e.getSource()==btnTemizle)
			sayiGiris.setText("");
			sayiGiris.requestFocus();
		
		if(e.getSource()==btnSilme)
		{
			String s=sayiGiris.getText();
			sayiGiris.setText("");
			for(int i=0;i<s.length()-1;i++)
				sayiGiris.setText(sayiGiris.getText()+s.charAt(i));
		}		
			
		}
		
	
	}




	

	
	
	
	

