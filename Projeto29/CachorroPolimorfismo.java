package Repeticao;

public class CachorroPolimorfismo extends Animal{
	
		public CachorroPolimorfismo(String nome, int idade, String alimentacao, String sexo) {
		super(nome, idade, alimentacao, sexo);
		// TODO Auto-generated constructor stub
	}

		private boolean CachorroPolimorfismo;
		
		public boolean CachorroPolimorfismo()
		{
			return CachorroPolimorfismo;
		}
		
		private String latido;

		public String getLatido() {
			return latido;
		}

		public void setLatido(String latido) {
			this.latido = latido;
		}
		
		public String getNome()
		{
			return "cachorro: "+getNome()+"latido :  "+this.getLatido();
		}
}
