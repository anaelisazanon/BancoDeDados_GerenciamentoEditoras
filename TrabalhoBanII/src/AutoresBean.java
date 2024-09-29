public class AutoresBean {
   private int idautor;
   private String nome;
   private String telefone;    
   private String email;

   public AutoresBean(int idautor, String nome, String telefone, String email) {
       this.idautor = idautor;
       this.nome = nome;
       this.telefone = telefone;
       this.email = email;
   }

    // Getters e Setters
    public int getIdAutor() { return idautor; }
    public void setIdAutor(int idautor) { this.idautor = idautor; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString(){
        return "ID: " + idautor + ", Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
       
}
