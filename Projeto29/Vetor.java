package Repeticao;
//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//� Os n�meros pares digitados;  
//� A soma dos n�meros pares digitados; 
//� Os n�meros �mpares digitados; 
//� A quantidade de n�meros �mpares digitados

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
				System.out.println(vet[x]+" -> Este n�mero � par.");
			}
			else if(vet[x] % 2 == 1)
			{
				System.out.println(vet[x]+" -> Este n�mero � �mpar.");
			}
		}

		System.out.printf("\nSoma dos n�meros pares digitados: %d",somapar);
		System.out.printf("\nTotal de n�meros �mpares digitados: %d",contimpar);

}
}
