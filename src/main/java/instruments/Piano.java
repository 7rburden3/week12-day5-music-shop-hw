package instruments;

public class Piano extends Instrument{

    private int numberOfKeys;

    public Piano(InstrumentType instrumentType, String type, String colour, double priceBuy, double priceSell, int numberOfKeys){
        super(instrumentType, type, colour, priceBuy, priceSell);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }

    public String play(){
        return "I'm an 88 string folk guitar";
    }

    public double calculateMarkUp() {
        return this.getPriceSell() - this.getPriceBuy();
    }

}
