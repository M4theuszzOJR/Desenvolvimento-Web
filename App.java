import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        tamagotchi obj1 = new tamagotchi("Jotamaro",70, 70, 70, 70, 70, true);
        int opcao;

        do {
            System.out.println("\n----- O que você quer fazer com o seu pet ?-------");
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
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;        
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    break;
                default:
                    System.out.println();
            }
        } while (opcao != 3);

        scanner.close();



        
        //Aluno eu = new Aluno("Matheus", 454187001, 8f, 6.5f, 10f);
        //eu.calcularMedia();
        //Livro book = new Livro("Harry Potter", "J. K. Rowling", 366, false);
        //book.livre();
        //book.emprestar();
        //book.devolver();

        //tamagotchi obj2 = new tamagotchi(15, 0, 0, 0);
    
        obj1.Status();
    }
}
