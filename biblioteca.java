
package avaliacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class biblioteca {
    
    
    public static void main(String[] args) {
        //metodo principal 
        int op=1;
        List<usuario> usuarios = new ArrayList<>();   //declaraçao das listas
        List<livro> livros = new ArrayList<>();
        List<emprestimo> emprestimos = new ArrayList<>();
              
        //metedo de repetiçao do menu       
        do {
            op=Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar Aluno\n2-Listar Alunos\n3-Buscar Aluno" +
                                                            "\n4-Adicionar Livro\n5-Listar Livros\n6-Buscar Livro" + 
                                                            "\n7-Realizar Emprestimo\n8-Livros Emprestados\n9-Livros Nao devolvidos\n10-Fazer devolução"
                                                            + "Opcao: ", op));
  
        //laço de cadastro de aluno
        if (op==1){ 
            int id_usuario = (int)(Math.random()*1000); //gera um codigo randomico para o aluno
            String senha = JOptionPane.showInputDialog("Informe a senha: ");
            String nome_usuario = JOptionPane.showInputDialog("Informe o nome do aluno: ");
            String email = JOptionPane.showInputDialog("Informe o email do aluno: ");
            //polimorfismo por sobrecarga 
            usuarios.add(new usuario(id_usuario,senha,nome_usuario,email)); //adiciona o novo aluno na lista
            
        }
        else if(op==2){  //laço para listar os alunos cadastrados
            for(usuario c: usuarios){
                JOptionPane.showMessageDialog(null,c); //mostra na tela os alunos
            }
        }
        else if(op==3){ //laço para fazer busca do usuario 
            String alunobusca = JOptionPane.showInputDialog("Informe o nome do aluno: "); //nome do aluno procurado
            for(usuario c: usuarios){   //laço que percorre a lista e verifica
                if(c.getNome_usuario()==alunobusca){ //compara o  nome do aluno procurado com os alunos cadastrados na lista
                    JOptionPane.showMessageDialog(null,c);  //se for encontrado, ele mostra os dados do aluno buscado
                } else
                    JOptionPane.showMessageDialog(null,"O aluno nao tem cadastro");
            }
        }
        else if(op==4){ //laço para cadastrar livro
            int id_livro = (int)(Math.random()*100);  //gera um codigo randomico para o livro
            String titulo = JOptionPane.showInputDialog("Informe o nome do livro: ");
            String autor = JOptionPane.showInputDialog("Informe o nome do autor: ");
            String editora = JOptionPane.showInputDialog("Informe o nome da editora: ");
            String edicao = JOptionPane.showInputDialog("Informe a edição: ");
            String cidade = JOptionPane.showInputDialog("Informe a cidade: ");
            int anoPublicacao = (int)(Math.random()*1000);  //gera um ano randomico para o livro
            
            livros.add(new livro(id_livro,titulo,autor,editora,edicao,cidade,anoPublicacao)); //adiciona o livro na lista dos livros
        }
        else if(op==5){ //lista os livros cadastrados no acervo
            for(livro c: livros){ //percorre a lista de livros
                JOptionPane.showMessageDialog(null,c);
            }
        }
        else if(op==6){ //laço para buscar livro
            String livrobusca = JOptionPane.showInputDialog("Informe o nome do livro: "); 
            for(livro c: livros){
                if(c.getTitulo()==livrobusca) //compara o nome do livro buscado com os livros cadastrados na lista
                    JOptionPane.showMessageDialog(null,c);
            }
        }
        
        else if (op==7){ //laço responsavel por realizar o emprestimo
            String senha_emp = null;
            String nome_emp= null;
            String email_emp=null;
            int id_alunoemp= Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do aluno: "));
            for(usuario p: usuarios){
                if(p.getId_usuario()==id_alunoemp){
                    senha_emp=  p.getSenha();
                    nome_emp =  p.getNome_usuario();
                    email_emp=  p.getEmail();
                }
            }
            String livro_emp = JOptionPane.showInputDialog("Informe o nome do livro: ");
            for(livro c: livros){
               if(c.getTitulo().equals(livro_emp)){ //compara o nome do livro buscado e adiciona na lista de emprestimo
                   emprestimos.add(new emprestimo((int)(Math.random()*100),LocalDate.now(),LocalDate.now(),false,c.getId_livro(),c.getTitulo(),c.getAutor(),
                                                        c.getEditora(),c.getEdicao(),c.getCidade(),c.getAnoPublicacao(),id_alunoemp,senha_emp,nome_emp,email_emp));
               }
            }
        }
        else if (op==8){ //laço que mostra os livros emprestados
           for(emprestimo c: emprestimos){  //percorre a lista
                JOptionPane.showMessageDialog(null,c); //mostra na tela os livros 
            } 
        }
        else if (op==9){ //laço que mostra os livros nao devolvidos
            for(emprestimo c: emprestimos){
                if(c.isDevolvido()==false){
                     JOptionPane.showMessageDialog(null,c);
                }
            }
        }
        else if (op==10){// laço que realiza a devolução
            String livro_devol = JOptionPane.showInputDialog("Informe o nome do livro a ser devolvido: ");
            for(emprestimo c: emprestimos){
                if(c.getTitulo()==livro_devol){
                    c.setDevolvido(true); //altera o valor do booleano que informa se o livro foi devolvido ou nao
                    JOptionPane.showMessageDialog(null,"O livro foi devolvido!");
                }
            }
        }
        } while (op!=0);
   }
}
