package Repeticao;
//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.
public class a04081 {
	public static void main(String[] args)
	{
		int x;
		System.out.printf("\nQuantidade de números que divididos por 11 tem como resto 5: ");
		for(x=1000;x<=1999;x++)
		{
			if(x % 11 ==5)
				{
				System.out.println("\n"+x);
				}
		}
	
	}
}
