package org.iesvdm.tiendaOnline;

import java.math.BigDecimal;
import java.util.Date;

public class Order
{
    public enum OrderStatus {NEW, HOLD, SHIPPED, DELIVERED, CLOSED}
    private String number;
    private Date ordered;
    private Date shipped;
    private String shipTo;
    private OrderStatus status;
    private BigDecimal total;
    private ShoppingCart shoppingCart;

    public Order(String number, Date ordered, Date shipped, String shipTo,ShoppingCart shoppingCart) {
        this.number = number;
        this.ordered = ordered;
        this.shipped = shipped;
        this.shipTo = shipTo;
        this.status = OrderStatus.NEW;
        this.shoppingCart = shoppingCart;
        this.total = calculoTotal();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getOrdered() {
        return ordered;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    //Cálculo total del contenido del carrito
    private BigDecimal calculoTotal()
    {
        if (shoppingCart != null)
        {
            return shoppingCart.getTotalPrice();
        }
        else
        {
            return BigDecimal.ZERO;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", status=" + status +
                '}';
    }
}
