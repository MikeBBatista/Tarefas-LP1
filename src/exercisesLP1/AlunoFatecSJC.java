package exercisesLP1;

public class AlunoFatecSJC {
	private String nome;
	private String sexo;
	private Integer semestre;
	private Double rendimento;
	private Double progresso;
	
	public AlunoFatecSJC(String nome, String sexo, Integer semestre, Double rendimento, Double progresso) {
		super();
		this.setNome(nome);
		this.setSexo(sexo);
		this.setSemestre(semestre);
		this.setRendimento(rendimento);
		this.setProgresso(progresso);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getSemestre() {
		return semestre;
	}
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
	public Double getRendimento() {
		return rendimento;
	}
	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	public Double getProgresso() {
		return progresso;
	}
	public void setProgresso(Double progresso) {
		this.progresso = progresso;
	}
	public String returnRendimento() {
		if(this.getRendimento() >= 9.0) {
			return "Seu rendimento é incrível!";
		}
		else {
			return "Você precisa melhorar no seu rendimento!";
		}
	}
	public Integer returnFaltaSemestre() {
		int semestres = 6 - this.getSemestre();
		return semestres;
	}
	public Double returnFaltaProgresso() {
		double progress = 100 - this.getProgresso();
		return progress;
	}
}
