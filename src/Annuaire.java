import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Annuaire {
    public Registry reg;

    public Annuaire() throws RemoteException {
        this.reg = LocateRegistry.getRegistry(1099);
    }

    public Annuaire(int port) throws RemoteException {
        this.reg = LocateRegistry.getRegistry(port);
    }

    public Remote importerObjetDistant(String nomObjet) throws NotBoundException, RemoteException {
        try{
            return reg.lookup(nomObjet);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
