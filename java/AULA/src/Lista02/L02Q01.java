package Lista02;
import java.util.*;

public class L02Q01 
{

	public static void main(String[] args) 
	{
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		int comparador = 0;
		
		System.out.printf("Informe um número: ");
		numero1 = leia.nextInt();
		if (numero1 > comparador) 
		{
			comparador = numero1;
		}
		System.out.printf("Informe um novo número: ");
		numero2 = leia.nextInt();
		if (numero2 > comparador) 
		{
			comparador = numero2;
		}
		
		System.out.printf("Informe um terceiro número: ");
		numero3 = leia.nextInt();
		if (numero3 > comparador) 
		{
			comparador = numero3;
		}
		
		System.out.printf("Dentre os 3 números informados, o maior é %d", comparador);
		
		
				
				
	}

}
