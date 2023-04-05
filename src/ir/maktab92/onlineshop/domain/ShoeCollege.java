package ir.maktab92.onlineshop.domain;

import ir.maktab92.onlineshop.base.product.Shoes;

public class ShoeCollege extends Shoes {
    String metal;
    boolean OrthopedicShoe;

    public ShoeCollege(long id, double unitPrice, int size, String color, String metal, boolean orthopedicShoe) {
        super(id, unitPrice, size, color);
        this.metal = metal;
        OrthopedicShoe = orthopedicShoe;
    }

    public ShoeCollege(int size, String color, String metal, boolean orthopedicShoe) {
        super(size, color);
        this.metal = metal;
        OrthopedicShoe = orthopedicShoe;
    }

    public ShoeCollege(String metal, boolean orthopedicShoe) {
        this.metal = metal;
        OrthopedicShoe = orthopedicShoe;
    }

    public ShoeCollege() {
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public boolean isOrthopedicShoe() {
        return OrthopedicShoe;
    }

    public void setOrthopedicShoe(boolean orthopedicShoe) {
        OrthopedicShoe = orthopedicShoe;
    }

    @Override
    public String toString() {
        return "ShoeCollege{" +
                "metal='" + metal + '\'' +
                ", OrthopedicShoe=" + OrthopedicShoe +
                "} " + super.toString();
    }
}
