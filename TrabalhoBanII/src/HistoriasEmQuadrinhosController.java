import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HistoriasEmQuadrinhosController {
    public void createHistoria(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os dados da nova História em Quadrinhos: ");
        System.out.print("Título: ");
        String titulo = input.nextLine();
        System.out.print("Volume: ");
        int volume = input.nextInt();
        System.out.print("Data de Lançamento (YYYY-MM-DD): ");
        String dataInput = input.next();
        java.sql.Date dataLancamento = java.sql.Date.valueOf(dataInput);
        System.out.print("ID da Coleção: ");
        int idcolecao = input.nextInt();
        System.out.print("ID do Autor: ");
        int idautor = input.nextInt();
        System.out.print("ID do Ilustrador: ");
        int idilustrador = input.nextInt();
        System.out.print("ID da Editora: ");
        int ideditora = input.nextInt();

        HistoriasEmQuadrinhosBean hq = new HistoriasEmQuadrinhosBean(0, titulo, volume, dataLancamento,
                                                                     idcolecao, idautor, idilustrador, ideditora);
        HistoriasEmQuadrinhosModel.createHistoria(hq, con);
        System.out.println("História em Quadrinhos criada com sucesso!!");
    }

    public void listarHistorias(Connection con) throws SQLException {
        HashSet<HistoriasEmQuadrinhosBean> all = HistoriasEmQuadrinhosModel.listAll(con);
        Iterator<HistoriasEmQuadrinhosBean> it = all.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
