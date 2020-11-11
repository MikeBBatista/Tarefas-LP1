package exercisesLP1;

public class teste_Calcado {
	public static void main (String[] args) {
		Calcado[] calcado = new Calcado[5];
		calcado[0] = new Calcado("Sapato", "Azul", 42, 4, 300.0);
		calcado[1] = new Calcado("Sapato", "Amarelo", 39, 1, 400.0);
		calcado[2] = new Calcado("Tênis", "Preto", 44, 4, 200.0);
		calcado[3] = new Calcado("Salto Alto", "Branco", 41, 4, 700.0);
		calcado[4] = new Calcado("Tamanco", "Cinza", 36, 4, 100.0);
		for(int i=0; i < 5; i++) {
			System.out.println("Dica de moda: "+calcado[i].returnModa());
			System.out.println("Valor total da compra: "+calcado[i].returnPreco());
			System.out.println("Disponibilidade: "+calcado[i].returnTamanho());
		}
	}
}
