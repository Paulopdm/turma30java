package Lista02;
import java.util.*;

public class L02Q02 
{
	public static void main (String[]args) 
	{
		int numero1, numero2, numero3;
		int maior = 0, meio = 0, menor= 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Informe um número: ");
		numero1 = leia.nextInt();
		System.out.printf("Informe um segundo número: ");
		numero2 = leia.nextInt();
		System.out.printf("Informe um terceiro número: ");
		numero3 = leia.nextInt();
		
		
		if (numero1 < numero2 && numero2 < numero3) {
			System.out.print("A ordem crescente dos números é: " + numero1 + " ; " + numero2 + " ; " + numero3 + ".");
		}
		if (numero1 < numero3 && numero3 < numero2) {
			System.out.print("A ordem crescente dos números é: " + numero1 + " ; " + numero3 + " ; " + numero2 + ".");
		}
		if (numero2 < numero1 && numero1 < numero3) {
			System.out.print("A ordem crescente dos números é: " + numero2 + " ; " + numero1 + " ; " + numero3 + ".");
		}
		if (numero2 < numero3&& numero3< numero1) {
			System.out.print("A ordem crescente dos números é: " + numero2 + " ; " + numero3 + " ; " + numero1+ ".");
		}
		if (numero3 < numero1 && numero1 < numero2) {
			System.out.print("A ordem crescente dos números é: " + numero3 + " ; " + numero1 + " ; " + numero2 + ".");
		}
		if (numero3 < numero2 && numero2 < numero1) {
			System.out.print("A ordem crescente dos números é: " + numero3 + " ; " + numero2 + " ; " + numero1 + ".");
		}
		if (numero1 == numero2 && numero2 < numero3) {
			System.out.print("A ordem crescente dos números é: " + numero1 + " ; " + numero2 + " ; " + numero3 + ".");
		}
		if (numero1 == numero2 && numero2 > numero3) {
			System.out.print("A ordem crescente dos números é: " + numero3 + " ; " + numero1 + " ; " + numero2 + ".");
		}
		if (numero1 == numero3 && numero3 > numero2) {
			System.out.print("A ordem crescente dos números é: " + numero2 + " ; " + numero1 + " ; " + numero3 + ".");
		}
		if (numero1 == numero3 && numero3 < numero2) {
			System.out.print("A ordem crescente dos números é: " + numero3 + " ; " + numero1 + " ; " + numero2 + ".");
		}
		if (numero2 == numero3 && numero3 > numero1) {
			System.out.print("A ordem crescente dos números é: " + numero1 + " ; " + numero2 + " ; " + numero3 + ".");
		}
		if (numero2 == numero3 && numero3 < numero1) {
			System.out.print("A ordem crescente dos números é: " + numero3 + " ; " + numero2 + " ; " + numero1 + ".");
		}
		if (numero2 == numero3 && numero3 == numero1) {
			System.out.print("A ordem crescente dos números é: " + numero3 + " ; " + numero2 + " ; " + numero1 + ".");
		}
	
	
	}
	
	
	
}
