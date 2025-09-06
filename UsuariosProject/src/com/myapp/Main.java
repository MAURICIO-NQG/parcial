package com.myapp;

import com.myapp.formularios.FrmLogin;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        UsersData.crearUsuarioPorDefecto();
        SwingUtilities.invokeLater(() -> {
            FrmLogin login = new FrmLogin();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        });
    }
}
