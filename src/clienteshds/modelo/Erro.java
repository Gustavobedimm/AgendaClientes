package clienteshds.modelo;

/**
 *
 * @author Gustavo Bedim Mazutti
 */
public class Erro {
    
    private Integer id_erro; //not null seq_erro
    private Integer id_cliente;
    private String programa;
    private String arquivo;
    private String paragrafo;
    private String operacao;
    private String coderro;
    private String chave;
    private String mensagemerro;
    private String data;
    private String usuariots;
    private String nomeservidor;
    private String nomecomputador;
    private String pastaEmpresa;
    private String caminhoarquivo;

    public Integer getId_erro() {
        return id_erro;
    }

    public void setId_erro(Integer id_erro) {
        this.id_erro = id_erro;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getParagrafo() {
        return paragrafo;
    }

    public void setParagrafo(String paragrafo) {
        this.paragrafo = paragrafo;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getCoderro() {
        return coderro;
    }

    public void setCoderro(String coderro) {
        this.coderro = coderro;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getMensagemerro() {
        return mensagemerro;
    }

    public void setMensagemerro(String mensagemerro) {
        this.mensagemerro = mensagemerro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUsuariots() {
        return usuariots;
    }

    public void setUsuariots(String usuariots) {
        this.usuariots = usuariots;
    }

    public String getNomeservidor() {
        return nomeservidor;
    }

    public void setNomeservidor(String nomeservidor) {
        this.nomeservidor = nomeservidor;
    }

    public String getNomecomputador() {
        return nomecomputador;
    }

    public void setNomecomputador(String nomecomputador) {
        this.nomecomputador = nomecomputador;
    }

    public String getPastaEmpresa() {
        return pastaEmpresa;
    }

    public void setPastaEmpresa(String pastaEmpresa) {
        this.pastaEmpresa = pastaEmpresa;
    }

    public String getCaminhoarquivo() {
        return caminhoarquivo;
    }

    public void setCaminhoarquivo(String caminhoarquivo) {
        this.caminhoarquivo = caminhoarquivo;
    }
    
    
    
    
    
    
    
}
