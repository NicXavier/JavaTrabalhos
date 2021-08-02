package Projeto29;

import java.util.Scanner;

public class PrimeiroProjeto {
	public static void main(String[] args) {
		//Todo auto-generated method stub
		
		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();

		media = (nota1 + nota2 + nota3)/3
				System.out.println("\nMédia: ",+media);
		System.out.printf("\nMédia arredondada: %2.2f",media);
		
		nota1 = math.sqrt(nota2);
		nota2 = math.pow(nota3,3);
		nota3 = nota1 % nota2
	}
	
	
}
