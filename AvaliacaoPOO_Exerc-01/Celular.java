public class Celular {
    private String marca;
    private String modelo;
    private float tamanhoTela;
    private String sistemaOperacional;
    private int bateria;
    private boolean ligado;

    public Celular(String marca, String modelo, float tamanhoTela, String sistemaOperacional, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoTela = tamanhoTela;
        this.sistemaOperacional = sistemaOperacional;
        this.bateria = 100;
        this.ligado = ligado;
    }

    public void detalhes() {
        System.out.println("=== DETALHES ===");
        System.out.println(this);
    }

    public void ligar() {
        if (bateria > 0) {
            if (!ligado) {
                ligado = true;
                System.out.printf("O %s está ligado.\n", getModelo());
            } else {
                System.out.printf("Seu %s já está ligado!\n", getModelo());
            }
        } else {
            System.out.printf("Seu %s está sem bateria. Não é possível ligar.\n", getModelo());
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.printf("O %s foi desligado.\n", getModelo());
        } else {
            System.out.printf("O %s já está desligado.\n", getModelo());
        }
    }

    public void carregar() {
        bateria = 100;
        System.out.printf("O seu %s foi recarregado.\nBateria: %d%%\n", getModelo(), getBateria());
    }

    public void fazerLigacao(int numero) {
        if (ligado) {
            if (String.valueOf(numero).length() == 9) {
                System.out.printf("Você está ligando para o número %d.\n", numero);
                bateria -= 20;
                if (bateria <= 0) {
                    System.out.printf("Seu %s desligou porque a bateria acabou.\n", getModelo());
                    ligado = false;
                }
            } else {
                System.out.println("Erro: número de telefone inválido.");
            }
        } else {
            System.out.printf("O %s está desligado. Ligue-o para fazer uma ligação.\n", getModelo());
        }
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
               "\nModelo: " + modelo +
               "\nTamanho da Tela: " + tamanhoTela + " polegadas" +
               "\nSistema Operacional: " + sistemaOperacional +
               "\nBateria: " + bateria + "%" +
               "\nLigado: " + (ligado ? "Sim" : "Não");
    }

    // Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public float getTamanhoTela() { return tamanhoTela; }
    public void setTamanhoTela(float tamanhoTela) { this.tamanhoTela = tamanhoTela; }

    public String getSistemaOperacional() { return sistemaOperacional; }
    public void setSistemaOperacional(String sistemaOperacional) { this.sistemaOperacional = sistemaOperacional; }

    public int getBateria() { return bateria; }
    public void setBateria(int bateria) { this.bateria = bateria; }

    public boolean isLigado() { return ligado; }
    public void setLigado(boolean ligado) { this.ligado = ligado; }
}