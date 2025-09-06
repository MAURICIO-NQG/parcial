package com.myapp;

import java.util.ArrayList;
import java.util.List;

public class UsersData {
    private static final List<Usuarios> usuarios = new ArrayList<>();

    public static void guardarUsuario(String nombre, String apellidos, String email, String nickname, String clave) {
        Usuarios u = new Usuarios(nombre, apellidos, email, nickname, clave);
        usuarios.add(u);
    }

    public static Usuarios validarUsuario(String nickname, String clave) {
        for (Usuarios u : usuarios) {
            if (u.getNickname().equals(nickname) && u.getClave().equals(clave)) {
                return u;
            }
        }
        return null;
    }

    public static void crearUsuarioPorDefecto() {
        guardarUsuario("Mauricio", "Arrieta", "mauricio@example.com", "mauri", "1234");
    }
}





