package org.iesvdm.tiendaOnlineTest;

import org.iesvdm.tiendaOnline.Account;
import org.iesvdm.tiendaOnline.Customer;
import org.iesvdm.tiendaOnline.WebUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class WebUserCustomerAccountTest
{
    Date fechaOpen1 = new Date("02/05/2015");
    Date fechaOpen2 = new Date("10/12/2020");
    @Test
    public void testCrearUsuariosYCuentas()
    {
        //Creamos WebUser Customer y Account
        WebUser webUser1 = new WebUser("usuario1", "contraseña1", WebUser.State.NEW);
        Customer customer1 = new Customer(webUser1, "Dirección1", "123456789", "correo1@ejemplo.com");
        Account account1 = new Account(customer1, "Dirección1", false, fechaOpen1, null);

        WebUser webUser2 = new WebUser("usuario2", "contraseña2", WebUser.State.ACTIVE);
        Customer customer2 = new Customer(webUser2, "Dirección2", "987654321", "correo2@ejemplo.com");
        Account account2 = new Account(customer2, "Dirección2", false, fechaOpen2, null);

        //Comprobamos que se han creado correctamente
        Assertions.assertEquals("usuario1", webUser1.getLogin_id());
        Assertions.assertEquals("Dirección1", customer1.getAdress());
        Assertions.assertEquals(fechaOpen1, account1.getOpen());

        Assertions.assertEquals(WebUser.State.ACTIVE, webUser2.getState());
        Assertions.assertEquals("987654321", customer2.getPhone());
        Assertions.assertEquals(null, account2.getClosed());
    }
}
