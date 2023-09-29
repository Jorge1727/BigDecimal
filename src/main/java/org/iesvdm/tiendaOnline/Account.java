package org.iesvdm.tiendaOnline;

import java.util.Date;

public class Account
{
    //Atributos
    Customer customer;
    private String billing_address;
    private boolean is_closed;
    private Date open;
    private Date closed;

    private ShoppingCart shoppingCart;

    //Constructor
    public Account(Customer customer, String billing_address, boolean is_closed, Date open, Date closed) {
        this.customer = customer;
        this.billing_address = billing_address;
        this.is_closed = is_closed;
        this.open = open;
        this.closed = closed;
        this.shoppingCart = new ShoppingCart();
    }

    //Metodos
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    public boolean isIs_closed() {
        return is_closed;
    }

    public void setIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", is_closed=" + is_closed +
                '}';
    }
}
