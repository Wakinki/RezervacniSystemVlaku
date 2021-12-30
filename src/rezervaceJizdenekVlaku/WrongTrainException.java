package rezervaceJizdenekVlaku;

public class WrongTrainException extends RuntimeException{
    public WrongTrainException(){

        super("Tato rezervace neni pro tento vlak");
        System.out.println("Nelze přidat rezervaci do vlaku protože není pro tento vlak");
    }

}
