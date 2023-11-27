package main;

import java.util.ArrayList;
import java.util.List;
import modell.LyukasHenger;
import modell.MertaniHenger;
import modell.TomorHenger;

public class HengerProgra {

    private static List<MertaniHenger> hengerek = new ArrayList<>();

    public static void main(String[] args) {
       run();
    }

    private static void run() {
        elvalaszt(); 
        System.out.println("A hengerek fajtái és paraméterei:");
        MertaniHenger c1 = new LyukasHenger(1.1, 2.2, 3.3, 4.4);
        MertaniHenger c2 = new LyukasHenger(1.2, 2.3, 3.4);
        MertaniHenger t1 = new TomorHenger(2.1, 3.2, 4.3);
        MertaniHenger t2 = new TomorHenger(3.1, 4.2);

        hengerek.add(c1);
        hengerek.add(c2);
        hengerek.add(t1);
        hengerek.add(t2);
        lista();
        
         
        elvalaszt();
        System.out.println("Össz henger: " + hengerek.size());
        elvalaszt();
        System.out.println("Átlagos térfogat a csöveknek: " + atlagTerfogat());
        elvalaszt();
        System.out.println("Csövek súlya: " + csovekSulya());
        

    }

    private static void elvalaszt() {
        System.out.println("_______________________________________________________");
    }

    private static double atlagTerfogat() {
        double osszeg = 0.0;
        int hengerDb = MertaniHenger.getHengerDarab();
        for (MertaniHenger henger : hengerek) {
            osszeg += henger.terfogat();
        }
        return osszeg / hengerDb;
    }

    private static double csovekSulya() {
        double csovekSulya = 0.0;
        for (MertaniHenger henger : hengerek) {
            if (henger instanceof LyukasHenger) {
                LyukasHenger cso = (LyukasHenger) henger;
                csovekSulya += cso.getFajsuly();
            }
        }
        return csovekSulya;
    }

    private static List lista() {

        for (MertaniHenger henger : hengerek) {
            System.out.println(henger.toString());
        }

        return hengerek;
    }
}
