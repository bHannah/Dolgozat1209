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
            if(T[sor][oszlop] != UresCella){
                T[sor][oszlop] = 'K';
            }
        }
    }

    public boolean UresOszlop(int oszlop){
        int szamlalo = 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i][oszlop] == UresCella) {
                szamlalo += 1;
            }
        }
        return szamlalo != T.length;
    }

    public boolean UresSor(int sor){
        int szamlalo = 0;
        for (int i = 0; i < T[sor].length; i++) {
            if (T[sor][i] == UresCella) {
                szamlalo += 1;
            }
        }
        return szamlalo != T.length;
    }

    public int UresSorokSzama(){
        int szamlalo = 0;
        for (int i = 0; i < T.length; i++) {
            if(!UresSor(i)){
                szamlalo += 1;
            }
        }
        return szamlalo;
    }

    public int UresOszlopokSzama(){
        int szamlalo = 0;
        for (int i = 0; i < T.length; i++) {
            if(!UresOszlop(i)) {
                szamlalo += 1;
            }
        }
        return szamlalo;
    }
}
