package exercisesLP1;

public class teste_InstrumentoMusical {
	public static void main (String[] args) {
		InstrumentoMusical[] instrumento = new InstrumentoMusical[5];
		instrumento[0] = new InstrumentoMusical("Viol�o", "Amarelo", "F�cil", 8.0, 124.3);
		instrumento[1] = new InstrumentoMusical("Guitarra", "Branco", "M�dio", 9.0, 154.3);
		instrumento[2] = new InstrumentoMusical("Flauta", "Preto", "D�ficil", 3.0, 99.0);
		instrumento[3] = new InstrumentoMusical("Violino", "Amarelo", "D�ficil", 6.0, 524.3);
		instrumento[4] = new InstrumentoMusical("Gaita", "Prata", "F�cil", 2.0, 65.3);
		for(int i=0; i < 5; i++){
			System.out.println("Sobre o instrumento: "+ instrumento[i].getModelo());
			System.out.println(instrumento[i].returnPeso());
			System.out.println(instrumento[i].returnPromocao());
			System.out.println(instrumento[i].returnModeloCor());
		}
	}
}
