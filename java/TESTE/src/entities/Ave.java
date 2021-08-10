package entities;

public class Ave extends Pet {
	
	private boolean voa;

	public Ave(String raca, boolean voa) { //construtor1
		super(raca);
		this.voa = voa;
	}

	public Ave(String raca, int anoNascimento, boolean voa) { //construtor2
		super(raca, anoNascimento);
		this.voa = voa;
	}

	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	

}
