package pacote2;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int plano = 0;

		if(plano != 4) {
			
			System.out.println("OLA , ESCOLHA UMA DOS PLANO DE SAÚDE ABAIXO: ");
			System.out.println("1 - PLANO BÁSICO ");
			System.out.println("2 - PLANO BRONZE ");
			System.out.println("3 - PLANO PRATA ");
			System.out.println("4 - PLANO OURO ");

			plano = scanner.nextInt();
			
			switch (plano) {
			case 1:
				System.out.println("O PLANO BÁSICO CUSTA R$ 150,00 ");
				break;
			case 2:
				System.out.println("O PLANO BRONZE CUSTA R$ 220,00 ");
				break;
			case 3:
				System.out.println("O PLANO PRATA CUSTA R$ 310,00 ");
				break;
			case 4:
				System.out.println("O PLANO OURO CUSTA R$ 450,00 ");
				break;
			default:
				
				System.out.println("Plano Inválido ");
				break;
			}
		}
	}

}
