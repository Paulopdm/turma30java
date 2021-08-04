package LacoRepeticao;
import java.util.*;

public class L03Q06 {

	public static void main(String[] args) 
	{	/*Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. 
	Para sair digitar 0(zero).(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		final int DIVISOR = 3;
		final int FINALIZADOR = 0;
		int numero;
		int soma = 0;
		double media;
		int contadorDivisiveis = 0 ;
		
		do {
			System.out.print("Digite um número (ou digite 0 para finalizar o programa): ");
			numero = leia.nextInt();
			 if (numero % DIVISOR == 0 && numero != 0) {
				 soma += numero;
				 contadorDivisiveis++;
				 
			 }
					
		} while (numero != FINALIZADOR);
		
		media = soma/contadorDivisiveis;
		
		System.out.printf("\nDos números informados, %d são divisíveis por %d.", contadorDivisiveis, DIVISOR);
		System.out.printf("\nA soma desses números é igual a: %d", soma);
		System.out.printf("\nA média desses números é igual a: %.2f", media);
		
		
		

	}

}
