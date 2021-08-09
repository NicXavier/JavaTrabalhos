package Repeticao;

public class Preguica extends Animal {

	private String especie;
	private float comprimento;
	
	public Preguica(String nome, int idade, String alimentacao, String sexo, String especie, float comprimento)
	{
		super(nome, idade, alimentacao, sexo);
		this.especie = especie;
		this.comprimento = comprimento;
	}
	public void imprimirInfo()
	{
		System.out.println("Nome da Preguiça: "+getNome()+"Idade: "+getIdade()+"Tipo de alimentação: "+getAlimentacao()
		+"Sexo: "+getSexo()+"Especie: "+especie+"Comprimento: "+comprimento);
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
}
