package instruments;

public class Piano extends Instrument{

    private int numberOfKeys;

    public Piano(String type, String colour, double priceBuy, double priceSell, int numberOfKeys){
        super(type, colour, priceBuy, priceSell);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }

    public String play(){
        return "I'm an 88 string folk guitar";
    }

}
