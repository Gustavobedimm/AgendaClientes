package clienteshds.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Conexao {
    
    public ResultSet rs;
    public Connection con;
    private final String driver = "org.postgresql.Driver";
    private String caminho = "";
    //private final String caminho = "jdbc:postgresql://localhost:5432/ClientesHds?useSSL=false";
    private String usuario = "";//postgres    
    private String senha = "";//root
    
    
    public void leXML(){
    String ipPorta ="";
        
    }
    
    public void Conexao() throws ClassNotFoundException {
        String tempCaminho = "";
        String tempUsuairo = "";
        String tempSenha = "";
        //le xml
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("Config.xml");
            NodeList listaDePessoas = doc.getElementsByTagName("xConfig");
            int tamanhoLista = listaDePessoas.getLength();
            for (int i = 0; i < tamanhoLista; i++) {
                Node noPessoa = listaDePessoas.item(i);
                if (noPessoa.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoPessoa = (Element) noPessoa;
                    tempCaminho = elementoPessoa.getAttribute("caminho");
                    tempUsuairo = elementoPessoa.getAttribute("usuario");
                    tempSenha = elementoPessoa.getAttribute("senha");
                    caminho = "jdbc:postgresql://"+tempCaminho+"/ClientesHds?useSSL=false";
                    usuario = tempUsuairo;
                    senha = tempSenha;
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //fim le xml
        
        //conexao
        try {
            Class.forName("org.postgresql.Driver");
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }

    public void Desconecta() {
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
