package com.mycompany.my_own_shop;

import java.util.Scanner;

public class CDetalleVenta {
    public int id_detalle;
    public CProducto proucto;
    public int cantidad;
    public double subtotal;

    public CDetalleVenta() {
    }

    public CDetalleVenta(int id_detalle, CProducto proucto, int cantidad, double subtotal) {
        this.id_detalle = id_detalle;
        this.proucto = proucto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public CProducto getProucto() {
        return proucto;
    }

    public void setProucto(CProducto proucto) {
        this.proucto = proucto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    public void calcularSubtotal() {
        Scanner sc = new Scanner(System.in);
        String opc_calcular = null;
        subtotal = 0;
        
        while (!opc_calcular.equals("n")){
            try {
                System.out.print("Ingrese el precio del producto: ");
                double prec = sc.nextInt();
                int validacion = 0;
                while (validacion != 1){
                    System.out.println("¿Agregar más? s/n");
                    opc_calcular = sc.nextLine();
                    if (!opc_calcular.equals("s") && !opc_calcular.equals("n"))
                        System.out.println("Opcion invalida");
                    else
                        validacion++;
                }
                subtotal += prec;
            } catch(Exception e) {
                System.out.println("Error " + e.getMessage());
            }
            finally {
                System.out.println(subtotal);
            }
        }
    }
    
    public void mostrarDetalle() {
    
    }
}
