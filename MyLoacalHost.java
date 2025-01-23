import java.net.*;

public class MyLoacalHost {
    public static void main(String[] args) {
        try {
            InetAddress me = InetAddress.getLocalHost();
            String dottedquad = me.getHostAddress();
            System.out.println("My address is: " + dottedquad);
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}