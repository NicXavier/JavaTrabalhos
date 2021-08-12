package Repeticao;

public class CavaloPolimorfismo extends Animal{

	public CavaloPolimorfismo(String nome, int idade, String alimentacao, String sexo) {
		super(nome, idade, alimentacao, sexo);
		// TODO Auto-generated constructor stub
	}
	private String cavalgar;
	private boolean CavaloPolimorfismo;
	
	public boolean CavaloPolimorfismo()
	{
		return CavaloPolimorfismo;
	}

	public String getCavalgar() {
		return cavalgar;
	}

	public void setCavalgar(String cavalgar) {
		this.cavalgar = cavalgar;
	}
	public String getNome()
	{
		return "cavalo"+super.getNome()+"cavalgar poc poc poc"+this.getCavalgar();
	}
}
