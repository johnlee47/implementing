import java.rmi.*;
import java.rmi.server.*;

public class rimp extends UnicastRemoteObject implements rint // rimp is implementation name
{
    public rimp() throws RemoteException // rimp() is constructor
    {}
    public double fact(double x) throws RemoteException // fact() method definition
    {
        if (x <= 1) return (1);
        else return (x * fact(x - 1));
    }
}