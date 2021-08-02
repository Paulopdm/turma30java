import java.util.Scanner;

public class L01Q06 
{
	public static void main (String[]args) 
	{
	
		double x1;
		double x2;
		double y1;
		double y2;
		double p1;
		double p2;
		double d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de X1: ");
		x1 = leia.nextDouble();
		System.out.print("Digite o valor de X2: ");
		x2 = leia.nextDouble();
		System.out.print("Digite o valor de Y1: ");
		y1 = leia.nextDouble();
		System.out.print("Digite o valor de Y2: ");
		y2 = leia.nextDouble();

		p1 = Math.pow((x2-x1), 2);
		p2 = Math.pow((x2-x1), 2);
		d = Math.sqrt(p1 + p2);
		
		System.out.printf("O valor de D = %.2f", d);
	}
}
