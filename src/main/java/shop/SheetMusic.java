package shop;

public class SheetMusic extends Store{

    public SheetMusic(String type, double priceBuy, double priceSell){
        super(type, priceBuy, priceSell);
    }

    public double calculateMarkUp() {
        return this.getPriceSell() - this.getPriceBuy();
    }


}
