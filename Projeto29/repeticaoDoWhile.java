package Repeticao;
//Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)
import java.util.Scanner;

public class a04085 {
	public static void main(String[] args)
	// TODO Auto-generated method stub
	{
		int num=0,soma=0;
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			System.out.println("\nEntre com um número");
			num = leia.nextInt();
			soma += num;
		}
		while(num != 0);
		System.out.println("\nA soma dos números digitados é:"+soma);
	}
}