package exercisesLP1;

public class teste_Pessoa {
	public static void main (String[] args) {
		Pessoa[] person = new Pessoa[5];
		person[0] = new Pessoa("Perry", "Masculino", "Preto", "Verde", "1.77");
		person[1] = new Pessoa("Gabi", "Feminino", "Vermelho", "Castanho", "1.87");
		person[2] = new Pessoa("Rodolfo", "Masculino", "Azul", "Castanho", "1.69");
		person[3] = new Pessoa("Bella", "Feminino", "Castanho", "Azul", "1.73");
		person[4] = new Pessoa("Milena", "Feminino", "Amarelo", "Cinza", "1.90");
		
		int contador = 0;
		for(int i=0; i < 5; i++) {
			System.out.println(person[i].returnNomeOlhos());
			if (person[i].getNome() == "Perry") {
				System.out.println("Perry o Onitorrinco!");
			}
			else {
				System.out.println(person[i].returnAlturaSexo());
				System.out.println(person[i].returnCabeloOlhos());
			}
		}
	}
}
