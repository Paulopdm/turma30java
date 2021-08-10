package entities;

public class Cachorro extends Pet{

	private boolean latidoAlto;

	public Cachorro(String raca, boolean latidoAlto) { //construtor 1
		super(raca);
		this.latidoAlto = latidoAlto;
	}

	public Cachorro(String raca, int anoNascimento, boolean latidoAlto) { //construtor 2
		super(raca, anoNascimento);
		this.latidoAlto = latidoAlto;
	}

	public boolean isLatidoAlto() {
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}

	@Override
	public void emiteSom() { //o m�todo ser� sobreposto ao da classe m�e.	
		System.out.println("au au au au au");
	}
	
	
}
