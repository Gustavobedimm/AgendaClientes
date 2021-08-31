package clienteshds.modelo;

public class Backup {
    
    private Integer id_cliente;
    private String pastaEmpresa;
    private String retorno;
    private String nome;
    private String dataFim;

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    public String getPastaEmpresa() {
        return pastaEmpresa;
    }

    public void setPastaEmpresa(String pastaEmpresa) {
        this.pastaEmpresa = pastaEmpresa;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    
    
}
