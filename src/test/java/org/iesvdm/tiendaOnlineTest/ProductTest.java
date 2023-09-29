package org.iesvdm.tiendaOnlineTest;

import org.iesvdm.tiendaOnline.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest
{
    @Test
    public void testCrearProductos() {
        //Creamos productos
        Product product1 = new Product("1", "Producto 1", "Proveedor 1");
        Product product2 = new Product("2", "Producto 2", "Proveedor 2");

        //Comprobamos que se han creado
        Assertions.assertEquals("Producto 1", product1.getName());
        Assertions.assertEquals("Proveedor 2", product2.getSupplier());
    }
}
