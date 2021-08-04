package LacoRepeticao;
import java.util.*;

public class L03Q05 {

	public static void main(String[] args) 
	{
	/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
	 *No final, mostre a soma dos números digitados*/	
		Scanner leia = new Scanner(System.in);
		int numero;
		int soma = 0;
		
		do {
			System.out.printf("Digite um número (ou digite 0 para finalizar o programa e realizar a soma de todos os números já informados): ");
			numero = leia.nextInt();
			soma += numero;
			
		} while (numero != 0);
		
		System.out.printf("\nA somatória dos números informados é igual a: %d.", soma);

	}

}
