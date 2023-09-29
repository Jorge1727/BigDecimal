package org.iesvdm.tiendaOnline;

import java.math.BigDecimal;

public class LineItem
{
    //Atributos
    private Integer quantity;
    private BigDecimal price;
    private Product product;

    //Constructor
    public LineItem(Integer quantity, BigDecimal price, Product product)
    {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    //Metodos
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "LineItem{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", product=" + product +
                '}';
    }
}
