package LacoRepeticao;
import java.util.*;

public class L03Q06 {

	public static void main(String[] args) 
	{	/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
	Para sair digitar 0(zero).(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		final int DIVISOR = 3;
		final int FINALIZADOR = 0;
		int numero;
		int soma = 0;
		double media;
		int contadorDivisiveis = 0 ;
		
		do {
			System.out.print("Digite um n�mero (ou digite 0 para finalizar o programa): ");
			numero = leia.nextInt();
			 if (numero % DIVISOR == 0 && numero != 0) {
				 soma += numero;
				 contadorDivisiveis++;
				 
			 }
					
		} while (numero != FINALIZADOR);
		
		media = soma/contadorDivisiveis;
		
		System.out.printf("\nDos n�meros informados, %d s�o divis�veis por %d.", contadorDivisiveis, DIVISOR);
		System.out.printf("\nA soma desses n�meros � igual a: %d", soma);
		System.out.printf("\nA m�dia desses n�meros � igual a: %.2f", media);
		
		
		

	}

}
