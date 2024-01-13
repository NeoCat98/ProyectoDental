package Otros;

import java.util.Objects;

public class ClientList {

    ClientNode head;

    public ClientList() {
        this.head = null;
    }

    public void appEnd(ClientSheet clientInfo) {
        ClientNode nuNode = new ClientNode(clientInfo);
        if (head == null) {
            this.head = nuNode;
        } else {

            ClientNode current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nuNode;
        }
    }

    public ClientNode searchClient(String clientName) {
        ClientNode traverse = this.head;
        while (traverse.next != null) {
            if (Objects.equals(traverse.data.clientName, clientName)) {
                return traverse;
            } else {
                traverse = traverse.next;
            }
        } return null;
    }

}
