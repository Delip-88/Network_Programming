import java.net.*;

public class ReverseTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("157.240.3.35"); // using getByName
        System.out.println(ia.getCanonicalHostName());
    }
}