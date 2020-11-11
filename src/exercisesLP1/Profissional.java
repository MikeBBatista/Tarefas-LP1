package exercisesLP1;

public class Profissional {
	private String profissao;
	private Integer horas;
	private Double salario;
	private String nivel;
	private String periculoso;
	
	public Profissional(String profissao, Integer horas, Double salario, String nivel, String periculoso) {
		this.setProfissao(profissao);
		this.setHoras(horas);
		this.setSalario(salario);
		this.setNivel(nivel);
		this.setPericolo(periculoso);
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getPericuloso() {
		return periculoso;
	}
	public void setPericolo(String periculoso) {
		this.periculoso = periculoso;
	}
	public String returnSalario() {
		if (this.getSalario() > 5000.0) {
			return "Sua remunera��o � acima da m�dia populacional.";
		}
		else {
			return "Talvez seja melhor procurar uma nova oferta de trabalho, pois seu s�lario n�o est� t�o alto.";
		}
	}
	public String returnHoras() {
		if (this.getHoras() < 8) {
			return "Uma das vantagens da sua profiss�o � a baixa carga horaria.";
		}
		else {
			return "Uma das desvantagens da sua profiss�o � a alta carga horaria.";
		}
	}
	public String returnPerigo() {
		if (this.getPericuloso() == "Sim") {
			return "Uma das desvantagens da sua profiss�o � a periculosidade.";
		}
		else {
			return "Uma das vantagens da sua profiss�o � a falta de periculosidade";
		}
	}
}
