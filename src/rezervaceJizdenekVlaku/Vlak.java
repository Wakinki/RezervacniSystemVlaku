/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezervaceJizdenekVlaku;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.Serializable;
/**
 *
 * @author Michal Wackermann
 */
public class Vlak implements Serializable{
    private String nazev;
    private ArrayList<TypVagonu> vagony;
    private ArrayList<Rezervace> rezervace;
    private int delkaVlaku = vagony.size();



    public Vlak(String nazev) {
        this.nazev = nazev;
        this.vagony = new ArrayList<TypVagonu>();
        this.rezervace = new ArrayList<Rezervace>();
    }

    public String getNazev() {
        return nazev;
    }

    public int getDelkaVlaku() {
        return delkaVlaku;
    }

    public ArrayList<TypVagonu> getVagony() {
        return vagony;
    }

    public void setVagony(ArrayList<TypVagonu> vagony) {
        this.vagony = vagony;
    }

    public ArrayList<Rezervace> getRezervace() {
        return rezervace;
    }

    public void setRezervace(ArrayList<Rezervace> rezervace) {
        this.rezervace = rezervace;
    }

    public void pridejVagon(TypVagonu v ){//přidá vagón do pole vagonu
        vagony.add(v);
    }

    public void pridejRezervaci(Rezervace r) throws WrongTrainException{//Přidá do pole rezervací vlaku rezervaci pokud je tato rezervace podele sestavení a názvu vlaku možná

        //TODO ošetřit jestli ve vlaku je správné sedadlo jako v rezervaci
        if(r.getNazevVlaku().equals(this.nazev)||r.getCisloVagonu()<=delkaVlaku){
            rezervace.add(r);
        }
        else throw new WrongTrainException();

    }

    //TODO vymyslet jak ukládat / načítat vlaky ze souboru
    public void nactiVlak(){
            try{
                BufferedReader buffReader = new BufferedReader(new FileReader("/Vlaky.csv"));



                buffReader.close();

            }catch(IOException e){
                System.out.println("Soubor nenalezen");
                e.printStackTrace();
            }

    }






    @Override
    public String toString() {
        return "Vlak{" +
                "vagony=" + vagony +
                ", rezervace=" + rezervace +
                '}';
    }
}
