package modell;

public class TomorHenger extends MertaniHenger {
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

    @Override
    public double terfogat() {
        return Math.PI * Math.pow(getSugar(), 2) * getMagassag();
    }

    public double suly() {
        return fajsuly * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fajsúly: " + this.fajsuly + ", Súly: " + suly() + " Típusa: Tömör henger";
    }
}