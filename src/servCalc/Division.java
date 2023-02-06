import java.rmi.RemoteException;

public class Division implements ServiceCalcul {
    public double calculer(double a,double b) throws RemoteException {
        return a/b;
    }
}
