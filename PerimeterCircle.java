import java.rmi.*;
public interface PerimeterCircle extends Remote {
    public double Perimeter(int radius)throws RemoteException;
}