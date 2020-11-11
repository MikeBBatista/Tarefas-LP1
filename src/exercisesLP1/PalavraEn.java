package exercisesLP1;

public class PalavraEn {
	private String word;
	private String trad;

	public PalavraEn(String word, String trad) {
		this.setWord(word);
		this.setTrad(trad);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public String toString() {
		return this.getWord() + " = " + this.getTrad();
	}

	public String getTrad() {
		return trad;
	}

	public void setTrad(String trad) {
		this.trad = trad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trad == null) ? 0 : trad.hashCode());
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PalavraEn other = (PalavraEn) obj;
		if (trad == null) {
			if (other.trad != null)
				return false;
		} else if (!trad.equals(other.trad))
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	
}
