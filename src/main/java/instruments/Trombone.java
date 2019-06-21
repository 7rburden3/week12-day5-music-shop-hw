package instruments;

public class Trombone extends Instrument{

    private String valves;

    public Trombone(String type, String colour, double priceBuy, double priceSell, String valves){
        super(type, colour, priceBuy, priceSell);
        this.valves = valves;
    }

    public String play() {
        return "Paarrrrppp! I'm a trombone!";
    }

    public String getValves() {
        return valves;
    }

    public void setValves(String valves) {
        this.valves = valves;
    }
}
