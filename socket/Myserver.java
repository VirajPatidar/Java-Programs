import java.net.*;
import java.io.*;

class Myserver {
    public static void main(String args[]) throws Exception {

        ServerSocket ss = new ServerSocket(3333);
        System.out.println("Server Started");
        Socket s = ss.accept();
        System.out.println("Client Connected");

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nwd = "", spd = "", ts = "";
        double a, b, sal;
        String choice = "";
        while (!choice.equals("n")) {

            nwd = din.readUTF();
            a = Double.parseDouble(nwd);
            spd = din.readUTF();
            b = Double.parseDouble(spd);
            sal = a * b;

            ts = String.valueOf(sal);
            dout.writeUTF(ts);
            dout.flush();
            System.out.println("Salary details are sent");
            choice = din.readUTF();
        }
        din.close();
        s.close();
        ss.close();
    }
}
