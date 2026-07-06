package RegistroUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {

    JLabel titulo, lblNombre, lblEmail, lblContra, lblMensaje;
    JTextField txtNombre, txtEmail;
    JPasswordField txtContra;
    JButton btnRegistrar;
    JSeparator linea;

    public Ventana() {

        setTitle("Sistema de Registro");
        setSize(500,470);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Título
        titulo = new JLabel("Registro de Usuario");
        titulo.setBounds(90,20,350,40);
        titulo.setFont(new Font("Arial",Font.BOLD,28));
        add(titulo);

        // Nombre
        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(40,90,100,25);
        add(lblNombre);

        txtNombre = new JTextField("Ingresa tu nombre");
        txtNombre.setBounds(160,90,240,30);
        txtNombre.setForeground(Color.GRAY);
        add(txtNombre);

        // Email
        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(40,140,100,25);
        add(lblEmail);

        txtEmail = new JTextField("ejemplo@correo.com");
        txtEmail.setBounds(160,140,240,30);
        txtEmail.setForeground(Color.GRAY);
        add(txtEmail);

        // Contraseña
        lblContra = new JLabel("Contraseña:");
        lblContra.setBounds(40,190,100,25);
        add(lblContra);

        txtContra = new JPasswordField("........ Mínimo 8 caracteres");
        txtContra.setEchoChar((char)0);
        txtContra.setForeground(Color.GRAY);
        txtContra.setBounds(160,190,240,30);
        add(txtContra);

        // Botón
        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(180,245,120,35);
        add(btnRegistrar);
        // Color de fondo (azul)
        btnRegistrar.setBackground(new Color(0, 102, 204));
        // Color del texto (blanco)
        btnRegistrar.setForeground(Color.white);
        // Fuente
        btnRegistrar.setFont(new Font("Arial", Font.BOLD, 17));

        add(btnRegistrar);

        // Línea
        linea = new JSeparator();
        linea.setBounds(30,310,430,10);
        add(linea);

        // Mensaje
        lblMensaje = new JLabel("",SwingConstants.CENTER);
        lblMensaje.setBounds(20,330,450,30);
        lblMensaje.setFont(new Font("Arial",Font.BOLD,16));
        add(lblMensaje);

        // Placeholder Nombre
        txtNombre.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {

                if(txtNombre.getText().equals("Ingresa tu nombre")){
                    txtNombre.setText("");
                    txtNombre.setForeground(Color.BLACK);
                }

            }

            @Override
            public void focusLost(FocusEvent e) {

                if(txtNombre.getText().trim().isEmpty()){
                    txtNombre.setText("Ingresa tu nombre");
                    txtNombre.setForeground(Color.GRAY);
                }

            }

        });

        // Placeholder Email
        txtEmail.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {

                if(txtEmail.getText().equals("ejemplo@correo.com")){
                    txtEmail.setText("");
                    txtEmail.setForeground(Color.BLACK);
                }

            }

            @Override
            public void focusLost(FocusEvent e) {

                if(txtEmail.getText().trim().isEmpty()){
                    txtEmail.setText("ejemplo@correo.com");
                    txtEmail.setForeground(Color.GRAY);
                }

            }

        });

        // Placeholder Contraseña
        txtContra.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {

                String texto = new String(txtContra.getPassword());

                if(texto.equals("........ Mínimo 8 caracteres")){
                    txtContra.setText("");
                    txtContra.setEchoChar('•');
                    txtContra.setForeground(Color.BLACK);
                }

            }

            @Override
            public void focusLost(FocusEvent e) {

                String texto = new String(txtContra.getPassword());

                if(texto.isEmpty()){
                    txtContra.setEchoChar((char)0);
                    txtContra.setText("........ Mínimo 8 caracteres");
                    txtContra.setForeground(Color.GRAY);
                }

            }

        });

        // Botón Registrar
        btnRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = txtNombre.getText();

                lblMensaje.setText("¡Registro exitoso para " + nombre + "!");

            }

        });

    }

}