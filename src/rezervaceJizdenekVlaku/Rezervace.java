/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezervaceJizdenekVlaku;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Michal Wackermann
 */
public class Rezervace {

    private Uzivatel vlastnikRezervace;
    private String nazevVlaku;
    private int cisloVagonu;
    private int sedadlo;



    //TODO předělat pořadí hodnot tak aby dávali větší smyslo (vlastnikRezervace,nazevVlaku,cisloVagonu,sedadlo)
    public Rezervace(Uzivatel vlastnikRezervace,String nazevVlaku,int cisloVagonu, int sedadlo ) {
        this.vlastnikRezervace = vlastnikRezervace;
        this.cisloVagonu = cisloVagonu;
        this.sedadlo = sedadlo;
        this.nazevVlaku = nazevVlaku;

        //TODO napsat metodu, která při inicializaci rezervace ji hned přidá do vlaku ke kterému patří
    }

    public Uzivatel getVlastnikRezervace() {
        return vlastnikRezervace;
    }

    public void setVlastnikRezervace(Uzivatel vlastnikRezervace) {
        this.vlastnikRezervace = vlastnikRezervace;
    }

    public int getCisloVagonu() {
        return cisloVagonu;
    }

    public void setCisloVagonu(int cisloVagonu) {
        this.cisloVagonu = cisloVagonu;
    }

    public int getSedadlo() {
        return sedadlo;
    }

    public void setSedadlo(int sedadlo) {
        this.sedadlo = sedadlo;
    }

    public String getNazevVlaku() {
        return nazevVlaku;
    }

    public void setNazevVlaku(String nazevVlaku) {
        this.nazevVlaku = nazevVlaku;
    }


    public void printReservationFile(){


        String[] dataRezervace = {vlastnikRezervace.getFullName(), nazevVlaku, String.valueOf(cisloVagonu), String.valueOf(sedadlo)};

        try {
            BufferedWriter resWriter =
                    new BufferedWriter((new FileWriter(".\\Jízdenky"+ (vlastnikRezervace.getFullName()).toLowerCase() +".txt")));

            for(String data: dataRezervace){
                resWriter.write(data);//TODO struktura vypsání dat do souboru
                resWriter.newLine();
            }

            resWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
