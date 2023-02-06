import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class LanceurServeurCalcul {
    public static void main(String[] args) throws RemoteException {
        Registry reg = LocateRegistry.getRegistry();
        Addition a = new Addition();
        ServiceCalcul aS = (ServiceCalcul) UnicastRemoteObject.exportObject(a,1099);
        reg.rebind("Addition", aS);
        Soustraction s = new Soustraction();
        ServiceCalcul sS = (ServiceCalcul) UnicastRemoteObject.exportObject(s,1099);
        reg.rebind("Soustraction", sS);
        Multiplication m = new Multiplication();
        ServiceCalcul mS = (ServiceCalcul) UnicastRemoteObject.exportObject(m,1099);
        reg.rebind("Multiplication", mS);
        Division d = new Division();
        ServiceCalcul dS = (ServiceCalcul) UnicastRemoteObject.exportObject(d,1099);
        reg.rebind("Division", dS);
    }
}