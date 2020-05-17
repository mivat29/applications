
package avaliacao;


public class livro extends usuario{
    
    private int id_livro;
    private String titulo;
    private String autor;
    private String editora;
    private String edicao;
    private String cidade;
    private int anoPublicacao;

    public livro(int id_livro, String titulo, String autor, String editora, String edicao, String cidade, int anoPublicacao) {
        this.id_livro = id_livro;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora; 
        this.edicao = edicao;
        this.cidade = cidade;
        this.anoPublicacao = anoPublicacao;
    }
    
    public livro(int id_livro, String titulo, String autor, String editora, String edicao, String cidade, int anoPublicacao, int id_usuario, String senha, String nome_usuario, String email) {
        super(id_usuario, senha, nome_usuario, email);
        this.id_livro = id_livro;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora; 
        this.edicao = edicao;
        this.cidade = cidade;
        this.anoPublicacao = anoPublicacao;
    }

    public livro() {
    }
    
    
    //sets e gets
    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return super.toString() + "ID=" + getId_livro() + "\nTítulo=" + getTitulo() + 
                                    "\nAutor=" + getAutor() + "\nEditora=" + getEditora() + "\nEdicao=" + getEdicao() + "\nCidade=" + getCidade() + 
                                    "\nAno da Publicacao=" + getAnoPublicacao() ;
    }
    
    
    
}
