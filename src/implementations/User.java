package implementations;

import interfaces.UserInterface;
import utils.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class User extends UnicastRemoteObject implements UserInterface {

    String username, password;

    public User(String user, String pass) throws RemoteException {
        username = user;
        password = pass;
    }

    @Override
    public boolean login(String username, String password) throws RemoteException {

        Validate validation = new Validate();
        if(validation.checkUserLogin(username, password)){
            return true;
        } else {
            return false;
        }

    }
}
