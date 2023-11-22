package modell;

public class Cso extends TomorHenger {

    private double falvastagsag;

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double falvastagsag) {
        super(sugar, magassag, falvastagsag);
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public double terfogat() {
        return falvastagsag;
    }

    @Override
    public String toString() {
        return "fajsuly: " + this.falvastagsag;
    }
}
