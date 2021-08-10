package entities;

public class Produto {
	private String codigo;
	private int estoque;
	private String nome;
	private double valor;

	public Produto(String codigo, int estoque, String nome, double valor) {
		super();
		this.codigo = codigo;
		this.estoque = estoque;
		this.nome = nome;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getEstoque() {
		return estoque;
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

	public void entradaEstoque(int quantidade) {
		if(quantidade >= 0){
				this.estoque += quantidade;
		}
		else {
			System.out.println("Impossível adicionar a quantidade informada");
		}
	}

	public void saidaEstoque(int quantidade) {
		if (quantidade <= this.estoque) {
			this.estoque -= quantidade;
		}
		else {
			System.out.println("Quantidade inválida");
		}
	}
}
