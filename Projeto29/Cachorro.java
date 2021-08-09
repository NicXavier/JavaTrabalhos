package Repeticao;

public class Cachorro extends Animal{
	
	private String tutor;
	private String raca;
	
	public Cachorro(String nome, int idade, String alimentacao, String sexo, String tutor, String raca)
	{
		super(nome, idade, alimentacao, sexo);
		this.tutor = tutor;
		this.raca = raca;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: "+getNome()+"\nIdade: "+getIdade()+"\nTipo de alimenta��o: "+getAlimentacao()
		+"\nSexo: "+getSexo()+"\nTutor: "+tutor+"\nRa�a: "+raca);
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public String getRa�a() {
		return raca;
	}
	public void setRa�a(String ra�a) {
		this.raca = ra�a;
	}
	
}
