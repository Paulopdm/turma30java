

import java.util.Scanner;

public class Exemplos 
{
	
	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		char tratamento; //m, f, e
		double salarioBruto, salarioLiquido;
		double imposto;
		
		
		System.out.print("Digite seu nome completo: ");
		nome = leia.nextLine().toUpperCase();
		System.out.print("Informe como deseja ser tratado [M - masculino]");
		tratamento= leia.next().toUpperCase().charAt(0);
		System.out.print("Informe seu salario bruto em reais: ");
		salarioBruto = leia.nextDouble();
		
		if (tratamento == 'M') {
			System.out.println("Caro Sr "+nome);
			if (salarioBruto<=2000) {
				System.out.println("Voc� est� isento do imposto!");
				System.out.println("Seu sal�rio l�quido � igual a R$"+salarioBruto);
			}
			else if (salarioBruto > 2000 && salarioBruto <= 5000) {
				imposto = salarioBruto * 0.15;
				System.out.printf("\nO valor do imposto � igual a: R$%.2f", imposto);
				salarioLiquido = salarioBruto - imposto;
				System.out.printf("\nO seu sal�rio l�quido � igual a: R$%.2f",salarioLiquido);
			}
			else if (salarioBruto > 5000) {
				imposto = salarioBruto * 0.25;
				System.out.printf("\nO valor do imposto � igual a: R$%.2f", imposto);
				salarioLiquido = salarioBruto - imposto;
				System.out.printf("\nO seu sal�rio l�quido � igual a: R$%.2f",salarioLiquido);
			}

			if (tratamento == 'F') {
				System.out.println("/nCara Sra "+nome);
				if (salarioBruto<=2000) {
					System.out.print("\nVoc� est� isenta do imposto!");
					System.out.print("\nSal�rio l�quido = R$"+salarioBruto);
				}
				else if (salarioBruto > 2000 && salarioBruto <= 5000) {
					imposto = salarioBruto * 0.15;
					System.out.printf("\nO valor do imposto � igual a: R$%.2f", imposto);
					salarioLiquido = salarioBruto - imposto;
					System.out.printf("\nO seu sal�rio l�quido � igual a: R$%.2f",salarioLiquido);
				}
				else if (salarioBruto > 5000) {
					imposto = salarioBruto * 0.25;
					System.out.printf("\nO valor do imposto � igual a: R$%.2f", imposto);
					salarioLiquido = salarioBruto - imposto;
					System.out.printf("\nO seu sal�rio l�quido � igual a: R$%.2f",salarioLiquido);
				}
				
				if (tratamento == 'E') {
					System.out.println("Care Sre "+nome);
					if (salarioBruto<=2000) {
						System.out.println("Voc� est� isente do imposto!");
						System.out.println("Sal�rio l�quido = R$"+salarioBruto);
					}
					else if (salarioBruto > 2000 && salarioBruto <= 5000) {
						imposto = salarioBruto * 0.15;
						System.out.printf("\nO valor do imposto � igual a: R$%.2f", imposto);
						salarioLiquido = salarioBruto - imposto;
						System.out.printf("\nO seu sal�rio l�quido � igual a: R$%.2f",salarioLiquido);
					}
					else if (salarioBruto > 5000) {
						imposto = salarioBruto * 0.25;
						System.out.printf("\nO valor do imposto � igual a: R$%.2f", imposto);
						salarioLiquido = salarioBruto - imposto;
						System.out.printf("\nO seu sal�rio l�quido � igual a: R$%.2f",salarioLiquido);
					}

			
			
		}
		
		
		
		
	}

}
		

}}