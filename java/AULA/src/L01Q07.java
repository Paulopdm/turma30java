import java.util.Scanner;

public class L01Q07 
{
	public static void main (String[]args) 
	{
		int valorA, valorB, valorC, valorD, valorE, valorF;
		double valorX, valorY;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Atribua um valor inteiro e positivo para a vari�vel a: ");
		valorA = leia.nextInt();
		System.out.print("Agora atribua um valor inteiro e positivo para a vari�vel b: ");
		valorB = leia.nextInt();
		System.out.print("Agora atribua um valor inteiro e positivo para a vari�vel c: ");
		valorC = leia.nextInt();
		System.out.print("Agora atribua um valor inteiro e positivo para a vari�vel d: ");
		valorD = leia.nextInt();
		System.out.print("Agora atribua um valor inteiro e positivo para a vari�vel e: ");
		valorE = leia.nextInt();
		System.out.print("Agora atribua um valor inteiro e positivo para a vari�vel f: ");
		valorF = leia.nextInt();

		valorX = (valorC * valorE - valorB * valorF) / (valorA*valorE - valorB*valorD);

		valorY = (valorA * valorF - valorC * valorD) / (valorA * valorE - valorB * valorD);

		

		System.out.printf("\nO valor de X � igual a %.2f", valorX);
		System.out.printf("\nO valor de Y � igual a %.2f", valorY);
		
		
		
	}

}
