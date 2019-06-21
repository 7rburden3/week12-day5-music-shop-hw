package instruments;

public class Piano extends Instrument{

    public Piano(String type, String colour, double priceBuy, double priceSell){
        super(type, colour, priceBuy, priceSell);
    }

    public String play(){
        return "I'm an 88 string folk guitar";
    }

}
