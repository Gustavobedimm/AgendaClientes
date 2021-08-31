package clienteshds.DAO;

import clienteshds.modelo.Backup;
import clienteshds.modelo.Empresa;
import clienteshds.modelo.Erro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmpresaDAO {

    Conexao conexao = new Conexao();
    GravaLog gravaLog = new GravaLog();

    public void AdicionarEmpresa(Empresa empresa) throws ClassNotFoundException {
        conexao.Conexao();
        try {
            PreparedStatement pst;
            pst = conexao.con.prepareStatement("insert into empresas (razaosocial,fantasia,telefone1,telefone2,ipservidor,senha,dominio,regimecontabil,contabilidade,responsavel,telefonecontador,nfe,nfce,nfse,cnpj,vencimentosistema,vencimentocertificado,obs,id_cliente,pasta) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, empresa.getRazaoSocial());
            pst.setString(2, empresa.getFantasia());
            pst.setString(3, empresa.getTelefone1());
            pst.setString(4, empresa.getTelefone2());
            pst.setString(5, empresa.getIpServidor());
            pst.setString(6, empresa.getSenha());
            pst.setString(7, empresa.getDominio());
            pst.setString(8, empresa.getRegimeContabil());
            pst.setString(9, empresa.getContabilidade());
            pst.setString(10, empresa.getResponsavel());
            pst.setString(11, empresa.getTelefoneContador());
            pst.setString(12, empresa.getNfe());
            pst.setString(13, empresa.getNfce());
            pst.setString(14, empresa.getNfse());
            pst.setString(15, empresa.getCnpj());
            pst.setString(16, empresa.getVencimentoSistema());
            pst.setString(17, empresa.getVencimentoCertificado());
            pst.setString(18, empresa.getObs());
            pst.setInt(19, empresa.getId_cliente());
            pst.setString(20, empresa.getPasta());

            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao Cadastrar.\n Erro: " + ex.getMessage());
        }
        conexao.Desconecta();
        gravaLog.gravaTxtLog("Cliente adicionado. (" + empresa.getFantasia() + ")");
    }

    public void AlterarEmpresa(Empresa empresa) throws ClassNotFoundException {
        conexao.Conexao();

        this.conexao.Conexao();
        try {
            String query = "update empresas set razaosocial = '" + empresa.getRazaoSocial() + "' ,"
                    + "fantasia = '" + empresa.getFantasia() + "',"
                    + "telefone1 = '" + empresa.getTelefone1() + "',"
                    + "telefone2 = '" + empresa.getTelefone2() + "',"
                    + "ipservidor = '" + empresa.getIpServidor() + "',"
                    + "senha = '" + empresa.getSenha() + "',"
                    + "dominio = '" + empresa.getDominio() + "',"
                    + "regimecontabil = '" + empresa.getRegimeContabil() + "',"
                    + "contabilidade = '" + empresa.getContabilidade() + "',"
                    + "responsavel = '" + empresa.getResponsavel() + "',"
                    + "telefonecontador = '" + empresa.getTelefoneContador() + "',"
                    + "nfe = '" + empresa.getNfe() + "',"
                    + "nfce = '" + empresa.getNfce() + "',"
                    + "nfse = '" + empresa.getNfse() + "',"
                    + "cnpj = '" + empresa.getCnpj() + "',"
                    + "vencimentosistema = '" + empresa.getVencimentoSistema() + "',"
                    + "vencimentocertificado = '" + empresa.getVencimentoCertificado() + "',"
                    + "obs = '" + empresa.getObs() + "',"
                    + "pasta = '" + empresa.getPasta() + "'"
                    + "where id_cliente = '" + empresa.getId_cliente() + "'";
            PreparedStatement pst;
            pst = conexao.con.prepareStatement(query);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }

        conexao.Desconecta();
        gravaLog.gravaTxtLog("Cliente alterado. (" + empresa.getFantasia() + ")");
    }

    public void ExcluirEmpresa(String cnpj) throws ClassNotFoundException {
        conexao.Conexao();
        try {
            String query = "delete from empresas where cnpj = '" + cnpj + "'";
            PreparedStatement pst;
            pst = conexao.con.prepareStatement(query);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.Desconecta();
        gravaLog.gravaTxtLog("Cliente excluido. (" + cnpj + ")");
    }

    public ArrayList todasEmpresas() throws ClassNotFoundException {
        conexao.Conexao();
        ArrayList<Empresa> listaDeEmpresas = new ArrayList();
        try {
            String query = "SELECT * FROM empresas order by fantasia";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Empresa empresa = new Empresa();

                empresa.setRazaoSocial(rs.getString("razaosocial"));
                empresa.setFantasia(rs.getString("fantasia"));
                empresa.setTelefone1(rs.getString("telefone1"));
                empresa.setTelefone2(rs.getString("telefone2"));
                empresa.setIpServidor(rs.getString("ipservidor"));
                empresa.setSenha(rs.getString("senha"));
                empresa.setDominio(rs.getString("dominio"));
                empresa.setRegimeContabil(rs.getString("regimecontabil"));
                empresa.setContabilidade(rs.getString("contabilidade"));
                empresa.setResponsavel(rs.getString("responsavel"));
                empresa.setTelefoneContador(rs.getString("telefonecontador"));
                empresa.setNfe(rs.getString("nfe"));
                empresa.setNfce(rs.getString("nfce"));
                empresa.setNfse(rs.getString("nfse"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setVencimentoSistema(rs.getString("vencimentosistema"));
                empresa.setVencimentoCertificado(rs.getString("vencimentocertificado"));
                empresa.setObs(rs.getString("obs"));
                empresa.setId_cliente(rs.getInt("id_cliente"));
                empresa.setPasta(rs.getString("pasta"));

                listaDeEmpresas.add(empresa);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.Desconecta();
        return listaDeEmpresas;
    }

    public ArrayList buscaTodos(String palavra) throws ClassNotFoundException {
        conexao.Conexao();
        ArrayList<Empresa> listaDeEmpresas = new ArrayList();
        try {
            String query = "select * from empresas where fantasia  ilike '%" + palavra + "%'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Empresa empresa = new Empresa();

                empresa.setRazaoSocial(rs.getString("razaosocial"));
                empresa.setFantasia(rs.getString("fantasia"));
                empresa.setTelefone1(rs.getString("telefone1"));
                empresa.setTelefone2(rs.getString("telefone2"));
                empresa.setIpServidor(rs.getString("ipservidor"));
                empresa.setSenha(rs.getString("senha"));
                empresa.setDominio(rs.getString("dominio"));
                empresa.setRegimeContabil(rs.getString("regimecontabil"));
                empresa.setContabilidade(rs.getString("contabilidade"));
                empresa.setResponsavel(rs.getString("responsavel"));
                empresa.setTelefoneContador(rs.getString("telefonecontador"));
                empresa.setNfe(rs.getString("nfe"));
                empresa.setNfce(rs.getString("nfce"));
                empresa.setNfse(rs.getString("nfse"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setVencimentoSistema(rs.getString("vencimentosistema"));
                empresa.setVencimentoCertificado(rs.getString("vencimentocertificado"));
                empresa.setObs(rs.getString("obs"));
                empresa.setId_cliente(rs.getInt("id_cliente"));
                empresa.setPasta(rs.getString("pasta"));

                listaDeEmpresas.add(empresa);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.Desconecta();
        return listaDeEmpresas;
    }

    public Empresa consultaCnpj(String cnpj) throws ClassNotFoundException {
        conexao.Conexao();
        Empresa empresa = new Empresa();
        try {
            String query = "select * from empresas where cnpj = '" + cnpj + "'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            if (rs.next()) {
                empresa.setRazaoSocial(rs.getString("razaosocial"));
                empresa.setFantasia(rs.getString("fantasia"));
                empresa.setTelefone1(rs.getString("telefone1"));
                empresa.setTelefone2(rs.getString("telefone2"));
                empresa.setIpServidor(rs.getString("ipservidor"));
                empresa.setSenha(rs.getString("senha"));
                empresa.setDominio(rs.getString("dominio"));
                empresa.setRegimeContabil(rs.getString("regimecontabil"));
                empresa.setContabilidade(rs.getString("contabilidade"));
                empresa.setResponsavel(rs.getString("responsavel"));
                empresa.setTelefoneContador(rs.getString("telefonecontador"));
                empresa.setNfe(rs.getString("nfe"));
                empresa.setNfce(rs.getString("nfce"));
                empresa.setNfse(rs.getString("nfse"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setVencimentoSistema(rs.getString("vencimentosistema"));
                empresa.setVencimentoCertificado(rs.getString("vencimentocertificado"));
                empresa.setObs(rs.getString("obs"));
                empresa.setId_cliente(rs.getInt("id_cliente"));
                empresa.setPasta(rs.getString("pasta"));
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.Desconecta();
        return empresa;
    }

    public void GravaBackup(Backup backup) throws ClassNotFoundException {
        conexao.Conexao();
        try {
            PreparedStatement pst;
            pst = conexao.con.prepareStatement("insert into logbackup (empresa,resultado,nometarefa,datafim,id_cliente) values(?,?,?,?,?)");

            pst.setString(1, backup.getPastaEmpresa());
            pst.setString(2, backup.getRetorno());
            pst.setString(3, backup.getNome());
            pst.setString(4, backup.getDataFim());
            pst.setInt(5, backup.getId_cliente());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conexao.Desconecta();
    }

    public ArrayList buscaTodosBackup() throws ClassNotFoundException {
        conexao.Conexao();
        ArrayList<Backup> lista = new ArrayList();
        try {
            String query = "select * from logbackup order by id_backup desc";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Backup backup = new Backup();

                backup.setPastaEmpresa(rs.getString("empresa"));
                backup.setRetorno(rs.getString("resultado"));
                backup.setNome(rs.getString("nometarefa"));
                backup.setDataFim(rs.getString("datafim"));
                backup.setId_cliente(rs.getInt("id_cliente"));
                lista.add(backup);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.Desconecta();
        return lista;
    }

    public Empresa consultaPasta(String pasta) throws ClassNotFoundException {
        conexao.Conexao();
        Empresa empresa = new Empresa();
        try {
            String query = "select * from empresas where pasta = '" + pasta + "'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            if (rs.next()) {
                empresa.setRazaoSocial(rs.getString("razaosocial"));
                empresa.setFantasia(rs.getString("fantasia"));
                empresa.setTelefone1(rs.getString("telefone1"));
                empresa.setTelefone2(rs.getString("telefone2"));
                empresa.setIpServidor(rs.getString("ipservidor"));
                empresa.setSenha(rs.getString("senha"));
                empresa.setDominio(rs.getString("dominio"));
                empresa.setRegimeContabil(rs.getString("regimecontabil"));
                empresa.setContabilidade(rs.getString("contabilidade"));
                empresa.setResponsavel(rs.getString("responsavel"));
                empresa.setTelefoneContador(rs.getString("telefonecontador"));
                empresa.setNfe(rs.getString("nfe"));
                empresa.setNfce(rs.getString("nfce"));
                empresa.setNfse(rs.getString("nfse"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setVencimentoSistema(rs.getString("vencimentosistema"));
                empresa.setVencimentoCertificado(rs.getString("vencimentocertificado"));
                empresa.setObs(rs.getString("obs"));
                empresa.setId_cliente(rs.getInt("id_cliente"));
                empresa.setPasta(rs.getString("pasta"));
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.Desconecta();
        return empresa;
    }

    public ArrayList buscaTodosBackupID(Integer Id) throws ClassNotFoundException {
        conexao.Conexao();
        ArrayList<Backup> lista = new ArrayList();
        try {
            String query = "select * from logbackup where id_cliente = '" + Id + "' order by id_backup desc";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Backup backup = new Backup();

                backup.setPastaEmpresa(rs.getString("empresa"));
                backup.setRetorno(rs.getString("resultado"));
                backup.setNome(rs.getString("nometarefa"));
                backup.setDataFim(rs.getString("datafim"));
                backup.setId_cliente(rs.getInt("id_cliente"));
                lista.add(backup);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.Desconecta();
        return lista;
    }

    public void GravaErro(Erro erro) throws ClassNotFoundException {
        conexao.Conexao();
        try {
            PreparedStatement pst;
            pst = conexao.con.prepareStatement("insert into logerro (id_cliente,programa,arquivo,paragrafo,operacao,coderro,chave,mensagemerro,data,usuariots,nomeservidor,nomecomputador,pastaempresa,caminhoarquivo) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setInt(1, erro.getId_cliente());
            pst.setString(2, erro.getPrograma());
            pst.setString(3, erro.getArquivo());
            pst.setString(4, erro.getParagrafo());
            pst.setString(5, erro.getOperacao());
            pst.setString(6, erro.getCoderro());
            pst.setString(7, erro.getChave());
            pst.setString(8, erro.getMensagemerro());
            pst.setString(9, erro.getData());
            pst.setString(10, erro.getUsuariots());
            pst.setString(11, erro.getNomeservidor());
            pst.setString(12, erro.getNomecomputador());
            pst.setString(13, erro.getPastaEmpresa());
            pst.setString(14, erro.getCaminhoarquivo());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conexao.Desconecta();
    }
    public ArrayList buscaTodosErros() throws ClassNotFoundException {
        conexao.Conexao();
        ArrayList<Erro> lista = new ArrayList();
        try {
            String query = "select * from logerro order by id_erro desc";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Erro erro = new Erro();
                erro.setId_erro(rs.getInt("id_erro"));
                erro.setId_cliente(rs.getInt("id_cliente"));
                erro.setPrograma(rs.getString("programa"));
                erro.setArquivo(rs.getString("arquivo"));
                erro.setParagrafo(rs.getString("paragrafo"));
                erro.setOperacao(rs.getString("operacao"));
                erro.setCoderro(rs.getString("coderro"));
                erro.setChave(rs.getString("chave"));
                erro.setMensagemerro(rs.getString("mensagemerro"));
                erro.setData(rs.getString("data"));
                erro.setUsuariots(rs.getString("usuariots"));
                erro.setNomeservidor(rs.getString("nomeservidor"));
                erro.setNomecomputador(rs.getString("nomecomputador"));
                erro.setPastaEmpresa(rs.getString("pastaempresa"));
                erro.setCaminhoarquivo(rs.getString("caminhoarquivo"));
                lista.add(erro);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.Desconecta();
        return lista;
    }
    public ArrayList buscaErrosIdCliente(Integer id_cliente) throws ClassNotFoundException {
        conexao.Conexao();
        ArrayList<Erro> lista = new ArrayList();
        try {
            String query = "select * from logerro where id_cliente = '"+id_cliente+"' order by id_erro desc";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Erro erro = new Erro();
                erro.setId_erro(rs.getInt("id_erro"));
                erro.setId_cliente(rs.getInt("id_cliente"));
                erro.setPrograma(rs.getString("programa"));
                erro.setArquivo(rs.getString("arquivo"));
                erro.setParagrafo(rs.getString("paragrafo"));
                erro.setOperacao(rs.getString("operacao"));
                erro.setCoderro(rs.getString("coderro"));
                erro.setChave(rs.getString("chave"));
                erro.setMensagemerro(rs.getString("mensagemerro"));
                erro.setData(rs.getString("data"));
                erro.setUsuariots(rs.getString("usuariots"));
                erro.setNomeservidor(rs.getString("nomeservidor"));
                erro.setNomecomputador(rs.getString("nomecomputador"));
                erro.setPastaEmpresa(rs.getString("pastaempresa"));
                erro.setCaminhoarquivo(rs.getString("caminhoarquivo"));
                lista.add(erro);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.Desconecta();
        return lista;
    }
    public Erro buscaErrosId(Integer id_erro) throws ClassNotFoundException {
        conexao.Conexao();
        Erro erro = new Erro();
        try {
            String query = "select * from logerro where id_erro = '"+id_erro+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                erro.setId_erro(rs.getInt("id_erro"));
                erro.setId_cliente(rs.getInt("id_cliente"));
                erro.setPrograma(rs.getString("programa"));
                erro.setArquivo(rs.getString("arquivo"));
                erro.setParagrafo(rs.getString("paragrafo"));
                erro.setOperacao(rs.getString("operacao"));
                erro.setCoderro(rs.getString("coderro"));
                erro.setChave(rs.getString("chave"));
                erro.setMensagemerro(rs.getString("mensagemerro"));
                erro.setData(rs.getString("data"));
                erro.setUsuariots(rs.getString("usuariots"));
                erro.setNomeservidor(rs.getString("nomeservidor"));
                erro.setNomecomputador(rs.getString("nomecomputador"));
                erro.setPastaEmpresa(rs.getString("pastaempresa"));
                erro.setCaminhoarquivo(rs.getString("caminhoarquivo"));
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.Desconecta();
        return erro;
    }

}
