import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro("Harry Potter", "J.K Rowling", 1999, 348);
        Audiobook audiobook = new Audiobook("A Guerra dos Tronos", "George Martin", 2019, 37.5);
        int opcao;

        do {
            System.out.println("\n============================================================================");
            System.out.println("\n===== MENU DA BIBLIOTECA =====");
            System.out.println("1 - Emprestar Livro");
            System.out.println("2 - Ler Livro");
            System.out.println("3 - Devolver Livro");
            System.out.println("4 - Ver disponibilidade de Livro");
            System.out.println("5 - Emprestar audiobook");
            System.out.println("6 - Reproduzir audiobook");
            System.out.println("7 - Devolver audiobook");
            System.out.println("8 - Ver disponibilidade de Audiobook");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt(); 

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: Emprestar Livro");
                    livro.emprestar();
                    break;
                case 2:
                    System.out.println("Você escolheu: Ler Livro");
                    livro.ler();
                    break;
                case 3:
                    System.out.println("Você escolheu: Devolver Livro");
                     livro.devolver();
                    break;
                case 4:
                    System.out.println("Você escolheu: Ver disponibilidade de Livro");
                    if (livro.isDisponivel()) {
                    System.out.format("O livro %s está disponível.\n", livro.nome ); 
                     } else {
                     System.out.format("O livro %s não está disponível.\n", livro.nome);
                     }
                    break;
                case 5:
                    System.out.println("Você escolheu: Emprestar audiobook");
                     audiobook.emprestar();
                    break;
                case 6:
                    System.out.println("Você escolheu: Reproduzir audiobook");
                     audiobook.reproduzir();
                    break;
                case 7:
                    System.out.println("Você escolheu: Devolver audiobook");
                     audiobook.devolver();
                    break;
                case 8:
                    System.out.println("Você escolheu: Ver disponibilidade de Audiobook");
                    if (audiobook.isDisponivel()) {
                    System.out.format("O audiobook %s está disponível.\n", audiobook.nome ); 
                     } else {
                     System.out.format("O audiobook %s não está disponível.\n", audiobook.nome);
                     }
                    break;
                case 0:
                    System.out.println("Saindo da biblioteca...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0); 

        scanner.close();
    }
    
}
