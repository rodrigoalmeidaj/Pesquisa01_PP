package classes;

import classesAbstratas.TCPState;

public class TCPListen extends TCPState{

    @Override
    public void open() {
        System.out.println("Conexão ABERTA com sucesso!!");
        
    }

    @Override
    public void close() {
        System.out.println("Conexão fechada com sucesso!!");
        
    }

    @Override
    public void acknowledge() {
        System.out.println("ACK");
        
    }
    
}
