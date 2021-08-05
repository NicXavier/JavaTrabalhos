package Repeticao;
//2- Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//• Os números ímpares digitados; 
//• A quantidade de números ímpares digitados

import java.util.Scanner;

public class a05082 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int[] vet = new int[6];
		int x,contpar=0,somapar=0,contimpar=0;
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nEntre com um valor: ");
			vet[x] = leia.nextInt();
			if(vet[x] % 2 == 0)
			{
				contpar++;
				somapar += contpar;
			}
			else if(vet[x] % 2 == 1)
			{
				contimpar++;
			}
		}
		for(x=0;x<6;x++)
		{
			if(vet[x] % 2 == 0)
			{
				System.out.println(vet[x]+" -> Este número é par.");
			}
			else if(vet[x] % 2 == 1)
			{
				System.out.println(vet[x]+" -> Este número é ímpar.");
			}
		}

		System.out.printf("\nSoma dos números pares digitados: %d",somapar);
		System.out.printf("\nTotal de números ímpares digitados: %d",contimpar);

}
}
