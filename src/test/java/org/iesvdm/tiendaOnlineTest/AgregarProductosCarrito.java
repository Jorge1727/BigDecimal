package org.iesvdm.tiendaOnlineTest;

import org.iesvdm.tiendaOnline.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

public class AgregarProductosCarrito
{
    @Test
    public void testAgregarProductosAlCarrito()
    {
        //Crear un carrito de compra para WebUser y Account
        WebUser usuario1 = new WebUser("1111", "12345678", WebUser.State.ACTIVE);
        ShoppingCart carritoUsuario1 = usuario1.getShoppingCart();

        WebUser usuario2 = new WebUser("2222", "98765432", WebUser.State.ACTIVE);
        Customer cliente2 = new Customer(usuario2, "dirección 1", "666-555-444", "ejemplo@mail.com");
        Date fechaOpen1 = new Date("02/05/2015");
        Account cuenta2 = new Account(cliente2, "direccion de envio", false, fechaOpen1, null);
        ShoppingCart carritoCuenta2 = cuenta2.getShoppingCart();

        //Productos
        Product producto1 = new Product("1111", "Carcasa de movil", "proveedor1");
        Product producto2 = new Product("2222", "Tijeras", "proveedor2");

        //Agregamos productos al carrito de WebUser
        LineItem item1 = new LineItem(2, new BigDecimal("10.99"), producto1);
        LineItem item2 = new LineItem(3, new BigDecimal("5.99"), producto2);
        LineItem item3 = new LineItem(5, new BigDecimal("8.49"), producto1);

        carritoUsuario1.addLineItem(item1);
        carritoUsuario1.addLineItem(item2);
        carritoCuenta2.addLineItem(item3);

        //Comprobamos que se añaden correctamente
        Assertions.assertEquals(2, carritoUsuario1.getLineItems().size());
        Assertions.assertEquals(1, carritoCuenta2.getLineItems().size());
    }
}
