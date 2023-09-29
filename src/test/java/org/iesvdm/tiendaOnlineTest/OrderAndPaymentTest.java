package org.iesvdm.tiendaOnlineTest;


import org.iesvdm.tiendaOnline.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

public class OrderAndPaymentTest
{
    @Test
    public void testOrderAndPayment()
    {
        //Creamos el carrito de un usuario y su order
        WebUser usuario1 = new WebUser("1111", "12345678", WebUser.State.ACTIVE);
        ShoppingCart carritoUsuario1 = usuario1.getShoppingCart();

        //Creamos Producto y lineitem
        Product producto1 = new Product("1111", "Carcasa de movil", "proveedor1");
        LineItem item1 = new LineItem(2, new BigDecimal("10.99"), producto1);

        //Agregamos al carrito
        carritoUsuario1.addLineItem(item1);
        carritoUsuario1.addLineItem(item1);

        Date fechaDeOrder = new Date("02/05/2023");
        Date fechaDeEnvio = new Date("03/05/2023");
        Date fechaDePago = new Date("01/05/2023");

        Order order1 = new Order("x1x1x1", fechaDeOrder, fechaDeEnvio, "Direccion de envio", carritoUsuario1);

        //Creamos el pago
        Payment pagoDelOrder1 = new Payment(usuario1, order1, fechaDePago, "Paquete de accesorios de movil");

        //Comprobamos con Asserts
        Assertions.assertEquals(true, pagoDelOrder1.realizarPago());

        //Ahora queda a 0 y sin productos el carrito, no debe realizar la compra
        Order order2 = new Order("x2x2x2", fechaDeOrder, fechaDeEnvio, "Direccion de envio", carritoUsuario1);
        Payment pagoDelOrder2 = new Payment(usuario1, order2, fechaDePago, "");

        //Comprobamos con Asserts
        Assertions.assertEquals(false, pagoDelOrder2.realizarPago());
    }
}
