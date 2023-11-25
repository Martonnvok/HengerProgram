package main;

import java.util.List;
import modell.Henger;

public class HengerProgram {

    private static List<Henger> hengerek;

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        atlagTerfogat();
        csovekSulya();
        lista();
    }

    private static double atlagTerfogat() {
        double atlagTerfogat = 0.0;
        return atlagTerfogat;
    }

    private static double csovekSulya() {
        double csovekSulya = 0.0;
        return csovekSulya;
    }

    private static List lista() {

        for (Henger henger : hengerek) {
            System.out.println(henger.toString());
        }

        return hengerek;
    }
}
