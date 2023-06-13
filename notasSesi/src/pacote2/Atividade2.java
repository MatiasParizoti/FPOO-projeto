
package pacote2;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String codigo;
		double valor = 0, quantidade, total = 0;
		

		System.out.println("DIGITE UM DOS CÓDIGOS");
		codigo = scanner.next();
		
		switch(codigo) {
		case "A001":
			
			System.out.println("quantos produtos você deseja comprar");
			quantidade = scanner.nextDouble();
			
			total = quantidade * 7.50;
			
			break;
			
		case "A002":
						
					 System.out.println("quantos produtos você deseja comprar");
					 quantidade = scanner.nextDouble();
					 
						
					total = quantidade * 9.90;
						
			break;
			
			case "A003":
						
				System.out.println("quantos produtos você deseja comprar");
				 quantidade = scanner.nextDouble();
						
					total = quantidade * 14.00;
					
					break;
					
			case "A004":
				
				System.out.println("quantos produtos você deseja comprar");
				 quantidade = scanner.nextDouble();
				
				total = quantidade * 19.99;
				
				break;
			default:
							
					System.out.println("Plano Inválido ");
					break;
		}
		System.out.println("o valor total é " + total);
	}
}