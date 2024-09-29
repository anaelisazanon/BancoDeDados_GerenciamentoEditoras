import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.HashSet;

public class AutoresModel {

    static void createAutor(AutoresBean autor, Connection con) throws SQLException {
        String sql = "INSERT INTO autores (nome_autor, telefone_autor, email_autor) VALUES (?, ?, ?)";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, autor.getNome());
            st.setString(2, autor.getTelefone());
            st.setString(3, autor.getEmail());
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Autor inserido com sucesso!");
            } else {
                System.out.println("Nenhuma linha foi inserida.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir autor: " + e.getMessage());
            con.rollback();
        }
    }

    static HashSet<AutoresBean> listAll(Connection con) throws SQLException {
        String sql = "SELECT idautor, nome_autor, telefone_autor, email_autor FROM autores";
        HashSet<AutoresBean> list = new HashSet<>();
        try (Statement st = con.createStatement(); ResultSet result = st.executeQuery(sql)) {
            while (result.next()) {
                AutoresBean autor = new AutoresBean(
                    result.getInt("idautor"),
                    result.getString("nome_autor"),
                    result.getString("telefone_autor"),
                    result.getString("email_autor")
                );
                list.add(autor);
            }
        }
        return list;
    }
    
    static void remove(int n, Connection con) throws SQLException {
        String sql = "DELETE FROM autores where idautor=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, n);
        
        st.execute();
        st.close();
    }
    
    static void alterar(AutoresBean a, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("UPDATE autores SET nome_autor=?, telefone_autor=?, email_autor=? WHERE idautor=?");
        st.setString(1, a.getNome());
        st.setString(2, a.getTelefone());
        st.setString(3, a.getEmail());
        st.setInt(4, a.getIdAutor());
        
        st.execute();
        st.close();          
    }
    
    
}
