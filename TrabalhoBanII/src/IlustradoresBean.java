public class IlustradoresBean {
    private int idilustrador;
    private String nome;
    private String telefone;    
    private String email;

    public IlustradoresBean(int idilustrador, String nome, String telefone, String email) {
        this.idilustrador = idilustrador;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getIdIlustrador() {
        return idilustrador;
    }

    public void setIdIlustrador(int idilustrador) {
        this.idilustrador = idilustrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "ID: " + idilustrador + ", Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }        
}
