package ir.maktab92.onlineshop.base.product;

import ir.maktab92.onlineshop.base.domain.Entity;
import ir.maktab92.onlineshop.base.domain.Product;

public class ElectronicDevice extends Product {

    String name;
    int voltage;


    public ElectronicDevice(long id, double unitPrice, String name, int voltage) {
        super(id,unitPrice);
        this.name = name;
        this.voltage = voltage;

    }

    public ElectronicDevice() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }


}



