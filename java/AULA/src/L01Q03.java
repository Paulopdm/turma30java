import java.util.Scanner;

public class L01Q03 
{
/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma 
 * f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

	public static void main (String[]args) 
	{
	
		int tempoSegundos;
		int horas;
		int minutos;
		int segundos;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Qual o tempo, em segundos, da dura��o do turno na f�brica? ");
		tempoSegundos = leia.nextInt();
		
		horas = tempoSegundos / 360;
		minutos = (tempoSegundos % 360) / 60;
		segundos = (tempoSegundos % 360) % 60;
		
		System.out.println("O tempo de dura��o do turno na f�brica � " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
				
		
		
		
	}


}
