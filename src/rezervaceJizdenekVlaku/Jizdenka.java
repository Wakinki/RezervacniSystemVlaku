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
public class Jizdenka {
    
    Vlak vlak;
    Rezervace rezervace;
    String pocatecniStanice;
    String cilovaStanice;
    
    public Jizdenka(){
        
    }
    
    public Jizdenka(Vlak v, Rezervace r, String pS, String cS){
        this.vlak = v;
        this.rezervace = r;
        this.pocatecniStanice = pS;
        this.cilovaStanice = cS;
    }
    
    //TODO napsat metodu pro vypsání Jízdenky
    public void Display(){

    }

}