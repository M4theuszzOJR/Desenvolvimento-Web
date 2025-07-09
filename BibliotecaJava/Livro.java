public class Livro extends Biblioteca {
    protected int paginas;

    public Livro(String nome, String autor, int ano, int paginas){
        super(nome, autor, ano);
        this.paginas = paginas;
    }

    @Override
    public void emprestar () {
        super.emprestar();
    }
    @Override
    public void devolver () {
        super.devolver();
    }

    public void ler () {
        if (disponibilidade == false) {
            System.out.format("O Livro %s do ano %d com %d páginas do autor %s, está sendo lido.\n", getNome(), getAno(), getPaginas(), getAutor());
        } else {
            System.out.println("Você ainda não possui este livro para ler.");
        }
    }
    // ------------

    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
}
