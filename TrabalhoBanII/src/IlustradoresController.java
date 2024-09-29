import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class IlustradoresController {
    public void createIlustrador(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para criar um novo Ilustrador: ");
        System.out.print("nome: ");
        String nome = input.nextLine();
        System.out.print("telefone: ");
        String telefone = input.nextLine();
        System.out.print("email: ");
        String email = input.nextLine();    
    
        IlustradoresBean mb = new IlustradoresBean(0, nome, telefone, email); // ID é gerado automaticamente pelo banco
        IlustradoresModel.createIlustrador(mb, con); // Chama o método para inserir
    }

    public void listarIlustradores(Connection con) throws SQLException {
        HashSet<IlustradoresBean> all = IlustradoresModel.listAll(con);
        if (all.isEmpty()) {
            System.out.println("Nenhum ilustrador encontrado.");
        } else {
            System.out.println("Lista de Ilustradores:");
            for (IlustradoresBean ilustrador : all) {
                System.out.println(ilustrador.toString());
            }
        }
    }
    
    public void removerIlustrador(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        listarIlustradores(con);
        System.out.println("Informe o ID do ilustrador a remover: ");
        
        int n = input.nextInt();
        input.nextLine();  // Consumir a quebra de linha pendente
        
        IlustradoresModel.remove(n, con);
        System.out.println("Ilustrador removido com sucesso!");
    }
    
    public void alterarIlustrador(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        listarIlustradores(con);
        
        System.out.println("Informe o ID do ilustrador a alterar: ");
        int n = input.nextInt();
        input.nextLine();  // Consumir a quebra de linha pendente
        
        System.out.print("Nome: ");
        String nome_ilustrador = input.nextLine();
            
        System.out.print("Telefone: ");
        String telefone_ilustrador = input.nextLine();
        
        System.out.print("Email: ");
        String email_ilustrador = input.nextLine();
        
        System.out.print("\n");
        
        // Criar a instância de IlustradoresBean com o ID fornecido
        IlustradoresBean ab = new IlustradoresBean(n, nome_ilustrador, telefone_ilustrador, email_ilustrador);
        IlustradoresModel.alterar(ab, con);
        System.out.println("Ilustrador alterado com sucesso!");
    }
}
