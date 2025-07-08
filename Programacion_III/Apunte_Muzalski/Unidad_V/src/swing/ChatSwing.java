package swing;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;


public class ChatSwing extends JFrame {
    private JTextField tfAlias;
    private JTextField tfMensaje;
    private JButton bLogin;
    private JButton bCerrarSesion;
    private JButton bEnviar;
    private JList lstMensaje;
    private Border borde;

    public ChatSwing(){
        super("Ventana de Chat");
        //Pedir el panel contenedor del JFrame
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        //Definir el tipo de borde de los paneles
        borde = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        //Panel Norte
        JPanel pNorte = crearPanleNorte();
        add(pNorte, BorderLayout.NORTH);

        //Panel Centro
        JPanel pCentro = crearPanleCentro();
        add(pCentro, BorderLayout.CENTER);

        //Panel Sur
        JPanel pSur = crearPanleSur();
        add(pSur, BorderLayout.SOUTH);

        //Configurar la ventana
        setSize(400,300);
        setVisible(true);

    }

    private JPanel crearPanleNorte(){
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        TitledBorder borderInterno = BorderFactory.createTitledBorder(borde, "Alias");
        panel.setBorder(borderInterno);

        tfAlias = new JTextField(10);
        panel.add(tfAlias);
        bLogin = new JButton("Login");
        panel.add(bLogin);
        bCerrarSesion = new JButton("Cerrar Sesion");
        panel.add(bCerrarSesion);

        return panel;
    }

    private JPanel crearPanleCentro(){
        JPanel panel = new JPanel(new BorderLayout());

        TitledBorder borderInterno = BorderFactory.createTitledBorder(borde, "Conversacion");
        panel.setBorder(borderInterno);

        lstMensaje = new JList();
        panel.add(lstMensaje, BorderLayout.CENTER);

        return panel;
    }

    private JPanel crearPanleSur(){
        JPanel panel = new JPanel(new BorderLayout());

        TitledBorder borderInterno = BorderFactory.createTitledBorder(borde, "Mensaje");
        panel.setBorder(borderInterno);

        tfMensaje = new JTextField();
        panel.add(tfMensaje, BorderLayout.CENTER);
        bEnviar = new JButton("Enviar");
        panel.add(bEnviar, BorderLayout.EAST);

        return panel;
    }

    public static void main(String[] args) throws
        UnsupportedLookAndFeelException{
            UIManager.setLookAndFeel(new MetalLookAndFeel());
            new ChatSwing();
        }
    }

