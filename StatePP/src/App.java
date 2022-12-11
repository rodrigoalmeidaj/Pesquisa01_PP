import classes.TCPConnection;
import classes.TCPEstablished;

public class App {
    public static void main(String[] args) throws Exception {

        TCPConnection tc = new TCPConnection();
        tc.open();

        //mudança de estado, alterando o comportamento.
        tc.setState(new TCPEstablished());
        tc.open();


    }
}
