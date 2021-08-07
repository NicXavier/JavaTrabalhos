package Repeticao;

public class testeAutomovel {
	public static void main(String[] args)
	{
		//instanciando um objeto da classe automóvel
		
		Automovel carro = new Automovel("Nicole Xavier","Porsche","NXS0708",2021);
		carro.imprimirInfo();
		
		System.out.println("\n***Tranferência de Proprietário***");
		carro.setNomeProprietario("Andreia Xavier");
		carro.imprimirInfo();
		
		Automovel car = new Automovel("Natasha Xavier","Audi","NXS3011",2021);
		car.imprimirInfo();
		
		System.out.println("\n***Mudança de Placa***");
		car.setPlaca("NXS3O11");
		car.imprimirInfo();
		
	}
}
