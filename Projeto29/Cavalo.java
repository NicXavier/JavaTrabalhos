package Repeticao;

public class Cavalo extends Animal{
	 
	private float peso;
	private float valor;
	
	public Cavalo(String nome, int idade, String alimentacao, String sexo, float peso, float valor)
	{
		super(nome, idade, alimentacao, sexo);
		this.peso = peso;
		this.valor = valor;
	}
	public void imprimirInfo()
	{
		System.out.println("Nome do Cavalo: "+getNome()+"Idade: "+getIdade()+"Tipo de alimentação: "+getAlimentacao()
		+"Sexo: "+getSexo()+"Peso: "+peso+"Valor: "+valor);
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
