package LacoRepeticao;
import java.util.*;

public class L03Q04 {

	public static void main(String[] args) 
	{ Scanner leia = new Scanner(System.in);
	
		/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada 
		 * uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2, 
		 * se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, 
		 * calcule e mostre: (WHILE)*/ 

		final int NUMERO_ENTREVISTA = 150;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int HomensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasComMaisDe40 = 0;
		int pessoasCalmasComMenosDe18 = 0;
		int errados = 0;
		int numeroEntrevistado = 0;
		char genero; //em vari�veis para pegar op��o de um usu�rio, sempre use o tipo Char
		int idade;
		char jeito;
		
		while (numeroEntrevistado != NUMERO_ENTREVISTA) { //pra pegar o candidato n�mero, visto que no in�cio do programa ele adiciona 1 ao n�mero
			numeroEntrevistado++;
			System.out.printf("\nEntrevistado n�mero: %d", numeroEntrevistado);
			System.out.print("\nInforme a sua idade: ");
			idade = leia.nextInt();
			System.out.print("\n1 - Masculino\n2 - Feminino\n3 - Outro \nInforme sua identidade de g�nero(digite o n�mero): ");
			genero = leia.next().charAt(0);
			System.out.print("\n1 - Sou uma pessoa calma.\n2 - Sou uma pessoa nervosa.\n3 - Sou uma pessoa agressiva.\nLeia as frases acima e em seguida digite o n�mero da que mais combina com voc�: ");
			jeito = leia.next().charAt(0);
			
			if (jeito == '1') { //o n�mero de pessoas calmas; 
				pessoasCalmas++;
			}
			if (genero == '2' && jeito == '2') { //o n�mero de mulheres nervosas; 

				mulheresNervosas++;
			}
			if (genero == '1' && jeito == '3') { //o n�mero de homens agressivos; 

				HomensAgressivos++;
			}
			if (genero == '3' && jeito == '1') { // o n�mero de outros calmos;
				
				outrosCalmos++;
			}
			if(jeito == '2' && idade > 40) { //o n�mero de pessoas nervosas com mais de 40 anos; 

				pessoasNervosasComMaisDe40++;
			}
			if(jeito == '1' &&  idade < 18) { //o n�mero de pessoas calmas com menos de 18 anos.

				pessoasCalmasComMenosDe18++;
			}
			
			
		}
		
		System.out.print("\nDe acordo com os dados coletados na pesquisa:");
		System.out.printf("\nO n�mero de pessoas calmas � igual a: %d", pessoasCalmas);
		System.out.printf("\nO n�mero de mulheres nervosas � igual a: %d ", mulheresNervosas);
		System.out.printf("\nO n�mero de homens agressivos � igual a: %d ", HomensAgressivos);
		System.out.printf("\nO n�mero de pessoas de outras identidades de g�nero calmas � igual a: %d ", outrosCalmos);
		System.out.printf("\nO n�mero de pessoas nervosas com mais de 40 anos � igual a: %d ", pessoasNervosasComMaisDe40);
		System.out.printf("\nO n�mero de pessoas calmas com menos de 18 anos � igual a: %d ", pessoasCalmasComMenosDe18);
		
		
		
		
	}

}
