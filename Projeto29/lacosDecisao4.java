package Java2;

import java.util.Scanner;

//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//�mpar exiba o n�mero elevado ao quadrado.
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num,raiz,potencia;
		System.out.println("Digite um n�mero:");
		num = leia.nextDouble();
		
		
		if(num % 2 == 0)
		{
			raiz = Math.sqrt(num);
			System.out.printf("\nEste n�mero � par. Sua raiz quadrada �: %.2f",raiz);
		}
		if(num % 2 == 1)
		{
			potencia = Math.pow(num, 2);
			System.out.printf("\nEste n�mero � �mpar. E elevado ao quadrado �: %.2f",potencia);
		}
		
}
}
