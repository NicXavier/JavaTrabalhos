package Repeticao;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario[] lista = new Funcionario[5];
		
		lista[0] = new Funcionario(14700,"Nicole Xavier",12500);
		lista[1] = new Funcionario(14701,"Natasha Xavier",16700);
		lista[2] = new Funcionario(14702,"Andreia Xavier",17900);
		lista[3] = new Funcionario(14703,"Railson Tiburcio",18900);
		lista[4] = new Funcionario(14704,"Elza Quirino",20100);
		
		for(Funcionario roda: lista)
		{
			roda.imprimir();
		}
		
	}

}
