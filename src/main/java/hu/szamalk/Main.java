package hu.szamalk;

//feladatleirás:
//  - mindegyik feladatrész elkészítése után legyen egy commit
//  - három feladatrészből min 2. (f1 1 f1 2)/f1 VÉGE
// választott feladat: 2.

import hu.szamalk.model.Tábla;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Tábla obj = new Tábla('#');
        System.out.println(obj.Megjelenit());
//        System.out.println(obj.UresOszlop(2));
//        System.out.println(obj.UresSor(3));
        System.out.println("9. feladat: Üres oszlopok és sorok száma: ");
        System.out.println("Oszlopok: " + obj.UresOszlopokSzama());
        System.out.println("Sorok: " + obj.UresSorokSzama());
        obj.fajlbaIras();
    }
}
//VÉGE

