package com.myapp.formularios;

import com.myapp.UsersData;
import javax.swing.*;

public class FrmRegUser extends JDialog {
    private JTextField txtNombre, txtApellidos, txtEmail, txtNickname;
    private JPasswordField txtClave;

    public FrmRegUser(JFrame parent) {
        super(parent, "Registrar Usuario", true);
        setSize(400, 320);
        setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 100, 25);
        add(lblNombre);
        txtNombre = new JTextField();
        txtNombre.setBounds(130, 20, 220, 25);
        add(txtNombre);

        JLabel lblAp = new JLabel("Apellidos:");
        lblAp.setBounds(20, 60, 100, 25);
        add(lblAp);
        txtApellidos = new JTextField();
        txtApellidos.setBounds(130, 60, 220, 25);
        add(txtApellidos);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 100, 100, 25);
        add(lblEmail);
        txtEmail = new JTextField();
        txtEmail.setBounds(130, 100, 220, 25);
        add(txtEmail);

        JLabel lblNick = new JLabel("Nickname:");
        lblNick.setBounds(20, 140, 100, 25);
        add(lblNick);
        txtNickname = new JTextField();
        txtNickname.setBounds(130, 140, 220, 25);
        add(txtNickname);

        JLabel lblClave = new JLabel("Clave:");
        lblClave.setBounds(20, 180, 100, 25);
        add(lblClave);
        txtClave = new JPasswordField();
        txtClave.setBounds(130, 180, 220, 25);
        add(txtClave);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(130, 220, 100, 30);
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            String nombre = txtNombre.getText().trim();
            String apellidos = txtApellidos.getText().trim();
            String email = txtEmail.getText().trim();
            String nick = txtNickname.getText().trim();
            String clave = new String(txtClave.getPassword()).trim();

            if (nombre.isEmpty() || nick.isEmpty() || clave.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nombre, Nickname y Clave son obligatorios.", "Atención", JOptionPane.WARNING_MESSAGE);
                return;
            }

            UsersData.guardarUsuario(nombre, apellidos, email, nick, clave);
            JOptionPane.showMessageDialog(this, "Usuario registrado correctamente.", "OK", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        });
    }
}
