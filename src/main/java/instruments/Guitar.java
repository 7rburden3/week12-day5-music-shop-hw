package instruments;

public class Guitar extends Instrument{

    private String strings;

    public Guitar(InstrumentType instrumentType, String type, String colour, double priceBuy, double priceSell, String strings){
        super(instrumentType, type, colour, priceBuy, priceSell);
        this.strings = strings;
    }

    public String play() {
        return "I am a six string guitar yeehaw!";
    }

    public String getStrings() {
        return strings;
    }

    public void setStrings(String strings) {
        this.strings = strings;

    }

    public double calculateMarkUp() {
        return this.getPriceSell() - this.getPriceBuy();
    }
}
