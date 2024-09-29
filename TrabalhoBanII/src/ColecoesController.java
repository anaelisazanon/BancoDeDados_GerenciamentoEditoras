import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Date;

public class ColecoesController {
    public void createColecao(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para criar uma nova Coleção: ");
        System.out.print("Nome da Coleção: ");
        String nomeColecao = input.nextLine();
        System.out.print("Data (YYYY-MM-DD): ");
        String dataStr = input.nextLine();
        Date data = java.sql.Date.valueOf(dataStr);
    
        ColecoesBean colecao = new ColecoesBean(0, nomeColecao, data); // ID é gerado automaticamente pelo banco
        ColecoesModel.createColecao(colecao, con); // Chama o método para inserir
    }

    public void listarColecoes(Connection con) throws SQLException {
        HashSet<ColecoesBean> all = ColecoesModel.listAll(con);
        if (all.isEmpty()) {
            System.out.println("Nenhuma coleção encontrada.");
        } else {
            System.out.println("Lista de Coleções:");
            for (ColecoesBean colecao : all) {
                System.out.println(colecao.toString());
            }
        }
    }
}
