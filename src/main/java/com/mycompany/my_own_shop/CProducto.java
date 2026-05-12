package com.mycompany.my_own_shop;

public class CProducto {
    public int id;
    public String nombre;
    public double precio;
    public int stock;
    public String categoria;
    public int stock_minimo;

    public CProducto() {
    }

    public CProducto(int id, String nombre, double precio, int stock, String categoria, int stock_minimo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.stock_minimo = stock_minimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }
    
    public void reducirStock(int reducir) {
        stock = stock - reducir;
    }
    
    public void aumentarStock(int aumentar) {
        stock = stock + aumentar;
    }
    
    public void estaDisponible() {
        if (stock > 0)
            System.out.println("Producto disponible");
        else
            System.out.println("Producto NO disponible");
    }
    
    public void estaStockMinimo() {
        if (stock <= stock_minimo)
            System.out.println("Producto en STOCK MINIMO, quedan: " + stock);
        else
            System.out.println("No esta en stock minimo, quedan: " + stock);
    }
}
