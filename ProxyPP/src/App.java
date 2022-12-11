import classes.Image;
import classes.ImageProxy;
import interfaces.Graphic;

public class App {
    public static void main(String[] args) throws Exception {
        Image i = new Image();
        Graphic g = new ImageProxy(i);

        //usando o proxy
        g.draw();
        g.getExtent();

        System.out.println("");
        //sem usar o proxy
        g = i;
        g.draw();
        g.getExtent();
        
    }
}
