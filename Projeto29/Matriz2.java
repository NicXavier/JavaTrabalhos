package Repeticao;
//4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
//(1) somar as duas matrizes 
//(2) subtrair a primeira matriz da segunda 
//(3) adicionar uma constante as duas matrizes
//(4) imprimir as matrizes 
//Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

import java.util.Scanner;

public class a05084 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float[][] a = new float [2][2];
		float[][] b = new float [2][2];
		float[][] C = new float [2][2];
		int opcoes=0,constante=0;
		
		for(int l=0;l<2;l++) 
		{
			for(int c=0;c<2;c++)
			{
				System.out.println("\nDigite o valor da primeira matriz: ");
				a[l][c] = leia.nextInt();
			}
		}
		for(int l=0;l<2;l++) 
		{
			for(int c=0;c<2;c++)
			{
				System.out.println("\nDigite o valor da segunda matriz: ");
				b[l][c] = leia.nextInt();
			}
		}
		System.out.println("\nSiga as instruções:");
		System.out.println("(1) somar as duas matrizes \r\n"
				+ "(2) subtrair a primeira matriz da segunda \r\n"
				+ "(3) adicionar uma constante as duas matrizes\r\n"
				+ "(4) imprimir as matrizes ");
		opcoes = leia.nextInt();
		switch(opcoes)
		{
		case 1:
			System.out.println("\nSoma das matrizes:");
			for(int l=0;l<2;l++) 
			{
				for(int c=0;c<2;c++)
				{
					C[l][c] = a[l][c] + b[l][c];
				}
			}
			for(int l=0;l<2;l++) 
			{
				for(int c=0;c<2;c++)
				{
					System.out.print(+C[l][c]+"\t");
				}
			}
			break;
			case 2:
				System.out.println("\nSubtração das matrizes:");
				for(int l=0;l<2;l++) 
				{
					for(int c=0;c<2;c++)
					{
						C[l][c] = a[l][c] - b[l][c];
					}
				}
				for(int l=0;l<2;l++) 
				{
					for(int c=0;c<2;c++)
					{
						System.out.print(+C[l][c]+"\t");
					}
				}
				break;
			case 3:
				System.out.printf("\nDigite o valor da constante:");
				constante = leia.nextInt();
				for(int l=0;l<2;l++) 
				{
					for(int c=0;c<2;c++)
					{
						C[l][c] = constante;
					}
				}
				System.out.printf("\nMatriz 1:");
				for(int l=0;l<2;l++) 
				{
					System.out.println();
					for(int c=0;c<2;c++)
					{
						System.out.print(C[l][c]+"\t");
					}
				}
				break;
			case 4:
				System.out.printf("\nMatriz 2:");
				for(int l=0;l<2;l++) 
				{
					System.out.println();
					for(int c=0;c<2;c++)
					{
						System.out.print(a[l][c]+"\t");
					}
				}
				System.out.printf("\nMatriz 1:");
				for(int l=0;l<2;l++) 
				{
					System.out.println();
					for(int c=0;c<2;c++)
					{
						System.out.print(b[l][c]+"\t");
					}
				}
			}
}
}
