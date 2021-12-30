/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezervaceJizdenekVlaku;

/**
 *
 * @author Michal Wackermann
 */
public class Rezervace {

    private Uzivatel vlastnikRezervace;
    private int cisloVagonu;
    private int sedadlo;
    private String nazevVlaku;


    public Rezervace(Uzivatel vlastnikRezervace, int cisloVagonu, int sedadlo, String nazevVlaku) {
        this.vlastnikRezervace = vlastnikRezervace;
        this.cisloVagonu = cisloVagonu;
        this.sedadlo = sedadlo;
        this.nazevVlaku = nazevVlaku;
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
}
