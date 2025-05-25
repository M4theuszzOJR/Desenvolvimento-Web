public class Tamagotchi {
    String nome;
    int fome;
    int felicidade;
    int sono;
    int saude;
    int higiene;
    boolean vivo;

    public Tamagotchi (String nome, int fome, int felicidade, int sono, int saude, int higiene, boolean vivo) {
        this.nome = nome;
        this.fome = fome;
        this.felicidade = felicidade;
        this.sono = sono;
        this.saude = saude;
        this.higiene = higiene;
        this.vivo = vivo;
    }

    void Status () {
        System.out.format("Status do %s:\n Fome: %d\n felicidade: %d \n sono: %d \n saude: %d \n higiene: %d\n ", nome, fome, felicidade, sono, saude, higiene);
    }

    void Fim () {
        if (vivo == false) {
            System.out.println("Fim de jogo.");
        }
    }

    void Brincar () {
        felicidade += 40;
        sono -= 30;
        higiene -= 30;
        fome -= 35;
        saude += 20;
    }

    void Dormir () {
        felicidade += 25;
        sono += 40;
        higiene -= 20;
        fome -= 20;
        saude += 20;
    }

    void Banho () {
        felicidade += 15;
        saude += 10;
        higiene += 50;
    }

    void Comer () {
        felicidade += 20;
        saude += 20;
        sono -= 15;
        higiene -= 20;
    }

    void TomarRemedio () {
        saude += 60;
        felicidade += 25;
    }

}