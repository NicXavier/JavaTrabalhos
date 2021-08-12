package Repeticao;

public class TestePreguicaPolimorfismo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			CachorroPolimorfismo  cachorro = new CachorroPolimorfismo();
			cachorro.setNome("Bela");
			cachorro.setLatido("auauauaua");
			
			CavaloPolimorfismo cavalo = new CavaloPolimorfismo();
			cavalo.setNome("Spirit");
			cavalo.setCavalgar("poc poc poc");
			
			
			PreguicaPolimorfismo preguica = new PreguicaPolimorfismo();
			preguica.setNome("preguisinha");
			preguica.setSubirarvore("sobe na árvore");
			
	   	Animal[] animals = new Animal[3];
			                            
			animals[0]=cachorro;
		   	animals[1]=cavalo;
			animals[2]=preguica;
			
			
			for(Animal animal:animals)
			{
				System.out.println(animal.getNome());
			}

		}
	}
}
