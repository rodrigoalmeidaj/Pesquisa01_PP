package classes;

import interfaces.MyIterator;

public class MenuIterator implements MyIterator {

    MenuItem[] itens;
    int posicao = 0;

    public MenuIterator(MenuItem[] itens) {
        this.itens = itens;
    }

    public Object next() {
        MenuItem menuItem = itens[posicao];
        posicao++;
        return menuItem;
    }

    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }

}
