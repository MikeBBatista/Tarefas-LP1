package exercisesLP1;

public class Lugar {
	
	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	
	public Lugar(String pais, String estado, String cidade, String bairro, String rua) {
		this.setPais(pais);
		this.setEstado(estado);
		this.setCidade(cidade);
		this.setBairro(bairro);
		this.setRua(rua);
	}
	
		public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String returnCityState() {
		return (this.getCidade()+" "+ this.getEstado());
	}
	public String returnRuaBairro() {
		return this.getRua()+" "+this.getBairro();
	}
	public String returnPais() {
		return this.getPais();
	}
		
}

