package LacoRepeticao;
import java.util.*;

public class L03Q02 {

	public static void main(String[] args) 
	{/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
		Scanner leia = new Scanner(System.in);
		int numero;
		int contadorPar = 0;
		int contadorImpar = 0;
		int contadorErro = 0;
		
		for(int x=1; x<=10; x++) {
			System.out.print("Informe um número inteiro e maior que 0: ");
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
			System.out.printf("\nDos números informados, %d são pares e %d são ímpares.", contadorPar, contadorImpar);
		}
		else if(contadorErro != 0) {
			System.out.printf("\nDos números informados, %d são pares e %d são ímpares.", contadorPar, contadorImpar);
			System.out.printf("\nMas vi também que %d número(s) informado(s) não se aplica(m) à regra par/ímpar.", contadorErro);
		}

	}

}
