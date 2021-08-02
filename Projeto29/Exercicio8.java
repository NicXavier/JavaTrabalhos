package Projeto29;

import java.util.Scanner;

// O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
public class Exercicio8 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double custof,custoc;
		System.out.println("Entre com o custo de fábrica do carro: ");
		custof = ler.nextFloat();
		custoc = custof+(custof*0.73);
		
		System.out.printf("O custo do consumidor é: %.2f",custoc);
				
	}

}
