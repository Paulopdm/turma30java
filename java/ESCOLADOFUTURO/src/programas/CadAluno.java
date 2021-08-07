package programas;

import java.util.Scanner;

public class cadAluno {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String alunes[] = { "Ana Beatriz Yujra Espejo", "Ana Carolina Gonzalez de Souza", "Ana Paula Souza Dias",
				"Anderson Coelho da Costa", "Andrei Felipe Corrêa de Souza", "Ariel de Barros Pirangy Soares",
				"Beatriz dos Santos Teixeira", "Beatriz Gomes de Abreu", "Caio Saldanha Motta",
				"Cássia de Arruda Nicolau Santos", "Emerson da Silva Santana", "Enzo Fulaneto",
				"Ester Gomes Neves Nascimento", "Fábio Campaner Suzuki", "Felipe Matos de Lima",
				"Felipe Souza da Silva", "Flávio Augusto da Costa", "Giovanna Siqueira Paiva dos Penedos",
				"Gustavo Mesquita Ferreira", "Henrique Uriel Lopes", "João Pedro Cruz Gomes",
				"José Paulo de Matos Ferreira Neto", "Letícia Porto Martins", "Lucas Silva Nunes de Aguiar",
				"Maicon Gomes Cerqueira", "Marcos Vinicius Coutinho Rego", "Matheus de Araujo Farina",
				"Matheus de Brito Milani", "Natália Regina dos Santos Rocha", "Pamela Paulino",
				"Renata dos Santos Ferreira", "Rodrigo Roseo Lopes da Costa", "Sabrina Alves de Paiva",
				"Sergio de Jesus Severo", "Stefani Fernanda Pereira Tosi",
				"Talita gleice maria da gloria da Silva Lima", "Thiago da Silva Machado", "Vinícios Lisboa da Silva",
				"Vinicius Cardoso Siqueira Francisco" };
		int nota[] = new int[alunes.length];
		String matriculas[] = new String[alunes.length]; // MAT-0X
		boolean ativo[] = new boolean[alunes.length]; // true
		char op = ' ';
		String matriculaAlune;
		char auxAtivo = 'S';

		// mostrar tabela
		for (int x = 0; x < alunes.length; x++) {
			ativo[x] = true;
			if (x >= 9) {
				matriculas[x] = "MAT-" + (x + 1);
			}
			if (x < 9) {
				matriculas[x] = "MAT-0" + (x + 1);
			}
			System.out.print(
					"Matricula: " + matriculas[x] + " Alunes: " + alunes[x] + "\t\tNotas: " + nota[x] + " Status: ");
			if (ativo[x] == true) {
				System.out.print(" Ativo \n");
			}
			if (ativo[x] == false) {
				System.out.print(" Inativo \n");
			}
		}

		do {
			System.out.print("Informe a matrícula do aluno: ");
			matriculaAlune = ler.next().toUpperCase();

			for (int x = 0; x < alunes.length; x++) {
				if (matriculaAlune.equals(matriculas[x])) {
					System.out.printf("\nMatricula: %s - Alune: %s", matriculas[x], alunes[x]);
					System.out.printf("\nInforme a nota do alune: ");
					nota[x] = ler.nextInt();
					System.out.printf("\nQual o atual status do alune? (1-Ativo/2-Inativo): ");
					auxAtivo = ler.next().charAt(0);

					if (auxAtivo == '1') {
						ativo[x] = true;
					} else if (auxAtivo == '2') {
						ativo[x] = false;
					} else {
						System.out.printf("/nOpção inválida!");
					}

				}
			}
			System.out.println("\nVocê deseja continuar?");
			op = ler.next().toUpperCase().charAt(0);
		} while (op == 'S');

		for (int x = 0; x < alunes.length; x++) {
			if (nota[x] > 0 && ativo[x] == true) {
				System.out.print("\nMatricula: " + matriculas[x] + " Alunes: " + alunes[x] + " Notas: " + nota[x]
						+ " Status: Ativo.");
				if (nota[x] > 5) {
					System.out.printf("\nObs: Parabéns! Continue assim!");
				} else {
					System.out.println("\nObs: Precisa estudar mais, em?!");
				}

			}

		}
	}

}
