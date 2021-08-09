package entidadesExercicio1;

public class Cavalo extends Animal 
{
	
	public int velocidadeCorrida;

	public Cavalo(String nome, int idade, String som, int velocidadeCorrida) {
		super(nome, idade, som);
		this.velocidadeCorrida = velocidadeCorrida;
	}

	
}
