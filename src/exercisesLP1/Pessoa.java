package exercisesLP1;

public class Pessoa {
	private String nome;
	private String sexo;
	private String cordoCabelo;
	private String cordosOlhos;
	private String altura;
	
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

	public String getCordoCabelo() {
		return cordoCabelo;
	}

	public void setCordoCabelo(String cordoCabelo) {
		this.cordoCabelo = cordoCabelo;
	}

	public String getCordosOlhos() {
		return cordosOlhos;
	}

	public void setCordosOlhos(String cordosOlhos) {
		this.cordosOlhos = cordosOlhos;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public Pessoa(String nome, String sexo, String cordoCabelo, String cordosOlhos, String altura) {
		this.setAltura(altura);
		this.setCordoCabelo(cordoCabelo);
		this.setCordosOlhos(cordosOlhos);
		this.setNome(nome);
		this.setSexo(sexo);
	}
	
	public String returnNomeOlhos() {
		return "O nome da pessoa é: "+this.getNome()+" e seus olhos são da cor: "+this.getCordosOlhos();
	}
	public String returnCabeloOlhos() {
		return "UAU seus olhos da cor "+this.getCordosOlhos()+ " e seus cabelos da cor "+this.getCordoCabelo()+" combinam perfeitamente!";
	}
	public String returnAlturaSexo() {
		return "Sexo: "+this.getSexo()+ " Altura: "+this.getAltura();
	}
	public String returnTudo() {
		return "Ola "+ this.getNome()+ "! Cadastramos seu perfil: \n Altura: "+this.getAltura() + "\n Olhos: " + this.getCordosOlhos()+ "\n Cabelo: " + this.getCordoCabelo()+ "\n Sexo: " + this.getSexo(); 
	}
}
