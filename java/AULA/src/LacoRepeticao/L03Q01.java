package LacoRepeticao;

public class L03Q01 
{
	public static void main (String[]args) 
	{
		/*Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/
		final int LIMITE_MINIMO = 1000;
		final int LIMITE_MAXIMO = 1999;
		
		System.out.printf("Os n�meros entre %d e %d que ao serem divididos por 11 reste 5 s�o: ", LIMITE_MINIMO, LIMITE_MAXIMO);
		for (int x=LIMITE_MINIMO; x<=LIMITE_MAXIMO-4; x++) {
			if(x % 11 == 5) {
				System.out.print(x+" ; ");
			}
		}
		System.out.print("1996.");
		
		
	}
}
