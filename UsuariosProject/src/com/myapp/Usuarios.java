package com.myapp;

public class Usuarios {
    private String nombre;
    private String apellidos;
    private String email;
    private String nickname;
    private String clave;

    public Usuarios(String nombre, String apellidos, String email, String nickname, String clave) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.nickname = nickname;
        this.clave = clave;
    }

    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getEmail() { return email; }
    public String getNickname() { return nickname; }
    public String getClave() { return clave; }
}
