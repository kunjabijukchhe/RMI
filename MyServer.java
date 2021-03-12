import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.*;

public class MyServer{
    public MyServer() throws RemoteException{
        super();
    }
    public static void main(String args[]) throws RemoteException, MalformedURLException{
        try{
            PerimeterCircleRemote ci =new PerimeterCircleRemote();
            Registry reg = LocateRegistry.createRegistry(5000);
            reg.rebind("circle", ci);
            // Naming.rebind("rmi://localhost:5000/circle",ci);
            System.out.println("Server is wating...");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
