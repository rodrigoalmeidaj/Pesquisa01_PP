package classes;

import classesAbstratas.TCPState;

public class TCPConnection {
    private TCPState state = new TCPListen();


    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }

    public void acknowledge() {
        state.acknowledge();
    }

    //getters e setters
    public TCPState getState() {
        return state;
    }

    public void setState(TCPState state) {
        this.state = state;
    }
}
