package Repeticao;
//Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
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
			System.out.println("\nEntre com um n�mero");
			num = leia.nextInt();
			soma += num;
		}
		while(num != 0);
		System.out.println("\nA soma dos n�meros digitados �:"+soma);
	}
}