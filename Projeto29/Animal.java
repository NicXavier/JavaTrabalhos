package Repeticao;

public class Animal {

	private String nome;
	private int idade;
	private String alimentacao;
	private String sexo;
	
	public Animal(String nome, int idade, String alimentacao, String sexo)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.alimentacao = alimentacao;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
