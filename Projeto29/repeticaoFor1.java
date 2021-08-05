package Repeticao;
///Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
import java.util.Scanner;

public class a04082 {
	public static void main(String[] args)
	// TODO Auto-generated method stub
	{
		int y,x,contpar=0,contimpar=0;
		Scanner leia = new Scanner(System.in);
		
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\nDigite um número: ");
			y = leia.nextInt();
			if(y % 2 ==0)
			{
			contpar++;
			}
			else
			{
			contimpar++;
			}
		}
		System.out.println("\nQuantidade de número pares: "+contpar);
		System.out.println("\nQuantidade de número ímpares: "+contimpar);
	}
}
