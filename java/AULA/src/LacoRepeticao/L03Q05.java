package LacoRepeticao;
import java.util.*;

public class L03Q05 {

	public static void main(String[] args) 
	{
	/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
	 *No final, mostre a soma dos n�meros digitados*/	
		Scanner leia = new Scanner(System.in);
		int numero;
		int soma = 0;
		
		do {
			System.out.printf("Digite um n�mero (ou digite 0 para finalizar o programa e realizar a soma de todos os n�meros j� informados): ");
			numero = leia.nextInt();
			soma += numero;
			
		} while (numero != 0);
		
		System.out.printf("\nA somat�ria dos n�meros informados � igual a: %d.", soma);

	}

}
