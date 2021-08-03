package Java2;
//Faça um programa que entre com três números e coloque em ordem crescente
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite o primeiro número:");
		a = leia.nextInt();
		System.out.println("\nDigite o segundo número:");
		b = leia.nextInt();
		System.out.println("\nDigite o terceiro número:");
		c = leia.nextInt();
		
		if((a<=b) && (b<=c))
		{
			System.out.println("\nOrdem crescente dos números = "+a+" - "+b+" - "+c);			
		}
		else if((b<=a) && (a<=c))
		{
			System.out.println("\nOrdem crescente dos números = "+b+" - "+a+" - "+c);			
		}
		else if ((c<=b) && (b<=a))
		{
			System.out.println("\nOrdem crescente dos números = "+c+" - "+b+" - "+a);			
		}
		
		
}
}