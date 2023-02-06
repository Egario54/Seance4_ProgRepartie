import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceCalcul extends Remote{
    public double calculer(double a, double b) throws RemoteException;
}