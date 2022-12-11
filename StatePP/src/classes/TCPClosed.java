package classes;

import classesAbstratas.TCPState;

public class TCPClosed extends TCPState{

    @Override
    public void open() {
        System.out.println("Não é possivel abrir uma conexão que já está FECHADA!!");
        
    }

    @Override
    public void close() {
        System.out.println("Não é possivel FECHAR uma conexão que já está FECHADA!!");
        
    }

    @Override
    public void acknowledge() {
        System.out.println("Não é possivel ACK uma conexão que já está FECHADA!!");
        
    }
    
}
