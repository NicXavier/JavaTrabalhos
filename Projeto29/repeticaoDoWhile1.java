package Repeticao;

import java.util.Scanner;

public class a04086 {
	public static void main(String[] args)
	// TODO Auto-generated method stub
	{
		int num;
		float media3,soma3=0,cont3=0;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nEntre com um número");
			num = leia.nextInt();
			
			if(num % 3 ==0 && num!=0)
			{
				soma3= soma3 + num;
				cont3++;
				System.out.println("\n"+cont3);
			}
		}
		while(num!=0);
		if(cont3!=0)
		{
			media3 = soma3 /cont3;
			System.out.println("\nMédia dos números múltiplos de 3:"+media3);
		}
		else
		{
			media3=0;
			System.out.println("\nMédia dos números múltiplos de 3:"+media3);			
		}
	}
}
