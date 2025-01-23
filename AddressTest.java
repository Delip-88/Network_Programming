import java.net.*;

public class AddressTest {
    public static int getVersion(InetAddress ia) {
        byte[] address = ia.getAddress();
        if (address.length == 4) {
            return 4;
        }
        if (address.length == 16) {
            return 6;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("45.22.30.39");
            InetAddress address2 = InetAddress.getByName("2001:db8:3333:4444:5555:6666:7777:8888");
            System.out.println("Address is: IPv" + getVersion(address));
            System.out.println("Address2 is: IPv" + getVersion(address2));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}