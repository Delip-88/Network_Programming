import java.io.*;
import java.net.*;
public class Server{
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(6996);
            Socket s = ss.accept(); 
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("Message: " + str);
            ss.close();  

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}