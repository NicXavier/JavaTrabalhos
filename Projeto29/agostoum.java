package Java2;
import java.util.Scanner;
public class agostoum {
//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int a,b,c;
			
			System.out.println("Digite o primeiro n�mero:");
			a = leia.nextInt();
			System.out.println("\nDigite o segundo n�mero:");
			b = leia.nextInt();
			System.out.println("\nDigite o terceiro n�mero:");
			c = leia.nextInt();
			
			if((a<=b) && (b<=c))
			{
				System.out.println("\nOrdem crescente dos n�meros = "+a+" - "+b+" - "+c);			
			}
			else if((b<=a) && (a<=c))
			{
				System.out.println("\nOrdem crescente dos n�meros = "+b+" - "+a+" - "+c);			
			}
			else if((b<=c) && (c<=a))
			{
				System.out.println("\nOrdem crescente dos n�meros = "+b+" - "+c+" - "+a);			
			}
			else if((c<=a) && (a<=b))
			{
				System.out.println("\nOrdem crescente dos n�meros = "+c+" - "+a+" - "+b);			
			}
			else if((a<=c) && (c<=b))
			{
				System.out.println("\nOrdem crescente dos n�meros = "+a+" - "+c+" - "+b);			
			}
			else if ((c<=b) && (b<=a))
			{
				System.out.println("\nOrdem crescente dos n�meros = "+c+" - "+b+" - "+a);			
			}
			
			
	}
}
