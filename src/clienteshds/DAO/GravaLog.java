
package clienteshds.DAO;

import clienteshds.visao.Principal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GravaLog {
    public void gravaTxtLog (String mensagem){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String data = sdf.format(new Date());
            
            
            String terminal = InetAddress.getLocalHost().getHostName();
            String mensagemFormatada = data + " - " + terminal + " - " + mensagem;
            
            String content = mensagemFormatada;
            
            File file = new File("log.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(content);
            bw.newLine();
            bw.close();
            
        }catch(Exception erro){
            System.out.println("ERRO");
        }
                
            
    }
    public void gravaTxtLogConexoes (String mensagem){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String data = sdf.format(new Date());
            
            
            String terminal = InetAddress.getLocalHost().getHostName();
            String mensagemFormatada = data + " - " + terminal + " - " + mensagem;
            
            String content = mensagemFormatada;
            
            File file = new File(terminal+".txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(content);
            bw.newLine();
            bw.close();
            
        }catch(Exception erro){
            System.out.println("ERRO");
        }
                
            
    }
    public void gravaAtualizações(ArrayList<String> listaArquivos, String pasta){
        String terminal = "";  
        try {
            terminal = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
          try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String data = sdf.format(new Date());
            String dataFormatada = data;
            dataFormatada = dataFormatada.replace("/", "");
            dataFormatada = dataFormatada.replace(":", "");
            dataFormatada = dataFormatada.replace(" ", "");
            String mensagemFormatada = "Atualização feita por : " + terminal  + " em "+data+ "\r\n";
            mensagemFormatada = mensagemFormatada + "Cliente : " + pasta  + "\r\n";
            mensagemFormatada = mensagemFormatada + "Programas atualizados : "+ "\r\n";
            for(String nome: listaArquivos){
                mensagemFormatada = mensagemFormatada +nome+"\r\n";
            }
            File file = new File("./logtransf/"+dataFormatada+".txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(mensagemFormatada);
            bw.newLine();
            bw.close();
            
        }catch(Exception erro){
            System.out.println("ERRO");
        }
    }
}
