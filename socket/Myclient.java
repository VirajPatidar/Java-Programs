import java.net.*;
import java.io.*;

class Myclient {
    public static void main(String args[]) throws Exception {

        Socket s = new Socket("localhost", 3333);

        System.out.println("Client Started");
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nwd = "", spd = "", ts = "";
        String choice = "";
        while (!choice.equals("n")) {
            System.out.println("Enter number of working Days:");
            nwd = br.readLine();
            dout.writeUTF(nwd);
            dout.flush();
            System.out.println("Enter Salary/day:");
            spd = br.readLine();
            dout.writeUTF(spd);
            dout.flush();
            ts = din.readUTF();
            System.out.println("Total salary: " + ts);

            System.out.println("Do you want to continue");
            choice = br.readLine();
            dout.writeUTF(choice);
            dout.flush();
        }
        dout.close();
        s.close();
    }
}
