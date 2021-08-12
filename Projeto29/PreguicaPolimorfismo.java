package Repeticao;

public class PreguicaPolimorfismo extends Animal{
		
		public PreguicaPolimorfismo(String nome, int idade, String alimentacao, String sexo) {
		super(nome, idade, alimentacao, sexo);
		// TODO Auto-generated constructor stub
	}
		private String subirarvore;
		private boolean PreguicaPolimorfismo;
		
		public boolean PreguicaPolimorfismo()
		{
			return PreguicaPolimorfismo;
		}

		public String getSubirarvore() {
			return subirarvore;
		}

		public void setSubirarvore(String subirarvore) {
			this.subirarvore = subirarvore;
		}
		public String getNome()
		{
			return "Preguica"+super.getNome()+"sobe em árvore"+this.getSubirarvore();
		}
}
