package modell;

public class Cso extends TomorHenger {

    private double falvastagsag;

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag, fajsuly);
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        return Math.PI * Math.pow(getSugar(), 2) * getMagassag();
    }

    @Override
    public String toString() {
        return super.toString() + ", Falvastagság: " + this.falvastagsag + " (Cső)";
    }
}
