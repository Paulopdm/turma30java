package Lista02;
import java.util.*;

public class L02Q04 
{
	public static void main (String[]args) 
	{
	Scanner leia = new Scanner(System.in);
	double numero;
	
	System.out.print("Informe um n�mero: ");
	numero = leia.nextDouble();
	
	if(numero % 2 == 0 && numero != 0) {
		System.out.printf("\nEste � um n�mero par!");
		System.out.printf("\nO valor da raiz quadrada de %.2f � igual a %.2f.",numero, Math.sqrt(numero));
	}
	else if (numero % 2 == 1) {
		System.out.printf("\nEste � um n�mero impar!");
		System.out.printf("\nO valor de %.2f elevado ao quadrado � igual a %.2f",numero, Math.pow(numero, 2));
	}
	else if (numero == 0) {
		System.out.printf("\nZero � um n�mero neutro! Na pr�xima, tente adicionar um valor inteiro e maior que zero!");
		
	}
	else if (numero < 0) {
		System.out.print("\nN�meros negativos n�o s�o eleg�veis para escolha entre par ou �mpar! Tente colocar um n�mero inteiro e positivo da pr�xima vez!");
	}
	else {
		System.out.print("\nHmm.... o item digitado n�o era esperado aqui. Por que voc� n�o tenta colocar um n�mero inteiro e maior que zero da pr�xima vez?");
	}
	
	
	}
}
