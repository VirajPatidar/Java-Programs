import java.util.Scanner;
class checkException extends Exception {
    public String toString() {
        return("NoMatching");
    }
}
public class stringcheck {
    Scanner sc = new Scanner(System.in);
    String name;
    void input() throws checkException {
        System.out.println("Enter a name");
        name = sc.nextLine();
        if(name.equals("Somaiya")==false)
            throw new checkException();
    }
    public static void main(String[] args) {
        stringcheck ob = new stringcheck();
        try {
            ob.input();
        } catch (checkException e) {
            System.out.println(e);
        }
    }    
}