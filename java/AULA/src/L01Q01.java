import java.util.Scanner;

public class L01Q01 
{/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa apenas em dias.*/
	public static void main (String[]args) 
	{
		int idade;
		int meses;
		int dias;
		int valorFinal;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		idade = leia.nextInt();
		System.out.print("E quantos meses? ");
		meses = leia.nextInt();
		System.out.print("E quantos dias? ");
		dias = leia.nextInt();
		
		valorFinal = (idade * 365) + (meses * 30) + dias;
		
		System.out.println("Sua idade, expressa em dias, é igual a: "+ valorFinal);
				
		
	
		
	}
	
}
