package Otros;

public class ClientNode {

    ClientSheet data;
    ClientNode next;

    public ClientNode(ClientSheet dataIn){
        data = dataIn;
        next = null;
    }

    public void pointTo(ClientNode destination){
        next = destination;
    }

}