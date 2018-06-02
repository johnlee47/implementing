import java.rmi.*;
import java.net.*;
public class rser // rser is server name
{
    public static void main(String arg[]) {
        try {
            rimp ri = new rimp();
            Naming.rebind("rser", ri);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}