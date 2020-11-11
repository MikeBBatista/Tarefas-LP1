package exercisesLP1;

public class Calcado {
	private String modelo;
	private String cor;
	private Integer tamanho;
	private Integer quantidade;
	private Double preco;
	
	public Calcado(String modelo, String cor, Integer tamanho, Integer quantidade, Double preco) {
		this.setModelo(modelo);
		this.setCor(cor);
		this.setTamanho(tamanho);
		this.setQuantidade(quantidade);
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
	public Integer getTamanho() {
		return tamanho;
	}
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String returnModa() {
		if (this.getCor() == "Amarelo") {
			return "Sério? Amarelo não combina com nada!";
		}
		else if (this.getCor() == "Azul") {
			return "Estilo, graça, azul sem dúvidas é a melhor cor!";
		}
		else {
			return "Essa cor combina com tudo!";
		}
	}
	public Double returnPreco() {
		return this.getPreco() * this.getQuantidade();
	}
	public String returnTamanho() {
		if (this.getTamanho() > 40) {
			return "Esse tamanho só por encomenda!";
		}
		else {
			return "Temos esse tamanho em estoque.";
		}
	}
}
