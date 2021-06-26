package sample;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ChatServer extends UnicastRemoteObject implements InterfaceServer
{

    private final ArrayList<InterfaceClient> clients; //liste contient tous les clients mais qui ne sont pas bloqué
    private final ArrayList<InterfaceClient> blockedClients; //liste contient tous les clients bloqués

    public ChatServer() throws RemoteException{
        super();
        this.clients = new ArrayList<InterfaceClient>();
        blockedClients = new ArrayList<InterfaceClient>();
    }

    @Override
    public synchronized void broadcastMessage(String message, List<String> list) throws RemoteException {

    }

    @Override
    public void broadcastMessage(ArrayList<Integer> inc, List<String> list, String fileName) throws RemoteException {

    }

    @Override
    public Vector<String> getListClientByName(String name) throws RemoteException {
        return null;
    }

    @Override
    public void addClient(InterfaceClient client) throws RemoteException {

    }

    @Override
    public void blockClient(List<String> clients) throws RemoteException {

    }

    @Override
    public void removeClient(List<String> clients) throws RemoteException {

    }

    @Override
    public void removeClient(String clients) throws RemoteException {

    }

    @Override
    public void reactiveClient(List<String> clients) throws RemoteException {

    }

    @Override
    public boolean checkUsername(String username) throws RemoteException {
        return false;
    }
}
