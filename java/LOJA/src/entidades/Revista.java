package entidades;

public class Revista extends Produto // uma sublasse de produto - A revista
{ // no caso, ele será uma extensão de produto com as características específicas
	// de revista

	private String editora; // atributo específico da revista

	public Revista(String codigo, String nome, double valor, int estoque, String editora) {
		super(codigo, nome, valor, estoque); // isso pq ele herdou da classe mãe (Produto)
		this.editora = editora;
	}
	//getters and setters - Ele pegou todos os que já tem na classe mãe (Produto) e colocou os específicos só daqui.
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	

}
