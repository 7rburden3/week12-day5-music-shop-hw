package shop;

import instruments.Instrument;

public abstract class Store implements ISell{

    private String type;
    private double priceBuy;
    private double priceSell;

    public Store(String type, double priceBuy, double priceSell){

        this.type = type;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPriceBuy() {
        return priceBuy;
    }

    public void setPriceBuy(double priceBuy) {
        this.priceBuy = priceBuy;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(double priceSell) {
        this.priceSell = priceSell;
    }
}
