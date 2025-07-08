package awt;

import java.awt.*;

public class Chat extends Frame {
    private TextField tfAlias;
    private TextField tfMensaje;
    private Button bLogin;
    private Button bCerrarSesion;
    private Button bEnviar;
    private List lstMensaje;

    public Chat(){
        super("Ventana de Chat");
        setLayout(new BorderLayout());

        //Panel Norte
        Panel pNorte = crearPanleNorte();
        add(pNorte, BorderLayout.NORTH);

        //Panel Centro
        Panel pCentro = crearPanleCentro();
        add(pCentro, BorderLayout.CENTER);

        //Panel Sur
        Panel pSur = crearPanleSur();
        add(pSur, BorderLayout.SOUTH);

        //Configurar la ventana
        setSize(400,300);
        setVisible(true);

    }

    private Panel crearPanleNorte(){
        Panel panel = new Panel(new FlowLayout(FlowLayout.LEFT));
        panel.add(new Label("Alias: "));
        tfAlias = new TextField(10);
        panel.add(tfAlias);
        bLogin = new Button("Login");
        panel.add(bLogin);
        bCerrarSesion = new Button("Cerrar Sesion");
        panel.add(bCerrarSesion);

        return panel;
    }

    private Panel crearPanleCentro(){
        Panel panel = new Panel(new BorderLayout());

        panel.add(new Label("Conversacion: "), BorderLayout.NORTH);

        lstMensaje = new List();
        panel.add(lstMensaje, BorderLayout.CENTER);

        return panel;
    }

    private Panel crearPanleSur(){
        Panel panel = new Panel(new BorderLayout());

        panel.add(new Label("Mensaje: "), BorderLayout.WEST);
        tfMensaje = new TextField();
        panel.add(tfMensaje, BorderLayout.CENTER);
        bEnviar = new Button("Enviar");
        panel.add(bEnviar, BorderLayout.EAST);

        return panel;
    }

    public static void main(String[] args) {
        new Chat();
    }
}
