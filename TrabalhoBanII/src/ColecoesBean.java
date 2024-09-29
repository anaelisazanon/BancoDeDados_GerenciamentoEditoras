import java.util.Date;

public class ColecoesBean {
    private int idcolecao;
    private String nomecolecao;
    private Date data;

    public ColecoesBean(int idcolecao, String nomecolecao, Date data) {
        this.idcolecao = idcolecao;
        this.nomecolecao = nomecolecao;
        this.data = data;
    }

    public int getIdColecao() {
        return idcolecao;
    }

    public void setIdColecao(int idcolecao) {
        this.idcolecao = idcolecao;
    }

    public String getNomeColecao() {
        return nomecolecao;
    }

    public void setNomeColecao(String nomecolecao) {
        this.nomecolecao = nomecolecao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ID: " + idcolecao + ", Nome da Coleção: " + nomecolecao + ", Data: " + data;
    }        
}
