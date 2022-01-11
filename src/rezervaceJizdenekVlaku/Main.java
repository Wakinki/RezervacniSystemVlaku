
package rezervaceJizdenekVlaku;

public class Main {

    public static void main(String[] args) throws WrongTrainException {


      Uzivatel u1 = new Uzivatel("Karel", "Máslo");
      Vlak v1 = new Vlak("Krušnohor");
      Rezervace r1 = new Rezervace(u1,3,13,"Krušnohor");
        Rezervace r2 = new Rezervace(u1,2,13,"Krušnohor");

        r2.printReservationFile();
      v1.pridejRezervaci(r1);
        
    }
    
}
