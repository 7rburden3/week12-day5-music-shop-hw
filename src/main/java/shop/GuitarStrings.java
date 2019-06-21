package shop;

public class GuitarStrings extends Store{

    public GuitarStrings(String type, double priceBuy, double priceSell){
        super(type, priceBuy, priceSell);
    }

    public double calculateMarkUp() {
        return this.getPriceSell() - this.getPriceBuy();
    }


}
