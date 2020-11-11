package exercisesLP1;

public class teste_Profissional {
	public static void main (String[] args) {
		Profissional[] trabalhador = new Profissional[5];
		trabalhador[0] = new Profissional("Medicina", 6, 6000.0, "Superior", "Sim");
		trabalhador[1] = new Profissional("Educador", 8, 5000.0, "Superior", "Não");
		trabalhador[2] = new Profissional("Pedreiro", 9, 3000.0, "Superior", "Sim");
		trabalhador[3] = new Profissional("Arquiteto", 8, 4500.0, "Superior", "Não");
		trabalhador[4] = new Profissional("Engenheiro", 8, 4000.0, "Superior", "Não");
		for(int i=0; i < 5; i++) {
			System.out.println("As vantagens em ser da seguite profissão: "+trabalhador[i].getProfissao());
			System.out.println(trabalhador[i].returnSalario());
			System.out.println(trabalhador[i].returnHoras());
			System.out.println(trabalhador[i].returnPerigo());
		}
	}
}
