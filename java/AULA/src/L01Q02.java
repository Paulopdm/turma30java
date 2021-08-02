import java.util.Scanner;

public class L01Q02 
{/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e 
mostre-a expressa em anos, meses e dias. */
	public static void main (String[]args) 
	{
	int idadeDias;
	int anos;
	int meses;
	int dias;
	Scanner leia = new Scanner(System.in);
		
	System.out.print("Qual a sua idade expressa em dias? ");
	idadeDias = leia.nextInt();
	
	anos = idadeDias / 365;
	meses = (idadeDias % 365) / 30;
	dias = ((idadeDias % 365) % 30);
	
	System.out.print("Sua idade atual é: " + anos + " anos, " + meses + " meses e " + dias + "dias." );
	}
	


}
