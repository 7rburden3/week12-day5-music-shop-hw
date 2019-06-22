package instruments;

import shop.ISell;

public abstract class Instrument implements IPlay, ISell{

    private InstrumentType instrumentType;

    private String type;
    private String colour;
    private double priceBuy;


    private double priceSell;

    public Instrument(InstrumentType instrumentType, String type, String colour, double priceBuy, double priceSell) {
        this.type = type;
        this.colour = colour;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
        this.instrumentType = instrumentType;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPriceBuy() {
        return priceBuy;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(double priceSell) {
        this.priceSell = priceSell;
    }

    public double getMarkUp(){
        return this.priceSell - this.priceBuy;
    }



}
