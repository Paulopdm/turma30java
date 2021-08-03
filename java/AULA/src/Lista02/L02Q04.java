package Lista02;
import java.util.*;

public class L02Q04 
{
	public static void main (String[]args) 
	{
	Scanner leia = new Scanner(System.in);
	double numero;
	
	System.out.print("Informe um número: ");
	numero = leia.nextDouble();
	
	if(numero % 2 == 0 && numero != 0) {
		System.out.printf("\nEste é um número par!");
		System.out.printf("\nO valor da raiz quadrada de %.2f é igual a %.2f.",numero, Math.sqrt(numero));
	}
	else if (numero % 2 == 1) {
		System.out.printf("\nEste é um número impar!");
		System.out.printf("\nO valor de %.2f elevado ao quadrado é igual a %.2f",numero, Math.pow(numero, 2));
	}
	else if (numero == 0) {
		System.out.printf("\nZero é um número neutro! Na próxima, tente adicionar um valor inteiro e maior que zero!");
		
	}
	else if (numero < 0) {
		System.out.print("\nNúmeros negativos não são elegíveis para escolha entre par ou ímpar! Tente colocar um número inteiro e positivo da próxima vez!");
	}
	else {
		System.out.print("\nHmm.... o item digitado não era esperado aqui. Por que você não tenta colocar um número inteiro e maior que zero da próxima vez?");
	}
	
	
	}
}
