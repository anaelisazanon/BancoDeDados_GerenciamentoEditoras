import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws SQLException {
        Conexao c = new Conexao();
        Connection con = c.getConnection();
        int op = 0;
        do {
            op = menu();
            try {
                switch (op) {
                    case 1: // Cadastrar Editora
                        new EditorasController().createEditora(con);
                        break;
                    case 2: // Listar Editoras
                        new EditorasController().listarEditora(con);
                        break;
                    case 3: // Atualizar Editora
                        new EditorasController().alterarEditora(con);
                        break;
                    case 4: // Remover Editora
                        new EditorasController().removerEditora(con);
                        break;
                    case 5: // Cadastrar Autor
                        new AutoresController().createAutor(con);
                        break;
                    case 6: // Listar Autor
                        new AutoresController().listarAutores(con);
                        break;
                    case 7: // Alterar Autor
                        new AutoresController().alterarAutores(con);
                        break;
                    case 8: // Remover Autor
                        new AutoresController().removerAutor(con);
                        break;
                    case 9: // Cadastrar Ilustrador
                        new IlustradoresController().createIlustrador(con);
                        break;
                    case 10: // Listar Ilustrador
                        new IlustradoresController().listarIlustradores(con);
                        break;
                    case 11: // Alterar Ilustrador
                        new IlustradoresController().alterarIlustrador(con);
                        break;
                    case 12: // Remover Ilustrador
                        new IlustradoresController().removerIlustrador(con);
                        break;
                    case 13: // Cadastrar Coleção
                        new ColecoesController().createColecao(con);
                        break;
                    case 14: // Listar Coleções
                        new ColecoesController().listarColecoes(con);
                        break;
                    case 15: // Cadastrar História em Quadrinhos
                        new HistoriasEmQuadrinhosController().createHistoria(con);
                        break;
                    case 16: // Listar Histórias em Quadrinhos
                        new HistoriasEmQuadrinhosController().listarHistorias(con);
                        break;


                    default:
                        System.out.println("Saindo do sistema.");
                        break;
                }
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex.getMessage());
                continue;
            }
        } while (op >= 1 && op <= 16);  
        con.close();
    }    
    
    private static int menu() {
        System.out.println("");
        System.out.println("\n Informe o numero da opcao que desejas executar: ");
        System.out.println("1 - Cadastrar Editora");
        System.out.println("2 - Listar Editoras");
        System.out.println("3 - Atualizar Editora");
        System.out.println("4 - Remover Editora");
        System.out.println("5 - Cadastrar Autor");
        System.out.println("6 - Listar Autor");
        System.out.println("7 - Atualizar Autor");
        System.out.println("8 - Remover Autor");
        System.out.println("9 - Cadastrar Ilustrador");
        System.out.println("10 - Listar Ilustrador");
        System.out.println("11 - Atualizar Ilustrador");
        System.out.println("12 - Remover Ilustrador");
        System.out.println("13 - Cadastrar Colecao");
        System.out.println("14 - Listar Colecoes");
        System.out.println("15 - Cadastrar HQ");
        System.out.println("16 - Listar HQ");
        System.out.println("Digite qualquer outro valor para sair \n");
        System.out.print("Sua opcao: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
