package Projeto29;
//Construa um programa em d que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist?ncia entre eles. A f?rmula
//que efetua tal c?lculo ?:

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double x1,x2,y1,y2,d;
		System.out.println("Entre com o valor de X1: ");
		x1 = ler.nextDouble();
		System.out.println("Entre com o valor de X2: ");
		x2 = ler.nextDouble();
		System.out.println("Entre com o valor de Y1: ");
		y1 = ler.nextDouble();
		System.out.println("Entre com o valor de Y2: ");
		y2 = ler.nextDouble();
		d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		
		System.out.printf("A dist?ncia entre dois pontos  foi de: %.2f",d);
	}
}
