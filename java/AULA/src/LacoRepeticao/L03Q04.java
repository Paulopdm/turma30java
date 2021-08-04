package LacoRepeticao;
import java.util.*;

public class L03Q04 {

	public static void main(String[] args) 
	{ Scanner leia = new Scanner(System.in);
	
		/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada 
		 * uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, 
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
		char genero; //em variáveis para pegar opção de um usuário, sempre use o tipo Char
		int idade;
		char jeito;
		
		while (numeroEntrevistado != NUMERO_ENTREVISTA) { //pra pegar o candidato número, visto que no início do programa ele adiciona 1 ao número
			numeroEntrevistado++;
			System.out.printf("\nEntrevistado número: %d", numeroEntrevistado);
			System.out.print("\nInforme a sua idade: ");
			idade = leia.nextInt();
			System.out.print("\n1 - Masculino\n2 - Feminino\n3 - Outro \nInforme sua identidade de gênero(digite o número): ");
			genero = leia.next().charAt(0);
			System.out.print("\n1 - Sou uma pessoa calma.\n2 - Sou uma pessoa nervosa.\n3 - Sou uma pessoa agressiva.\nLeia as frases acima e em seguida digite o número da que mais combina com você: ");
			jeito = leia.next().charAt(0);
			
			if (jeito == '1') { //o número de pessoas calmas; 
				pessoasCalmas++;
			}
			if (genero == '2' && jeito == '2') { //o número de mulheres nervosas; 

				mulheresNervosas++;
			}
			if (genero == '1' && jeito == '3') { //o número de homens agressivos; 

				HomensAgressivos++;
			}
			if (genero == '3' && jeito == '1') { // o número de outros calmos;
				
				outrosCalmos++;
			}
			if(jeito == '2' && idade > 40) { //o número de pessoas nervosas com mais de 40 anos; 

				pessoasNervosasComMaisDe40++;
			}
			if(jeito == '1' &&  idade < 18) { //o número de pessoas calmas com menos de 18 anos.

				pessoasCalmasComMenosDe18++;
			}
			
			
		}
		
		System.out.print("\nDe acordo com os dados coletados na pesquisa:");
		System.out.printf("\nO número de pessoas calmas é igual a: %d", pessoasCalmas);
		System.out.printf("\nO número de mulheres nervosas é igual a: %d ", mulheresNervosas);
		System.out.printf("\nO número de homens agressivos é igual a: %d ", HomensAgressivos);
		System.out.printf("\nO número de pessoas de outras identidades de gênero calmas é igual a: %d ", outrosCalmos);
		System.out.printf("\nO número de pessoas nervosas com mais de 40 anos é igual a: %d ", pessoasNervosasComMaisDe40);
		System.out.printf("\nO número de pessoas calmas com menos de 18 anos é igual a: %d ", pessoasCalmasComMenosDe18);
		
		
		
		
	}

}
