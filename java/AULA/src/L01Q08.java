import java.util.Scanner;

public class L01Q08 
{
	public static void main (String[]args) 
	{/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do 
	distribuidor e dos impostos (aplicados ao custo de f�brica). 
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. */
		
		double valorInicial, valorFinal, imposto, distribuicao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de f�brica do autom�vel: ");
		valorInicial = leia.nextDouble();

		imposto = (valorInicial * 0.45);
		distribuicao = (valorInicial * 0.28);
		valorFinal = (valorInicial + imposto + distribuicao);

		System.out.printf("\nCusto do imposto: R$%.2f", imposto);
		System.out.printf("\nCusto de distribui��o: R$%.2f", distribuicao);
		System.out.printf("\nValor final: R$%.2f", valorFinal);
		
		
		
		
	}
	

}
