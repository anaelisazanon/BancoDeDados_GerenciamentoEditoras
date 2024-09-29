import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AutoresController {
    public void createAutor(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para criar um novo Autor: ");
        System.out.print("nome: ");
        String nome = input.next();
        System.out.print("telefone: ");
        String telefone = input.next();
        System.out.print("email: ");
        String email = input.next();    
    
        AutoresBean mb = new AutoresBean(0, nome, telefone, email); // ID é gerado automaticamente pelo banco
        AutoresModel.createAutor(mb, con); // Chama o método para inserir
    }

    public void listarAutores(Connection con) throws SQLException {
        HashSet<AutoresBean> all = AutoresModel.listAll(con);
        if (all.isEmpty()) {
            System.out.println("Nenhum autor encontrado.");
        } else {
            System.out.println("Lista de Autores:");
            for (AutoresBean autor : all) {
                System.out.println(autor.toString());
            }
        }
    }
    
    public void removerAutor(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        listarAutores(con);
        System.out.println("Informe o ID do autor a remover: ");
        
        int n = input.nextInt();
        input.nextLine();  // Consumir a quebra de linha pendente
        
        AutoresModel.remove(n, con);
        System.out.println("Autor removido com sucesso!");
    }
    
    public void alterarAutores(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        listarAutores(con);
        
        System.out.println("Informe o ID do autor a alterar: ");
        int n = input.nextInt();
        input.nextLine();  // Consumir a quebra de linha pendente
        
        System.out.print("Nome: ");
        String nome_autor = input.nextLine();
            
        System.out.print("Telefone: ");
        String telefone_autor = input.nextLine();
        
        System.out.print("Email: ");
        String email_autor = input.nextLine();
        
        System.out.print("\n");
        
        // Criar a instância de AutoresBean com o ID fornecido
        AutoresBean ab = new AutoresBean(n, nome_autor, telefone_autor, email_autor);
        AutoresModel.alterar(ab, con);
        System.out.println("Autor alterado com sucesso!");
    }
}
