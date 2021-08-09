package entidades;

public class Revista extends Produto // uma sublasse de produto - A revista
{ // no caso, ele ser� uma extens�o de produto com as caracter�sticas espec�ficas
	// de revista

	private String editora; // atributo espec�fico da revista

	public Revista(String codigo, String nome, double valor, int estoque, String editora) {
		super(codigo, nome, valor, estoque); // isso pq ele herdou da classe m�e (Produto)
		this.editora = editora;
	}
	//getters and setters - Ele pegou todos os que j� tem na classe m�e (Produto) e colocou os espec�ficos s� daqui.
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	

}
