import java.net.*;

public class LoopBackTest {
    public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getByName("127    .0.0.1");
            if(address.isLoopbackAddress()){
                System.out.println(address + " is a loopback address");
            }else{
                System.out.println(address + " isn't a loopback address");
            }
        }catch(UnknownHostException e){
            System.out.println(e);
        }
    }    
}
