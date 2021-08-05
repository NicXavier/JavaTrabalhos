package Java2;

import java.util.Scanner;

//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num,raiz,potencia;
		System.out.println("Digite um número:");
		num = leia.nextDouble();
		
		
		if(num % 2 == 0)
		{
			raiz = Math.sqrt(num);
			System.out.printf("\nEste número é par. Sua raiz quadrada é: %.2f",raiz);
		}
		if(num % 2 == 1)
		{
			potencia = Math.pow(num, 2);
			System.out.printf("\nEste número é ímpar. E elevado ao quadrado é: %.2f",potencia);
		}
		
}
}
