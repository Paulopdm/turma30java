package entidades;

public abstract class Conta { //pedido para que a classe fosse abstrata.
	// atributos
	private int numero;
	private String nomeCliente;
	private double saldo;

	// constructor
	public Conta(int numero, String nomeCliente) {
		super();
		
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}

//getters and setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	// metodos
	public void credito(double valor) { // adiciona dinheiro ao saldo no estoque
		if (valor < 0) {
			System.out.println("Impossível realizar esta operação.");
		} else {
			this.saldo = this.saldo + valor;
		}
	}

	public void debito(double valor) { //retira dinheiro da conta
		if (valor > this.saldo) { //para que o cliente não tire mais dinheiro do que possui na conta.
			System.out.println("Saldo indisponível. Digite um novo valor..");
		}

		else {
			this.saldo = this.saldo - valor;
		}
	}

}
