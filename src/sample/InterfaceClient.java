package sample;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public interface InterfaceClient
{
    //récuperer le message
    void retreiveMessage(String message) throws RemoteException;

    //recuperer les fichiers partagés
    void retreiveMessage(String filename, ArrayList<Integer> inc) throws RemoteException;

    //envoyer un message
    void sendMessage(List<String> list) throws RemoteException;

    //recuperer les noms des clients connectés
    String getName() throws  RemoteException;

    //désactiver à un client la fonctionalité d'envoyer un message
    void closeCHat(String message) throws RemoteException;

    //activer à un client la fonctionalité d'envoyer un message
    void openCHat() throws RemoteException;
}
