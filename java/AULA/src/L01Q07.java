import java.util.Scanner;

public class L01Q07 
{
	public static void main (String[]args) 
	{
		int valorA, valorB, valorC, valorD, valorE, valorF;
		double valorX, valorY;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Atribua um valor inteiro e positivo para a variável a: ");
		valorA = leia.nextInt();
		System.out.print("Agora atribua um valor inteiro e positivo para a variável b: ");
		valorB = leia.nextInt();
		System.out.print("Agora atribua um valor inteiro e positivo para a variável c: ");
		valorC = leia.nextInt();
		System.out.print("Agora atribua um valor inteiro e positivo para a variável d: ");
		valorD = leia.nextInt();
		System.out.print("Agora atribua um valor inteiro e positivo para a variável e: ");
		valorE = leia.nextInt();
		System.out.print("Agora atribua um valor inteiro e positivo para a variável f: ");
		valorF = leia.nextInt();

		valorX = (valorC * valorE - valorB * valorF) / (valorA*valorE - valorB*valorD);

		valorY = (valorA * valorF - valorC * valorD) / (valorA * valorE - valorB * valorD);

		

		System.out.printf("\nO valor de X é igual a %.2f", valorX);
		System.out.printf("\nO valor de Y é igual a %.2f", valorY);
		
		
		
	}

}
