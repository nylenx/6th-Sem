// Q1.To write the java program for simulating ping and trace route commands 
// SOURCE CODE

//pingclient.java
import java.io.*;
import java.net.*;
import java.util.Calendar;

class pingclient {
    public static void main(String args[]) throws Exception {
        String str;
        int c = 0;
        long t1, t2;
        Socket s = new Socket("127.0.0.1", 5555);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        PrintStream out = new PrintStream(s.getOutputStream());
        while (c < 4) {
            t1 = System.currentTimeMillis();
            str = "Welcome to network programming world";
            out.println(str);
            System.out.println(dis.readLine());
            t2 = System.currentTimeMillis();
            System.out.println(";TTL=" + (t2 - t1) + "ms");
            c++;
        }
        s.close();
    }
}


// SAMPLE INPUT&
// OUTPUT

// C:\>javac pingserver.java
// Note:
// pingserver.java uses
// or overrides
// a deprecated API.Note:
// Recompile with-Xlint:deprecation for details.C:\>
// java pingserver C:\>javac pingclient.java
// Note:
// pingclient.java uses
// or overrides
// a deprecated API.Note:
// Recompile with-Xlint:deprecation for details.C:\>
// java pingclient
// Reply from welcome-PC/192.168.1.100;Length36;TTL=50
// ms Reply
// from welcome-PC/192.168.1.100;Length36;TTL=0
// ms Reply
// from welcome-PC/192.168.1.100;Length36;TTL=0ms
// Reply
// from welcome-PC/192.168.1.100;Length36;TTL=0ms







