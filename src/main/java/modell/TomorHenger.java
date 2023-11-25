package modell;

public class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return fajsuly * 2;
    }

    @Override
    public double terfogat() {
        return Math.PI * Math.pow(getSugar(), 2) * getMagassag();
    }

    @Override
    public String toString() {
        return super.toString() + ", fajsuly: " + this.fajsuly + ", suly: " + suly();
    }
}