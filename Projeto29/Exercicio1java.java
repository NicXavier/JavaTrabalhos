package Java2;
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
import java.util.Scanner;

public class Exercicio1if {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int count=2;
		float maior,num;
		
		System.out.println("\nEntre com o n�mero 1: ");
		num = leia.nextFloat();
		maior = num;
		
		while(count <=3)
		{
			System.out.print("Numero "+count+":");
			num = leia.nextFloat();

			if(num > maior) {
				maior =num;
			}
			count++;
		}
		
	
		System.out.println("\nO maior n�mero digitado foi: "+maior);
}
}