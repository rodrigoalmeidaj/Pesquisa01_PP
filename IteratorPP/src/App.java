import classes.MenuItem;
import classes.MenuIterator;
import interfaces.MyIterator;

public class App {
    public static void main(String[] args) throws Exception {
        MenuItem [] itens = new MenuItem[4]; //criando um vetor


        //implementando exemplificação de iteração sobre menus usando o padrão iterator
        itens[0] = new MenuItem("Menu 1");
        itens[1] = new MenuItem("Menu 2");
        itens[2] = new MenuItem("Menu 3");
        itens[3] = new MenuItem("Menu 4");

        MyIterator menuIterator = new MenuIterator(itens);

        while (menuIterator.hasNext()) {
            MenuItem menuItem = (MenuItem)menuIterator.next();
            System.out.println(menuItem.nome);
        }

    }
}

