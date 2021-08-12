package entities;

import java.util.*;

public class Produto {
	// atributos

	private String nome;
	private int estoque;
	private double valor;
	private String codigo;

 // listas vitrine e carrinho
	List<Produto> vitrine = new ArrayList<>();
	List<Produto> carrinho = new ArrayList<>();

	// constructors
	public Produto(String nome, String codigo, double valor, int estoque ) {
		super();
		this.nome = nome;
		this.estoque = estoque;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	/*
	 * public void setEstoque(int estoque) { this.estoque = estoque; }
	 */

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


//metodos

	
	public void mostrarVitrine() {
		for (Produto x : vitrine) {
		System.out.printf("%s \t %.2f \t %d \t\t %s\n", x.getCodigo(), x.getValor(), x.getEstoque(), x.getNome());
	
		}

	}

	public void entraCarrinho(String nome, int quantidade, double valor, String codigo) {
		if (quantidade == 0) {
			System.out.println("QUANTIDADE NAO PODE SER 0!");
		} else {
			carrinho.add(new Produto(nome, quantidade, valor, codigo));
		}

	}

}
