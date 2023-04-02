package ir.maktab92.onlineshop.domain;

import ir.maktab92.onlineshop.base.product.ElectronicDevice;

public class Tv extends ElectronicDevice {
    String description;
    double screenSize;

    public Tv(Long id,double uintPrice ,String name, int voltage,String description,double screenSize) {
        super(id,uintPrice, name, voltage);
        this.description=description;
        this.screenSize=screenSize;
    }

    public Tv() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "description='" + description + '\'' +
                ", screenSize=" + screenSize +
                "} " + super.toString();
    }
}
