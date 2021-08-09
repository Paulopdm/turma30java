package entidades;

public class ContaPoupanca extends Conta
{	//atributos
	private int diaAniversarioPoupanca;
	//constructor
	public ContaPoupanca(int numero, String nomeCliente, double saldo, int diaAniversarioPoupanca) {
		super(numero, nomeCliente);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	//getter and setter
	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}


	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}


	public void correcao(int dataAtual) {
		if(this.diaAniversarioPoupanca == dataAtual) {
			super.credito((super.getSaldo()*0.05)); //super
		}
	}
	
}
