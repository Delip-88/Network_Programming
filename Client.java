import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost", 6996); 
            DataOutputStream dt = new DataOutputStream(s.getOutputStream());
            dt.writeUTF("Hello Server!");
            dt.flush();
            dt.close();
            s.close();  
        }catch(Exception ex){
            System.out.println("Error: "+ ex);
        }
    }
}