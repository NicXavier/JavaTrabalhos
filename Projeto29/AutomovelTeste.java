package Repeticao;

public class testeAutomovel {
	public static void main(String[] args)
	{
		//instanciando um objeto da classe autom�vel
		
		Automovel carro = new Automovel("Nicole Xavier","Porsche","NXS0708",2021);
		carro.imprimirInfo();
		
		System.out.println("\n***Tranfer�ncia de Propriet�rio***");
		carro.setNomeProprietario("Andreia Xavier");
		carro.imprimirInfo();
		
		Automovel car = new Automovel("Natasha Xavier","Audi","NXS3011",2021);
		car.imprimirInfo();
		
		System.out.println("\n***Mudan�a de Placa***");
		car.setPlaca("NXS3O11");
		car.imprimirInfo();
		
	}
}
