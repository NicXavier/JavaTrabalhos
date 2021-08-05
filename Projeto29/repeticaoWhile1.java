package Repeticao;

import java.util.Scanner;

public class a04084 {
	
	public static void main(String[] args)
	{
		int idade,genero,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,np=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(np<=150) 
		{
			System.out.println("\nEntre com sua idade");
			idade = leia.nextInt();
			System.out.println("\nGênero \n1-Masc \n2-Fem \n3-Outros");
			genero = leia.nextInt();
			System.out.println("\nFator Psicológico: \n1-Calmo; \n2-Nervoso; \n3-Agressivo");
			fp = leia.nextInt();
			
			if(fp == 1)
			{
				contpc++;
			}
			if(genero == 2 && fp == 2)
			{
				contmn++;
			}
			if(genero == 1 && fp == 3)
			{
				contha++;
			}
			if(fp == 2 && idade>40)
			{
				contpn40++;
			}
			if(genero == 1 && idade < 18)
			{
				contpc18++;
			}
			np++;
		}
		System.out.println("\nPessoas calmas: "+contpc);
		System.out.println("\nMulheres nervosas: "+contpc);
		System.out.println("\nHomens agressivos: "+contpc);
		System.out.println("\nOutros calmos: "+contpc);
		System.out.println("\nPessoas nervosas com mais de 40 anos: "+contpc);
		System.out.println("\npessoas calmas com menos de 18 anos: "+contpc);
	}

}
