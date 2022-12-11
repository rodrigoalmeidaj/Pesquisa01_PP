package classes;

import interfaces.Graphic;

public class ImageProxy implements Graphic {

    private Image image;

    

    public ImageProxy(Image image) {
        this.image = image;
    }

    //Proxy repassando a chama para o objeto original 
    @Override
    public void draw() {
        System.out.println("Proxy executou para o draw ");
        image.draw();
    }


    @Override
    public void getExtent() {
        System.out.println("Proxy executou para o getExtent ");
        image.getExtent();
    }
    
}
