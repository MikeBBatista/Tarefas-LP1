package exercisesLP1;

public class Planeta {
	private String nome;
	private String posicao;
	private String distancia;
	private String anoDescoberta;
	public Planeta(String nome, String posicao, String distancia, String anoDescoberta) {
		super();
		this.setNome(nome);
		this.setPosicao(posicao);
		this.setDistancia(distancia);
		this.setAnoDescoberta(anoDescoberta);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getDistancia() {
		return distancia;
	}
	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}
	public String getAnoDescoberta() {
		return anoDescoberta;
	}
	public void setAnoDescoberta(String anoDescoberta) {
		this.anoDescoberta = anoDescoberta;
	}
	
	public String returnInfo() {
		return "O planeta " +this.getNome()+ " foi descoberto em "+ this.getAnoDescoberta()+ "!\n "
				+ "Ele se encontra a "+this.getDistancia()+" anos luz da Terra (Seu planeta natal!) e foi o "+this.getPosicao()+" planeta possivelmente habitável a ser descoberto.";
	}

}
