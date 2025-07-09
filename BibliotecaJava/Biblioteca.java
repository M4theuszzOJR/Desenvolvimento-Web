public class Biblioteca {
    protected String nome;
    protected String autor;
    protected int ano;
    protected boolean disponibilidade;

    public Biblioteca (String nome, String autor, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.disponibilidade = true;
    }

    public void emprestar () {
        if (disponibilidade == true) {
            System.out.format("O item %s foi emprestado.\n", getNome());
            disponibilidade = false;
        } else {
            System.out.format("O item %s não esta disponível.\n", getNome());
            
        }
    }

    public boolean isDisponivel() {
        return disponibilidade;

    }

    public void devolver () {
        if (disponibilidade == false) {
            disponibilidade = true;
            System.out.format("O item %s foi devolvido.", getNome());
        } else {
            System.out.format("Erro. O item %s já foi devolvido.", getNome() );
        }
    }


    // --------------------
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
       
}


