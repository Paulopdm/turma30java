package LojaDonnuts;

import java.util.*;

public class notaFiscal {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char formaDePagamento;
		char sn = 'S';

		System.out.printf("\nM�todos de pagamento: ");
		System.out.printf("\n1 - � vista com 10% de desconto.");
		System.out.printf("\n2 - No cart�o de cr�dito em 1x (10% de acr�scimo.)");
		System.out.printf("\n3 - No cart�o de cr�dito em 2x (15% de acr�scimo.");
		System.out.printf("\nInforme a forma de pagamento desejada [1/2/3]: ");
		formaDePagamento = leia.next().charAt(0);


		if (formaDePagamento == '1') { 
			System.out.printf("\n*******DONNUTIX*******\n\n");    
			System.out.printf("****NOTA FISCAL****");
			for (int x = 0; x < 10; x++) {                        
				if (PRODUTOFINAL[x] != "") {
					System.out.print("%d - %s - R$%.2f \n", QTDEFINAL[x], PRODUTOFINAL[x], VALORFINAL[x]);
				}
			}
			System.out.printf("\nValor total da nota fiscal: R$%.2f", valorFinal);
			System.out.printf("\nImpostos sobre a nota: R$%.2f", valorFinal*0.09);
			System.out.printf("\nValor do desconto: R$%2.f", valorFinal*0.1);
			valorFECHADO = valorFinal - valorFinal*0.1;
			System.out.printf("\nValor total a pagar: R$%.2f", valorFECHADO);
			System.out.printf("\nObrigado pela prefer�ncia!");
		}
		else if (formaDePagamento == '2') { 
			System.out.printf("\n*******DONNUTIX*******\n\n");     
			System.out.printf("****NOTA FISCAL****");
			for (int x = 0; x < 10; x++) {                         
				if (PRODUTOFINAL[x] != "") {
					System.out.print("%d - %s - R$%.2f \n", QTDEFINAL[x], PRODUTOFINAL[x], VALORFINAL[x]);
				}
			}
			System.out.printf("\nValor total da nota fiscal: R$%.2f", valorFinal);
			System.out.printf("\nImpostos sobre a nota: R$%.2f", valorFinal*0.09);
			System.out.printf("\nValor do acr�scimo: R$%2.f", valorFinal*0.1);
			valorFECHADO = valorFinal + valorFinal*0.1;
			System.out.printf("\nValor total a pagar: R$%.2f", valorFECHADO);
			System.out.printf("\nObrigado pela prefer�ncia!");
		}
		else if (formaDePagamento == '3') { 
			System.out.printf("\n*******DONNUTIX*******\n\n");     
			System.out.printf("****NOTA FISCAL****");
			for (int x = 0; x < 10; x++) {                         
				if (PRODUTOFINAL[x] != "") {
					System.out.print("%d - %s - R$%.2f \n", QTDEFINAL[x], PRODUTOFINAL[x], VALORFINAL[x]);
				}
			}
			System.out.printf("\nValor total da nota fiscal: R$%.2f", valorFinal);
			System.out.printf("\nImpostos sobre a nota: R$%.2f", valorFinal*0.09);
			System.out.printf("\nValor do acr�scimo: R$%2.f", valorFinal*0.15);
			valorFECHADO = valorFinal + valorFinal*0.15;
			System.out.printf("\nValor total a pagar: R$%.2f", valorFECHADO);
			System.out.printf("\nObrigado pela prefer�ncia!");
		}
		
		else { // caso o usu�rio n�o informe uma forma de pagamento v�lida (ele ir� pra pergunta se quer continuar comprando)
			System.out.println("\nVoc� informou uma forma de pagamento inv�lida.");
		}
		
		
		System.out.printf("\nDeseja continuar comprando? [S/N]");
		sn = leia.next().toUpperCase().charAt(0);
		
	}
}
