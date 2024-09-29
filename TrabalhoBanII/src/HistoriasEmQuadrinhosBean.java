public class HistoriasEmQuadrinhosBean {
    private int idhistoria;
    private String titulo;
    private int volume;
    private java.sql.Date dataLancamento;
    private int idcolecao;
    private int idautor;
    private int idilustrador;
    private int ideditora;

    public HistoriasEmQuadrinhosBean(int idhistoria, String titulo, int volume, java.sql.Date dataLancamento,
                                      int idcolecao, int idautor, int idilustrador, int ideditora) {
        this.idhistoria = idhistoria;
        this.titulo = titulo;
        this.volume = volume;
        this.dataLancamento = dataLancamento;
        this.idcolecao = idcolecao;
        this.idautor = idautor;
        this.idilustrador = idilustrador;
        this.ideditora = ideditora;
    }

    public int getIdHistoria() {
        return idhistoria;
    }

    public void setIdHistoria(int idhistoria) {
        this.idhistoria = idhistoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public java.sql.Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(java.sql.Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getIdColecao() {
        return idcolecao;
    }

    public void setIdColecao(int idcolecao) {
        this.idcolecao = idcolecao;
    }

    public int getIdAutor() {
        return idautor;
    }

    public void setIdAutor(int idautor) {
        this.idautor = idautor;
    }

    public int getIdIlustrador() {
        return idilustrador;
    }

    public void setIdIlustrador(int idilustrador) {
        this.idilustrador = idilustrador;
    }

    public int getIdEditora() {
        return ideditora;
    }

    public void setIdEditora(int ideditora) {
        this.ideditora = ideditora;
    }

    @Override
    public String toString() {
        return "Id: " + idhistoria + ", Título: " + titulo + ", Volume: " + volume +
               ", Data de Lançamento: " + dataLancamento + ", Coleção ID: " + idcolecao +
               ", Autor ID: " + idautor + ", Ilustrador ID: " + idilustrador + 
               ", Editora ID: " + ideditora;
    }
}
