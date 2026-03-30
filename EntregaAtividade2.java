import java.util.Scanner;

public class EntregaAtividade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int exercicio = -1;

		while (exercicio != 0) {
			System.out.println("\n----------------------//----------------------");
			System.out.println("\nEntrega 2 - Hands On: Estrutura de Controle");
			System.out.println("\n----EXERCÍCIOS----");
			System.out.println("1. Cara Feliz");
			System.out.println("2. Distância entre os dois pontos");
			System.out.println("3. Contar letras, espaços, números e outros caracteres");
			System.out.println("4. Questão de múltipla escolh");
			System.out.println("\n==== PARA SAIR ====");
			System.out.println("0. Sair");
			System.out.print("\nEscolha um exercício: ");
			exercicio = sc.nextInt();

			switch (exercicio) {

			case 1:

				System.out.println(" +\"\"\"\"\"+");
				System.out.println("[| o o |]");
				System.out.println(" |  ^  |");
				System.out.println(" | '-' |");
				System.out.println(" +-----+");

				break;

			case 2:
				
				System.out.println("====Calculadora Distancia====\n");

		        
		        double r = 6371.01; // raio da Terra

		        System.out.println("Latitude da coordenada 1:"); //25
		        double x1 = sc.nextDouble();
		        System.out.println("Longitude da coordenada 1:"); //35
		        double y1 = sc.nextDouble();
		        System.out.println("Latitude da coordenada 2:"); //35,5
		        double x2 = sc.nextDouble();
		        System.out.println("Longitude da coordenada 2:"); //25,5
		        double y2 = sc.nextDouble();

		        
		        x1 = Math.toRadians(x1);
		        y1 = Math.toRadians(y1);
		        x2 = Math.toRadians(x2);
		        y2 = Math.toRadians(y2);

		        
		        double a = Math.sin(x1) * Math.sin(x2);
		        double b = Math.cos(x1) * Math.cos(x2);
		        double c = Math.cos(y1 - y2);

		       
		        double resultado = a + (b * c);
		        double d = r * Math.acos(resultado);

		        
		        System.out.println("A distância entre esses pontos é: " +  d);

		        sc.close();

				break;

			case 3:

				System.out.print("====CONTADOR JAVA====");
				System.out.print("\nDigite um texto: ");
				String texto = sc.nextLine();

				int letras = 0;
				int espacos = 0;
				int numeros = 0;
				int outros = 0;

				for (int i = 0; i < texto.length(); i++) {

					char c1 = texto.charAt(i);

					if ((c1 >= 'a' && c1 <= 'z') || (c1 >= 'A' && c1 <= 'Z')) {
						letras++;
					} else if (c1 >= '0' && c1 <= '9') {
						numeros++;
					} else if (c1 == ' ') {
						espacos++;
					} else {
						outros++;
					}
				}

				System.out.println("Letras: " + letras);
				System.out.println("Espacos: " + espacos);
				System.out.println("Numeros: " + numeros);
				System.out.println("Outros: " + outros);
				
				break;

			case 4:
				int tentativas = 0;
				char resp;

				do {

					tentativas++;
					
					System.out.println("====QUESTÃO MULTIPLA ESCOLHA====\n");

					System.out.println("O que é Inteligência Artificial (IA)?");
					System.out.println("a) Um tipo de hardware usado em computadores");
					System.out.println("b) Um sistema que permite máquinas aprenderem e tomarem decisões");
					System.out.println("c) Um programa usado apenas para jogos");
					System.out.println("d) Um vírus de computador avançado");
					System.out.println("e) Um tipo de linguagem de programação");

					resp = sc.next().charAt(0);

					switch (resp) {
					case 'b':
						System.out.println("Resposta correta");
						System.out.println("Acertou na tentativa: " + tentativas);
						break;
					default:
						System.out.println("Resposta incorreta");
					}

				} while (resp != 'b' && tentativas < 3);

				if (resp != 'b') {
					System.out.println("Resposta incorreta nas 3 tentativas");
				}

				sc.close();

				break;


			case 0:
				System.out.println("\nOperação finalizada.\nSaindo...");
				System.out.println("\nALUNO: Ederson Siqueira dos Santos.\nRA: 42321851.");
				break;

			default:
				System.out.println("\nOpção inválida.\nEscolha uma das opções disponíveis.");
				break;

			}
		}
		sc.close();
	}
}
