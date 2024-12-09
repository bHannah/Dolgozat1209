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
    public String Megjelenit(){
        String s = "";
        for (int i = 0; i < this.T.length; i++) {
            for (int j = 0; j < this.T[i].length; j++) {
                s += this.T[i][j];
            }
            s += "\n";
        }
        return s;
    }

    public void Elhelyez(int N){
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            int oszlop = rnd.nextInt();
            int sor = rnd.nextInt();
            if(T[oszlop][sor] != UresCella){
                T[oszlop][sor] = 'K';
            }
        }
    }

    
}
