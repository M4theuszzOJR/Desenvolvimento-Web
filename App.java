import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Tamagotchi obj1 = new Tamagotchi("Jotamaro",70, 70, 70, 70, 70, true);
        int opcao;

        do {
            System.out.println("\n----- O que você quer fazer com o seu pet ? -----");
            System.out.println("1. Brincar");
            System.out.println("2. Comer");
            System.out.println("3. Dormir");
            System.out.println("4. Tomar banho");
            System.out.println("5. Tomar remedio");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    obj1.Brincar();
                    System.out.println("Você está brincando com seu pet! ");
                    System.out.println("\n-------------");
                    obj1.Status();
                    break;
                case 2:
                    obj1.Comer();
                     System.out.println("O seu bichinho acabou de comer!");
                     System.out.println("\n-------------");
                     obj1.Status();
                    break;
                case 3:
                    obj1.Dormir();
                     System.out.println("O seu bichinho esta dormindo.");
                     System.out.println("\n-------------");
                    obj1.Status();
                    break;        
                case 4:
                    obj1.Banho();
                    System.out.println("O seu bichinho esta sujo!\n É hora do banho!");
                    System.out.println("\n-------------");
                    obj1.Status();
                    break;
                case 5:
                    obj1.TomarRemedio();
                    System.out.println("O seu bichinho esta bem agora!,");
                    System.out.println("\n-------------");
                    obj1.Status();
                    break;
                case 6:
                    obj1.Fim();
                    System.out.println("Jogo encerrado.");
                    break;
                default:
                    System.out.println("Erro! Digite uma opção válida.");
            }
        } while (opcao != 6);

        scanner.close();

        //tamagotchi obj2 = new tamagotchi(15, 0, 0, 0);
    
    }
}
