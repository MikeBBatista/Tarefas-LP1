package exercisesLP1;

public class teste_Lugar {
	public static void main (String[] args) {
		Lugar[] Place = new Lugar[5];
		Place[0] = new Lugar("Brasil", "Rio de Janeiro", "Queimados", "Fanchem", "F");
		Place[1] = new Lugar("Brasil", "S�o Paulo", "S�o Jos� dos Campos", "Vila Industrial", "Jos� Oliveira da Cruz");
		Place[2] = new Lugar("Brasil", "S�o Paulo", "S�o Jos� dos Campos", "Vila Industrial", "Jos� Oliveira da Cruz");
		Place[3] = new Lugar("Brasil", "Mato Grosso do Sul", "Dourados", "Vila do Mil�nio", "Av. Butiti");
		Place[4] = new Lugar("Brasil", "Paran�", "Curitiba", "Centro", "Av. tucuruvi");
		for(int i=0; i < 5; i++) {
			System.out.println(Place[i].returnPais());
			if (Place[i].returnCityState().equals(Place[i].getCidade()+" "+Place[i].getEstado())){
				System.out.println(Place[i].returnCityState());
					if (Place[i].returnRuaBairro().equals(Place[i].getRua()+" "+Place[i].getBairro())) {
						System.out.println(Place[i].returnRuaBairro());
				}
			}
		}

	}
}
