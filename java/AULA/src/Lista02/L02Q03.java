package Lista02;
import java.util.*;

public class L02Q03 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.print("Informe a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.print("De acordo com a sua idade, você está classificado na faixa Infantil.");
		}
		else if (idade > 14 && idade <= 17) {
			System.out.print("De acordo com a sua idade, você está classificado na faixa Juvenil.");
		}
		else if (idade > 17 && idade <= 25) {
			System.out.print("De acordo com a sua idade, você está classificado na faixa Adulto.");
		}
		else {
			System.out.print("Os parâmetros informados pela sua idade não correspondem a nenhuma faixa de classificação deste programa.");
		}


	}

}
