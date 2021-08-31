package clienteshds;

import clienteshds.visao.Principal;
import javax.swing.UIManager;

public class ClientesHds {
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Principal principal = new Principal();
        principal.setVisible(true);
    }
}
