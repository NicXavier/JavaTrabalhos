package Repeticao;

import java.util.Scanner;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99.
public class a04083 {
	public static void main(String[] args)
	// TODO Auto-generated method stub
	{
		int idade=0,pmenos21=0,pmais50=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade != -99)
		{
			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();
			if(idade<21) 
			{
				pmenos21++;
			}
			if(idade>50) 
			{
				pmais50++;
			}
			System.out.println("\nSe quiser sair digite -99");
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+pmenos21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+pmais50);
	}
}

