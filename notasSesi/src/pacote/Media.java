package pacote;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int nota1;
		
		int nota2;
		
		int nota3;
		
		int nota4;
		
		int media;
		
		System.out.println("Escreva as notas abaixo");
		
		System.out.println("Nota 1");
		nota1 = scanner.nextInt();
		
		System.out.println("Nota 2");
		nota2 = scanner.nextInt();


		System.out.println("Nota 3");
		nota3 = scanner.nextInt();
		
		System.out.println("Nota 4");
		nota4 = scanner.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media foi " + media);
		
		if (media > 7) {
			
			System.out.println("Aprovado");
			
		}else if ( media <= 5 && media >= 7) {
			
			System.out.println("Recuperação");
			
		}else{
			
			System.out.println("Reprovado");
		}

	}

}
