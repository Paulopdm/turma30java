import java.util.Scanner;

public class L01Q04 
{
	public static void main (String[]args) 
	{
		double valorA;
		double valorB;
		double valorC;
		double valorR;
		double valorS;
		double valorD;

		Scanner leia = new Scanner(System.in);
				
		System.out.print("Atribua um valor inteiro e positivo para a vari�vel A: ");
		valorA = leia.nextInt();
		System.out.print("Atribua um valor inteiro e positivo para a vari�vel B: ");
		valorB = leia.nextInt();
		System.out.print("Atribua um valor inteiro e positivo para a vari�vel C: ");
		valorC = leia.nextInt();

		
		valorR = Math.pow((valorA + valorB), 2);

		
		valorS = Math.pow((valorB + valorC), 2);

		//formula D
		valorD = (valorR + valorS) / 2;

		System.out.print("Atribuindo as vari�veis na f�rmula, obtivemos o resultado de D igual a: "+valorD);

		
		
	}
	
}
