package Repeticao;
//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
import java.util.Scanner;

public class a05083 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int[][] nums = new int[3][3];
		int total,nmais10=0;
		
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.println("\nEntre com um número: ");
				nums [l][c] = leia.nextInt();
				if(nums[l][c]>10)
				{
					nmais10++;
				}
			}
		}
		System.out.printf("\nMatriz 3 x 3:\n");
		for(int l=0;l<3;l++)
		{
			System.out.println();
			for(int c=0;c<3;c++)
			{
				System.out.print(nums[l][c]+"\t");
			}
		}
		System.out.println("\nVocê digitou "+nmais10+" números maiores que 10.");
}
}
		
