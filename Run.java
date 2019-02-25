package com.smartpro.ornek1.program;

import java.util.Scanner;

public class Run 
{

	public static void main(String[] args) 
	{
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz:");
		int num1 = klavye.nextInt();
		
		System.out.println("ikinci sayiyi giriniz:");
		int num2 = klavye.nextInt();
		
		int toplam = topla(num1, num2);			
		System.out.println("Toplama isleminin sonucu: " + toplam);
		
		
		cikar(num1, num2);
		
		System.out.println("Carpma isleminin sonucu: " + carp(num1, num2));
		
		double bolum = bol(num1, num2);
		System.out.println("Bolme isleminin sonucu: " + bolum);
		
		klavye.close();
	}

	private static double bol(int num1, int num2) 
	{
		return num1 / (double)num2;
	}

	private static int carp(int num1, int num2) 
	{
		int sonuc;
		sonuc = num1*num2;
		return sonuc;
	}

	private static void cikar(int num1, int num2) 
	{
		int fark = num1-num2;
		System.out.println("Cikarma isleminin sonucu: " + fark);
	}

	private static int topla(int num1, int num2) 
	{
		return num1+num2;
	}

}
