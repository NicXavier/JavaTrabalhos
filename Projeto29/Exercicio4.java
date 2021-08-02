package Projeto29;
//Escreva um sistema que leia três números inteiros e positivos (A,B,C) e calcule a seguinte expressão:
//D = R+S/2, onde R=(A+B)ao quadrado e S=(B+C)ao quadrado
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double a,b,c,res,r,s,d,res2;
		System.out.println("Dê um valor para a: ");
		a = ler.nextInt();
		System.out.println("Dê um valor para b: ");
		b = ler.nextInt();
		System.out.println("Dê um valor para c: ");
		c = ler.nextInt();
		res = a + b;
		r = Math.pow(res,2);
		res2= b + c;
		s = Math.pow(res2,2);
		d = (r + s) / 2;
		System.out.println("D equivale a:"+d);		
	}
}
