package exercisesLP1;

public class teste_AlunoFatecSJC {
	public static void main (String[] args) {
		AlunoFatecSJC[] aluno = new AlunoFatecSJC[5];
		aluno[0] = new AlunoFatecSJC("Roberto", "Masculino", 3, 9.18, 33.3);
		aluno[1] = new AlunoFatecSJC("May", "Feminino", 6, 9.75, 99.0);
		aluno[2] = new AlunoFatecSJC("Garnet", "Feminino", 5, 8.70, 78.0);
		aluno[3] = new AlunoFatecSJC("Steven", "Masculino", 4, 7.0, 67.0);
		aluno[4] = new AlunoFatecSJC("Alex", "Feminino", 2, 9.70, 22.5);
		for(int i=0; i < 5; i++) {
			System.out.println("Olá "+ aluno[i].getNome());
			System.out.println(aluno[i].returnRendimento());
			System.out.println("Faltam "+aluno[i].returnFaltaSemestre()+" semestres para conclusão da sua universidade!");
			System.out.println("Faltam "+aluno[i].returnFaltaProgresso()+"% no seu progresso!");
		}
	}
}
