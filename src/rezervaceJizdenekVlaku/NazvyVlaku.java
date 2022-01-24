package rezervaceJizdenekVlaku;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NazvyVlaku {

    private static final String[] typy = nactiNazvyVlaku("NazvyVlaku.csv",",");

    public static String getNazevVlaku(int i) {
        return typy[i];
    }

    public static String getRandomNazevVlaku() {
        int r = (int)(Math.random() * typy.length);
        return typy[r];
    }

    private static String[] nactiNazvyVlaku(String path, String splitBy){
        String line;
        String allNames = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null){
                allNames += line;
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        String[] nazvyVlaku = allNames.split(splitBy);
        return nazvyVlaku;
    }
}
