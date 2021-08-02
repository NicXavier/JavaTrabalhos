package Projeto29;

import java.util.Scanner;

//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
public class Exercicio2 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int idade,dias,meses,total;
		System.out.println("Digite sua idade em dias: ");
		total = ler.nextInt();
		idade = (total/365);
		meses = (total%365)/30;
		dias = (total%365)%30;
		
		System.out.println("Você viveu "+idade+" anos, "+meses+" meses e "+dias+" dias de vida.");
	}
}
