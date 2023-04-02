package entity.base;

public class ElectronicDevice extends BaseEntity {

    String name;
    int voltage;
    double UnitPrice;

    public ElectronicDevice(long id,String name, int voltage, double unitPrice) {
        super(id);
        this.name = name;
        this.voltage = voltage;
        UnitPrice = unitPrice;
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

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }


}
