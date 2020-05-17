
package avaliacao;

import java.time.LocalDate;


public class emprestimo extends livro { //classe emprestimo expande a classe livro
    //declaraçao dos metodos
    private int idEmprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean devolvido;
    //construtor
    public emprestimo(int idEmprestimo, LocalDate dataEmprestimo, LocalDate dataDevolucao, boolean devolvido, int id_livro, String titulo, String autor, String editora, String edicao, String cidade, int anoPublicacao) {
        super(id_livro, titulo, autor, editora, edicao, cidade, anoPublicacao);
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.devolvido = devolvido;
    }
    //construtor
    public emprestimo(int idEmprestimo, LocalDate dataEmprestimo, LocalDate dataDevolucao, boolean devolvido, int id_livro, String titulo, String autor, String editora, String edicao, String cidade, int anoPublicacao, int id_usuario, String senha, String nome_usuario, String email) {
        super(id_livro, titulo, autor, editora, edicao, cidade, anoPublicacao, id_usuario, senha, nome_usuario, email);
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.devolvido = devolvido;
    }
    //sets e gets
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    @Override
    public String toString() {
        return  "idEmprestimo=" + getIdEmprestimo() + "\nData do Emprestimo=" + getDataEmprestimo() + "\nData da Devolucao=" + getDataDevolucao() + "\nDevolvido=" + isDevolvido();
    }

    
}
