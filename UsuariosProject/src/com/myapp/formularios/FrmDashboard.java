package com.myapp.formularios;

import com.myapp.Usuarios;
import javax.swing.*;

public class FrmDashboard extends JFrame {
    public FrmDashboard(Usuarios user) {
        setTitle("FrmDashboard");
        setSize(420, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblBien = new JLabel("Bienvenido!");
        lblBien.setBounds(20, 20, 200, 30);
        lblBien.setFont(lblBien.getFont().deriveFont(18f));
        add(lblBien);

        JLabel lblNombre = new JLabel("Nombre: " + user.getNombre());
        lblNombre.setBounds(20, 60, 350, 25);
        add(lblNombre);

        JLabel lblApellidos = new JLabel("Apellidos: " + user.getApellidos());
        lblApellidos.setBounds(20, 90, 350, 25);
        add(lblApellidos);

        ImageIcon icon = new ImageIcon("resources/default_user.png");
        JLabel lblImage = new JLabel(icon);
        lblImage.setBounds(280, 40, 100, 100);
        add(lblImage);
    }
}
