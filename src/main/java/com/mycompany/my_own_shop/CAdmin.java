package com.mycompany.my_own_shop;

public class CAdmin extends AUsuario implements IUsuario {

    public CAdmin() {
    }

    public CAdmin(int id, String mombre, String contrasenia, String rol) {
        super(id, mombre, contrasenia, rol);
    }

    @Override
    public void login() {
        
    }

    @Override
    public void logout() {
        
    }

    @Override
    public void veridicarPermiso() {
        
    }

    @Override
    public void generarIdUnico() {

    }

    @Override
    public void verificarIdUnico() {

    }
}
