import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientCalcul {
    Annuaire a;

    public ClientCalcul() throws RemoteException {
        this.a = new Annuaire();
    }
    public void appeler() throws NotBoundException, RemoteException {
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();
            if(s==null){
                continue;
            }else if(s.startsWith("a")){
                Remote r = this.a.importerObjetDistant("Addition");
                ServiceCalcul s = (ServiceCalcul) r;
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println(s.calcule(a,b));
            }else if(s.startsWith("s")){
                Remote r = this.a.importerObjetDistant("Soustraction");
                ServiceCalcul s = (ServiceCalcul) r;
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println(s.calcule(a,b));
            }else if(s.startsWith("m")){
                Remote r = this.a.importerObjetDistant("Multiplication");
                ServiceCalcul s = (ServiceCalcul) r;
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println(s.calcule(a,b));
            }else if(s.startsWith("d")){
                Remote r = this.a.importerObjetDistant("Division");
                ServiceCalcul s = (ServiceCalcul) r;
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println(s.calcule(a,b));
            }else if(s.startsWith("quitter")){
                break;
            }
        }
    }

    public static void main(String[] args) throws RemoteException, NotBoundException {
        ClientCalcul c = new ClientCalcul();
        c.appeler();
    }
}
