package LacoRepeticao;

import java.util.*;

public class L03Q03 {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99.
		 */

		Scanner leia = new Scanner(System.in);
		int idade = 20; // vari�vel iniciada como 20 para n�o interferir no contador que dir� o n�mero
						// de pessoas abaixo de 21 anos
		int contadorMenorDe21 = 0;
		int contadorMaiorDe50 = 0;

		while (idade != -99) {
			System.out.print("Informe a sua idade (ou digite -99 para sair do programa): ");
			idade = leia.nextInt();
			if (idade < 21 && idade != -99) { // adicionei o != 99 para que ele n�o entre na contagem de idades menores
												// de 21 anos
				contadorMenorDe21++;
			}
			if (idade > 50) {
				contadorMaiorDe50++;
			}
		}
		System.out.printf("\nDas idades informadas, %d pessoas possuem menos de 21 anos.", contadorMenorDe21);
		System.out.printf("\nDas idades informadas, %d pessoas possuem mais de 50 anos.", contadorMaiorDe50);

	}

}