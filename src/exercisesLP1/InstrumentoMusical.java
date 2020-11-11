package exercisesLP1;

public class InstrumentoMusical {
	private String modelo;
	private String cor;
	private String nivelDificuldade;
	private Double peso;
	private Double preco;
	
	public InstrumentoMusical(String modelo, String cor, String nivelDificuldade, Double peso, Double preco) {
		super();
		this.setModelo(modelo);
		this.setCor(cor);
		this.setNivelDificuldade(nivelDificuldade);
		this.setPeso(peso);
		this.setPreco(preco);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNivelDificuldade() {
		return nivelDificuldade;
	}
	public void setNivelDificuldade(String nivelDificuldade) {
		this.nivelDificuldade = nivelDificuldade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String returnPeso() {
		if (this.getPeso() > 5.0) {
			return "Você terá dificuldades em carregar esse instrumento por muito tempo!";
		}
		else {
			return "Esse instrumento é leve!";
		}
	}
	public String returnModeloCor() {
		return "O instrumento: "+this.getModelo()+" de cor: "+this.getCor()+" está a venda!";
	}
	public String returnPromocao() {
		if (this.getPreco() < 100.0) {
			return "Esse instrumento está em promoção!";
		}
		else {
			return "Esse instrumento está acima do preço de mercado!";
		}
	}
}
