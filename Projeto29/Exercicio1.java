package Projeto29;

import java.util.Scanner;

//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias
public class Exercicio1 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int idade,dias,meses;
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		System.out.println("Digite quantos meses: ");
		meses = ler.nextInt();
		System.out.println("Digite quantos dias: ");
		dias = ler.nextInt();

		System.out.println("Você viveu :"+(idade*365)+" dias de vida.");
		
	}
	
	
	
}
