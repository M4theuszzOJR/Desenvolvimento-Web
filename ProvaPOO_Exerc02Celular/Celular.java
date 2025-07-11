public class Celular {
    private String marca;
    private String modelo;
    private float tamanhoTela;
    private String sistemaOperacional;
    private int bateria;
    private boolean ligado;

    public Celular (String marca, String modelo, float tamanhoTela, String sistemaOperacional, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoTela = tamanhoTela;
        this.sistemaOperacional = sistemaOperacional;
        this.bateria = 100;
        this.ligado = ligado;
    }

    public void detalhes()
    {
        System.out.println("=== DETALHES ===");
        System.out.println("Marca" + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Tamanho de tela: " + this.getTamanhoTela());
        System.out.println("Sistema Operacional: " + this.getSistemaOperacional());
        System.out.println("Bateria " + this.getBateria() + "%");
        System.out.println("Está ligado? " + this.isLigado());
    }

    public void ligar () {
        if (this.getBateria() >= 1){
            if (!this.isLigado()) {
                this.setLigado(true);
                System.out.format("O %s está ligado.", this.getModelo());   
            }
            else {
                System.out.format("Seu %s já está ligado!", this.getModelo());
            }
        } else {
            System.out.format("Seu %s está sem bateria. Não é possível ligar.", this.getModelo());
        }
    } 

    public void desligar () {
        if (this.isLigado()) {
            System.out.format("O %s está desligado.", this.getModelo());
            this.setLigado(false);
        } 
        else{
            System.out.format("O %s já está desligado.", this.getModelo());
        }
    }

    public void carregar () {
        this.setBateria(100);
        System.out.format("O seu %s foi recarregado.\n Bateria: %d", this.getModelo(), this.getBateria());
    }

    public void fazerLigacao (int numero) {
        if (this.isLigado()) {
            if (numero >= 100000000 && numero <= 100000000) {
                System.out.format("Você está ligando para o número %d.", numero);
                this.setBateria(this.getBateria() - 20);
                if (this.getBateria() <= 0)
                {
                    System.out.format("Seu %s desligou porque a bateria acabou.", this.getModelo());
                    this.setLigado(false);
                }
            } else {
                System.out.println("Erro, número de telefone inválido.");
            }
        } else {
            System.out.format("O %s está desligado. Ligue seu celular para efetuar uma ligação.", this.getModelo());
        }
    }


    // -----------------------

        public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(float tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
