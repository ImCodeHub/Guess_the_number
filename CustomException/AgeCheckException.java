package CustomException;

public class AgeCheckException extends Exception{
    public AgeCheckException(String message){
        super(message); //super() it will call the prnt cons.
    }
}
