package Projeto29;

import java.util.Scanner;

//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa 
		//em segundos e mostre-o expresso em horas, minutos e segundos.
public class Exercicio3 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int duracao,horas,minutos,segundos;
		System.out.println("Entre com tempo de duração da reunião em segundos: ");
		duracao = ler.nextInt();
		horas = (duracao / 3600);
		minutos = (duracao % 3600) / 60;
		segundos = (duracao % 3600) % 60;
		
		System.out.println("A reunião durou: "+horas+" minutos "+minutos+" segundos.");

	}
}
