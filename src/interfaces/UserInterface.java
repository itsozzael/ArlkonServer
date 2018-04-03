package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserInterface extends Remote {
    // Checking if the user is valid
    public boolean login(String username, String password) throws RemoteException;
}
