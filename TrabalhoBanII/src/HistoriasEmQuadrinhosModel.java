import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class HistoriasEmQuadrinhosModel {
    public static void createHistoria(HistoriasEmQuadrinhosBean hq, Connection con) throws SQLException {
        PreparedStatement st = con.prepareStatement(
            "INSERT INTO historiasemquadrinhos (titulo, volume, data_lancamento, " +
            "idcolecao, idautor, idilustrador, ideditora) VALUES (?, ?, ?, ?, ?, ?, ?)"
        );
        st.setString(1, hq.getTitulo());
        st.setInt(2, hq.getVolume());
        st.setDate(3, hq.getDataLancamento());
        st.setInt(4, hq.getIdColecao());
        st.setInt(5, hq.getIdAutor());
        st.setInt(6, hq.getIdIlustrador());
        st.setInt(7, hq.getIdEditora());
        st.execute();
        st.close();
    }

    public static HashSet<HistoriasEmQuadrinhosBean> listAll(Connection con) throws SQLException {
        HashSet<HistoriasEmQuadrinhosBean> list = new HashSet<>();
        Statement st = con.createStatement();
        String sql = "SELECT idhistoria, titulo, volume, data_lancamento, idcolecao, idautor, idilustrador, ideditora FROM historiasemquadrinhos";
        ResultSet result = st.executeQuery(sql);
        while (result.next()) {
            list.add(new HistoriasEmQuadrinhosBean(
                result.getInt(1), result.getString(2), result.getInt(3),
                result.getDate(4), result.getInt(5), result.getInt(6),
                result.getInt(7), result.getInt(8)
            ));
        }
        return list;
    }
}
