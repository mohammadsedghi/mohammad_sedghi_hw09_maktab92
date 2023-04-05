package ir.maktab92.onlineshop.domain;

import ir.maktab92.onlineshop.base.product.ElectronicDevice;

public class Radio extends ElectronicDevice {
    private String typeOfSearch;
    private String receivedWaves;
    public Radio(Long id,double unitPrice, String name, int voltage,  String typeOfSearch,String receivedWaves ) {
        super(id,unitPrice, name, voltage);
        this.typeOfSearch=typeOfSearch;
        this.receivedWaves=receivedWaves;
    }

    public Radio() {
    }

    public String getTypeOfSearch() {
        return typeOfSearch;
    }

    public void setTypeOfSearch(String typeOfSearch) {
        this.typeOfSearch = typeOfSearch;
    }

    public String getReceivedWaves() {
        return receivedWaves;
    }

    public void setReceivedWaves(String receivedWaves) {
        this.receivedWaves = receivedWaves;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "typeOfSearch='" + typeOfSearch + '\'' +
                ", receivedWaves='" + receivedWaves + '\'' +
                ", id=" + id +
                "} " + super.toString();
    }
}
