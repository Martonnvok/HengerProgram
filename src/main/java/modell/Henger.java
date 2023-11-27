package modell;

public abstract class Henger {

    private static int hengerDarab;
    private double sugar, magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
        hengerDarab++;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public abstract double terfogat();

    @Override
    public String toString() {
        return "Sugár: " + this.sugar + ", Magasság: " + this.magassag;
    }
}
