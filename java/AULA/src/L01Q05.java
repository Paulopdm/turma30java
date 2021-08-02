import java.util.Scanner; 

public class L01Q05 
{
	public static void main (String[]args) 
	{/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
 * */
		double nota1;
		double nota2;
		double nota3;
		double valor1;
		double valor2;
		double valor3;
		double valorMedia;
		
			Scanner leia = new Scanner(System.in);
		
			System.out.print("Insira a nota da primeira prova: ");
			nota1 = leia.nextDouble();
			System.out.print("Insira a nota da segunda prova: ");
			nota2 = leia.nextDouble();
			System.out.print("Insira a nota da terceira prova: ");
			nota3 = leia.nextDouble();

			valor1 = nota1 * 0.2;
			valor2 = nota2 * 0.3;
			valor3 = nota3 * 0.5;
			valorMedia = valor1 + valor2 + valor3;

			System.out.print("\nA média do estudante é igual a: " + valorMedia);
		
		
	}
	
}
