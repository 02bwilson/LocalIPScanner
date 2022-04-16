import java.util.ArrayList;
import java.net.*;
import java.io.*;

public class scan {
    public static ArrayList<String> scanPorts(String gateway, int sp, int ep){
        InetAddress address; 
        ArrayList<String> a = new ArrayList<>();
        // Handles if user input makes the end port larger then start port
        if (ep > sp){
            int tempPort = sp;
            sp = ep;
            ep = tempPort;
        }
        // I's through the specified ports and pings them to see if any responce 
        for (int i = sp; i < ep; i++){
            try {
                address = InetAddress.getByName(gateway + String.valueOf(i));
                a.add("Found");
                System.out.print("Found");
            } 
            catch (UnknownHostException e){
                System.out.println(e.toString());
                a.add("Not Found");
                System.out.print("Not Found");
            }
        }
       
 
         
        
        return a;
    }
}
