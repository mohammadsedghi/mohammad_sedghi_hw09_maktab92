package entity.base;

public class ElectronicDevice {
    Long id;
    String name;
    int voltage;
    double UnitPrice;

    public ElectronicDevice(Long id, String name, int voltage, double unitPrice) {
        this.id = id;
        this.name = name;
        this.voltage = voltage;
        UnitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
