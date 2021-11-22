import java.util.Scanner;
class MyException extends Exception {
    private int age;
    MyException(int a) {
        age = a;
    }
    public String toString() {
        return("Age: "+age+" is not within the valid range [10 to 105 years]");
    }
}
public class user {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    boolean valid;
    void input() throws MyException {
        System.out.println("Enter user's name");
        name = sc.nextLine();
        System.out.println("Enter user's age");
        age = Integer.parseInt(sc.nextLine()); 
        if (age < 10 || age > 105)
            throw new MyException(age);
        if (age>=18) 
            valid = true;
    }
    void display(user ob[]) {
        System.out.println("NAME AGE VALID");
        for (int i = 0; i < ob.length; i++) {
            System.out.println(ob[i].name + " " + ob[i].age + " " + ob[i].valid);
        }
    }
    public static void main(String[] args) {
        user u[] = new user[10];
        for (int i = 0; i < u.length; i++) {
            u[i] = new user();
            try {
                u[i].input();
            } catch (MyException e) {
                System.out.println(e);
                System.out.println("Enter the details again");
                i--;
            }
        }
        u[0].display(u);
    }    
}