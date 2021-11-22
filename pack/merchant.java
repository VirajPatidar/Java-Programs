import com.org.mypack.*;
import java.util.Scanner;
public class merchant {
    String mername;
    int registration;
    double balance;
    product p[];
    Scanner sc = new Scanner(System.in);
    merchant() {
        System.out.println("Enter the merchant's name");
        mername = sc.nextLine();
        System.out.println("Enter the Registration Number");
        registration = Integer.parseInt(sc.nextLine());
    }
    void calculateTotal() {
        System.out.println("Enter the total number of products");
        int n = Integer.parseInt(sc.nextLine());
        p = new product[n];
        for (int i = 0; i < p.length; i++) {
            p[i]= new product();
            balance = balance + p[i].difference();
        }
    }
    void display() {
        System.out.println("Merchant Name: " + mername);
        System.out.println("Registration Number: " + registration);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        merchant ob =new merchant();
        ob.calculateTotal();
        ob.display();
    }    
}