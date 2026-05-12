package com.mycompany.my_own_shop;

public abstract class AUsuario {
    protected int id;
    protected String mombre;
    protected String contrasenia;
    protected String rol;

    public AUsuario() {
    }

    public AUsuario(int id, String mombre, String contrasenia, String rol) {
        this.id = id;
        this.mombre = mombre;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }
}
