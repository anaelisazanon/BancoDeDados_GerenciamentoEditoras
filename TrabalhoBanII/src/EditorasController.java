import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EditorasController {
    
    public void createEditora(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para registrar uma nova Editora: ");
        
        System.out.print("CNPJ: ");
        String cnpj_editora = input.nextLine();
        
        System.out.print("Nome: ");
        String nome_editora = input.nextLine();
        
        System.out.print("Telefone: ");
        String telefone_editora = input.nextLine();
        
        System.out.print("CEP: ");
        String cep = input.nextLine();
       
        System.out.print("Rua: ");
        String rua = input.nextLine();
        
        System.out.print("Numero: ");
        String numero = input.nextLine();
        
        System.out.print("\n");
        
        // Criar a instância de EditorasBean sem ID
        EditorasBean ab = new EditorasBean(0, cnpj_editora, nome_editora, telefone_editora, cep, rua, numero);
        EditorasModel.create(ab, con);
        System.out.println("Editora criada com sucesso!");
    }

    public void listarEditora(Connection con) throws SQLException {
        HashSet<EditorasBean> all = EditorasModel.listAll(con);
        Iterator<EditorasBean> it = all.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
            System.out.print("\n");
        }
    }

    public void removerEditora(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        listarEditora(con);
        System.out.println("Informe o ID da editora a remover: ");
        
        int n = input.nextInt();
        input.nextLine();  // Consumir a quebra de linha pendente
        
        EditorasModel.remove(n, con);
        System.out.println("Editora removida com sucesso!");
    }

    public void alterarEditora(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        listarEditora(con);
        
        System.out.println("Informe o ID da editora a alterar: ");
        int n = input.nextInt();
        input.nextLine();  // Consumir a quebra de linha pendente
        
        System.out.print("CNPJ: ");
        String cnpj_editora = input.nextLine();
        
        System.out.print("Nome: ");
        String nome_editora = input.nextLine();
        
        System.out.print("Telefone: ");
        String telefone_editora = input.nextLine();
        
        System.out.print("CEP: ");
        String cep = input.nextLine();
        
        System.out.print("Rua: ");
        String rua = input.nextLine();
        
        System.out.print("Numero: ");
        String numero = input.nextLine();
        
        System.out.print("\n");
        
        // Criar a instância de EditorasBean com o ID fornecido
        EditorasBean ab = new EditorasBean(n, cnpj_editora, nome_editora, telefone_editora, cep, rua, numero);
        EditorasModel.alterar(ab, con);
        System.out.println("Editora alterada com sucesso!");
    }
}
