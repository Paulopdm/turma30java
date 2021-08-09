package entidades;

public class Produto // a classe
{
	// atributos (o objeto é, tem e está)
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;

	// para um código seguro, todos os itens são privados, então devem usar um
	// constructor para serem enviados para o programa a ser gerado
	// constructor

	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		if (estoque < 0) { //impossibilita a construção de um produto com estoque negativo.
			this.estoque = 0;
		}
		else {
			this.estoque = estoque;
		}
	}

	// getters and setters - pra colocar os valores nos atributos privados. Sem set,
	// não há alteração do estoque no CadLoja -
	// isso torna o processo mais seguro. Na loja, não queremos que mexam no estoque
	// do produto.

	public String getCodigo() { // get - pegar
		return codigo;
	}

	public void setCodigo(String codigo) { // set - alterar
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	/*public void setEstoque(int estoque) {   pra evitar que o programador mude o estoque -- dá mais proteção.
		this.estoque = estoque;
	}*/ 

	// metodos

	public void incluiEstoque(int quantidade) { // adiciona quantidade de produto no estoque
		if (quantidade < 0) {
			System.out.println("Quantidade impossível ");
		}
		else {
			this.estoque = this.estoque + quantidade;
		}
	}

	public void retiraEstoque(int quantidade) {
		if (quantidade > this.estoque) { //evita que o usuário compre uma quantidade maior do que a presente no estoque.
			System.out.println("Quantidade indisponível! Selecione uma nova quantidade.");
		}
		
		else{
			this.estoque = this.estoque - quantidade;
		}
	}


}
