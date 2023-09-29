package org.iesvdm.tiendaOnline;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Payment
{
    //Atributos
    private String id;
    private Date paid;
    private BigDecimal total;
    private List<LineItem> productos;
    private String details;

    //Constructores
    public Payment(Account account, Order order, Date paid, String details) {
        this.id = account.getCustomer().getUsuarioWeb().getLogin_id();
        this.paid = paid;
        this.productos = order.getShoppingCart().getLineItems();
        this.total = order.getTotal();
        this.details = details;
    }

    public Payment(WebUser webUser, Order order, Date paid, String details) {
        this.id = webUser.getLogin_id();
        this.paid = paid;
        this.productos = order.getShoppingCart().getLineItems();
        this.total = order.getTotal();
        this.details = details;
    }

    //Métodos
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPaid() {
        return paid;
    }

    public void setPaid(Date paid) {
        this.paid = paid;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<LineItem> getProductos() {
        return productos;
    }

    public void setProductos(List<LineItem> productos) {
        this.productos = productos;
    }

    public boolean realizarPago() //Pone a 0euros la cuenta y elimina los productos del carrito
    {
        BigDecimal total = getTotal();
        boolean hizoElPago = false;

        if(total.equals(BigDecimal.ZERO))
        {
            System.out.println("No tienes nada en el carrito para realizar la compra.");
        }
        else
        {
            System.out.println("Pago realizado, su orden esta en marcha.");
            setTotal(BigDecimal.ZERO);
            getProductos().clear();
            hizoElPago = true;
        }
        return hizoElPago;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", paid=" + paid +
                ", total=" + total +
                '}';
    }
}
