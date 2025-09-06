package com.myapp.formularios;

import com.myapp.UsersData;
import com.myapp.Usuarios;
import javax.swing.*;

public class FrmLogin extends JFrame {
    private JTextField txtNickname;
    private JPasswordField txtClave;

    public FrmLogin() {
        setTitle("FrmLogin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLayout(null);

        JLabel lblNick = new JLabel("Nickname:");
        lblNick.setBounds(20, 20, 80, 25);
        add(lblNick);

        txtNickname = new JTextField();
        txtNickname.setBounds(110, 20, 200, 25);
        add(txtNickname);

        JLabel lblClave = new JLabel("Clave:");
        lblClave.setBounds(20, 60, 80, 25);
        add(lblClave);

        txtClave = new JPasswordField();
        txtClave.setBounds(110, 60, 200, 25);
        add(txtClave);

        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(110, 100, 100, 30);
        add(btnIngresar);

        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(220, 100, 90, 30);
        add(btnRegistrar);

        btnIngresar.addActionListener(e -> {
            String nick = txtNickname.getText().trim();
            String clave = new String(txtClave.getPassword()).trim();
            Usuarios u = UsersData.validarUsuario(nick, clave);
            if (u != null) {
                FrmDashboard dash = new FrmDashboard(u);
                dash.setLocationRelativeTo(this);
                dash.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Nickname o clave incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnRegistrar.addActionListener(e -> {
            FrmRegUser reg = new FrmRegUser(this);
            reg.setLocationRelativeTo(this);
            reg.setVisible(true);
        });
    }
}
