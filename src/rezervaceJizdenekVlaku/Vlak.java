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

/**
 *
 * @author Michal Wackermann
 */
public class Vlak{
    private String nazev;
    private ArrayList<Vagon> vagony;
    private ArrayList<Rezervace> rezervace;
    private int delkaVlaku;

    public Vlak() {
        this.nazev = NazvyVlaku.getRandomNazevVlaku();
        this.vagony = nactiVagony(3,10);
        this.rezervace = new ArrayList<Rezervace>();
        this.delkaVlaku = vagony.size();
    }

    public Vlak(String nazev) {
        this.nazev = nazev;//TODO napsat enum názvy vlaků aby se při inicializaci mohly náhodně generovat (možnost to samé udělat se stanicemi)
        this.vagony = nactiVagony(3,10);
        this.rezervace = new ArrayList<Rezervace>();
        this.delkaVlaku = vagony.size();
    }

    private ArrayList<Vagon> nactiVagony(int minVagonu, int maxVagonu) {
        ArrayList<Vagon> v = new ArrayList<Vagon>();
        for(int i=0;i< minVagonu + (int)(Math.random() * maxVagonu);i++)
        v.add(new Vagon(i+367,TypVagonu.getRandomTypVagonu()));

        return v;
    }

    public String getNazev() {
        return nazev;
    }

    public int getDelkaVlaku() {
        return delkaVlaku;
    }

    public ArrayList<Vagon> getVagon(int index) {
        return vagony;
    }

    /*public void setVagony(ArrayList<Vagon> vagony) {
        this.vagony = vagony;
    }*/

    public ArrayList<Rezervace> getRezervace() {
        return rezervace;
    }

    public void setRezervace(ArrayList<Rezervace> rezervace) {
        this.rezervace = rezervace;
    }

    public void pridejVagon(Vagon v ){//přidá vagón do pole vagonu
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


        String cislaVagonuVeVlaku = "";
        for (int i = 0;i<vagony.size();i++) {
            cislaVagonuVeVlaku += vagony.get(i).getCislo() + ",";
        }

        return "Vlak:" + nazev + '\'' +
                ", vagony:" + cislaVagonuVeVlaku +
                ", počet vagónů:" + delkaVlaku +
                '}';
    }
}
