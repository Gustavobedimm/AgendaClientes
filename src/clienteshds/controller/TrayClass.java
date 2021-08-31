package clienteshds.controller;

import clienteshds.visao.Principal;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class TrayClass {
    static TrayIcon trayIcon;

    public TrayClass(Principal principal){
        show(principal);
    }
    public TrayClass(String empresa,String erro){
        mostrarMensagem(empresa,erro);
    }

    public static void show(Principal principal)  {
        if (!SystemTray.isSupported()) {
            System.exit(0);
        }
        trayIcon = new TrayIcon(createIcon("/clienteshds/imagens/tray.png", "Icon"));
        trayIcon.setToolTip("Clientes HDS v1.0");
        final SystemTray tray = SystemTray.getSystemTray();
        final PopupMenu menu = new PopupMenu();
        MenuItem restaurar = new MenuItem("Restaurar");
        MenuItem sair = new MenuItem("Fechar");
        menu.add(restaurar);
        menu.addSeparator();
        menu.add(sair);
        trayIcon.setPopupMenu(menu);
        
        trayIcon.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                principal.setVisible(true);
            }
        }
        );
        
        restaurar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal.setVisible(true);
            }
        });
        
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
            }
        });
        
        
        
        try {
            tray.add(trayIcon);
        } catch (AWTException ex) {
            Logger.getLogger(TrayClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void mostrarMensagem(String empresa,String erro){
        trayIcon.displayMessage(empresa , erro, TrayIcon.MessageType.ERROR);
    }

    protected static Image createIcon(String path, String desc) {
        URL imageURL = TrayClass.class.getResource(path);
        return (new ImageIcon(imageURL, desc)).getImage();
    }

}
