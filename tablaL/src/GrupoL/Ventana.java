package GrupoL;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private JLabel lblGrupo;
    private JLabel lblEngland;
    private JLabel lblCroatia;
    private JLabel lblGhana;
    private JLabel lblPanama;

    public Ventana() {

        setTitle("Grupo L");
        setSize(450,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,1,5,5));

        getContentPane().setBackground(new Color(30,45,60));

        // Título
        lblGrupo = new JLabel("GROUP L");
        lblGrupo.setForeground(Color.WHITE);
        lblGrupo.setFont(new Font("Arial",Font.BOLD,44));
        add(lblGrupo);

        // Banderas
        ImageIcon england = new ImageIcon(getClass().getResource("/imagenes/england.png"));
        Image imgEngland = england.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        england = new ImageIcon(imgEngland);
        ImageIcon croatia = new ImageIcon(getClass().getResource("/imagenes/croatia.png"));
        Image imgCroatia = croatia.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        croatia = new ImageIcon(imgCroatia);

        ImageIcon ghana = new ImageIcon(getClass().getResource("/imagenes/ghana.png"));
        Image imgGhana = ghana.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        ghana = new ImageIcon(imgGhana);

        ImageIcon panama = new ImageIcon(getClass().getResource("/imagenes/panama.png"));
        Image imgPanama = panama.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        panama = new ImageIcon(imgPanama);

        // England
        lblEngland = new JLabel(" ENGLAND");
        lblEngland.setIcon(england);
        lblEngland.setOpaque(true);
        lblEngland.setBackground(Color.WHITE);
        lblEngland.setFont(new Font("Arial",Font.BOLD,32));
        add(lblEngland);

        // Croatia
        lblCroatia = new JLabel(" CROATIA");
        lblCroatia.setIcon(croatia);
        lblCroatia.setOpaque(true);
        lblCroatia.setBackground(Color.WHITE);
        lblCroatia.setFont(new Font("Arial",Font.BOLD,32));
        add(lblCroatia);

        // Ghana
        lblGhana = new JLabel(" GHANA");
        lblGhana.setIcon(ghana);
        lblGhana.setOpaque(true);
        lblGhana.setBackground(Color.WHITE);
        lblGhana.setFont(new Font("Arial",Font.BOLD,32));
        add(lblGhana);

        // Panama
        lblPanama = new JLabel(" PANAMA");
        lblPanama.setIcon(panama);
        lblPanama.setOpaque(true);
        lblPanama.setBackground(Color.WHITE);
        lblPanama.setFont(new Font("Arial",Font.BOLD,32));
        add(lblPanama);
    }
}