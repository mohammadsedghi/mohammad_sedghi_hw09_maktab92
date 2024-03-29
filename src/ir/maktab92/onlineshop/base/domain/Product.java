package ir.maktab92.onlineshop.base.domain;

public class Product extends Entity {
   protected double UnitPrice=0;
    public double getUnitPrice() {
        return UnitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.UnitPrice=unitPrice;
    }

    public Product(long id, double unitPrice) {
        super(id);
        UnitPrice = unitPrice;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "UnitPrice=" + UnitPrice +
                "} " + super.toString();
    }
}
