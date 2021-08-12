import java.util.*;

public class CadFunc 
{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		List<Funcionario> folha = new ArrayList<>();
		char tipo;
		
		do {
			System.out.printf("Funcionário - F ou Terceiro - T?");
			tipo = leia.next().toUpperCase().charAt(0);
			System.out.printf("Digite a matrícula: ");
			String matricula = leia.next().toUpperCase();
			System.out.printf("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.printf("Digite o valor da hora trabalhada: R$");
			double valorHora = leia.nextDouble();
			if(tipo == 'T') {
				System.out.printf("Informe o valor adicional: R$");
				double adicional = leia.nextDouble();
			}
			
			
		}while(true)
		

		
	}

}
