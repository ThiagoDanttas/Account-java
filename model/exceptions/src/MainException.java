import java.io.Serial;

public class MainException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public MainException(String msg){
        super(msg);
    }


}