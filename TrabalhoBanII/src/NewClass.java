public class NewClass {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();

        // Testar a conexão
        if (conexao.getConnection() != null) {
            System.out.println("Conexão estabelecida com sucesso!");
        } else {
            System.out.println("Falha na conexão.");
        }

        // Fechar a conexão
        conexao.closeConnection();
    }
}