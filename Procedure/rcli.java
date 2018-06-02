import java.rmi.*;
public class rcli // rcli is client name
{
    public static void main(String arg[]) {
        try {
            rint rr = (rint) Naming.lookup("rmi://172.16.13.2/rser"); // system IP address
            double s = rr.fact(5);
            System.out.println("Factorial value is… : " + s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}