package Repeticao;
///Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
import java.util.Scanner;

public class a04082 {
	public static void main(String[] args)
	// TODO Auto-generated method stub
	{
		int y,x,contpar=0,contimpar=0;
		Scanner leia = new Scanner(System.in);
		
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\nDigite um n�mero: ");
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
		System.out.println("\nQuantidade de n�mero pares: "+contpar);
		System.out.println("\nQuantidade de n�mero �mpares: "+contimpar);
	}
}
