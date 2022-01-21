
package rezervaceJizdenekVlaku;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws WrongTrainException {

        //TODO neřešit uživatele
      Uzivatel u1 = createUser();
      SeznamVlaku seznamVlaku = SeznamVlaku.loadRandomTrains(10);


      for(int i=0;i<seznamVlaku.size();i++){
          System.out.println(seznamVlaku.getOnIndex(i).toString());
      }
      //Vlak v1 = new Vlak("Krušnohor");
      //Rezervace r1 = new Rezervace(u1,"Krušnohor",369,13);
      //Rezervace r2 = new Rezervace(u1,"Krušnohor",367,2);
        // r2.printReservationFile();
      //v1.pridejRezervaci(r1);
        
    }

    public static Uzivatel createUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej své jméno: ");
        String name = sc.nextLine();
        System.out.println("Zadej své příjmení: ");
        String surname = sc.nextLine();
        sc.close();
        return new Uzivatel(name,surname);
    }
    
}
