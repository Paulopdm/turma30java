package LacoRepeticao;
import java.util.*;

public class L03Q02 {

	public static void main(String[] args) 
	{/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
		Scanner leia = new Scanner(System.in);
		int numero;
		int contadorPar = 0;
		int contadorImpar = 0;
		int contadorErro = 0;
		
		for(int x=1; x<=10; x++) {
			System.out.print("Informe um n�mero inteiro e maior que 0: ");
			numero = leia.nextInt();
			
			if(numero > 0 && numero % 2 == 0 && numero != 0) {
				contadorPar++;
			}
			else if(numero > 0 && numero % 2 == 1) {
				contadorImpar++;
			}
			else {
				contadorErro++;
			}
			
		}
		
		if(contadorErro == 0) {
			System.out.printf("\nDos n�meros informados, %d s�o pares e %d s�o �mpares.", contadorPar, contadorImpar);
		}
		else if(contadorErro != 0) {
			System.out.printf("\nDos n�meros informados, %d s�o pares e %d s�o �mpares.", contadorPar, contadorImpar);
			System.out.printf("\nMas vi tamb�m que %d n�mero(s) informado(s) n�o se aplica(m) � regra par/�mpar.", contadorErro);
		}

	}

}
