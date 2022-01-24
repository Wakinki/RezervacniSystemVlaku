/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezervaceJizdenekVlaku;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Michal Wackermann
 */
//TODO řešit typy vagónů přes CSV soubor
public class TypVagonu {

    //(pocet kupe, pocet sedacek v kupe)
    private static final TypVagonu[] typy = nactiTypyVagonu("TypyVagonu.csv",",");
    private final String nazev;
    private final int pocetKupe;
    private final int pocetSedadel;

    public static TypVagonu getTypVagonu(int i) {
        return typy[i];
    }

    public static TypVagonu getRandomTypVagonu() {
        int r = (int)(Math.random() * typy.length);
        return typy[r];
    }

    public int getPocetKupe() {
        return pocetKupe;
    }

    public int getPocetSedadel() {
        return pocetSedadel;
    }



    TypVagonu(String nazev, int pocetKupe, int pocetSedadel){
            this.nazev = nazev;
            this.pocetKupe = pocetKupe;
            this.pocetSedadel = pocetSedadel;
    }

    private static TypVagonu[] nactiTypyVagonu(String path, String splitBy){
        String line;
        ArrayList<TypVagonu> typyVagonu = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null){
                String[] udaje = line.split(splitBy);
                typyVagonu.add(new TypVagonu(udaje[0],Integer.parseInt(udaje[1]),Integer.parseInt(udaje[2])));
                //pravděpodobně by mělo být ošetřený NumberFormatException
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        TypVagonu[] returnTypyVagonu = typyVagonu.toArray(new TypVagonu[0]);
        return returnTypyVagonu;
    }
}
