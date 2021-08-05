package Java2;
import java.util.Scanner;
public class agostoum {
//Faça um programa que entre com três números e coloque em ordem crescente

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
			else if((b<=c) && (c<=a))
			{
				System.out.println("\nOrdem crescente dos números = "+b+" - "+c+" - "+a);			
			}
			else if((c<=a) && (a<=b))
			{
				System.out.println("\nOrdem crescente dos números = "+c+" - "+a+" - "+b);			
			}
			else if((a<=c) && (c<=b))
			{
				System.out.println("\nOrdem crescente dos números = "+a+" - "+c+" - "+b);			
			}
			else if ((c<=b) && (b<=a))
			{
				System.out.println("\nOrdem crescente dos números = "+c+" - "+b+" - "+a);			
			}
			
			
	}
}
