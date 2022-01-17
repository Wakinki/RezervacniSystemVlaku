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
public class Vagon {
    
    private int cislo;
    private int[] sedadla;
    //private int[] rezervace;
    private TypVagonu typVagonu;
    
    //TODO vymyslet jak načíst typy vagonů
    
    public Vagon(int cislo, TypVagonu typ){
        this.cislo=cislo;
        this.typVagonu = typ;
        sedadla = new int[typ.getPocetSedadel()];
        insertSedadla(sedadla);
    }

    public int getCislo() {
        return cislo;
    }

    public int[] getSedadla() {
        return sedadla;
    }

    public TypVagonu getTypVagonu() {
        return typVagonu;
    }

    /*private void insertSedadla(int[] sedadla){ //Funkce která popíše sedadla jako ve vlaku {11,12,13,14,15,16,21,22...
        int pocetSedacekVKupe = typVagonu.getPocetSedadel()/ typVagonu.getPocetKupe();
        for (int sedadlo : sedadla) {

            int cisloSedadla =

            sedadla[sedadlo] = cisloSedadla;
        }*/

    private void insertSedadla(int[] sedadla){ //Funkce která popíše sedadla od 1 do počtu sedadel ve vagonu
        for (int i=0;i<sedadla.length;i++) {
            sedadla[i] = i+1;
        }
    }
    

}
