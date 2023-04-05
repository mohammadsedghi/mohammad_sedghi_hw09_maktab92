package ir.maktab92.onlineshop.domain;

import ir.maktab92.onlineshop.base.product.Shoes;

public class ShoeSport extends Shoes {
    private String typeofSport;
    private boolean suitableRunning;

    public ShoeSport(long id, double unitPrice, int size, String color, String typeofSport, boolean suitableRunning) {
        super(id, unitPrice, size, color);
        this.typeofSport = typeofSport;
        this.suitableRunning = suitableRunning;
    }

    public ShoeSport(int size, String color, String typeofSport, boolean suitableRunning) {
        super(size, color);
        this.typeofSport = typeofSport;
        this.suitableRunning = suitableRunning;
    }

    public ShoeSport(String typeofSport, boolean suitableRunning) {
        this.typeofSport = typeofSport;
        this.suitableRunning = suitableRunning;
    }

    public ShoeSport() {
    }

    @Override
    public String toString() {
        return "ShoeSport{" +
                "typeofSport='" + typeofSport + '\'' +
                ", suitableRunning=" + suitableRunning +
                ", id=" + id +
                "} " + super.toString();
    }
}
