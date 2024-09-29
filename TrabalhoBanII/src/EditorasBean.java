public class EditorasBean {
    private int ideditora;
    private String cnpj_editora;
    private String nome_editora;
    private String telefone_editora;
    private String cep;
    private String rua;
    private String numero;

    // Construtor com todos os parâmetros
    public EditorasBean(int ideditora, String cnpj_editora, String nome_editora, String telefone_editora, String cep, String rua, String numero) {
        this.ideditora = ideditora;
        this.cnpj_editora = cnpj_editora;
        this.nome_editora = nome_editora;
        this.telefone_editora = telefone_editora;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
    }
    
    // Construtor vazio (opcional)
    public EditorasBean() {
    }

    // Getters e Setters
    public int getIdEditora() {
        return ideditora;
    }

    public void setIdEditora(int ideditora) {
        this.ideditora = ideditora;
    }

    public String getCnpjEditora() {
        return cnpj_editora;
    }

    public void setCnpjEditora(String cnpj_editora) {
        this.cnpj_editora = cnpj_editora;
    }

    public String getNomeEditora() {
        return nome_editora;
    }

    public void setNomeEditora(String nome_editora) {
        this.nome_editora = nome_editora;
    }

    public String getTelefoneEditora() {
        return telefone_editora;
    }

    public void setTelefoneEditora(String telefone_editora) {
        this.telefone_editora = telefone_editora;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Método toString atualizado para melhor legibilidade
    @Override
    public String toString() {
        return "IdEditora: " + ideditora + "\n" +
               "CNPJ: " + cnpj_editora + "\n" +
               "Nome: " + nome_editora + "\n" +
               "Telefone: " + telefone_editora + "\n" +
               "CEP: " + cep + "\n" +
               "Rua: " + rua + "\n" +
               "Número: " + numero;
    }
}
