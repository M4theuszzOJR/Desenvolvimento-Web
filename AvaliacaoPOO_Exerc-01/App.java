import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Celular celular = new Celular("Samsung", "A24", 6f, "Android", false);
        int opcao;

        do {
            System.out.println("\n==========================================================");
            System.out.println("===== MENU =====");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Recarregar a bateria");
            System.out.println("4 - Fazer ligação");
            System.out.println("5 - Ver detalhes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.next();
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: Ligar o celular");
                    celular.ligar();
                    break;
                case 2:
                    System.out.println("Você escolheu: Desligar o celular");
                    celular.desligar();
                    break;
                case 3:
                    System.out.println("Você escolheu: Recarregar a bateria");
                    celular.carregar();
                    break;
                case 4:
                    System.out.print("Digite um número com 9 dígitos para fazer a ligação: ");
                    String numeroStr = scanner.next();
                    try {
                        int numero = Integer.parseInt(numeroStr);
                        celular.fazerLigacao(numero);
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: número inválido.");
                    }
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