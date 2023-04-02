package entity;

import entity.base.ElectronicDevice;

public class Tv extends ElectronicDevice {
    String description;
    double screenSize;

    public Tv(Long id, String name, int voltage, double unitPrice,String description,double screenSize) {
        super(id, name, voltage, unitPrice);
        this.description=description;
        this.screenSize=screenSize;
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
}
