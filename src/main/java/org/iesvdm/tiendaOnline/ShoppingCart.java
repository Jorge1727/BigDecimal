package org.iesvdm.tiendaOnline;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart
{
    //Atributos
    private Date created;
    private List<LineItem> lineItems;

    //Constructor
    public ShoppingCart() {
        this.created = new Date();
        this.lineItems = new ArrayList<>();
    }

    //Metodos
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public void removeLineItem(LineItem lineItem) {
        lineItems.remove(lineItem);
    }

    public BigDecimal getTotalPrice()
    {
        BigDecimal total = BigDecimal.ZERO;

        for (LineItem item : lineItems)
        {
            BigDecimal itemTotalPrice = item.getPrice().multiply(BigDecimal.valueOf(item.getQuantity()));
            total = total.add(itemTotalPrice);
        }

        return total;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "created=" + created +
                '}';
    }
}
