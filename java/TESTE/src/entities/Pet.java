package entities;

public class Pet {
	
	//atributos
	private String raca;
	private char porte;
	private int anoNascimento;
	
	//construtor
	public Pet(String raca) { //construtores sempre tê o nome da Classe
		super();
		this.raca = raca;
	}
	
	//sobrecarga de construtor
	
	public Pet(String raca, int anoNascimento) {
		super();
		this.raca = raca;
		this.anoNascimento = anoNascimento;
	}

	//getters and setters - para encapsulamento! Só entra as informações através de métodos
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getPorte() {
		return porte;
	}

	public void setPorte(char porte) {
		this.porte = porte;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
	public void emiteSom() {
		System.out.println("Emitindo som do bicho...");
	}
	
	public int idade() {
		
		return (2021 - anoNascimento);
	}
	
}
