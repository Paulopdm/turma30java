package entities;

public class Carrinho 
{
	private String nome;
	private int quantidadeComprada;
	private String codigo;
	private double valor;
	
	public Carrinho(String nome, int quantidadeComprada, String codigo, double valor) {
		super();
		this.nome = nome;
		this.quantidadeComprada = quantidadeComprada;
		this.codigo = codigo;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public double valorFinalProduto() {
		return this.quantidadeComprada * this.valor;
	}
	
	//calcular valor final de todos os produtos do carrinho;
	
}
