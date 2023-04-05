package ir.maktab92.onlineshop.base.product;

import ir.maktab92.onlineshop.base.domain.Product;

public class Shoes extends Product {
   protected int size;
   protected String color;

    public Shoes(long id, double unitPrice, int size, String color) {
        super(id, unitPrice);
        this.size = size;
        this.color = color;
    }

    public Shoes(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Shoes() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "size=" + size +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
