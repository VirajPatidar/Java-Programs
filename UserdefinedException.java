import java.util.Scanner;
class ageException extends Exception {
    private int age;
    ageException(int a) {
        age = a;
    }
    public String toString() {
        return("Age: "+age+" is not within the range");
    }
}
public class UserdefinedException {
    Scanner sc = new Scanner(System.in);
    String name;
    int age = 0;
    int flag =0;
    void input() throws ageException {
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter age");
        age = Integer.parseInt(sc.nextLine()); 
        if (age < 10 || age > 105)
            throw new ageException(age);
    }
    void display(UserdefinedException ob[]) {
        System.out.print("\n");
        for (int i = 0; i < ob.length; i++) {
            System.out.print(ob[i].name + " "+ ob[i].age + " ");
            if(ob[i].age >= 18 && ob[i].flag!=1)
                System.out.print("valid\n");
            else
                System.out.print("Invalid\n");
            }
    }
    public static void main(String[] args) {
        UserdefinedException u[] = new UserdefinedException[3];
        UserdefinedException ob = new UserdefinedException();
        for (int i = 0; i < u.length; i++) {
            u[i] = new UserdefinedException();
            try {
                u[i].input();
            } catch (ageException e) {
                System.out.println(e);
                u[i].flag=1;
            }
        }
        ob.display(u);
    }    
}