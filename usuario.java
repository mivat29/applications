
package avaliacao;


public class usuario {
    
    private int id_usuario;
    private String senha;
    private String nome_usuario;
    private String email;

    public usuario(int id_usuario, String senha, String nome_usuario, String email) {
        this.id_usuario = id_usuario;
        this.senha = senha;
        this.nome_usuario = nome_usuario;
        this.email = email;
        
    }

    public usuario(String senha, String email) {
        this.senha = senha;
        this.email = email;
    }
    
    
    public usuario() {
    }
    
    //sets e gets
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id: " + getId_usuario() + "\n" + "Nome: "
                + getNome_usuario() + "\n" + "E-mail: " + getEmail() + "\n";

    }

}
