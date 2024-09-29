import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class EditorasModel {
    public static void create(EditorasBean a, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO editoras (ideditora, cnpj_editora, nome_editora, telefone_editora, cep, rua, numero) VALUES (?,?,?,?,?,?,?)");
            st.setInt(1, a.getIdEditora());
            st.setString(2, a.getCnpjEditora());
            st.setString(3, a.getNomeEditora());
            st.setString(4, a.getTelefoneEditora());
            st.setString(5, a.getCep());
            st.setString(6, a.getRua());
            st.setString(7, a.getNumero());
            
            st.execute();
            st.close();  
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT ideditora, cnpj_editora, nome_editora, telefone_editora, cep, rua, numero FROM editoras ORDER BY ideditora ASC";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new EditorasBean(result.getInt(1), 
                        result.getString(2), 
                        result.getString(3), 
                        result.getString(4),
                        result.getString(5),
                        result.getString(6),
                        result.getString(7) ));
            }
        return list;
    }
    
    static void remove(int n, Connection con) throws SQLException {
        String sql = "DELETE FROM editoras where ideditora=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, n);
        
        st.execute();
        st.close();
    }
    
    static void alterar(EditorasBean a, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("UPDATE editoras SET cnpj_editora=?, nome_editora=?, telefone_editora=?, cep=?, rua=?, numero=? WHERE ideditora=?");
        st.setString(1, a.getCnpjEditora());
        st.setString(2, a.getNomeEditora());
        st.setString(4, a.getTelefoneEditora());
        st.setString(5, a.getCep());
        st.setString(6, a.getRua());
        st.setString(7, a.getNumero());
        st.setInt(8, a.getIdEditora());
        
        st.execute();
        st.close();          
    }
    
    
}
