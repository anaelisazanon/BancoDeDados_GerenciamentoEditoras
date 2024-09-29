import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Date;

public class ColecoesModel {

    static void createColecao(ColecoesBean colecao, Connection con) throws SQLException {
        String sql = "INSERT INTO Colecoes (nomecolecao, data) VALUES (?, ?)";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, colecao.getNomeColecao());
            st.setDate(2, new java.sql.Date(colecao.getData().getTime()));
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Coleção inserida com sucesso!");
            } else {
                System.out.println("Nenhuma linha foi inserida.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir coleção: " + e.getMessage());
            con.rollback();
        }
    }

    static HashSet<ColecoesBean> listAll(Connection con) throws SQLException {
        String sql = "SELECT idcolecao, nomecolecao, data FROM Colecoes";
        HashSet<ColecoesBean> list = new HashSet<>();
        try (Statement st = con.createStatement(); ResultSet result = st.executeQuery(sql)) {
            while (result.next()) {
                ColecoesBean colecao = new ColecoesBean(
                    result.getInt("idcolecao"),
                    result.getString("nomecolecao"),
                    result.getDate("data")
                );
                list.add(colecao);
            }
        }
        return list;
    }
}
