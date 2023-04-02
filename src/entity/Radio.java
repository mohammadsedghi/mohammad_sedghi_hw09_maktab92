package entity;

import entity.base.ElectronicDevice;

public class Radio extends ElectronicDevice {
    String typeOfSearch;
    String receivedWaves;
    public Radio(Long id, String name, int voltage, double unitPrice, String typeOfSearch,String receivedWaves ) {
        super(id, name, voltage, unitPrice);
        this.typeOfSearch=typeOfSearch;
        this.receivedWaves=receivedWaves;
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
}
