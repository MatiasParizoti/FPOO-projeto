package pacote2;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int plano = 0;

		if(plano != 4) {
			
			System.out.println("OLA , ESCOLHA UMA DOS PLANO DE SA�DE ABAIXO: ");
			System.out.println("1 - Escritur�rio ");
			System.out.println("2 - Secret�rio ");
			System.out.println("3 - Caixa ");
			System.out.println("4 - Gerente ");
			System.out.println("4 - Diretor ");

			plano = scanner.nextInt();
			
			switch (plano) {
			case 1:
				System.out.println("O AUMENTO DO SAL�RIO � DE 50%");
				break;
			case 2:
				System.out.println("O AUMENTO DO SAL�RIO � DE 35%");
				break;
			case 3:
				System.out.println("O AUMENTO DO SAL�RIO � DE 20%");
				break;
			case 4:
				System.out.println("O AUMENTO DO SAL�RIO � DE 10%");
				break;
			case 5:
				System.out.println(" ESSE CARGO N�O POSSUI UM AUMENTO SAL�RIAL");
				break;
			default:
				
				System.out.println("Cargo n�o disponivel Inv�lido ");
				break;
			}
		}
		
	}

}
