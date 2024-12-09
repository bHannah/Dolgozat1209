package hu.szamalk.model;

import java.util.Random;

public class Tábla {
    //adattagok:
    private char[][] T;
    private char UresCella;

    //konstruktor:

    public Tábla(char uresCella) {
        T = new char[8][8];
        UresCella = uresCella;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                this.T[i][j] = this.UresCella;
            }
        }
    }

    //tagfgv-k:

}
