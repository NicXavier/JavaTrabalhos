package Repeticao;
//1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
//(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
//(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
//(d) Mostre na tela cada valor do vetor A, um em cada linha.

import java.util.Scanner;

public class a05081 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int[] A = {1,0,5,-2,-5,7};
		int soma;
		System.out.println("Vetor A:");
		for(int x=0;x<6;x++)
		{
		System.out.print("\n"+A[x]);
		}
		soma = A[0] + A[1] + A[5];				
		System.out.println("\nA soma entre os valores das posi��es A[0], A[1] e A[5] do vetor �: "+soma);
		
		A[4] = 100;
		
		for(int x=0;x<6;x++)
		{
			System.out.println("\n"+A[x]);
		}
}
}