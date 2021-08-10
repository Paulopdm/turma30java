package entities;

public class Gato extends Pet {
	
	private boolean miadoAlto;

	public Gato(String raca, boolean miadoAlto) { //construtor1
		super(raca);
		this.miadoAlto = miadoAlto;
	}

	public Gato(String raca, int anoNascimento, boolean miadoAlto) { //construtor2
		super(raca, anoNascimento);
		this.miadoAlto = miadoAlto;
	}

	public boolean isMiadoAlto() {
		return miadoAlto;
	}

	public void setMiadoAlto(boolean miadoAlto) {
		this.miadoAlto = miadoAlto;
	}
	
	
	

}
