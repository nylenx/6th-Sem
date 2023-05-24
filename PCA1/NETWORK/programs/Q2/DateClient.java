
// Q2. Write a client-server program which displays the server machine's date
// and time on the client
// machine.
// //DateClient.java
import java.io.*;
import java.net.*;

class DateClient {
    public static void main(String args[]) throws Exception {
        Socket soc = new Socket(InetAddress.getLocalHost(), 5217);
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(in.readLine());
    }
}