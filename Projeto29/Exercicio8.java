package Projeto29;

import java.util.Scanner;

// O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
public class Exercicio8 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double custof,custoc;
		System.out.println("Entre com o custo de f�brica do carro: ");
		custof = ler.nextFloat();
		custoc = custof+(custof*0.73);
		
		System.out.printf("O custo do consumidor �: %.2f",custoc);
				
	}

}
