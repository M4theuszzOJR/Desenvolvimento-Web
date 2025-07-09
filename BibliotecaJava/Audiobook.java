public class Audiobook extends Biblioteca {
    protected double duracao;

    public Audiobook (String nome, String autor, int ano, double duracao) {
        super(nome, autor, ano);
        this.duracao = duracao;
    }
    
     @Override
    public void emprestar () {
        super.emprestar();
    }
    @Override
    public void devolver () {
        super.devolver();
    }

    public void reproduzir () {
        if (disponibilidade == false) {
             System.out.format("O Audiobook %s do ano %d do autor %s, com %.2f de tempo de duração está sendo reproduzido.", getNome(), getAno(), getAutor(), getDuracao() );
        } else {
            System.out.println("Você ainda não possui este audiobook para reproduzi-lo.");
        }
    }
    // ---------------
    public double getDuracao() {
        return duracao;
    }
    public void setTDuracao(double duracao) {
        this.duracao = duracao;
    }
}
