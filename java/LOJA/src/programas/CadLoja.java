package programas;
import entidades.Produto;

public class CadLoja 
{
	public static void main (String[]args) 
	{
		Produto prod1 = new Produto("x110", "donnut" , 200.00, 10);
		
		prod1.retiraEstoque(5);
		System.out.println(prod1.getEstoque());
		
		
	
	
	}
	
	
}
