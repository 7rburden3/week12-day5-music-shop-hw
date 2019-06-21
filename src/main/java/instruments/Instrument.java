package instruments;

public abstract class Instrument implements IPlay {

    private String type;
    private String colour;
    private double priceBuy;
    private double priceSell;

    public Instrument(String type, String colour, double priceBuy, double priceSell) {
        this.type = type;
        this.colour = colour;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
