import java.rmi.*;
public interface rint extends Remote // rint is the interface name
{
    double fact(double x) throws RemoteException; // fact() is the method declaration only
}