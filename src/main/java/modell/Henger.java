package modell;

public class Henger {

    private static int hengerDarab;
    private double sugar, magassag;

    public Henger(double r, double m) {
        this.sugar = r;
        this.magassag = m;
    }
    
    public int getHengerDarab(){
        return hengerDarab;
    }
    
    public double getSugar(){
        return sugar;
    }
    
    public double getMagassag(){
        return magassag;
    }
    
    public double terfogat(){
        return magassag * sugar;
    }
    
    @Override
    public String toString(){
        return "Sugár: "+this.sugar+", Magasság: "+this.magassag+", HengerDarab: "+hengerDarab;
    }
}
