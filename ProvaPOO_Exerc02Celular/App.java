import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Celular celular = new Celular("Samsung", "A24", 6f, "Android", false);
        int opcao;

        do {
            System.out.println("\n==========================================================");
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Recarregar a bateria");
            System.out.println("4 - Fazer ligação");
            System.out.println("5 - Ver detalhes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt(); 

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: Ligar o celular");
                    celular.ligar();
                    break;
                case 2:
                    System.out.println("Você escolheu: Desligar o Celular");
                    celular.desligar();
                    break;
                case 3:
                    System.out.println("Você escolheu: Recarregar a bateria");
                     celular.carregar();
                    break;
                case 4:
                    System.out.println("Você escolheu: Fazer ligação");
                    System.out.println("Digite um número com 9 dígitos para fazer a ligação: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    celular.fazerLigacao(numero);
                    break;
                case 5:
                    celular.detalhes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0); 

        scanner.close();
    }
    
}